package com.qa.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencarts.constants.AppsConstants;

public class LoginPage {
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


// 1. By Locator: page objects: OR
private By emailId = By.id("input-email");
private By password = By.id("input-password");
private By loginBtn = By.xpath("//input [@value='Login']"); 
private By forgotPwdLink = By.linkText("Forgotten Password");


//2. Public page actions - methods (features)
public String getLoginPageTitle() {
	String title = eleUtil.waitForTitleIs(AppsConstants.LOGIN_PAGE_TITLE, AppConstants.DEFAULT_TIME_OUT);
	System.out.println("login page title==>" + title);
	return title;
}

public String getLoginPageURL() {
String url = eleUtil.waitForURLContaind(AppsConstants.LOGIN_PAGE_URL_FRACTION, AppsConstants.DEFAULT_TIME_OUT);
System.out.println("login page url==>" + url); 
return url;
}


public boolean isForgotPwdLinkExist() {
	return driver.findElement (forgotPwdLink).isDisplayed();
}

public static Object doLogin(String username, String pwd) {
System.out.println("App creds are: ==>"+ username + " : " + pwd);
eleUtil.waitForElementVisible(emailId, AppsConstants.SHORT_TIME_OUT).sendkKeys(username);
eleUtil.dosendKeys(password, pwd);
eleUtil.doClick(LoginBtn);
return new HomePage(driver);
}
}
