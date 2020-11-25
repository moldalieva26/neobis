package com.example.testingweb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//https://codedelay.com/spring-boot-swagger-example/ add custom exception handlers
// https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api ?
@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
	/*
	 * After defining the Docket bean, its select() method returns an instance of
	 * ApiSelectorBuilder, which provides a way to control the endpoints exposed by
	 * Swagger. We can configure predicates for selecting RequestHandlers with the
	 * help of RequestHandlerSelectors and PathSelectors. Using any() for both will
	 * make documentation for our entire API available through Swagger.
	 */
	/*
	 * 
	 http://localhost:8080/swagger-ui/index.html works
	 http://localhost:8080/spring-security-rest/api/swagger-ui/ did not work
	 */

}
