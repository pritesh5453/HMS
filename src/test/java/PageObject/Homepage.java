package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
WebDriver ldriver;
	
	public Homepage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement Patient;
	
	public void clickPatient()
	{
		Patient.click();
	}

}
