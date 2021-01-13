package com.furniture.shop.webappv1.tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes={SpringBootApplication.class})
@WebAppConfiguration
@AutoConfigureMockMvc
@ComponentScan(basePackages = {"com.furnitureshop"}) // bez nego vydaet 404 (ne vidit controllery) 
@WithUserDetails(value="testuser3", userDetailsServiceBeanName="userDetailsServiceImpl") //value="customUsername", userDetailsServiceBeanName="myUserDetailsService")
public class CustomerControllerTest {
	@Autowired
    private MockMvc mockMvc;

	
    @Test
    public void getAllCustomers() throws Exception{
        mockMvc.perform(get("/customers/all"))
                .andDo(print())
                .andExpect(status().isOk());
    }
    
	@Test
	public void getCustomerByIdTest() throws Exception{
		this.mockMvc.perform(get("/customers/1")).andDo(print())
		.andExpect(status().isOk());
		
	}
	
	@Test
	public void getCustomerByEmail() throws Exception{
		String email = "test@test.com";
		this.mockMvc.perform(get("/customers").param("email", email)).andDo(print())
		.andExpect(status().isOk());

		
	}
 

}
