package sindat.pets.ytbank.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import sindat.pets.ytbank.users.obj.UserEntity
import java.util.Optional

@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {

    @Query(
        """
        select u from UserEntity u 
        where u.username = :username 
        and u.passwordHash = :passwordHash
        """
    )
    fun findByUsernameAndPasswordHash(
        @Param("username") username: String,
        @Param("passwordHash") passwordHash: String
    ): Optional<UserEntity>

}