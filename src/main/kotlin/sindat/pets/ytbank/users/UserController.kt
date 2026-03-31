package sindat.pets.ytbank.users

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sindat.pets.ytbank.users.obj.User
import javax.print.attribute.standard.RequestingUserName

@RestController
@RequestMapping("/users")
class UserController(
    private final val userService: UserService,
    private final val userConverter: UserConverter
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") userId: Long): User {
        log.info("getting user by id: $userId")
        val user = userService.getUserById(userId)
        return user
    }

    @PostMapping
    fun createUser(userName: RequestingUserName, password: String) {
        log.info("creating user with name: $userName and password: $password") //TODO LOGGING PASSWORD!! DELETE ON RELEASE!!! think !HOW! and !WHERE! to hash password
//        userService.createUser()
        //TODO("")
    }

//    @PostMapping("/login")
}