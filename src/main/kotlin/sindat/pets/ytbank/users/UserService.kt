package sindat.pets.ytbank.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.payment.AccountService
import sindat.pets.ytbank.users.obj.Permission
import sindat.pets.ytbank.users.obj.User

@Service
class UserService(
    private val accountService: AccountService,
    private val repository: UserRepository,
    private val converter: UserConverter
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
        accountService.createAccount(owner = userToSave)
        val savedUser = repository.save(userToSave)
        return converter.userEntityToUser(savedUser)
    }


    @Transactional
    fun updateUser(userToUpdate: User): ResponseEntity<User> { //TODO password change etc; jpa security
        TODO()
//        val userToCheck = authenticate(userToUpdate)
//        permissionService.authorizePermissionBase(userToCheck)
//        return converter.userEntityToUser(repository.save(userToCheck))
    }


    @Transactional
    fun deleteUserById(userId: Long) {
        TODO()
    }
}