package sindat.pets.ytbank.payment

import jakarta.persistence.EntityNotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import sindat.pets.ytbank.users.obj.UserEntity

@Service
class AccountService (
    private val accountRepository: AccountRepository,
    private val converter: AccountConverter,
) {
    fun createAccount(owner: UserEntity) {
        val accountEntity = AccountEntity(
            id = null,
            amount = 0,
            owner = owner
        )
        accountRepository.save(accountEntity)
    }
//    fun getAccountById(accountId: Long): Account {
//        return converter accountRepository.findById(accountId).orElseThrow { EntityNotFoundException() }
//    }

}
