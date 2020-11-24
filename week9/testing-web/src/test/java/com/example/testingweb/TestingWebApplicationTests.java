package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Resources:
// https://www.logicbig.com/tutorials/spring-framework/spring-boot/boot-web-application-testing-with-mock-mvc.html
// https://howtodoinjava.com/spring-boot2/testing/rest-controller-unit-test-example/
// add main page tests
//@RunWith(SpringRunner.class) // when to use it?
@SpringBootTest // tells Spring Boot to go and look for a main configuration class (one with @SpringBootApplication for instance), and use that to start a Spring application contex
class TestingWebApplicationTests {

	@Test
	void contextLoads() {
	}

}
