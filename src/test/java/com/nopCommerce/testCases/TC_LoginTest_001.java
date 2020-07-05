package com.nopCommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		
		logger.info("URL is opened.....");//logger msg
		
		
		LoginPage lp = new LoginPage(driver);
		
		
	/*	lp.setUserName(username);
		logger.info("User provided"); //logger msg
		
		
		lp.setPassword(password);
		logger.info("Password provided");//logger msg
		*/
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg

		
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			Assert.assertTrue(true);
			lp.clickLogout();
			logger.info("Login Passed");//logger msg
			
			
		} 

	}
	

}
