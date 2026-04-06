package sindat.pet_projects.ytbank.exceptionsHandler.exceptions

import java.time.LocalDateTime

data class ErrorResponseDTO(
    val message: String?,
    val detailedMessage: String?,
    val errorTime: LocalDateTime?
)