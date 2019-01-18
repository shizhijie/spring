package com.zjs.bwcx.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.zjs.bwcx.spring.spittr.web.HomeController;

public class HomeControllerTest {
	
	/*@Test
	public void testHomePage() {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}*/
	
	@Test 
	public void testHomePageByMock() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/homepage")) //对“/”执行GET请求
				.andExpect(view().name("home")); //预期得到的home视图
	}
	
}
