package com.qa.opencart.pages; 

import org.openqa.selenium.By;

 import org.openqa.selenium.WebDriver; 
 
import com.qa.opencart.constants.AppConstants;

 import com.qa.opencart.util.ElementUtil; 
 
public class ProductlnfoPage { 
	
private WebDriver driver; 

private ElementUtil eleUtil; 

public ProductlnfoPage(WebDriver driver) { 
this.driver = driver; eleUtil = new ElementUtil(driver); 
} 

private By productHeader = By.tag L"); 
private By productImages = By.css5L _or("ut.thumbnails img"); 
public String getProductHeader() 
I String header = eleUtil.doElementGetText(productHeader); 
System.out.println("product header: ===>" + header); return header; I 
} 
public inti getProductImagesCount() { 
int imagesCount = eleUtil.waitForElementsPresence(productImages, AppConstants.SHORT_TIME_OUT).size(); 
System.out.println(getProductHeader() +" : Images Count = "+ imagesCount); 
return imagesCount; 
} 

