package sindat.pets.ytbank.services

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.controllers.dto.UserDTO
import sindat.pets.ytbank.services.obj.User

@Service
class UserService (
) {


    @Transactional
    fun getUserById(userId: Long): User {
        TODO()
//        return
    }



    @Transactional
    fun createUser(userDTO: UserDTO): User {
        TODO()
    }

    @Transactional
    fun updateUser(userDTO: UserDTO): User {
        TODO()
    }

    @Transactional
    fun deleteUserById(userId: Long) {
        TODO()
    }
}