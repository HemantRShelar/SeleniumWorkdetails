
	package tatasons.tataautomobile;


	import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


	public class newassert {
		
	    WebDriver driver;
		
			
		@BeforeTest
		public void setup() 
		{
			
			System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
	        driver = new ChromeDriver();
		    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		@Test
		public void signup()
        {
			  Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");
			
			   WebElement email=driver.findElement(By.id("email"));email.sendKeys("newaccount12345@gmail.com");
				WebElement pass=driver.findElement(By.id("passwd"));pass.sendKeys("newaccount12345");
				WebElement loginbtn=driver.findElement(By.id("SubmitLogin"));loginbtn.click();
				
				Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
				
				
        }

}
