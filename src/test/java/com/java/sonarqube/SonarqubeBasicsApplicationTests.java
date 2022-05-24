package com.java.sonarqube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.sonarqube.controller.MessageController;

@SpringBootTest
class SonarqubeBasicsApplicationTests {
	
	
	@Autowired
	private MessageController controller;
	
	

	@Test
	void contextLoads() {
	}
	
	@Test
	void GetMessage() {
		String message= controller.getMessage();
		Assertions.assertNotNull(message);
		
	}

}
