package sindat.pets.ytbank.users.obj

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import sindat.pets.ytbank.payment.Account
import sindat.pets.ytbank.payment.AccountEntity
import java.time.LocalDateTime

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long?,

    @Column(name = "username")
    var username: String,

    @Column(name = "password_hash")
    // @Size(min = 60, max = 255) todo any regulation method?
    var passwordHash: String,

    @Column(name = "email")
    var email: String?,

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

//    @Column(name = "account_amount") todo deprecate method
//    var accountAmount: Long,

    @OneToMany(mappedBy = "owner")
    var accounts: Set<AccountEntity>,
)