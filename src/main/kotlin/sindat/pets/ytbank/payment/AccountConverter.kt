package sindat.pets.ytbank.payment

import org.springframework.stereotype.Component
import sindat.pets.ytbank.users.UserConverter

@Component
class AccountConverter (
    private val userConverter: UserConverter
) {

    fun convertToEntity(account: Account): AccountEntity {
        return AccountEntity(account.id, account.amount, owner = userConverter.userToUserEntity(account.owner))
    }
    fun convertToDTO(account: AccountEntity): Account {
        return Account(account.id, account.amount, owner = userConverter.userEntityToUser(account.owner))
    }
}