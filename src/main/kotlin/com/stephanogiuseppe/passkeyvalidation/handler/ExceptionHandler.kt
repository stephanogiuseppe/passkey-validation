package com.stephanogiuseppe.passkeyvalidation.handler

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse
import com.stephanogiuseppe.passkeyvalidation.error.PassKeyErrorDetails
import com.stephanogiuseppe.passkeyvalidation.error.PassKeyException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(PassKeyException::class)
    fun handle(passKeyException: PassKeyException): ResponseEntity<PassKeyErrorDetails> =
        ResponseEntity(
            PassKeyErrorDetails("Error: ${passKeyException.message}", PassKeyResponse(false)),
            HttpStatus.MULTI_STATUS
        )

}
