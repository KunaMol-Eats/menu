package ru.kunamol.eats.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["ru.kunamol.eats"],
    exclude = [DataSourceAutoConfiguration::class],
)
class EatsApplication

fun main(args: Array<String>) {
    runApplication<EatsApplication>(*args)
}