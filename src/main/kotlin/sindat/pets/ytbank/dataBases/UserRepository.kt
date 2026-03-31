package sindat.pets.ytbank.dataBases

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sindat.pets.ytbank.services.obj.User
import java.util.Optional

@Repository
interface UserRepository: JpaRepository<UserEntity, Long> {

//    fun findById(): Optional<User> TODO
//    fun findByUsernameAndPasswordHash(username: String, password: String): Optional<User> TODO

}