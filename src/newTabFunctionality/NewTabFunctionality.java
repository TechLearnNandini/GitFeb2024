package newTabFunctionality;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabFunctionality {
	WebDriver driver;
	@Test
	public void newtab() throws Exception {
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
		Thread.sleep(2000);
		// Working with new tab window handles
		
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
		driver.switchTo().window(tab.get(0));
			
	}
	
	@Test
	public void newtabcode() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.close();
		
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);

		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		  
		
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	}

}
