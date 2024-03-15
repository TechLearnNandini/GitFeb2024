package demojava;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDoubleDragMouseKey {
	WebDriver driver;
	@Test
	public void rightclick() throws InterruptedException {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(4000);
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]/a"))).build().perform();
	}
	
	
	
	@Test
	public void doubleclickonwebelement() throws InterruptedException {
		driver.get("https://seleniumlearn.com/double-click");
		Thread.sleep(4000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
	}
	
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("https://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(4000);
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();	
	
	}
	
	@Test
	public void mousehover() throws InterruptedException {
		driver.get("https://www.seleniumlearn.com/");
		Thread.sleep(4000);
		Actions act = new Actions(driver);		
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().build().perform();
		
	}
	
	@Test
	public void keyboardkeys() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	//	act.sendKeys(Keys.TAB).build().perform();
		
		
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}


