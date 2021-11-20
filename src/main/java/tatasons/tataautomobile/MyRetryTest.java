package tatasons.tataautomobile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyRetryTest {
	
	
     @Test(retryAnalyzer = RetryClass.class)
	public void test1()
	{
		System.out.println("print my test1");
	}
     
     @Test(retryAnalyzer = RetryClass.class)
	public void test2()
	{
		System.out.println("print my test2");
	}
	
	@Test(retryAnalyzer = RetryClass.class)
	public void test3()
	{
		System.out.println("print my test3");
		Assert.assertEquals(2, 3);
	}
}
