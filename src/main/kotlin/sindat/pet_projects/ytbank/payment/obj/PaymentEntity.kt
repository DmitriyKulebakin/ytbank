package sindat.pet_projects.ytbank.payment.obj

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "Payments")
@Entity
data class PaymentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "sender_id")
    var senderId: Long,

    @Column(name = "receiver_id")
    var receiverId: Long,

    @Column(name = "amount")
    var amount: Long,

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    var status: PaymentStatus
)