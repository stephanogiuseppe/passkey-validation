package com.stephanogiuseppe.passkeyvalidation.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SwaggerConfig {

    @Bean
    fun getApiInfo(): Docket =
        Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.stephanogiuseppe.passkeyvalidation.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(metaData())

    private fun metaData(): ApiInfo =
        ApiInfoBuilder()
            .title("Password Validation API")
            .description("This API validates the password. The password must be a lowercase letter and a capitalized letter")
            .version("1.0.0")
            .build()

}
