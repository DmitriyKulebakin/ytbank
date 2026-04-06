package sindat.pet_projects.ytbank.users

import sindat.pet_projects.ytbank.users.obj.CreateUserRequestDTO
import sindat.pet_projects.ytbank.users.obj.UserDTO
import sindat.pet_projects.ytbank.users.obj.UserEntity
import org.mapstruct.*


@Mapper(
    unmappedTargetPolicy = ReportingPolicy.WARN, // todo ?? chose the policy accurately
    componentModel = MappingConstants.ComponentModel.SPRING
)
interface UserEntityMapper {

    fun toEntity(createRequestUserDTO: CreateUserRequestDTO): UserEntity

    fun userEntityToUser(user: UserEntity): UserDTO
//    {
//        return UserDTO(
//            id = user.id,
//            username = user.username,
//            passwordHash = user.passwordHash,
//            email = user.email,
//            gender = user.gender,
//            lastSeenDate = user.lastSeenDate,
//            firstSeenDate = user.firstSeenDate,
//            permissionLevel = user.permissionLevel,
//            accounts = user.accounts,
//        )
//    }
}