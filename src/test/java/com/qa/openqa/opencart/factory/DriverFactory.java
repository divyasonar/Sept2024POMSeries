package com.qa.openqa.opencart.factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	WebDriver driver;
	Properties prop;
	OptionsManager optionsManager;
	

	public WebDriver initDriver(Properties prop) {
		
		String browserName = prop.getProperty("browser");
		System.out.println("browser name is :" + browserName);
		optionsManager = new OptionsManager(prop);
		
		switch (browserName.trim().to LowerCase()) {
		case"chrome":
			driver = new ChromeDriver(optionsManager.getChromeOptions());
			break;
		case"firefox":
			driver = new FirefoxDriver(optionsManager.getChromeOptions());
			break;
		case"edge":
			driver = new edgeDriver(optionsManager.getChromeOptions());
			break;
		case"safari":
			driver = new SafariDriver(optionsManager.getChromeOptions());
			break;
		default:
			System.out.println("plz pass the vaild browser name.." + browserName);
			throw new FrameworkException("===invalid browser name===");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
				
			
			
			
			
			
			
			
			
			
			
			
		}

}
