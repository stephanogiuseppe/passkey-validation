package com.stephanogiuseppe.passkeyvalidation.service

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyRequest
import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse

interface PassKeyService {

    fun isPassKeyValid(passKey: PassKeyRequest): PassKeyResponse

}
