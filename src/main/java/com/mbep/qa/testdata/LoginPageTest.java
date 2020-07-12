package com.mbep.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mbep.qa.base.TestBase;
import com.mbep.qa.pages.HomePage;
import com.mbep.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
	}
	//hear you can put test cases
	@Test(description="Veify Login Tittle")
	public void loginTittleTest() throws InterruptedException {
		loginPage.validateLoginPageTitle();
		Assert.assertTrue(true);
		Thread.sleep(10000);
		
	//}
	
	//@Test(description="Navigate to password reset page ")
	//public void Password_Reset_Page() {
		loginPage.Password_Reset();
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Password Reset Page is displayed");
	}
	
	//@Test(description="Verify Login")
	//public void loginTest() {
		//homePage=loginPage.login(prop.getProperty("un"),prop.getProperty("pwd"));
	//}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
