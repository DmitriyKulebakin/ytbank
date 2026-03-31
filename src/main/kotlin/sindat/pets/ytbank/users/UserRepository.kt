package sindat.pets.ytbank.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, Long> {

//    fun findById(): Optional<User> TODO
//    fun findByUsernameAndPasswordHash(username: String, password: String): Optional<User> TODO

}