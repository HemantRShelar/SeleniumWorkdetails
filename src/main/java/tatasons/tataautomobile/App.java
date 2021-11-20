package tatasons.tataautomobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App ref = new App();
        ref.setup();
        LoginClass log = new LoginClass(driver);
        log.login();
        SystemUser user=new SystemUser(driver);
        user.systemuser();
        AddClass add= new AddClass(driver);
        add.add();
        DeleteClass del= new DeleteClass(driver);
        del.delete();
        ref.teardown();
    }
        
        public void setup()
        {
        
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
         driver = new ChromeDriver();
        
        //System.setProperty("webdriver.edge.driver","resource/msedgedriver.exe");
        
       // WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
       
        
        }
        

         
        public void teardown() 
        {
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		
		}
        }
	
}
