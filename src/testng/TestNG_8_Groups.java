package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_8_Groups {
	WebDriver driver;

	@Test(groups="Social")
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(groups="Food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	
	@Test(groups="Social")
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(groups="Tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(groups="Search")
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(groups="Food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	
	@Test(groups="Social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups="Tech")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

  @BeforeTest(groups="Food")
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
