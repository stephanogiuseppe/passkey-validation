package com.stephanogiuseppe.passkeyvalidation.enum

enum class PassKeyMessageCustomError(val message: String) {
    ONE_LETTER("Need at least one letter"),
    WHITESPACE("Has a whitespace"),
    LOWERCASE("Need at least one lowercase letter"),
    CAPITAL("Need at least one capital letter"),
    DUPLICATED("Has a duplicated letter")
}
