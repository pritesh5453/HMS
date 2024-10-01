package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.LoginPage;

public class TC_Homepage extends Base_class{
	
	@Test(priority=1)
	public void loginTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
	}
	
	@Test
	
	public void HomepageTest() throws InterruptedException
	{
	 
		Homepage pg = new Homepage(driver);
		Thread.sleep(5000);
		pg.clickPatient();
	}
	
	
	
}
