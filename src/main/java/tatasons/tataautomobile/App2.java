package tatasons.tataautomobile;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class App2 {
	
    WebDriver driver;
	public static void main(String[] args) {
		
		App2 ref = new App2();
		ref.setup();
		ref.createaccount();
		ref.signup();
		
	}
	
	public void setup() 
	{
		
		System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        driver = new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	public void createaccount()
	{
		WebElement enteremail=driver.findElement(By.name("email_create"));enteremail.sendKeys("newaccount12345@gmail.com");
		WebElement createbutton=driver.findElement(By.name("SubmitCreate"));createbutton.click();
		try {
		WebElement titlebutton=driver.findElement(By.id("id_gender1"));titlebutton.click();
		WebElement firstname=driver.findElement(By.id("customer_firstname"));firstname.sendKeys("Escobar");
		WebElement lastname=driver.findElement(By.id("customer_lastname"));lastname.sendKeys("Pablo");
		WebElement password=driver.findElement(By.id("passwd"));password.sendKeys("newaccount12345");
		
		Select day= new Select(driver.findElement(By.id("days")));
		day.selectByValue("17");
		Select month= new Select(driver.findElement(By.id("months")));
		month.selectByValue("10");
		Select year= new Select(driver.findElement(By.id("years")));
		year.selectByValue("1995");
		
		WebElement company=driver.findElement(By.id("company"));company.sendKeys("None");
		WebElement address=driver.findElement(By.id("address1"));address.sendKeys("Kharadi,Pune");
		WebElement city=driver.findElement(By.id("city"));city.sendKeys("Pune");
		Select state= new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("2");
		WebElement zipcode=driver.findElement(By.id("postcode"));zipcode.sendKeys("41101");
		Select country=new Select(driver.findElement(By.id("id_country")));
		country.selectByValue("21");
		WebElement addinfo=driver.findElement(By.id("other"));addinfo.sendKeys("Registration complete");
		WebElement mobileno=driver.findElement(By.id("phone_mobile"));mobileno.sendKeys("1234567891");
		WebElement alias=driver.findElement(By.id("alias"));alias.sendKeys("nothing to show");
		WebElement registerbtn=driver.findElement(By.id("submitAccount"));registerbtn.click();
		Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
        public void signup()
         {
			   WebElement email=driver.findElement(By.id("email"));email.sendKeys("newaccount12345@gmail.com");
				WebElement pass=driver.findElement(By.id("passwd"));pass.sendKeys("newaccount12345");
				WebElement loginbtn=driver.findElement(By.id("SubmitLogin"));loginbtn.click();
				WebElement women=driver.findElement(By.className("sf-with-ul"));women.click();
				WebElement dresses=driver.findElement(By.linkText("Dresses"));dresses.click();
				WebElement casual=driver.findElement(By.linkText("Casual Dresses"));casual.click();
				WebElement element = driver.findElement(By.className("right-block"));
				Actions actions = new Actions(driver);
				actions.moveToElement(element);
				actions.perform();
				WebElement addcart=driver.findElement(By.linkText("Add to cart"));addcart.click();
				WebElement checkout1=driver.findElement(By.linkText("Proceed to checkout"));checkout1.click();
				WebElement add=driver.findElement(By.className("icon-plus"));add.click();
				WebElement checkout2=driver.findElement(By.linkText("Proceed to checkout"));checkout2.click();
				WebElement checkout3=driver.findElement(By.name("processAddress"));checkout3.click();
				WebElement terms=driver.findElement(By.id("cgv"));terms.click();
				WebElement checkout4=driver.findElement(By.name("processCarrier"));checkout4.click();
				WebElement payment=driver.findElement(By.className("payment_module"));payment.click();
				WebElement confirm=driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));confirm.click();
				
				
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     }

}
