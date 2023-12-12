package capstone.spicejet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.spicejet.utils.SeWrappers;

public class SJetSignupPages extends SeWrappers {
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement button;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement option;
	
	@FindBy(id="first_name")
	WebElement fname;
	
	@FindBy(id="last_name")
	WebElement lname;
	
	@FindBy(xpath="//img[@class='d-inline-block datepicker']")
	WebElement date;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--004 react-datepicker__day--keyboard-selected react-datepicker__day--weekend']")
	WebElement day;
	
	@FindBy(id="email_id")
	WebElement mail;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement phone;
	
	@FindBy(id="new-password")
	WebElement pass1;
	
	@FindBy(id="c-password")
	WebElement pass2;
	
	@FindBy(xpath ="//input[@class='form-check-input mt-02']")
	WebElement box;
	
	@FindBy(xpath ="//button[text()='Submit']")
	WebElement submit;
	
	public void clicSignup()
	{
		waitForElement(button,20);		
		//String parentWindow = driver.getWindowHandle();
		//clickElement(button);
		//windowHandlingParentWindow();
		windowHandlingParentWindow();
		clickElement(button);
	}
	
	public void optSelect(String visibleText)
	{
		waitForElement(option,20);
		selectByVisibleText(option,visibleText);
	}
	
	public void fnane(String text)
	{
		waitForElement(fname,20);
		typeText(fname,text);
	}
	
	public void lname(String text)
	{
		waitForElement(lname,20);
		typeText(lname,text);
		
		WebElement val = driver.findElement(By.xpath("//img[@class='d-inline-block datepicker']"));
		val.click();

		// identify all td elements in list
		List<WebElement> t = driver.findElements(By.xpath(
				"//div[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--keyboard-selected']"));
		//react-datepicker__day react-datepicker__day--004 react-datepicker__day--keyboard-selected react-datepicker__day--weekend
		// Date picking
		for (int k = 0; k < t.size(); k++) {
			// check date
			String dt = t.get(k).getText();
			if (dt.equals("5")) {
				t.get(k).click();
				// break;
			}
		}
		// obtain selected date
		val.getAttribute("value");

		System.out.print("Date is Successfully selected");
	}
	
	
	public void mobText( String text)
	{
		//javascriptExecutorScrollToWebelement(scrollDownValue);
		waitForElement(phone,20);
		typeText(phone,text);
		javascriptExecutorClickWebElement(submit);
		
	}
	
	public void mailidSignup(String text)
	{
		waitForElement(mail,20);
		typeText(mail,text);
	}
	
	public void newPasswd(String text)
	{
		waitForElement(pass1,20);
		typeText(pass1,text);
	}
	
	public void confirmpass(String text)
	{
		waitForElement(pass2,20);
		typeText(pass2,text);
	}
	
	public void termsBox()
	{
		waitForElement(box,30);
		clickElement(box);
	}
	
	public void clicSubmit()
	{
		waitForElement(submit,30);
		clickElement(submit);
		
	}
	
	public void clicExit() throws InterruptedException
	{
		javascriptExecutorStartingContent();
		Thread.sleep(5000);
		closeAllBrowsers();
	}
	
	
	

}
