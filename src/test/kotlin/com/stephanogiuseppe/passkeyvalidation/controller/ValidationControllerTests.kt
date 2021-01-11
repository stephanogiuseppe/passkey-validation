package com.stephanogiuseppe.passkeyvalidation.controller

import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyRequest
import com.stephanogiuseppe.passkeyvalidation.dto.PassKeyResponse
import com.stephanogiuseppe.passkeyvalidation.service.PassKeyService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ValidationControllerTests(
    @Autowired val restTemplate: TestRestTemplate,
    @Autowired var passKeyService: PassKeyService
) {

    @Test
    fun `Assert application return content and status code 200`() {
        val entity = restTemplate.postForEntity("/validation/passkey", PassKeyRequest("Pas!@#"), PassKeyResponse::class.java)
        Assertions.assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        Assertions.assertThat(entity.body).isEqualTo(PassKeyResponse(true))
    }

}