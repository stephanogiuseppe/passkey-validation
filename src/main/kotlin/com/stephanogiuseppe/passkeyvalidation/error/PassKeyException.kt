package com.stephanogiuseppe.passkeyvalidation.error

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(HttpStatus.OK)
class PassKeyException(message: String?) : RuntimeException(message)
