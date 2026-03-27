package sindat.pets.ytbank.services.serviceLayerObjects

data class SimpleUser(
    val id: String,
    val username: String,
    val email: String,
    val gender: String,
    val lastSeenDate: String,
    val permissionLevel: String,
    val simpleAccounts: List<SimpleAccount>,
    )
