package com.stephanogiuseppe.passkeyvalidation.service.impl

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyRequest
import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse
import com.stephanogiuseppe.passkeyvalidation.enum.PassKeyMessageCustomError
import com.stephanogiuseppe.passkeyvalidation.error.PassKeyException
import com.stephanogiuseppe.passkeyvalidation.functions.*
import com.stephanogiuseppe.passkeyvalidation.service.PassKeyService
import org.springframework.stereotype.Service

@Service
class PassKeyValidationServiceImpl: PassKeyService {

    override fun isPassKeyValid(passKey: PassKeyRequest): PassKeyResponse {
        if (passKey.encryptedPass.length < 9)
            throw PassKeyException(PassKeyMessageCustomError.NINE_CHAR.message)

        if (hasWhitespace(passKey.encryptedPass))
            throw PassKeyException(PassKeyMessageCustomError.WHITESPACE.message)

        if (!hasAtLeastOneLowercaseLetter(passKey.encryptedPass))
            throw PassKeyException(PassKeyMessageCustomError.LOWERCASE.message)

        if (!hasAtLeastOneCapitalLetter(passKey.encryptedPass))
            throw PassKeyException(PassKeyMessageCustomError.CAPITAL.message)

        if (hasDuplicatedLetters(passKey.encryptedPass))
            throw PassKeyException(PassKeyMessageCustomError.DUPLICATED.message)

        if (!hasAtLeastOneSpecialChar(passKey.encryptedPass))
            throw PassKeyException(PassKeyMessageCustomError.SPECIAL_CHAR.message)

        return PassKeyResponse(true)
    }

}
