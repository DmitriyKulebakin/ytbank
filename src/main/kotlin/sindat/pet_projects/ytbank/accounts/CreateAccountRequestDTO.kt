package sindat.pet_projects.ytbank.accounts

import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.PositiveOrZero

/**
 * Create request DTO for [AccountEntity]
 */
data class CreateAccountRequestDTO(
    @PositiveOrZero @NotNull val ownerId: Long
)