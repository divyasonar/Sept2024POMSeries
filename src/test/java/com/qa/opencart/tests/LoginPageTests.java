package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.page.LoginPage;
import com.qa.opencarts.constants.AppsConstants;

public class LoginPageTests {

	@Test
	public void loginPageTitleTest() {
	 String actTitle = LoginPage.getLoginPageTitle(); 
	 Assert.assertEquals(actTitle, AppsConstants.LOGIN_PAGE_TITLE, "==title is not matched=="); 
	}
	
	@Test public void LoginPageURLTest() { 
		String actURL = LoginPage.getLoginPageURLD; 
		Assert.assertTrue(actURL.contains(AppsConstants.LOGIN_PAGE_URL_FRACTION), "==URL is not matched==");
		}
	
	@Test 
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(LoginPage.isForgotPwdLinkExist(), "===forgotpwd link is not present==="); 
	}
	
	@Test(priority = Integer.MAX_VALUE) 
	public void LoginTest() { 
		Object homePage;
		try {
			homePage = LoginPage.doLogin("septbatch2024@open.com", "Selenium@123451");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 Assert.assertEquals(((Object) homePage).getHomePageTitle(), "My Account", "==title is not matched=="); 
		 } 
	}



