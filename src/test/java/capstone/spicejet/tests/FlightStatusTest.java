package capstone.spicejet.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.spicejet.utils.Reports;
import capstone.spicejet.utils.SJwrappers;
import capstone.spicejet.utils.SeWrappers;

public class FlightStatusTest extends SeWrappers {
	

	SJwrappers sj  = new SJwrappers();
	Reports report = new Reports();
	
	@Parameters({"browser"})
	@Test
	public void checkin(String browserName)
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			launchCrossBrowser(browserName,"https://www.spicejet.com/");
			
			
			
			sj.flightStatus();
			
			
				
		
	      }
		
		catch(Exception ex)
		{
			System.out.println("Problem while validating Signup");
			ex.printStackTrace();
		}
		
	}
		
	

}
