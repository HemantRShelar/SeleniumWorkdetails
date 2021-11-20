package tatasons.tataautomobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignupTest {
	
    WebDriver driver;
	public static void main(String[] args) {
		
		SignupTest ref = new SignupTest();
		ref.setup();
		
		
	}
	
	public void setup() 
	{
	System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

   public void signup()
   {
	   WebElement email=driver.findElement(By.id("email"));email.sendKeys("newaccount12345@gmail.com");
		WebElement pass=driver.findElement(By.id("passwd"));pass.sendKeys("newaccount12345");
		WebElement loginbtn=driver.findElement(By.id("SubmitLogin"));loginbtn.click();
	   
   }
}