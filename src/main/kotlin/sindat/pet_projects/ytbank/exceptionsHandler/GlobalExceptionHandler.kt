package sindat.pet_projects.ytbank.exceptionsHandler


import jakarta.persistence.EntityNotFoundException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import sindat.pet_projects.ytbank.exceptionsHandler.exceptions.ErrorResponseDTO
import java.time.LocalDateTime

@ControllerAdvice
class GlobalExceptionHandler {
    private val log: Logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    @ExceptionHandler(Exception::class)
    fun handleGenericException(e: Exception): ResponseEntity<ErrorResponseDTO> =
        createSimpleResponse(
            e = e,
            logMessage = "Handle undefined exception",
            userMessage = "Internal Server Error",
            status = HttpStatus.INTERNAL_SERVER_ERROR
        )


    @ExceptionHandler(EntityNotFoundException::class)
    fun handleEntityNotFound(e: EntityNotFoundException): ResponseEntity<ErrorResponseDTO> =
        createSimpleResponse(
            e = e,
            logMessage = "Handle entityNotFoundException",
            userMessage = "Entity not found",
            status = HttpStatus.NOT_FOUND
        )

    @ExceptionHandler(
        exception = [
            IllegalArgumentException::class,
            IllegalStateException::class,
            MethodArgumentNotValidException::class,
        ]
    )
    fun handleBadRequest(e: Exception): ResponseEntity<ErrorResponseDTO> =
        createSimpleResponse(
            e = e,
            logMessage = "Handle handle bad request",
            userMessage = "Bad request",
            status = HttpStatus.BAD_REQUEST
        )

    private fun createSimpleResponse(
        e: Exception,
        logMessage: String,
        userMessage: String,
        status: HttpStatus
    ): ResponseEntity<ErrorResponseDTO> {
        log.error(logMessage, e)
        val errorDto = ErrorResponseDTO(
            userMessage,
            e.message,
            LocalDateTime.now()
        )
        return ResponseEntity.status(status).body(errorDto)
    }
}
