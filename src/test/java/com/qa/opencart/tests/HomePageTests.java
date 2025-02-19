package com.qa.opencart.tests;

import.org.testng.Assert;
import.org.testng.annotations.BeforeClass;
import.org.testng.annotations.Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;


public class HomePageTests extends BaseTest {

	@BeforeClass
	public void homePageSetup() {
		homePage = loginPage.dologin("septbatch2024@open.com","selenium@12345");
	}
	
	
	@Test
	public void homePageTitleTest() {
		Object homePage;
		Assert.assertEquals(homePage.getHomePageTitle(),"My Account", "==title is not matched==" );
	
	
	@Test
	 public void homePageURLTest() { 
	Assert.assertTrue(homePage.getHomePageURL.contains(AppsConstants.HOME_PAGE_URL_FRACTION), AppError.URL_1 } 
	
	@Test 
	public void logoutLinkExistTest() {
	 Object homePage;
	Assert.assertTrue(homePage.isLogoutLinkExist(), AppError.ELEMENT_NOT_FOUND_ERROR);
	}
	
	@Test
	 public void headersTest() { 
		Object homePage;
		List<String> actualHeaders = homePage.getHeadersList();
		System.out.println("home page headers: ==>" + actualHeaders); 
	} 
	@DataProvider 
	public Object[][] getSearchData() { 
	return new Object [] [] {
		{"macbook", 3}, 
		{"imac", 1}, 
		{"samsung", 2}, 
		{"canon", 1}, 
		{"airtel", 0}; 
	};
	
	} 
	@Test(dataProvider = "getSearchData") 
	public void searchTest(String searchKey, int resultCount) {
		Object searchResultsPage = homePage.doSearch(searchkey); 
		Assert.assertEquals(((Object) searchResultsPage).getProductResultsCount(), resultCount);
		} 
	}


	}

