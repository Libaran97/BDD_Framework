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

public class EditApplication extends Baseclass {
	public EditApplication() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	public WebElement eSelectVehicle;

	// @FindBy(xpath ="//select[@id='MainContent_drpMake']")
	@FindBy(xpath = "//select[@id='MainContent_drpMake1']")
	public WebElement eSelectMake;

	// @FindBy(xpath ="//select[@id='drpModel']")
	@FindBy(xpath = "//select[@id='drpModel1']")
	public WebElement eSelectModel;

	// @FindBy(xpath ="//input[@id='MainContent_imgbtnsearch']")
	@FindBy(xpath = "//button[@id='MainContent_imgbtnsearchnew']")
	public WebElement eSearchButton;

	@FindBy(xpath = "//select[@id='MainContent_ddlFilter']")
	public WebElement eSelectFilter;

	@FindBy(xpath = "//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox;

	@FindBy(xpath = "//input[@id='MainContent_btnFilterSearch']")
	public WebElement eSearchButton2;

	@FindBy(xpath = "//input[@id='MainContent_GVData_imgEdit_0']")
	public WebElement eEditButton;

	@FindBy(id = "MainContent_txtcc")
	public WebElement eCc;

	@FindBy(xpath = "//input[@id='MainContent_btnupdate']")
	public WebElement eUpdateButton;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication2;

	@FindBy(xpath = "//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox2;

	@FindBy(xpath = "//span[@id='MainContent_GVData_lblEngineBase_0']")
	public WebElement eAppverify;

	public void ClickApplication() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eApplication, 250).click();
		//wait//
		//eApplication.click();
		Thread.sleep(2000);
		//wait//
	}

	public void ChooseVehicle(String vehicletypename0) throws InterruptedException {
		Thread.sleep(4000); 
		Select vehicle = new Select(eSelectVehicle);
		vehicle.selectByVisibleText(vehicletypename0);
		Thread.sleep(4000);

	}

	public void ChooseMake(String makename) throws InterruptedException {
		Thread.sleep(5000); 
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(makename);
		Thread.sleep(5000);

	}

	public void ChooseModel(String modelname) throws InterruptedException {

		Select model = new Select(eSelectModel);
		model.selectByVisibleText(modelname);
		Thread.sleep(5000);

	}

	public void Clicksearch() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 150).click();
			//wait//
			//eSearchButton.click();
			//Thread.sleep(9000);
			//wait//
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			
			Baseclass.waitForElementToBeClickable(driver, eSearchButton, 150).click();
			//wait//
			//eSearchButton.click();
			//Thread.sleep(9000);
			//wait//
		}
	}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		Thread.sleep(3000);
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(3000);

	}

	public void SelectsearchTextbox1(String SearchText1) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSelectsearchbox, 150).sendKeys(SearchText1);
		//wait//
		//eSelectsearchbox.sendKeys(SearchText1);
		//Thread.sleep(3000);
		//wait//

	}

	public void Clicksearch2() throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSearchButton2, 250).click();
			//wait//
			//eSearchButton2.click();
			Thread.sleep(2000);
			//wait//
			
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver,eSearchButton2, 150).click();
			//wait//
			//eSearchButton2.click();
			//Thread.sleep(5000);
			//wait//
		}
	}

	public void ClickEdit() throws InterruptedException {
		
		try
		{
		Baseclass.waitForElementToBeClickable(driver,eEditButton, 150).click();
		}catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver,eEditButton, 150).click();
		}
		//wait//
		//eEditButton.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void EditCc(String EditCcvalue) throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver,eCc, 150).clear();
		Baseclass.waitForElementToBeVisible(driver, eCc, 150).sendKeys(EditCcvalue);
		//wait//
		//eCc.clear();
		//Thread.sleep(3000);
		//eCc.sendKeys(EditCcvalue);
		//wait//

	}

	public void ClickUpdate() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eUpdateButton);
		Baseclass.waitForElementToBeClickable(driver, eUpdateButton, 150).click();
		
		//wait//
		//eUpdateButton.click();
		//Thread.sleep(5000);
		//wait//

	}

	public void acceptAlert() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void ClickApplication2() throws InterruptedException {

		try {
			Baseclass.waitForElementToBeClickable(driver,eApplication2, 150).click();
			
			//wait//
			//eApplication2.click();
			//Thread.sleep(3000);
			//wait//
			
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver, eApplication2, 150).click();
			
			//wait//
			//eApplication2.click();
			//Thread.sleep(3000);
			//wait//
		}
	}

	public void SelectsearchTextbox2(String SearchText2) throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver, eSelectsearchbox2, 150).click();
			//wait//
			//eSelectsearchbox2.sendKeys(SearchText2);
			//Thread.sleep(3000);
			//wait//
			
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			Baseclass.waitForElementToBeClickable(driver, eSelectsearchbox2, 150).click();
			//wait//
			//eSelectsearchbox2.sendKeys(SearchText2);
			//Thread.sleep(3000);
			//wait//
		}

	}

	public void verifytext1(String SearchText2) throws Exception {

		Thread.sleep(8000);
		String actualText = eAppverify.getText();
		System.out.println("Text" + actualText);
		if (actualText.equals(SearchText2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

}
