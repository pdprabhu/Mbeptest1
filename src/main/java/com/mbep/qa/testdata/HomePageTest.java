package com.mbep.qa.testdata;

import org.testng.annotations.AfterMethod;
//import org.testng.ITestResult;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import com.mbep.qa.base.TestBase;
import com.mbep.qa.pages.HomePage;
import com.mbep.qa.pages.LoginPage;


public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws ThreadTimeoutException{
		
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("un"),prop.getProperty("pwd"));
	}
	@Test(description = "Navigate to Retail Evolution")
	public void RetailEvolution() throws InterruptedException {
		homePage.Retail_Evolution();
	}
	@Test(description = "Navigate to current MBEP Program main")
	public void CurrentMBEPProgramMain() throws InterruptedException {
		homePage.Current_MBEP_Program_Main();
	}
	@Test(description = "Navigate to MBEP Hawaii Program")
	public void MBEPHawaiiProgram() throws InterruptedException {
		homePage.MBEP_Hawaii_Program();
	}
	@Test(description = "Navigate to MBEP NC Program")
	public void MBEPNCProgram() throws InterruptedException {
		homePage.MBEP_NC_Program();
	}
	@Test(description="Navigate to Facility Information")
	public void FacilityInformation() throws InterruptedException {
		homePage.Facility_Information();
	}
	@Test(description="Navigate to Facility Information Report")
	public void FacilityInformationReport() throws InterruptedException {
		homePage.Facility_Information_Report();
	}
	@Test(description="Navigate to MFI Freeze Period")
	public void MFIFreezePeriod() throws InterruptedException {
		homePage.MFI_Freeze_Period();
	}
	@Test(description="Navigate to Dealer Status Summary")
	public void DealerStatusSummary() throws InterruptedException {
		homePage.Dealer_Status_Summary();
	}
	@Test(description="Navigate to Earnings Summary")
	public void EarningsSummary() throws InterruptedException {
		homePage.Earnings_Summary();
	}
	@Test(description="Navigate to Earnings Detail")
	public void EarningsDetail() throws InterruptedException {
		homePage.Earnings_Detail();
	}
	@Test(description="Navigate to Escrow Summary")
	public void EscrowSummary() throws InterruptedException {
		homePage.Escrow_Summary();
	}
	@Test(description="Navigate to Escrow Summary")
	public void PaymentManagement() throws InterruptedException {
		homePage.Payment_Management();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

