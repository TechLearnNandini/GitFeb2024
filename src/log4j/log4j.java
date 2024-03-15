package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class log4j {
	WebDriver driver;
	@Test
	public void googlesearch() throws InterruptedException {
		 Logger log= Logger.getLogger("LogLearning");
		  PropertyConfigurator.configure("Log4j.properties");
		  driver = new ChromeDriver();
			log.info("Chrome Browser Launched");
			
			driver.manage().window().maximize();
			log.info("Browser window maximized");
			
			driver.get("https://www.google.com");
			log.info("Navigate to the google application");
			
			driver.findElement(By.name("q")).sendKeys("Tirupati");
			log.info("In google search field Tirupati text enter");
			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			log.info("Enter button pressed in keyboard");
			
			Thread.sleep(5000);
			log.info("Wait for 5 Sec");
}
}
