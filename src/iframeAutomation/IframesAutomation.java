package iframeAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframesAutomation {
	WebDriver driver;
	@Test
	public void framesapplication() throws Exception {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(7000);
		
		WebElement frm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frm);				
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);	
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	}

}
