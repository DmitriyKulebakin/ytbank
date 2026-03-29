package sindat.pets.ytbank.controllers

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.dataBases.UserEntity

@RestController
@RequestMapping("/accounts")
class AccountController {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getAccountById(@PathVariable("id") userId: Long): AccountEntity {
        log.info("getting user by id: $userId")
        val user = getUserById(userId)
        return TODO()
    }
}