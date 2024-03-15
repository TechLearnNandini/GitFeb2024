package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Git {
	 WebDriver driver;
  @Test
  public void Google()
  {
	 driver.get("https://google.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

}
