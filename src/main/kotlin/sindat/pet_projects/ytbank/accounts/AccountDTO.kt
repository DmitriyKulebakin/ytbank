package sindat.pet_projects.ytbank.accounts

import jakarta.validation.constraints.NegativeOrZero
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Null
import jakarta.validation.constraints.PositiveOrZero

class AccountDTO (
    @Null
    var id: Long?,
    @PositiveOrZero
    @NegativeOrZero
    @NotNull
    var balance: Long,

    @NotNull
    var owner: Long
)