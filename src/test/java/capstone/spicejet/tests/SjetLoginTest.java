package capstone.spicejet.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.spicejet.utils.Reports;
import capstone.spicejet.utils.SJwrappers;
import capstone.spicejet.utils.SeWrappers;

public class SjetLoginTest extends SeWrappers{
	
	SJwrappers sj  = new SJwrappers();
	Reports report = new Reports();
	
	@Parameters({"browser"})
	@Test
	public void loginTest(String browserName)
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			launchCrossBrowser(browserName,"https://www.spicejet.com/");
			
			
			
			sj.invalidDatalogin();	
			 
			
				
		
	      }
		
		catch(Exception ex)
		{
			System.out.println("Problem while validating Signup");
			ex.printStackTrace();
		}
		
	}
		
	


}
