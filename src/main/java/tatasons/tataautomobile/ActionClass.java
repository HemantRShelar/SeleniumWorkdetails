package tatasons.tataautomobile;

import java.lang.invoke.SwitchPoint;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://court.mah.nic.in/courtweb/index_eng.php#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement first=driver.findElement(By.xpath("//a[text()='Case Status']"));
		WebElement second=driver.findElement(By.xpath("//a[text()='Filing Number']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(first).pause(Duration.ofSeconds(3)).moveToElement(second).click().build().perform();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement district=driver.findElement(By.id("sess_dist_code"));
		Select sel= new Select(district);
		sel.selectByIndex(4);
		

	}

}
