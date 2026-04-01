package sindat.pets.ytbank.users.obj

import jakarta.validation.constraints.NegativeOrZero
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Null
import jakarta.validation.constraints.PastOrPresent
import jakarta.validation.constraints.PositiveOrZero
import java.time.LocalDateTime

data class User(
    @Null
    var id: Long,
    @NotNull
    var username: String,
    @NotNull
    var passwordHash: String, // 60-255 hash
    var email: String?,
    @NotNull
    var gender: Gender,
    @PastOrPresent
    var firstSeenDate: LocalDateTime?,
    @PastOrPresent
    var lastSeenDate: LocalDateTime?,
    @Null
    var permissionLevel: Permission?,
    @PositiveOrZero
    @NegativeOrZero
    var accountAmount: Long,  //TODO can provide any balance on start!! (done? seek for better solutons)
)
