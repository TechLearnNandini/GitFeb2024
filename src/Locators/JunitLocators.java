package Locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitLocators {
	
	static WebDriver driver;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	@Disabled
	@Test
	public void locatorstest() throws Exception {
		driver.get("https://seleniumlearn.com/user");
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.id("edit-name"));
		user.sendKeys("navya");
		
	//	driver.findElement(By.id("edit-name")).sendKeys("navya");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(2000);
	}
		
		/*
		 * driver.findElement(By.className("form-submit")).click(); 
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("edit-name")).clear();
		 *  Thread.sleep(2000);
		 * driver.findElement(By.id("edit-name")).sendKeys("Lavanya");
		 */
		
		@Disabled
		@Test
		public void cssSelectorlocator() throws Exception {
			driver.get("https://seleniumlearn.com/user");
			Thread.sleep(3000);

			driver.findElement(By.id("edit-name")).sendKeys("navya");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("Hello@123");
			Thread.sleep(2000);
		//	driver.findElement(By.className("form-submit")).click();
		//	driver.findElement(By.cssSelector("#edit-submit")).click();
		//	driver.findElement(By.cssSelector("input#edit-submit")).click();
		//	driver.findElement(By.cssSelector(".form-submit")).click();
		//	driver.findElement(By.cssSelector("input.form-submit")).click();
			

		}

	@Disabled
	@Test
	public void linkpartiallink() throws Exception {
		Thread.sleep(3000);
		driver.get("http://hyderabadreport.com/");
		Thread.sleep(3000);
		
		WebElement p = driver.findElement(By.linkText("Photos"));
		p.click();
		
//		driver.findElement(By.linkText("Photos")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("News")).click();

	}
	@Disabled
	@Test
	
	public void tagnamelocator() throws Exception {
		
		driver.get("https://www.ndtv.com/");
		Thread.sleep(3000);
		
		List<WebElement> tl = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on NDTV Application:"+tl.size());
		

	}

	@Test
	public void xpathlocator() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
      /* driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("nandini");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Hello");
       Thread.sleep(3000);
       driver.findElement(By.xpath(" /html/body/div[2]/div/div[3]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"menu-375-3\"]/a")).click();*/
		
	//	driver.findElement(By.xpath("")).
       		
	}}


