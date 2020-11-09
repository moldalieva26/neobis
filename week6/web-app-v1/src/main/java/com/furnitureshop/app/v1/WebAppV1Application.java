package com.furniture.shop.webappv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.furniture.shop.webappv1.controller"})
public class WebAppV1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebAppV1Application.class, args);
	}

}
