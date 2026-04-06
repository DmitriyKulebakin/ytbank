package sindat.pet_projects.ytbank.accounts

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService(
    private val accountRepository: AccountRepository,
    private val mapper: AccountMapper,
) {
    fun createAccount(request: CreateAccountRequestDTO): AccountDTO {
        val accountEntity = mapper.createRequestToDomain(request)
        return mapper.toDTO(accountRepository.save(accountEntity))
    }

    @Transactional
    fun changeBalance(id: Long, balance: Long): Long {
        verifyNewBalance(balance)
        val account = accountRepository.findById(id).orElseThrow { IllegalStateException("no Account found to change balance") }
        val balanceDifference = account.balance - balance
        accountRepository.updateBalance(id, balance)
            .orElseThrow { IllegalStateException("no Account found to change balance") }
        return balanceDifference
    }

    @Transactional
    fun modifyBalance(id: Long, amount: Long): Long {
        val account = accountRepository.findById(id).orElseThrow { IllegalStateException("no Account found to modify balance") }
        val newBalance = account.balance + amount
        verifyNewBalance(newBalance)
        accountRepository.updateBalance(id, newBalance)
        return newBalance
    }

    private fun verifyNewBalance(newBalance: Long) {
        require(newBalance > 0) { "New balance should be greater than 0" }
    }
}
