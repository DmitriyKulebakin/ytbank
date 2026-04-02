package sindat.pets.ytbank.users

import org.springframework.stereotype.Service
import sindat.pets.ytbank.users.obj.Permission
import sindat.pets.ytbank.users.obj.User
import sindat.pets.ytbank.users.obj.UserEntity

@Service
class UserConverter {

    fun userToUserEntity(user: User): UserEntity {
        return UserEntity(
            id = user.id,
            username = user.username,
            passwordHash = user.passwordHash,
            email = user.email,
            gender = user.gender,
            lastSeenDate = user.lastSeenDate,
            firstSeenDate = user.firstSeenDate,
            permissionLevel = user.permissionLevel ?: Permission.UNAUTHORIZED,
            accounts = user.accounts,
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
            accounts = user.accounts,
        )
    }
}