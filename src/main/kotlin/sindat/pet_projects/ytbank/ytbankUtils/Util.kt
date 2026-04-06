package sindat.pet_projects.ytbank.ytbankUtils

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


object Util {
    fun <T : Any> createResponseEntity(status: HttpStatus, entity: T): ResponseEntity<T> {
        return ResponseEntity.status(status).body(entity)
    }
}