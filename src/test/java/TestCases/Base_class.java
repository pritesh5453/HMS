package TestCases;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;

public class Base_class {
	
	ReadConfig readconfig = new ReadConfig();

	
	 String Url = readconfig.getApplicationURL() ;
	 String username =readconfig.getUsername();
	 String password =readconfig.getPassword();
	 static WebDriver driver;
	 
	@BeforeClass
	public void setup() throws InterruptedException
	{
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://project1.qualibytes.com/backend/admin/index.php");
			
			
			
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

	
	

	}
	
