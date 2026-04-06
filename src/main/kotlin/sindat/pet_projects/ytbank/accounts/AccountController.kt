package sindat.pet_projects.ytbank.accounts

import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pet_projects.ytbank.ytbankUtils.Util.createResponseEntity

@RestController
@RequestMapping("/accounts")
class AccountController(
    private val accountService: AccountService,
) {
    private val log = LoggerFactory.getLogger(javaClass)


    @PostMapping
    fun createAccount(@RequestBody @Valid request: CreateAccountRequestDTO): ResponseEntity<AccountDTO> {
        return createResponseEntity(HttpStatus.CREATED, accountService.createAccount(request))
    }

    @PostMapping("/change-balance")
    fun changeAccountBalance(@RequestBody @Valid request: ChangeAccountBalanceRequestDTO): ResponseEntity<Long> { //todo another entity as response containing the difference?
        val result = createResponseEntity(
            HttpStatus.OK,
            accountService.changeBalance(
                id = request.id, balance = request.balance,
            )
        )
        return result
    }


}