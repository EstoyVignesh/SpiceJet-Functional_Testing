package capstone.spicejet.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import capstone.spicejet.pages.CheckinPage;
import capstone.spicejet.pages.FlightStatusPage;
import capstone.spicejet.pages.LinkVerifyPage;
import capstone.spicejet.pages.ManageBookingPage;
import capstone.spicejet.pages.OnewayPage;
import capstone.spicejet.pages.RoundtripPage;
import capstone.spicejet.pages.SJetSignupPages;
import capstone.spicejet.pages.SjetLoginPage1;
import capstone.spicejet.pages.SjetLoginPage2;

public class SJwrappers extends SeWrappers {
	
	public void linkValidation(String url)
	{
		LinkVerifyPage lp = PageFactory.initElements(driver, LinkVerifyPage.class);
		
		lp.linktag(url);
		lp.exitPag();
		
	}
	
	public void signUP() throws InterruptedException
	{
		SJetSignupPages sj = PageFactory.initElements(driver, SJetSignupPages.class);
		
		sj.clicSignup();
		sj.optSelect("Mr");
		sj.fnane("Vignesh");
		sj.lname("palanisamy");
		sj.selDate();
		sj.mobText("7092909386");
		sj.mailidSignup("vickyphysics1998@gmail.com");
		sj.newPasswd("@Vignesh1998");
		sj.confirmpass("@Vignesh1998");
		sj.termsBox();
		sj.clicSubmit();
		captureScreenshot("Signup-ValidData");
		sj.clicExit();
	}
	
	public void invalidDatalogin() 
	{
		SjetLoginPage1 sj = PageFactory.initElements(driver, SjetLoginPage1.class);
	
		sj.clicLogin();
		sj.number("70929asdff");
		sj.password("@Vignesh19er");
		sj.clicSubmit();
		captureScreenshot("Login-InvalidData");		
		sj.exit();
	}
	
	public void validDatalogin() 
	{
		SjetLoginPage2 sj = PageFactory.initElements(driver, SjetLoginPage2.class);
	
		sj.clicLogin();
		sj.number("7092909386");
		sj.password("@Vignesh1998");
		sj.clicSubmit();
		sj.validation();
		sj.exit();
	}
	
	public void oneWaygo() 
	{
		OnewayPage op = PageFactory.initElements(driver, OnewayPage.class);
	
		op.clicOri();
		
		op.selecCiti();
		op.clicdest();
		op.clicDate1();	
		op.flightsearch();
		op.searchAgain();
		op.name1("Vinesh");
		op.name2("palani");
		op.number("7092909380");
		op.email("vikyphy98@gmail.com");
		op.entName(400, "vignesh");
		op.entName1("p");
		op.nummber2("7092909380");
		op.clicContinu();
		op.clicContinu1(30);
		op.skipEle();
		op.clicContinu2(30);
		op.switchFrame(500);
		op.cardNum("1221322345558778");
		op.switchFrame1();;
		op.cardName("vicky");
		op.switchFrame2();
		op.month("11");
		op.switchFrame3();
		op.year("28");
		op.switchFrame4();
		op.securityCode("154");
		op.proceedToPay();
			
		op.validation();
		captureScreenshot("ClickPayment-OneWay");
		op.exitone();
		
			
	}
	
	public void roundTripgo() 
	{
		RoundtripPage op = PageFactory.initElements(driver, RoundtripPage.class);
	
		op.clicOri();
		
		op.selecCiti();
		op.clicdest();
		op.clicDate1();
		op.selDate();
		op.clicDate2();
		op.flightsearch();
		op.searchAgain();
		op.name1("Vinesh");
		op.name2("palani");
		op.number("7092909380");
		op.email("vikyphy98@gmail.com");
		op.entName(400, "vinesh");
		op.entName1("p");
		op.nummber2("7092909380");
		op.clicContinu();
		op.clicContinu1(30);
		op.skipEle();
		op.clicContinu2(30);
		op.switchFrame(500);
		op.cardNum("1221322345558778");
		op.switchFrame1();
		op.cardName("vicky");
		op.switchFrame2();
		op.month("11");
		op.switchFrame3();
		op.year("28");
		op.switchFrame4();
		op.securityCode("154");
		op.proceedToPay();
			
		op.validation();
		captureScreenshot("ClickPayment-RoundTrip");
		op.exitone();
	}
	
	public void goCheckin() throws InterruptedException
	{
		CheckinPage cp = PageFactory.initElements(driver, CheckinPage.class);
		
		cp.checkIN();
		cp.ticNum("CCQU7Q");
		cp.email("vickyphysica1998@gmail.com");
		cp.goSearch();
		cp.validation();
		captureScreenshot("Checkin");
		cp.exit();
	}
	
	public void flightStatus()
	{
		FlightStatusPage fs = PageFactory.initElements(driver, FlightStatusPage.class);
		
		fs.clicFlightStatus();
		fs.departure();
		fs.pickDay();
		fs.clicOri();
		fs.selecCiti();
		fs.clicdest();		
		fs.flightsearch();
		fs.validation();
		captureScreenshot("FlightStatus");
		fs.exit();
	}
	
	
	public void goBooking() throws InterruptedException
	{
		ManageBookingPage mb = PageFactory.initElements(driver, ManageBookingPage.class);
		
		mb.manBooking();
		mb.ticNum("CCQU7Q");
		mb.email("vickyphysica1998@gmail.com");
		mb.searBooking();
		mb.validate();
		captureScreenshot("ManageBooking");
		mb.exit();
	}
	
}
