package com.defitech.DefiClinique;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class DefiCliniqueApplicationTests {

	@Autowired
	public MockMvc mockMvc;

	@Test
	public void testGetDM() throws Exception {
		mockMvc.perform(get("/dossiersmedicaux"))
				.andExpect(status().isOk());
	}
}