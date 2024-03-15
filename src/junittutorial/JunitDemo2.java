package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo2 {
	
	static WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Disabled  // Test Case skip Only for Junit 5
	@Test
	void google() {
		driver.get("https://www.google.com");
	//	System.out.println("Launch Google application");
	} 
	
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Disabled
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");	
	}
	
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
	}
	
	@Ignore    // Test Case skip Only for Junit 3 & 4
	@Test
	void xtwitter() {
		driver.get("https://www.twitter.com");
		
	}

}
