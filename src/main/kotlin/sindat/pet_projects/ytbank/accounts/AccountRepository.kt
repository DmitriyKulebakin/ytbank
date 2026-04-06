package sindat.pet_projects.ytbank.accounts

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

interface AccountRepository : JpaRepository<AccountEntity, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE AccountEntity a SET a.balance = :balance WHERE a.id = :id")
    fun updateBalance(@Param("id") id: Long, @Param("balance") balance: Long): Optional<AccountEntity>
}