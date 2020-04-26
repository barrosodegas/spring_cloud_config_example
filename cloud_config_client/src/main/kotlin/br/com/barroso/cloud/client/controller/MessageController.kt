package br.com.barroso.cloud.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @RefreshScope - Annotation responsible for allowing the property to be updated
 * Endpoint to refresh properties after git repository update: POST -->  http://localhost:8002/actuator/refresh with empty body
 */
@RefreshScope
@RequestMapping(value = ["/message"])
@RestController
class MessageController {

    @Value("\${api.limit.login.attempt:Property not found!}")
    private lateinit var messagePropertie: String

    @GetMapping
    fun getMessage(): String {
        return messagePropertie
    }

}
