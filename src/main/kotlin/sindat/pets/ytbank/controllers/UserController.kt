package sindat.pets.ytbank.controllers

import org.apache.catalina.User
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.dto.UserDTO
import sindat.pets.ytbank.services.UserService

@RestController
@RequestMapping("/users")
class UserController(
    private final val userService: UserService
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") userId: Long): UserDTO {
        log.info("getting user by id: $userId")
        val user = userService.getUserById(userId)
        return user
    }

    fun createUser(userId: Long): User {
        log.info("creating user by id: $userId")
        TODO();
    }

//    @PostMapping("/login")
}