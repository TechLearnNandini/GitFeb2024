package junittutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	  @Test
	void test1() {
		driver.get("https://www.google.com");
		System.out.println("Launch Google application");
		
	  }
		
		@Test
		void test3() {
			driver.get("https://www.selenium.dev");	
		}
		
		@Test
		void test4() {
			driver.get("https://www.redmine.org");
		}
		
		@Test
		void test5() {
			driver.get("https://www.twitter.com");
		
		
	}

}
