package com.stephanogiuseppe.passkeyvalidation.functions

fun hasWhitespace(message: String): Boolean = message.matches(".*\\s.*".toRegex())

fun hasAtLeastOneLowercaseLetter(message: String): Boolean = message.matches(".*[a-z].*".toRegex())

fun hasAtLeastOneCapitalLetter(message: String): Boolean = message.matches(".*[A-Z].*".toRegex())

fun hasDuplicatedLetters(message: String): Boolean = message.matches("^.*(.).*\\1.*\$".toRegex())

fun hasAtLeastOneSpecialChar(message: String): Boolean = message.matches(".*[!@#\$%^&*()-+].*".toRegex())
