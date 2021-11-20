package tatasons.tataautomobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationPractice {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	 public void setup(String bvalue)
     {
     String selectbrowser=bvalue;
     if (selectbrowser.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
         driver = new ChromeDriver();
		
	}
     else if (selectbrowser.equals("edge")) {
    	 System.setProperty("webdriver.edge.driver","resource/msedgedriver.exe");
         driver = new EdgeDriver();
    	 
		
	}
     else {
		throw new RuntimeException("You have provided an incorrect browser");
	}
     //System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
      //driver = new ChromeDriver();
     
     //System.setProperty("webdriver.edge.driver","resource/msedgedriver.exe");
     
    // WebDriver driver = new EdgeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
     }
     
	
	@Test(priority = 1)
	public void login()
	{
	LoginClass log = new LoginClass(driver);
    log.login();
	}
	@Test(priority = 2)
	public void systemuser()
	{
    SystemUser user=new SystemUser(driver);
    user.systemuser();
	}
	@Test(priority = 3)
	public void add()
	{
	 AddClass add= new AddClass(driver);
	  add.add();
	}
	@Test(priority = 4)
	public void delete()
	{
	DeleteClass del= new DeleteClass(driver);
     del.delete();
	}
    @AfterTest
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
