package tatasons.tataautomobile;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {
	
	int numberOfTry=0;

	@Override
	public boolean retry(ITestResult result) {
		
		if (numberOfTry<3) {
		
		if (!result.isSuccess()) {
			numberOfTry++;
			return true;
			
		}
		}
		
		return false;
	}

	
}
