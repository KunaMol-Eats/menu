package ru.kunamol.eats.api.admin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.kunamol.eats.admin.service.SimpleAdminService
import ru.kunamol.eats.client.model.HelloModel

@RestController
@RequestMapping("/admin")
class AdminController(
    private val adminService: SimpleAdminService,
) {

    @GetMapping
    fun helloAdmin(): HelloModel = adminService.hello()
}