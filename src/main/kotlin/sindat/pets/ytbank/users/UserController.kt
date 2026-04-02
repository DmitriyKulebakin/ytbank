package sindat.pets.ytbank.users

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.security.PasswordHasher
import sindat.pets.ytbank.users.obj.User

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService,
    private val passwordHasher: PasswordHasher
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") userId: Long): User {
        log.info("getting user by id: $userId")
        val user = userService.getUserById(userId)
        return user
    }

    @PostMapping
    fun createUser(user: User): User { //TODO USER-END HASHING PASSWORD?
        log.info("creating user with name: ${user.username} and password: ${user.passwordHash}")
        user.passwordHash = passwordHasher.hashPassword(user.passwordHash)
        log.info("user with name: ${user.username} and hashed password: ${user.passwordHash} is up to create")
        return userService.createUser(user)
    }

//    @PostMapping("/login")
}