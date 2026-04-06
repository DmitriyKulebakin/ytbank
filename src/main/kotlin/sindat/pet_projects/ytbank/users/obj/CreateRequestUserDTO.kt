package sindat.pet_projects.ytbank.users.obj

import jakarta.validation.constraints.NotNull

data class CreateUserRequestDTO (
    @NotNull
    var username: String,
    @NotNull
    var passwordHash: String, // 60-255 hash
    var email: String?,
    @NotNull
    var gender: Gender,
    )