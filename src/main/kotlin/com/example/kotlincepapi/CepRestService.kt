package com.example.kotlincepapi

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("v1/ceps")
class CepRestService {

    private val cepService: CepService? = null

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = arrayOf(RequestMethod.GET))
    fun getCep(@PathVariable cep: String): CepResponse? {
        return cepService?.getCep(cep)
    }
}