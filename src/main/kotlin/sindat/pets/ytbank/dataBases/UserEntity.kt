package sindat.pets.ytbank.dataBases

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import sindat.pets.ytbank.services.obj.Gender
import sindat.pets.ytbank.services.obj.Permission
import java.time.LocalDateTime

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long,

    @NotNull
    @Column(name = "username")
    var username: String,

    @NotNull
    @Column(name = "password_hash")
    @Size(min = 60, max = 255)
    var passwordHash: String,

    @Column(name = "email")
    var email: String?,

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    var gender: Gender,


    @Column(name = "last_seen")
    var lastSeenDate: LocalDateTime?,

    @Column(name = "first_seen")
    var firstSeenDate: LocalDateTime?,

    @Column(name = "permissions")
    @Enumerated(EnumType.STRING)
    var permissionLevel: Permission,

    @NotNull
    @Column(name = "account_amount")
    var accountAmount: Long,
)