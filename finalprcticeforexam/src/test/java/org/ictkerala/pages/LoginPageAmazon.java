package org.ictkerala.pages;

import org.openqa.selenium.WebDriver;

public class LoginPageAmazon {
	
	WebDriver driver;
	
	public LoginPageAmazon(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String verifyLogin() {
		String Actual_url=driver.getCurrentUrl();
		return Actual_url;
		
		
	}

}
