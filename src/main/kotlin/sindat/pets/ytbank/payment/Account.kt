package sindat.pets.ytbank.payment

import jakarta.validation.constraints.NegativeOrZero
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Null
import jakarta.validation.constraints.PositiveOrZero
import sindat.pets.ytbank.users.obj.User

class Account (
    @Null
    var id: Long?,
    @PositiveOrZero
    @NegativeOrZero
    @NotNull
    var amount: Long,

    @NotNull
    var owner: User
)