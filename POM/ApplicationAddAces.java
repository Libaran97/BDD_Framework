package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class ApplicationAddAces extends Baseclass {
	
	public ApplicationAddAces() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;
	
	@FindBy(xpath ="//button[@id='MainContent_btnAdd']")
	public WebElement eAddApplication;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleTypeAdd']")
	public WebElement eSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMakeAdd']")
	public WebElement eSelectMake;
	
	@FindBy(xpath ="//select[@id='MainContent_drpModelAdd']")
	public WebElement eSelectModel;
	
	@FindBy(xpath ="//input[@id='MainContent_txtYear']")
	public WebElement eYear;
	
	//@FindBy(xpath ="//input[@id='MainContent_rblist_0']")
	@FindBy(xpath="(//input[@name='ctl00$MainContent$rblist'])[2]")
	public WebElement eNONAces;
	
	
	//@FindBy(xpath ="//select[@id='MainContent_ddlEnginebase']")goo
	//public WebElement eEngineBase;ggggggggggooooooooooooooooo
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication2;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleType']")
	public WebElement eVSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMake1']")
	public WebElement eVSelectMake;
	
	@FindBy(xpath ="//select[@id='drpModel1']")
	public WebElement eVSelectModel;
	
	@FindBy(xpath ="//button[@id='MainContent_imgbtnsearchnew']")
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//select[@id='MainContent_ddlFilter']")
	public WebElement eSelectFilter;
	
	@FindBy(xpath ="//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox;
	
	@FindBy(xpath ="//button[@id='MainContent_imgbtnsearchnew']")
	public WebElement eSearchButton2;
	
	@FindBy(xpath ="//span[@id='MainContent_GVData_lblEngineBase_0']")
	public WebElement eAppverify;
	
	@FindBy(xpath ="//span[@id='MainContent_GVData_lblYear_0']")
	public WebElement eAppverifyYr;
	
	
	public void ClickApplication() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eApplication, 90).click();
		//wait//
		//eApplication.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void ClickAddApplication() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eAddApplication, 90).click();
		
		//wait//
		//eAddApplication.click();
		//Thread.sleep(8000);//5000
		//wait//
	}
	public void ChooseVehicle(String vehicletypename0) throws InterruptedException {
		Thread.sleep(2000);
		Select vehicles = new Select(eSelectVehicle);
		vehicles.selectByVisibleText(vehicletypename0);
		Thread.sleep(4000);//3000
	
		}

	public void ChooseMake(String makename) throws InterruptedException {
	 
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(makename);
		Thread.sleep(3000);
		
		}
 
	public void ChooseModel(String modelname) throws InterruptedException {
		
		Select model = new Select(eSelectModel);
		model.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	public void ApplicationYear(String EnterYear) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eYear, 90).sendKeys(EnterYear);
		//wait//
	//	eYear.sendKeys(EnterYear);
		//Thread.sleep(3000);
		//wait//
		}
	public void checkAces() throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver, eNONAces, 90).click();
		//wait//
		//eNONAces.click();
		//Thread.sleep(3000);
		//wait//
		}
//	public void ChooseEngineBase(String engine1) throws InterruptedException {
//		Select engine = new Select(eEngineBase);
//		engine.selectByVisibleText(engine1);
//		Thread.sleep(3000);
//		}
	
	public void Clicksave() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eSaveButton);
		eSaveButton.click();
		Thread.sleep(5000);
		
		}
	public void acceptAlert() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(5000);
		}
	public void ClickApplication2() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver,eApplication2, 90).click();
			//wait//
			//eApplication2.click();
			//Thread.sleep(3000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver,eApplication2, 90).click();
			//wait//
			//eApplication2.click();
			//Thread.sleep(6000);
			//wait//
		}
	}
	
//   public void ChooseVehiclevry(String vehicletypename) throws InterruptedException {
//	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Select Vvehicle = new Select(eVSelectVehicle);
//		Vvehicle.selectByVisibleText(vehicletypename);
//		
//	
//		}

	public void ChooseMakevry(String makename) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Select Vmake = new Select(eVSelectMake);
		Vmake.selectByVisibleText(makename);
		
		
		}
 
	public void ChooseModelvry(String modelname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Select Vmodel = new Select(eVSelectModel);
		Vmodel.selectByVisibleText(modelname);
		
		
		}
	public void Clicksearch() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 90).click();
			//eSearchButton.click();
		///	Thread.sleep(6000);
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 90).click();
			//eSearchButton.click();
			//Thread.sleep(6000);
		}
		}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		Thread.sleep(2000);
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(6000);
	
		}
	public void SelectsearchTextbox(String SearchTextAcesEngine) throws InterruptedException {
		
		try {
			Baseclass.waitForElementToBeVisible(driver, eSelectsearchbox, 90).sendKeys(SearchTextAcesEngine);
			
			//eSelectsearchbox.sendKeys(SearchTextAcesEngine);
			//Thread.sleep(3000);
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeVisible(driver, eSelectsearchbox, 90).sendKeys(SearchTextAcesEngine);
			//wait//
			//eSelectsearchbox.sendKeys(SearchTextAcesEngine);
			//Thread.sleep(3000);
			//wait//
		}
		
	}
	public void Clicksearch2() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton2, 90).click();
			//wait//
			//eSearchButton2.click();
			//Thread.sleep(5000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton2, 90).click();
			
			//wait//
			//eSearchButton2.click();
			//Thread.sleep(3000);
			//wait//
		}
		}
	public void verifytext1(String SearchTextVey) throws InterruptedException
	{
		
		
		Thread.sleep(5000);
		String actualText= eAppverify.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(SearchTextVey))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
	
	public void verifyyear(String EnterInvalidYear) throws InterruptedException
	{
		
		
		Thread.sleep(5000);
		String actualText= eAppverifyYr.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(EnterInvalidYear))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
}
