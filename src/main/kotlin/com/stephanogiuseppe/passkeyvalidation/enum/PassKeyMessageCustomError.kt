package com.stephanogiuseppe.passkeyvalidation.enum

enum class PassKeyMessageCustomError(val message: String) {
    NINE_CHAR("Need at least nine characters"),
    WHITESPACE("Has a whitespace"),
    LOWERCASE("Need at least one lowercase letter"),
    CAPITAL("Need at least one capital letter"),
    DUPLICATED("Has a duplicated letter"),
    SPECIAL_CHAR("Need at least one special character"),
}
