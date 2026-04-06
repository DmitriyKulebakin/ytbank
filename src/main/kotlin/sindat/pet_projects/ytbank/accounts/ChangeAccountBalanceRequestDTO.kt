package sindat.pet_projects.ytbank.accounts

import jakarta.validation.constraints.PositiveOrZero

/**
 * DTO for [AccountEntity]
 */
data class ChangeAccountBalanceRequestDTO(
    @PositiveOrZero
    val id: Long,
    @PositiveOrZero
    val balance: Long
)