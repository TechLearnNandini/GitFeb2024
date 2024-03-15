package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliWebAutomation {
	WebDriver driver;
	Screen s = new Screen();

	@Test
	public void websikuliautomation() throws InterruptedException, FindFailed {
		driver.get("https://seleniumlearn.com/");
		Thread.sleep(5000);
		s.click("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Java.PNG");
		Thread.sleep(4000);
		s.type("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Search.PNG", "Ruby");
//		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Python");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
