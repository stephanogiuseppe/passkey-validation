package com.stephanogiuseppe.passkeyvalidation.service.impl

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyRequest
import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse
import com.stephanogiuseppe.passkeyvalidation.service.PassKeyService
import org.springframework.stereotype.Service

@Service
class PassKeyValidationServiceImpl: PassKeyService {
    override fun isPassKeyValid(passKey: PassKeyRequest): PassKeyResponse =
        PassKeyResponse(true)
}