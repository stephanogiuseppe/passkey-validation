package com.stephanogiuseppe.passkeyvalidation.error

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse

data class PassKeyErrorDetails (
    var errorDetails: String,
    var passKey: PassKeyResponse
)
