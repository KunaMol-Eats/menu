package ru.kunamol.eats.admin.service

import org.springframework.stereotype.Service
import ru.kunamol.eats.client.model.HelloModel

@Service
class SimpleAdminService {

    fun hello() : HelloModel = HelloModel("Hello, world from admin module!")
}