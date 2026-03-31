package sindat.pets.ytbank.dataBases

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.UUID


//TODO("primary key and secondary key by id and ownerID")
//TODO("join with users table accurately")

@Table(name = "accounts")
@Entity
@PrimaryKeyJoinColumn(name = "id")
class AccountEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    var id: Long,

    @NotNull
    @Column(name = "amount")
    var amount: Long,

    @NotNull
    @Column(name = "ownerId")
    var ownerId: String,


)