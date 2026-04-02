package sindat.pets.ytbank.payment

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<AccountEntity, Long> {
}