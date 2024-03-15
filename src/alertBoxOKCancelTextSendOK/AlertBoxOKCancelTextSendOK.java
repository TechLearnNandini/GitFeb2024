package alertBoxOKCancelTextSendOK;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertBoxOKCancelTextSendOK {
	WebDriver driver;
	@Test
	public void alertokbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void alertCancelbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
	}
	
	
	@Test
	public void alertsendtextOkbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Sunil");
		
		a.accept();
		
	/*	driver.switchTo().alert().sendKeys("Usha");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();  */
		
	}
	
	@Test
	public void noalertbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com");
		Thread.sleep(5000);		
		driver.switchTo().alert().accept();
		
		// Will get the console window mesg is : NoAlertPresentException: no such alert
		
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
