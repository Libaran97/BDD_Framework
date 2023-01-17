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


public class ApplicationAddNonAces  extends Baseclass{
	public ApplicationAddNonAces() {
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
	
	@FindBy(xpath ="(//input[@name='ctl00$MainContent$rblist'])[2]")
	public WebElement eNonAces;
	
	@FindBy(id ="MainContent_txtcylinders")
	public WebElement eCylinder;
	
	@FindBy(id ="MainContent_txtcc")
	public WebElement eCc;
	
	@FindBy(id ="MainContent_txtliter")
	public WebElement eLiter;
	
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
	
	//@FindBy(xpath ="//input[@id='MainContent_btnFilterSearch']")
	@FindBy(xpath="//input[@class='button_search']")
	public WebElement eSearchButton2;
	
	@FindBy(xpath ="//span[@id='MainContent_GVData_lblEngineBase_0']")
	public WebElement eAppverify;
	
	public void ClickApplication() throws Exception {
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, eApplication, 250).click();
		//wait///
		//eApplication.click();
		Thread.sleep(8000);
		//wait///
	}

	public void ClickAddApplication() throws InterruptedException {
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, eAddApplication, 250).click();
		Thread.sleep(8000);
		//wait//
		//eAddApplication.click();
		//Thread.sleep(5000);
		//wait//
	}
	public void ChooseVehicle(String vehicletypename) throws InterruptedException {
		Thread.sleep(2000);
		Select vehicle = new Select(eSelectVehicle);
		vehicle.selectByVisibleText(vehicletypename);
		Thread.sleep(5000);
	
		}

	public void ChooseMake(String makename) throws InterruptedException {
	 
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(makename);
		Thread.sleep(5000);
		
		}
 
	public void ChooseModel(String modelname ) throws InterruptedException {
		
		Select model = new Select(eSelectModel);
		model.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	public void ApplicationYear(String EnterYear) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eYear, 250).sendKeys(EnterYear);
		//wait//
		//eYear.sendKeys(EnterYear);
		Thread.sleep(2000);
		//wait//
		}
	public void checkNonAces() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eNonAces, 250).click();
		//wait//
		//eNonAces.click();
		Thread.sleep(2000);
		//wait//
	}
	public void EngineDetails(String Cylindervalue, String Ccvalue,String litervalue ) throws InterruptedException {
		
		Baseclass.waitForElementToBeVisible(driver,eCylinder, 250).sendKeys(Cylindervalue);
		Baseclass.waitForElementToBeVisible(driver, eCc, 250).sendKeys(Ccvalue);
		Baseclass.waitForElementToBeVisible(driver, eLiter, 250).sendKeys(litervalue);
		//wait//
		//eCylinder.sendKeys(Cylindervalue);
		//eCc.sendKeys(Ccvalue);
		//eLiter.sendKeys(litervalue);
		//Thread.sleep(3000);
		//wait//
	}
	public void Clicksave() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eSaveButton);
		eSaveButton.click();
		Thread.sleep(5000);
		
		}
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		}
public void ChooseVehicle01(String vehicletypename) throws InterruptedException {
		Thread.sleep(2000);
		Select vehicle = new Select(eSelectVehicle);
		vehicle.selectByVisibleText(vehicletypename);
		Thread.sleep(5000);
	
		}

	public void ChooseMake01(String makename) throws InterruptedException {
		Thread.sleep(2000);
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(makename);
		Thread.sleep(5000);
		
		}
 
	public void ChooseModel01(String modelname ) throws InterruptedException {
		
		Select model = new Select(eSelectModel);
		model.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	public void ApplicationYear01(String EnterYear) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,eYear, 250).sendKeys(EnterYear);
		//wait//
		//eYear.sendKeys(EnterYear);
		//Thread.sleep(3000);
		//wait//
		}
	
	public void ChooseMakevry01(String makename ) throws InterruptedException {
		Thread.sleep(2000);
		Select Vmake = new Select(eVSelectMake);
		Vmake.selectByVisibleText(makename);
		Thread.sleep(8000);
		
		}
 
	public void ChooseModelvry01(String modelname ) throws InterruptedException {
		
		Select Vmodel = new Select(eVSelectModel);
		Vmodel.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	
	
	
	
	public void ClickApplication2() throws InterruptedException {
		try {
			Thread.sleep(3000);
			Baseclass.waitForElementToBeClickable(driver, eApplication2, 250).click();
			//wait//
			//eApplication2.click();
			Thread.sleep(3000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Thread.sleep(3000);
			Baseclass.waitForElementToBeClickable(driver, eApplication2, 250).click();
			//wait///
			//eApplication2.click();
			Thread.sleep(3000);
			//wait///
		}
	}
	
   public void ChooseVehiclevry(String vehicletypename0) throws InterruptedException {
	   Thread.sleep(2000);
		Select Vvehicle = new Select(eVSelectVehicle);
		Vvehicle.selectByVisibleText(vehicletypename0);
		Thread.sleep(5000);
	
		}

	public void ChooseMakevry(String makename ) throws InterruptedException {
	 
		Select Vmake = new Select(eVSelectMake);
		Vmake.selectByVisibleText(makename);
		Thread.sleep(8000);
		
		}
 
	public void ChooseModelvry(String modelname ) throws InterruptedException {
		
		Select Vmodel = new Select(eVSelectModel);
		Vmodel.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	public void Clicksearch() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 250).click();
			//wait//
			//eSearchButton.click();
			Thread.sleep(3000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 250).click();
			//wait//
			//eSearchButton.click();
			//Thread.sleep(6000);
			//wait//
		}
		}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		Thread.sleep(2000);
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(5000);
	
		}
	public void SelectsearchTextbox(String SearchText1) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSelectsearchbox, 250).sendKeys(SearchText1);
		//wait//
		//eSelectsearchbox.sendKeys(SearchText1);
		Thread.sleep(5000);
		//wait//
		
	}
	public void Clicksearch2() throws InterruptedException {
		try {
			//Baseclass.waitForElementToBeClickable(driver, eSearchButton2, 250).click();
			//wait//
			eSearchButton2.click();
	Thread.sleep(8000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			//Baseclass.waitForElementToBeClickable(driver, eSearchButton2, 250).click();
			//wait//
			//eSearchButton2.click();
	Thread.sleep(3000);
			//wait//
		}
		}
	public void verifytext1(String SearchText1) throws Exception
	{		
		
		Thread.sleep(12000);
		String actualText= eAppverify.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(SearchText1))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
}
