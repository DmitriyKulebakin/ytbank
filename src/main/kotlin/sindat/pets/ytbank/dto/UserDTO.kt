package sindat.pets.ytbank.dto


data class SimpleUser(
    val id: String,
    val username: String,
    val email: String,
    val gender: String,
    val lastSeenDate: String,
    val permissionLevel: String,
    val accounts: List<Long>
)
