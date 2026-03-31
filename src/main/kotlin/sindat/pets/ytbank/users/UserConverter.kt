package sindat.pets.ytbank.users

import org.springframework.stereotype.Service
import sindat.pets.ytbank.users.obj.User

@Service
class UserConverter (
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
            accountAmount = user.accountAmount,
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
            accountAmount = user.accountAmount,
        )
    }
}