package sindat.pets.ytbank.users

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.security.PasswordHasher
import sindat.pets.ytbank.users.obj.User
import java.net.http.HttpResponse

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService,
    private val passwordHasher: PasswordHasher
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") userId: Long): ResponseEntity<User> {
        log.info("getting user by id: $userId")
        val user = userService.getUserById(userId)
        return httpResponse(HttpStatus.OK, user)
    }

    @PostMapping
    fun createUser(user: User): ResponseEntity<User> { //TODO USER-END HASHING PASSWORD?
        log.info("creating user with name: ${user.username} and password: ${user.passwordHash}") //TODO delete log on release
        user.passwordHash = passwordHasher.hashPassword(user.passwordHash)
        log.info("user with name: ${user.username} and hashed password: ${user.passwordHash} is up to create")
        return httpResponse(HttpStatus.CREATED, userService.createUser(user))
    }



    private fun <T : Any> httpResponse(status: HttpStatus, entity: T): ResponseEntity<T> {
        return ResponseEntity.status(status).body(entity)
    }

//    @PostMapping("/login")
}