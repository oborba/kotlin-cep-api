package com.example.kotlincepapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class KotlinCepApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinCepApiApplication>(*args)
}
