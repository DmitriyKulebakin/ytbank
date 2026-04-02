package sindat.pets.ytbank.users

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.exceptionsHandler.exceptions.AuthenticationException
import sindat.pets.ytbank.security.PermissionService
import sindat.pets.ytbank.users.obj.Permission
import sindat.pets.ytbank.users.obj.User

@Service
class UserService(
    private val repository: UserRepository,
    private val converter: UserConverter,
    private val permissionService: PermissionService,
) {
    @Transactional
    fun getUserById(userId: Long): User {
        val user = repository.findById(userId).orElseThrow { IllegalArgumentException("No user with id: $userId") }
        return converter.userEntityToUser(user)
    }


    @Transactional
    fun createUser(user: User): User {
        val userToSave = converter.userToUserEntity(user)
        userToSave.permissionLevel = Permission.BASE
        val savedUser = repository.save(userToSave)
        return converter.userEntityToUser(savedUser)
    }

    @Transactional
    fun updateUser(userToUpdate: User): User { //TODO password change etc; jpa security
        val userToCheck = authenticate(userToUpdate)
        permissionService.authorizePermissionBase(userToCheck)
        return converter.userEntityToUser(repository.save(userToCheck))
    }

    private fun authenticate(user: User): UserEntity {
        return repository
            .findByUsernameAndPasswordHash(username = user.username, passwordHash = user.passwordHash)
            .orElseThrow { AuthenticationException() }
    }


    @Transactional
    fun deleteUserById(userId: Long) {
        TODO()
    }
}