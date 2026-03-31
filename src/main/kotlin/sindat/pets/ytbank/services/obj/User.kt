package sindat.pets.ytbank.services.obj

import java.time.LocalDateTime

data class User(
    var id: Long,
    var username: String,
    var passwordHash: String, // 60-255 hash
    var email: String?,
    var gender: Gender,
    var firstSeenDate: LocalDateTime?,
    var lastSeenDate: LocalDateTime?,
    var permissionLevel: Permission,
)
