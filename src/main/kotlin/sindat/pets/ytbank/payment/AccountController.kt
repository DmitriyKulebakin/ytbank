package sindat.pets.ytbank.payment

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.users.UserService

@RestController
@RequestMapping("/accounts")
class AccountController(
    private val accountService: AccountService,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getAccountById(@PathVariable("id") accountId: Long): AccountEntity {
//        log.info("getting account by id: $accountId")
//        accountService.getAccountById(accountId)
        return TODO()
    }
}