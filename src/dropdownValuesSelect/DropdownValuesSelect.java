package dropdownValuesSelect;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropdownValuesSelect {
	WebDriver driver;
  @Test
  public void selectdropdownoptions() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  driver.findElement(By.xpath("//input[@id='text-13263966988']")).sendKeys("Nandini");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517590");
		Thread.sleep(3000);
		
		Select co = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
		co.selectByValue("IN");
		
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(5);
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PH");
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Pakistan");
	}

@BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

}
