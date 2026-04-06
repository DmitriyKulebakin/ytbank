package sindat.pet_projects.ytbank.accounts

import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.mapstruct.ReportingPolicy
import org.springframework.stereotype.Component


@Mapper(
    unmappedTargetPolicy = ReportingPolicy.WARN, // todo ?? chose the policy accurately
    componentModel = MappingConstants.ComponentModel.SPRING
)
interface AccountMapper {
    fun toDTO(account: AccountEntity): AccountDTO
    fun createRequestToDomain(account: CreateAccountRequestDTO): AccountEntity
}