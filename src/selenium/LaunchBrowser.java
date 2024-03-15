package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	//WebDriver is a interface and driver is a reference object u can any  name
	
	static WebDriver driver;    

	public static void main(String[] args) throws InterruptedException {
		
		//launch Chrome browse (ChromeDriver(); we called as a class)
		
		driver = new ChromeDriver();
		
		//Another way to launch Chrome Browser
		
		//WebDriver driver = new ChromeDriver();
		
	//	ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver = new EdgeDriver();
		
//		driver = new FirefoxDriver();
		
		//	driver = new EdgeDriver();
			
			driver = new ChromeDriver();
		//	Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		//	driver.manage().window().minimize();
			
			driver.quit();
		//	driver.close();
	}

}
