package ru.kunamol.eats.client.service

import org.springframework.stereotype.Service
import ru.kunamol.eats.client.model.HelloModel

@Service
class SimpleClientService {

    fun hello() : HelloModel = HelloModel("Hello, world from client module!")
}