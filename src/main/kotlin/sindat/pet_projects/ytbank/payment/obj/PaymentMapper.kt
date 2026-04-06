package sindat.pet_projects.ytbank.payment.obj

import org.springframework.http.HttpInputMessage
import org.springframework.http.HttpOutputMessage
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter

class PaymentMapper : HttpMessageConverter<PaymentEntity> {
    override fun canRead(clazz: Class<*>, mediaType: MediaType?): Boolean {
        TODO("Not yet implemented")
    }

    override fun canWrite(clazz: Class<*>, mediaType: MediaType?): Boolean {
        TODO("Not yet implemented")
    }

    override fun getSupportedMediaTypes(): MutableList<MediaType> {
        TODO("Not yet implemented")
    }

    override fun write(value: PaymentEntity, contentType: MediaType?, outputMessage: HttpOutputMessage) {
        TODO("Not yet implemented")
    }

    override fun read(clazz: Class<out PaymentEntity>, inputMessage: HttpInputMessage): PaymentEntity {
        TODO("Not yet implemented")
    }
}