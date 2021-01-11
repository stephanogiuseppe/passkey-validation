package com.stephanogiuseppe.passkeyvalidation.functions

fun hasAtLeastOneChar(message: String): Boolean = !message.isNullOrBlank()

fun hasWhitespace(message: String): Boolean = message.matches(".*\\s.*".toRegex())

fun hasAtLeastOneLowercaseLetter(message: String): Boolean = message.matches(".*[a-z].*".toRegex())

fun hasAtLeastOneCapitalLetter(message: String): Boolean = message.matches(".*[A-Z].*".toRegex())

fun hasDuplicatedLetters(message: String): Boolean = message.matches("^.*(.).*\\1.*\$".toRegex())
