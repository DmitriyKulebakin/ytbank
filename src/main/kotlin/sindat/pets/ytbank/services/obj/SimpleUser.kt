package sindat.pets.ytbank.services.obj

import java.time.LocalDate

data class SimpleUser(
    val id: Long,
    val username: String,
    val passwordHash: Long,
    val email: String,
    val gender: Gender,
    val lastSeenDate: LocalDate,
    val permissionLevel: Permission,
    val simpleAccounts: List<SimpleAccount>,
)
