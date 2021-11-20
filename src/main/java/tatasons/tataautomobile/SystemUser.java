package tatasons.tataautomobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SystemUser {
	WebDriver driver;


	public SystemUser(WebDriver driver2) {
		driver=driver2;
	}


	public void systemuser()
	{
	 
         WebElement adminbutton= driver.findElement(By.id("menu_admin_viewAdminModule"));adminbutton.click();
         WebElement usermanagementbutton= driver.findElement(By.id("menu_admin_UserManagement"));usermanagementbutton.click();
         WebElement userbutton= driver.findElement(By.id("menu_admin_viewSystemUsers"));userbutton.click();
         WebElement username2field= driver.findElement(By.id("searchSystemUser_userName"));username2field.sendKeys("Admin");
         WebElement userrole= driver.findElement(By.name("searchSystemUser[userType]"));userrole.sendKeys("Admin");
         WebElement employeename= driver.findElement(By.name("searchSystemUser[employeeName][empName]"));employeename.sendKeys("Paul Collings");
         WebElement status= driver.findElement(By.name("searchSystemUser[status]"));status.sendKeys("Enabled");
         WebElement searchbutton= driver.findElement(By.id("searchBtn"));searchbutton.click();
         

}
}