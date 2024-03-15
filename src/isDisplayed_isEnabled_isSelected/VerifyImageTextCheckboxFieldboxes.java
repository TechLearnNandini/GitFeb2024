package isDisplayed_isEnabled_isSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyImageTextCheckboxFieldboxes {
WebDriver driver;
	
	@Test
	public void isDispalyedMethod() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		
		boolean pro = driver.findElement(By.xpath("//a[@class='projects']")).isDisplayed();
		
		if(pro==true)
		{
			System.out.println("Project menu item is Disaplyed in the topbar Menu");
			driver.findElement(By.xpath("//a[@class='projects']")).click();
		}
		
		else
		{
			System.out.println("Project menu item is Not Disaplyed in the topbar Menu");
		}
	}
	
	@Test
	public void isEnabledeMethod() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		boolean usr = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
		
		if(usr==true)
		{
			System.out.println("Login user name text box field is enabled to enter the username");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Happy BirthDay Harish");
		}
		else
		{
			System.out.println("Login user name text box field is NOT enabled to enter the username");
		}		
	}
	
	@Test
	public void isSelectedMethod() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		
		boolean check = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
		
		if(check==true)
		{
			System.out.println("Stay logged in check box is Selected");
		}
		
		else
		{
			System.out.println("Stay logged in check box is NOT Selected");
		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

}

