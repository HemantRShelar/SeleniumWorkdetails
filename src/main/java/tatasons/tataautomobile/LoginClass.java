package tatasons.tataautomobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	@FindBy(name="txtUsername")
	WebElement usernamefield;
	
	@FindBy(id="txtPassword")
	WebElement passwordfield;
	
	@FindBy(name="Submit")
	WebElement loginbuttonfield;
	
	
	WebDriver driver;

public LoginClass(WebDriver driver2) {
	driver=driver2;
	PageFactory.initElements(driver, this);
}
public void login()
{
	 usernamefield.sendKeys("Admin");
     passwordfield.sendKeys("admin123");
     loginbuttonfield.click();
     
}
}