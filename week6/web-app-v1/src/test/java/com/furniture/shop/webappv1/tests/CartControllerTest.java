package com.furniture.shop.webappv1.tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcConfigurer;
import org.springframework.web.context.WebApplicationContext;

import org.springframework.test.web.servlet.setup.MockMvcConfigurer;


@RunWith(SpringRunner.class) 
@SpringBootTest
//@WebMvcTest(MasterController.class)
@ContextConfiguration(classes={SpringBootApplication.class})
@AutoConfigureMockMvc
public class CartControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
/*
	@Test
	public void getAllCartsTest() throws Exception{
		this.mockMvc.perform(get("/carts")).andDo(print())
        .andExpect(status().isOk()); //? check
	}
	
	@Test
	public void getCartByIdTest() throws Exception{
		mockMvc.perform(get("/carts/17")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)); 

	}
*/
}
