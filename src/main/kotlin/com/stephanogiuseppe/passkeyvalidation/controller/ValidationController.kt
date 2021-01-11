package com.stephanogiuseppe.passkeyvalidation.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("validation")
class ValidationController {

    @PostMapping("passkey")
    fun isValid(@RequestBody passKey: String): ResponseEntity<String> {
        return ResponseEntity("Its ok: ${passKey}", HttpStatus.OK)
    }

}