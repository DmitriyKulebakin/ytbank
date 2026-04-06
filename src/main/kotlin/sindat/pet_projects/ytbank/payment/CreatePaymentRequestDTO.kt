package sindat.pet_projects.ytbank.payment

/**
 * DTO for [sindat.pet_projects.ytbank.payment.obj.PaymentEntity]
 */
data class CreatePaymentRequestDTO(val senderId: Long, val receiverId: Long, val amount: Long)