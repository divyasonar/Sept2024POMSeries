package com.qa.opencart.tests;

import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;

public class ProductInfoPageTest extends BaseTest {



      private static final String loginPage = null;

	@BeforeClass
      public void productlnfoSetup() {
    	  Object homePage = loginPage.doLogin("septbatch2024@open.com", "Selenium@12345");
      }

      @Test 
      public void productSearchHeaderTest() {
    	  Object searchResultsPage = homePage.doSearch("macbook");
    	  Object productInfoPage = searchResultsPage.selectProduct("MacBook Pro");
    	  String actutalProductHeader = productInfoPage.getProductHeader(); 
    	  Assert.assertEquals(actutalProductHeader, "MacBook Pro"); 

	
}
      
      @Test 
      public void productImagesCountTest() {
    	 searchResultsPage = homePage.doSearch("macbook");
    	 productInfoPage = searchResultsPage.selectProduct("MacBook Pro");
    	 int actutalProductImagesCount = productInfoPage.getProductImagesCount(); 
    	 Assert.assertEquals(actutalProductImagesCount, 4); 

}
}
