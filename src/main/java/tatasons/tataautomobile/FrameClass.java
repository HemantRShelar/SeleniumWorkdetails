package tatasons.tataautomobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement firstFr=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
		driver.switchTo().frame(firstFr);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome'][@target='packageFrame']")).click();
		driver.switchTo().defaultContent();
		
		WebElement secondFr=driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		driver.switchTo().frame(secondFr);
		driver.findElement(By.xpath("//a[text()='ChromeDriver'][@target='classFrame']")).click();
		driver.switchTo().defaultContent();
		
		WebElement thirdFr=driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo().frame(thirdFr);
		driver.findElement(By.xpath("//a[text()='Deprecated']['https://www.selenium.dev/selenium/docs/api/java/deprecated-list.html']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(firstFr);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium'][@target='packageFrame']")).click();
		
		
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}