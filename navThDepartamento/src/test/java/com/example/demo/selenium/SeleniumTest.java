package com.example.demo.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
public class SeleniumTest {
public static Logger log = LoggerFactory.getLogger(SeleniumTest.class);
	
	
	
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.edgedriver().setup();		 
		 EdgeOptions options = new EdgeOptions();
	     WebDriver driver = new EdgeDriver(options);
	     driver.manage()
	            .timeouts()
	            .implicitlyWait(Duration.ofSeconds(10));
		log.info("REALIZAMOS TEST del proyecto");
		driver.get("http://www.google.com");
	        String title = driver.getTitle();
	        assertEquals("Google", title);
		
	}
}
