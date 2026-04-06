package sindat.pet_projects.ytbank.users

import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pet_projects.ytbank.users.obj.CreateUserRequestDTO
import sindat.pet_projects.ytbank.users.obj.UserDTO
import sindat.pet_projects.ytbank.security.PasswordHasher
import sindat.pet_projects.ytbank.ytbankUtils.Util.createResponseEntity

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService,
    private val passwordHasher: PasswordHasher
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") userId: Long): ResponseEntity<UserDTO> {
        log.info("getting user by id: $userId")
        val user = userService.getUserById(userId)
        return createResponseEntity(HttpStatus.OK, user)
    }

    @PostMapping
    fun createUser(@RequestBody @Valid request: CreateUserRequestDTO): ResponseEntity<UserDTO> { //TODO USER-END HASHING PASSWORD?
        log.info("creating user with name: ${request.username} and password: ${request.passwordHash}") //TODO delete log on release
        request.passwordHash = passwordHasher.hashPassword(request.passwordHash)
        log.info("user with name: ${request.username} and hashed password: ${request.passwordHash} is up to create")
        return createResponseEntity(HttpStatus.CREATED, userService.createUser(request))
    }
}