package sindat.pets.ytbank.payment

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import sindat.pets.ytbank.users.obj.UserEntity

@Table(name = "accounts")
@Entity
data class AccountEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long?,

    @Column(name = "amount")
    var amount: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    var owner: UserEntity,
)