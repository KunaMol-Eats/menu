package ru.kunamol.eats.api.client.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.kunamol.eats.client.model.HelloModel
import ru.kunamol.eats.client.service.SimpleClientService

@RestController
@RequestMapping("/client")
class ClientController(
    private val clientService: SimpleClientService,
) {

    @GetMapping
    fun helloAdmin(): HelloModel = clientService.hello()
}