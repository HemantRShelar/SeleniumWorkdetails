package tatasons.tataautomobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteClass
{
	WebDriver driver;

public DeleteClass(WebDriver driver2) {
		driver=driver2;
	}

public void delete()
{
	 WebElement checkbox= driver.findElement(By.name("chkSelectRow[]"));checkbox.click(); 
	 WebElement deletebutton= driver.findElement(By.id("btnDelete"));deletebutton.click(); 
	 WebElement deleteconfirmation= driver.findElement(By.id("dialogDeleteBtn"));deleteconfirmation.click();

}
}
