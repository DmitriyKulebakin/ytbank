package sindat.pets.ytbank.users

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.users.obj.User

@Service
class UserService (
) {


    @Transactional
    fun getUserById(userId: Long): User {
        TODO()
//        return
    }



    @Transactional
    fun createUser(userDTO: User): User {
        TODO()
    }

    @Transactional
    fun updateUser(userDTO: User): User {
        TODO()
    }

    @Transactional
    fun deleteUserById(userId: Long) {
        TODO()
    }
}