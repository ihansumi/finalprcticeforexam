package org.ictkerala.testcases;

import org.ictkerala.base.InitiaSetupAmazon;
import org.ictkerala.pages.LoginPageAmazon;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesAmazon extends InitiaSetupAmazon{
	
	LoginPageAmazon lobj;
	
	@BeforeClass
	
	public void objinit() {
		
		lobj=new LoginPageAmazon(driver);
	}
	
	@Test
	public void TC_001() {
		
		String actual_url=lobj.verifyLogin();
		Assert.assertEquals(actual_url, Constants.Expected_url);
	}

}
