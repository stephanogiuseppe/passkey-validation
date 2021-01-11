package com.stephanogiuseppe.passkeyvalidation.controller

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AliveCheckControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert application is alive, content can be true and status code can be 200`() {
        val entity = restTemplate.getForEntity("/alive", String::class.java)
        Assertions.assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        Assertions.assertThat(entity.body).contains("true")
    }

}
