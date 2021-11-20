package tatasons.tataautomobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnotherClass {
	
	
	@BeforeClass
	public void beforec()
	{
		System.out.println("=Before Class=");
	}
@Test
public void morning()
{
	System.out.println("Good morning");
}
@AfterClass
public void afterc()
{
	System.out.println("==After Class==");
}
}
