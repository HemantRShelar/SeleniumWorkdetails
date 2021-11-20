package tatasons.tataautomobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeClass {
	@BeforeMethod
	public void bm()
	{
		System.out.println("====Hemant====");
	}
	
	@BeforeTest
	public  void m1()
	{
		System.out.println("--After test--");
	}
    @Test
	public void abc()
	{
		System.out.println("Practice Class");
	}
    @Test
    public void zqrs()
    {
    	System.out.println("Practice Class 2");
    }
    @AfterTest
    public void pxy()
    {
    	System.out.println("--After test---");
    }
    @AfterMethod
    public void am()
    {
    	System.out.println("====Vamshi====");
    }
}
