package sindat.pets.ytbank.services.obj

import java.time.LocalDate
import java.time.LocalDateTime

data class User(
    var id: Long,
    var username: String,
    var passwordHash: Long,
    var email: String,
    var gender: Gender,
    var firstSeen: LocalDateTime,
    var lastSeenDate: LocalDateTime,
    var permissionLevel: Permission,
    var accounts: List<Account>
)
