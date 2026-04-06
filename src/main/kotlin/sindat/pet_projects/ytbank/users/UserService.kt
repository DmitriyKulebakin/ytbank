package sindat.pet_projects.ytbank.users

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pet_projects.ytbank.accounts.AccountService
import sindat.pet_projects.ytbank.users.obj.CreateUserRequestDTO
import sindat.pet_projects.ytbank.users.obj.Permission
import sindat.pet_projects.ytbank.users.obj.UserDTO

@Service
class UserService(
    private val repository: UserRepository,
    private val mapper: UserEntityMapper
) {
    @Transactional
    fun getUserById(userId: Long): UserDTO {
        val user = repository.findById(userId).orElseThrow { IllegalArgumentException("No user with id: $userId") }
        return mapper.userEntityToUser(user)
    }


    @Transactional
    fun createUser(request: CreateUserRequestDTO): UserDTO {
        val userToSave = mapper.toEntity(request)
        userToSave.permissionLevel = Permission.BASE
        // todo kafka request to account service to create account
        val savedUser = repository.save(userToSave)
        return mapper.userEntityToUser(savedUser)
    }


//    @Transactional
//    fun updateUser(userDTOToUpdate: UserDTO): ResponseEntity<UserDTO> { //TODO password change etc; jpa security
//        TODO()
////        val userToCheck = authenticate(userToUpdate)
////        permissionService.authorizePermissionBase(userToCheck)
////        return converter.userEntityToUser(repository.save(userToCheck))
//    }
//
//
//    @Transactional
//    fun deleteUserById(userId: Long) {
//        TODO()
//    }
}