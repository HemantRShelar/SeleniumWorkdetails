package tatasons.tataautomobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MytestNgClass {
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("====before test====");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	@Test(priority = 2)
	public void m1()
	{
		System.out.println("my method m1");
	}
	@Test(priority = 3)
	public void m2()
	{
		System.out.println("my method m2");
	}
	@Test(priority = 1)
	public void m3()
	{
		System.out.println("my method m3");
	}
	@AfterTest
	public void at()
	{
		System.out.println("=====After test====");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After Class");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After suite");
	}
	
}
