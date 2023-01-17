package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class DeleteApplication extends Baseclass{
	public DeleteApplication() {
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
		@CacheLookup
		public WebElement eApplication;
		
		@FindBy(xpath ="//select[@id='MainContent_drpVehicleType']")
		public WebElement eSelectVehicle;
		
		@FindBy(xpath ="//select[@id='MainContent_drpMake']")
		public WebElement eSelectMake;
		
		@FindBy(xpath ="//select[@id='drpModel']")
		public WebElement eSelectModel;
		
		@FindBy(xpath ="//input[@id='MainContent_imgbtnsearch']")
		public WebElement eSearchButton;
		
		@FindBy(xpath ="//select[@id='MainContent_ddlFilter']")
		public WebElement eSelectFilter;
		
		@FindBy(xpath ="//input[@id='MainContent_txtFind']")
		public WebElement eSelectsearchbox;
		
		@FindBy(xpath ="//input[@id='MainContent_btnFilterSearch']")
		public WebElement eSearchButton2;
		
		@FindBy(xpath ="//input[@id='MainContent_GVData_imgDelete_0']")
		public WebElement eDeleteButton;
		
		
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
		@CacheLookup
		public WebElement eApplication2;
		
		public void ClickApplication() throws InterruptedException {
			eApplication.click();
			Thread.sleep(3000);
		}
		

		public void ChooseVehicle(String vehicletypename) throws InterruptedException {
			
			Select vehicle = new Select(eSelectVehicle);
			vehicle.selectByVisibleText(vehicletypename);
			Thread.sleep(5000);
		
			}

		public void ChooseMake(String makename ) throws InterruptedException {
		 
			Select make = new Select(eSelectMake);
			make.selectByVisibleText(makename);
			Thread.sleep(5000);
			
			}
	 
		public void ChooseModel(String modelname ) throws InterruptedException {
			
			Select model = new Select(eSelectModel);
			model.selectByVisibleText(modelname);
			Thread.sleep(3000);
			
			}
		public void Clicksearch() throws InterruptedException {
			eSearchButton.click();
			Thread.sleep(3000);
			}

		public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
			
			Select Filer = new Select(eSelectFilter);
			Filer.selectByVisibleText(SelectFilterName);
			Thread.sleep(3000);
		
			}
		public void SelectsearchTextbox(String SearchText2) throws InterruptedException {
			eSelectsearchbox.sendKeys(SearchText2);
			Thread.sleep(3000);
			
		}
		public void Clicksearch2() throws InterruptedException {
			eSearchButton2.click();
			Thread.sleep(3000);
			}
		public void ClickDelete() throws InterruptedException {
			eDeleteButton.click();
			Thread.sleep(3000);
			}
		public void acceptAlert() throws InterruptedException{
			Alert alert = driver.switchTo().alert();
			System.out.println("NonAcess: " + alert.getText());
			alert.accept();
			Thread.sleep(3000);
			alert.accept();
			Thread.sleep(3000);
			
			}
		public void dClickApplication() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			eApplication2.click();
			Thread.sleep(3000);
		}
		

		public void dChooseVehicle(String vehicletypename) throws InterruptedException {
			
			Select dvehicle = new Select(eSelectVehicle);
			dvehicle.selectByVisibleText(vehicletypename);
			Thread.sleep(5000);
		
			}

		public void dChooseMake(String makename ) throws InterruptedException {
		 
			Select dmake = new Select(eSelectMake);
			dmake.selectByVisibleText(makename);
			Thread.sleep(5000);
			
			}
	 
		public void dChooseModel(String modelname ) throws InterruptedException {
			
			Select dmodel = new Select(eSelectModel);
			dmodel.selectByVisibleText(modelname);
			Thread.sleep(3000);
			
			}
		public void dClicksearch() throws InterruptedException {
			eSearchButton.click();
			Thread.sleep(3000);
			}

		public void dSelectFiterdropdown(String SelectFilterName) throws InterruptedException {
			
			Select dFiler = new Select(eSelectFilter);
			dFiler.selectByVisibleText(SelectFilterName);
			Thread.sleep(3000);
		
			}
		public void dSelectsearchTextbox(String SearchText2) throws InterruptedException {
			eSelectsearchbox.sendKeys(SearchText2);
			Thread.sleep(3000);
			
		}
		public void dClicksearch2() throws InterruptedException {
			eSearchButton2.click();
			Thread.sleep(3000);
			}
		public void verifytext1(String AlertVrytext)
		{
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Alert alert2 = driver.switchTo().alert();
			String actualText= alert2.getText();
			System.out.println("Text"+actualText);
			
			if(actualText.equals(AlertVrytext))
			{
				System.out.println("Both are same");
				alert2.accept();
			}
			else
			{
				System.out.println("Both are not same");
				alert2.accept();
			}
			
		}

}
