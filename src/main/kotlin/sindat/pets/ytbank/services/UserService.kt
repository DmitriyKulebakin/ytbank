package sindat.pets.ytbank.services

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.controllers.dto.UserDTO
import sindat.pets.ytbank.dataBases.UserEntity
import sindat.pets.ytbank.services.obj.User

@Service
class UserService {


    fun getUserById(userId: Long) {

    }

    fun userDTOtoUser(userDTO: UserDTO): User {
        TODO()
    }

    fun userToUserEntity(user: User): UserEntity {
        TODO()
    }

    fun createUser(userDTO: UserDTO): User {
        TODO()
    }

    fun updateUser(userDTO: UserDTO): User {
        TODO()
    }

    fun deleteUserById(userId: Long) {
        TODO()
    }

}