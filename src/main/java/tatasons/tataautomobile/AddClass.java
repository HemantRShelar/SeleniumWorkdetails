package tatasons.tataautomobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddClass {
	WebDriver driver;

public AddClass(WebDriver driver2) {
	driver=driver2;
	}

public void add()
{
	 WebElement addbutton= driver.findElement(By.name("btnAdd"));addbutton.click(); 
 	WebElement userrole= driver.findElement(By.id("systemUser_userType"));userrole.sendKeys("ESS");
 	WebElement employeename= driver.findElement(By.id("systemUser_employeeName_empName"));employeename.sendKeys("Anthony Nolan");
 	WebElement username= driver.findElement(By.id("systemUser_userName"));username.sendKeys("Anthonyno");
 	WebElement status= driver.findElement(By.id("systemUser_status"));status.sendKeys("Enabled");
 	WebElement password= driver.findElement(By.id("systemUser_password"));password.sendKeys("AnthonyNolan@1234");
 	WebElement confirmpassword= driver.findElement(By.id("systemUser_confirmPassword"));confirmpassword.sendKeys("AnthonyNolan@1234");
 	WebElement savebutton= driver.findElement(By.id("btnSave"));savebutton.click(); 
 	WebElement cancelbutton= driver.findElement(By.id("btnCancel"));cancelbutton.click();

}
}