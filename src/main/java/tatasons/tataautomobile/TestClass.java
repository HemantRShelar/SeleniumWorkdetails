package tatasons.tataautomobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	static WebDriver driver;
	public static void main(String[] args) {
		TestClass ref= new TestClass();
		ref.setup();
		ref.login();
		ref.registration();

	}

	public void setup()
	{
		System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
		driver= new EdgeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	public void login()
	{	
		WebElement login= driver.findElement(By.id("email_create"));login.sendKeys("adminhemant@gmail.com");
		WebElement createAcct=driver.findElement(By.id("SubmitCreate"));
		createAcct.click();
	}
	public void registration()
	{
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement mr=wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
		mr.click();

		Select daySel= new Select(driver.findElement(By.id("days")));
		daySel.selectByValue("20");

		Select monthsSel= new Select(driver.findElement(By.id("months")));
		monthsSel.selectByValue("8");//august

	}


	

	public void teardown()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

