package com.stephanogiuseppe.passkeyvalidation.functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StringValidationTest {

    @Test
    fun `Should return true when hasWhitespace is called with whitespace`() {
        Assertions.assertEquals(true, hasWhitespace("te t"))
        Assertions.assertEquals(true, hasWhitespace("tes "))
        Assertions.assertEquals(true, hasWhitespace(" est"))
    }

    @Test
    fun `Should return false when hasWhitespace is called without whitespace`() {
        Assertions.assertEquals(false, hasWhitespace("test"))
    }

    @Test
    fun `Should return true when hasAtLeastOneLowercaseLetter is called with a lowercase`() {
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("t"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("test"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("!@#t"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("t!@#"))
    }

    @Test
    fun `Should return false when hasAtLeastOneLowercaseLetter is called without a lowercase`() {
        Assertions.assertEquals(false, hasAtLeastOneLowercaseLetter("T"))
        Assertions.assertEquals(false, hasAtLeastOneLowercaseLetter("TEST"))
        Assertions.assertEquals(false, hasAtLeastOneLowercaseLetter("!@#T"))
        Assertions.assertEquals(false, hasAtLeastOneLowercaseLetter("T!@#"))
    }

    @Test
    fun `Should return true when hasAtLeastOneCapitalLetter is called with a capital letter`() {
        Assertions.assertEquals(true, hasAtLeastOneCapitalLetter("T"))
        Assertions.assertEquals(true, hasAtLeastOneCapitalLetter("TEST"))
        Assertions.assertEquals(true, hasAtLeastOneCapitalLetter("!@#T"))
        Assertions.assertEquals(true, hasAtLeastOneCapitalLetter("T!@#"))
    }

    @Test
    fun `Should return false when hasAtLeastOneCapitalLetter is called without a capital letter`() {
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("t"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("test"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("!@#t"))
        Assertions.assertEquals(true, hasAtLeastOneLowercaseLetter("t!@#"))
    }

    @Test
    fun `Should return true when hasDuplicatedLetters is called with a capital letter`() {
        Assertions.assertEquals(true, hasDuplicatedLetters("test"))
        Assertions.assertEquals(true, hasDuplicatedLetters("TEST"))
        Assertions.assertEquals(true, hasDuplicatedLetters("!@#!@#"))
        Assertions.assertEquals(true, hasDuplicatedLetters("TT"))
    }

    @Test
    fun `Should return false when hasDuplicatedLetters is called without a capital letter`() {
        Assertions.assertEquals(false, hasDuplicatedLetters("tes"))
        Assertions.assertEquals(false, hasDuplicatedLetters("TEStes"))
        Assertions.assertEquals(false, hasDuplicatedLetters("TES!@#"))
    }

    @Test
    fun `Should return true when hasAtLeastOneSpecialChar is called with a special char`() {
        Assertions.assertEquals(true, hasAtLeastOneSpecialChar("!"))
        Assertions.assertEquals(true, hasAtLeastOneSpecialChar("T!T"))
        Assertions.assertEquals(true, hasAtLeastOneSpecialChar("TE!"))
        Assertions.assertEquals(true, hasAtLeastOneSpecialChar("T@T@"))
    }

    @Test
    fun `Should return false when hasAtLeastOneSpecialChar is called without a special char`() {
        Assertions.assertEquals(false, hasAtLeastOneSpecialChar("tes"))
        Assertions.assertEquals(false, hasAtLeastOneSpecialChar("TES"))
        Assertions.assertEquals(false, hasAtLeastOneSpecialChar("Test"))
    }

}
