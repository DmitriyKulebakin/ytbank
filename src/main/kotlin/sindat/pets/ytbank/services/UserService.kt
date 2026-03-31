package sindat.pets.ytbank.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sindat.pets.ytbank.controllers.dto.UserDTO
import sindat.pets.ytbank.dataBases.UserEntity
import sindat.pets.ytbank.services.obj.Account
import sindat.pets.ytbank.services.obj.User

@Service
class UserService (
    private final var accountService: AccountService
) {



    fun getUserById(userId: Long) {

    }

    fun userDTOtoUser(userDTO: UserDTO): User {
        TODO()
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


    fun userToUserEntity(user: User): UserEntity {
        TODO()
    }

    fun getUserAccounts(user:User): List<Account> {
        TODO()
    }

}