package com.mbep.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.mbep.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Retail Evolution Escrow Rules']")
	WebElement RetailEvolutionEscrowRules; 
	
	@FindBy(xpath="//span[text()='INFORMATION']")
	WebElement Informationtab;
	
	@FindBy(xpath="//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a/span")
	WebElement CurrentOverallTermsCondition; 
	
	@FindBy(xpath="//span[text()='Main MBEP Program']")
	WebElement MainMBEPProgram; 
	
	@FindBy(xpath="//span[text()='MBEP Hawaii Program']")
	WebElement MBEPHawaiiProgram;
	
	@FindBy(xpath="//span[text()='MBEP NC Program']")
	WebElement MBEPNCProgram;
	
	@FindBy(xpath="//span[text()='FACILITY']")
	WebElement Facilitytab;
	
	@FindBy(xpath="//span[text()='Facility Information']")
	WebElement FacilityInformation;
	
	@FindBy(xpath="//span[text()='Facility Information Report']")
	WebElement FacilityInformationReport;
	
	@FindBy(xpath="//span[text()='MFI Freeze Period']")
	WebElement MFIFreezePeriod;
	
	@FindBy(xpath="//span[text()='PERFORMANCE AND PAYMENT']")
	WebElement PERFORMANCEANDPAYMENTtab;
	
	@FindBy(xpath="//span[text()='Dealer Status Summary']")
	WebElement DealerStatusSummary;
	
	@FindBy(xpath="//span[text()='Earnings Summary']")
	WebElement EarningsSummary;
	
	@FindBy(xpath="//span[text()='Earnings Detail']")
	WebElement EarningsDetail;
	
	@FindBy(xpath="//span[text()='Escrow Summary']")
	WebElement EscrowSummary;
	
	@FindBy(xpath="//span[text()='ADMINISTRATION']")
	WebElement Administrationtab;
	
	@FindBy(xpath="//span[text()='Payment Management April-19 Onwards']")
	WebElement PaymentManagement;
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public InformationPage Retail_Evolution() throws InterruptedException {
		Thread.sleep(5000);
		Informationtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(RetailEvolutionEscrowRules).perform();
		RetailEvolutionEscrowRules.click();
		Thread.sleep(5000);
		System.out.println("RetailEvolutionEscrowRules downloaded successfully");
		return new InformationPage();
	}
	public InformationPage Current_MBEP_Program_Main() throws InterruptedException {
		Thread.sleep(5000);
		Informationtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(CurrentOverallTermsCondition).perform();
		actions.moveToElement(MainMBEPProgram).perform();
		MainMBEPProgram.click();
		Thread.sleep(5000);
		System.out.println("Main MBEP Program downloaded successfully");
		return new InformationPage();
	}
	public InformationPage MBEP_Hawaii_Program() throws InterruptedException {
		Thread.sleep(5000);
		Informationtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(CurrentOverallTermsCondition).perform();
		actions.moveToElement(MBEPHawaiiProgram).perform();
		MBEPHawaiiProgram.click();
		Thread.sleep(5000);
		System.out.println("MBEP Hawaii Program downloaded successfully");
		return new InformationPage();
	}
	public InformationPage MBEP_NC_Program() throws InterruptedException {
		Thread.sleep(5000);
		Informationtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(CurrentOverallTermsCondition).perform();
		actions.moveToElement(MBEPNCProgram).perform();
		MBEPNCProgram.click();
		Thread.sleep(5000);
		System.out.println("MBEP NC Program downloaded successfully");
		return new InformationPage();
	}
	
	public FacilityPage Facility_Information() throws InterruptedException{
		Facilitytab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(FacilityInformation).perform();
		FacilityInformation.click();
		Thread.sleep(5000);
		System.out.println("Facility Information page is displayed");
		driver.navigate().back();
		return new FacilityPage();
		
	}
	public FacilityPage Facility_Information_Report() throws InterruptedException {
		Facilitytab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(FacilityInformationReport).perform();
		FacilityInformationReport.click();
		Thread.sleep(5000);
		System.out.println("Facility Information Report page is displayed");
		driver.navigate().back();
		return new FacilityPage();
	}
	public FacilityPage MFI_Freeze_Period() throws InterruptedException {
		Facilitytab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(MFIFreezePeriod).perform();
		MFIFreezePeriod.click();
		Thread.sleep(5000);
		System.out.println("MFI Freeze Period page is displayed");
		driver.navigate().back();
		return new FacilityPage();
	}
	public PerformanceAndPaymentPage Dealer_Status_Summary() throws InterruptedException {
		PERFORMANCEANDPAYMENTtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(DealerStatusSummary).perform();
		DealerStatusSummary.click();
		Thread.sleep(5000);
		System.out.println("Dealer Status Summary page is displayed");
		driver.navigate().back();	
		return new PerformanceAndPaymentPage();
		
	}
	public PerformanceAndPaymentPage Earnings_Summary() throws InterruptedException {
		PERFORMANCEANDPAYMENTtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(EarningsSummary).perform();
		EarningsSummary.click();
		Thread.sleep(5000);
		System.out.println("Earnings Summary page is displayed");
		driver.navigate().back();	
		return new PerformanceAndPaymentPage();
		
	}
	public PerformanceAndPaymentPage Earnings_Detail() throws InterruptedException {
		PERFORMANCEANDPAYMENTtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(EarningsDetail).perform();
		EarningsDetail.click();
		Thread.sleep(5000);
		System.out.println("Earnings Detail page is displayed");
		driver.navigate().back();	
		return new PerformanceAndPaymentPage();
		
	}
	public PerformanceAndPaymentPage Escrow_Summary() throws InterruptedException {
		PERFORMANCEANDPAYMENTtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(EscrowSummary).perform();
		EscrowSummary.click();
		Thread.sleep(5000);
		System.out.println("Escrow Summary page is displayed");
		driver.navigate().back();	
		return new PerformanceAndPaymentPage();
		
	}
	public AdministrationPage Payment_Management() throws InterruptedException {
		Administrationtab.click();
		Actions actions=new Actions(driver);
		actions.moveToElement(PaymentManagement).perform();
		PaymentManagement.click();
		Thread.sleep(5000);
		System.out.println("Payment Management page is displayed");
		driver.navigate().back();	
		return new AdministrationPage();
		
	}

}
