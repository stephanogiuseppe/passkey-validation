package com.stephanogiuseppe.passkeyvalidation.controller

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ValidationControllerTests(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert application return content and status code 200`() {
        val entity = restTemplate.postForEntity("/validation/passkey", "true", String::class.java)
        Assertions.assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        Assertions.assertThat(entity.body).contains("Its ok: true")
    }

}