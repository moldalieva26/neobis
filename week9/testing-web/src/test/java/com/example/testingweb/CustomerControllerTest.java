package com.example.testingweb;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;


import org.junit.Ignore;
import org.junit.jupiter.api.Test; //???
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.testingweb.entity.CustomerEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

@RunWith(SpringRunner.class) // what does it do?
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerTest {
	@Autowired
    private MockMvc mockMvc;
	
	@Test
	public void getAllCustomersTest() throws Exception{
		this.mockMvc.perform(get("/customers/all")).andDo(print())
        .andExpect(status().isOk()); // works
	}
	
	@Test
	public void getCustomerByIdTest() throws Exception{
		this.mockMvc.perform(get("/customers/2345")).andDo(print())
		.andExpect(status().isOk());
		
	}
	
	@Test
	public void createCustomerTest() throws Exception{ // worked but, did not 
		CustomerEntity customer = new CustomerEntity();
		customer.setId(2347L);
		customer.setFirstName("Test");
		customer.setLastName("Test");
		
		ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson=ow.writeValueAsString(customer);

		mockMvc.perform(post("/customers").contentType(APPLICATION_JSON_UTF8)
                .content(requestJson)).andDo(print())
                .andExpect(status().isOk());
	}
	/*
	@Test
	public void updateCustomerTest() throws Exception{ // worked but, did not 
		CustomerEntity customer = new CustomerEntity();
		customer.setId(2347L);
		customer.setFirstName("Test updated");
		customer.setLastName("Test updated");
		customer.setEmail("test@t.com");

		
		ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson=ow.writeValueAsString(customer);

		mockMvc.perform(put("/customers").contentType(APPLICATION_JSON_UTF8)
                .content(requestJson)).andDo(print())
                .andExpect(status().isOk());
	}*/

}
