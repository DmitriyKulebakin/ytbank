package sindat.pets.ytbank.security

import org.springframework.security.crypto.bcrypt.BCrypt
import org.springframework.stereotype.Service

@Service
class PasswordHasher {
    fun hashPassword(password: String): String {
        val salt = BCrypt.gensalt(12)
        return BCrypt.hashpw(password, salt)
    }

    fun checkPassword(password: String, hashed: String): Boolean {
        return BCrypt.checkpw(password, hashed)
    }
}