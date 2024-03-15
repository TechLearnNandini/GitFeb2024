package Verify_TabTitle_AppilicationURL_ApplicationText;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabURLText {
	WebDriver driver;
  @Test
  public void tabtitle() {
	  driver.get("https://www.google.com/");
	  
	  String exptabtitle = "Google";
	  System.out.println("Expected Tab Title is :"+exptabtitle);
	  
	  String acttabtitle = driver.getTitle();
	  System.out.println("Actual Tab Title is :"+acttabtitle);
	  
	  Assert.assertEquals(acttabtitle, exptabtitle);
  }
  
  
  @Test
  public void verifyapplicationURL() {
	  driver.get("https://www.google.com");
	  
	 String expurl = "https://www.google.com/";
	 
	 String acturl = driver.getCurrentUrl();
	 
	 Assert.assertEquals(acturl, expurl);
	 
  }
  
  
  @Test
  public void verifyapplicationtext() {
	  driver.get("https://www.google.com");
	  
	 String expgmail = "Gmail";
	 
	 String actgmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
	 
	 Assert.assertEquals(actgmail, expgmail);
	 
     String expimg = "Images";
	 
	 String actimg = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();
	 
	 Assert.assertEquals(actimg, expimg);
	 
	 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
