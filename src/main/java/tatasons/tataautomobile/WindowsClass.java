package tatasons.tataautomobile;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;


public class WindowsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		String parentWindow= driver.getWindowHandle();
		Set<String> allWindows= driver.getWindowHandles();
		for (String individual : allWindows) {
			driver.switchTo().window(individual);
			System.out.println(driver.getTitle());
			if(!individual.equals(parentWindow)){
			driver.close();
			
			
			}
		}
        driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
		driver.findElement(By.xpath("//a[text()='Create Job Alert'][@href='https://www.naukri.com/free-job-alerts']")).click();
		
		
	
		
		for (String newwindow : driver.getWindowHandles()) {
			System.out.println(newwindow);
			driver.switchTo().window(newwindow);
			System.out.println(driver.getTitle());
			
		
			

			
		}
		WebElement click=driver.findElement(By.id("cjaSubmit"));click.click();
		
		driver.switchTo().window(parentWindow);
	    System.out.println(driver.getTitle());
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	 

	    
	    WebElement hcl=driver.findElement(By.xpath("//a[@class='bannerItemLink'][@href='https://w28.naukri.com/advertiser/bms_hits.php?banner=7306324']"));hcl.click();
		
	    System.out.println(driver.getTitle());
	     for(String secondwindow : driver.getWindowHandles())
	     {
	    	 System.out.println(secondwindow);
	    	 driver.switchTo().window(secondwindow);
	    	 System.out.println(driver.getTitle());
	     }
           
	     driver.switchTo().window(parentWindow);
	     JavascriptExecutor js1=(JavascriptExecutor) driver;
		    js1.executeScript("window.scrollBy(0,3500)");
		    
		    for(String secondwindow : driver.getWindowHandles())
		     {
		    	 System.out.println(secondwindow);
		    	 driver.switchTo().window(secondwindow);
		    	 System.out.println(driver.getTitle());
		    	 String pagetitle = driver.getTitle();
		    	 if(pagetitle.equalsIgnoreCase("HCL Jobs – Jobs in HCL - Career in HCL – Job Openings in HCL"))
		         {
		             driver.close();
		             System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
		         }
		     }
		    driver.switchTo().window(parentWindow);

		   

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		}
	}

