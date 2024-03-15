package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_TimeOut_Feature {
	WebDriver driver;
	@Test
	public void googleSelenium() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Images']")).click();
	}
	
	@Test(timeOut=7000)
	public void googleTestNG() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Images']")).click();
		
	}
	
	
	@Test
	public void googleKeyboard() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
	//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[normalize-space()='Images']")).click();
		
	}
 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
