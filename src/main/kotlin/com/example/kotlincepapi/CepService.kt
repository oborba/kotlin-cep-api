package com.example.kotlincepapi

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable



@FeignClient(name = "cepService", url = "http://api.postmon.com.br")
interface CepService {

    @RequestMapping("/v1/cep/{cep}")
    fun getCep(@PathVariable("cep") cep: String): CepResponse
}