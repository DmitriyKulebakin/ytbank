package sindat.pets.ytbank.converters

import jakarta.persistence.Converter
import org.springframework.stereotype.Service
import sindat.pets.ytbank.controllers.dto.UserDTO
import sindat.pets.ytbank.dataBases.UserEntity
import sindat.pets.ytbank.services.UserService
import sindat.pets.ytbank.services.obj.User

@Converter
@Service
class UserAccountConverter(
    private val userService: UserService
) {

    fun userToUserEntity(user: User): UserEntity {
        return UserEntity(
            id = user.id,
            username = user.username,
            passwordHash = user.passwordHash,
            email = user.email,
            gender = user.gender,
            lastSeenDate = user.lastSeenDate,
            firstSeenDate = user.firstSeenDate,
            permissionLevel = user.permissionLevel,
            )
    }
    fun userEntityToUser(user: UserEntity): User {
        return User(
            id = user.id,
            username = user.username,
            passwordHash = user.passwordHash,
            email = user.email,
            gender = user.gender,
            lastSeenDate = user.lastSeenDate,
            firstSeenDate = user.firstSeenDate,
            permissionLevel = user.permissionLevel,
        )
    }
    fun userDTOToUser(user: UserDTO): User {
        TODO()
//        return User(
//            id = user.id
//        )
    }
    fun userToUserDTO(user: User): UserDTO {
        TODO()
    }


}