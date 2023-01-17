package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class Buyersguide_POM extends Baseclass {

	public Buyersguide_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	@FindBy(xpath = "//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;
//edit
	@FindBy(xpath = "//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement BuyersGuid1click;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	private WebElement drpVehicleType;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	private WebElement drpMake;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	private WebElement drpModel;

	@FindBy(xpath = "//input[@id='MainContent_searchbtn']")
	private WebElement searchbtn;

	//@FindBy(xpath = "//input[@id='MainContent_GvApplications_chkActivee1_1']")//button[@id='MainContent_btnnonacesattributes']
	@FindBy(xpath="//button[@id='MainContent_btnnonacesattributes']")
	private WebElement selectappln;
	
	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
	private WebElement checkALL;

	@FindBy(xpath = "//input[@id='MainContent_btnSave_guid']")
	private WebElement btnSave;

	@FindBy(xpath = "//tr[@id='tr_0']//input[@id='appartsedit_btn']")
	private WebElement appartsedit_btn;

	@FindBy(xpath = "//textarea[@id='MainContent_GvApplications_txtapppartsnotes_0']")
	private WebElement apppartsnotes;

	@FindBy(xpath = "//tr[@id='tr_0']//input[@name='ctl00$MainContent$checkbox2']")
	private WebElement Delete_checkbox2;

	@FindBy(xpath = "//div[@class='dataTables_scrollHeadInner']//input[@id='apppartdelete']")
	private WebElement apppartdelete;

	@FindBy(xpath = "//input[@id='MainContent_btnUpdate']")
	private WebElement btnUpdate;

	@FindBy(xpath = "(//input[@placeholder='Year Range'])[1]")
	WebElement efilter;

	@FindBy(xpath = "(//input[@placeholder='Engine Details'])[1]") //
	WebElement efilter2;
	
	

	//@FindBy(xpath = "//*[@role='row']/td[4]")//year 
	@FindBy(xpath="(//input[@placeholder='Year Range'])[1]")//input[@placeholder='Year Range')[1]
	WebElement everifynon1ACES;

	@FindBy(xpath = "//table[@id='tbl_apppartstable']/tbody/tr/td")  
	WebElement everifynon1ACESdel;

	@FindBy(xpath="//input[@id='MainContent_txtenginebase']")
	private WebElement drptext;
	
	@FindBy(xpath="(//input[@name=\"chklistitem10\"])[2]")
	private WebElement drpcheckbox;
	
	@FindBy(xpath="/html/body/div[2]/div/div[3]/button[1]")
	private WebElement deletealert;
	
	
	
	
	
	
	
	//given
	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 250).click();
		
		///wait//
		//partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		///wait//
	}

	public void partsearch(String partnoenter) throws InterruptedException {
		txtpartsearch.sendKeys(partnoenter);
	     Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
			//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
				list.get(i).click();
				break;
			}
		}
		Baseclass.waitForElementToBeClickable(driver, btnPsearch, 250).click();
		//wait//
		//btnPsearch.click();
		//Thread.sleep(8000);
		//wait//
	}

	public void buyerguideclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, BuyersGuid1click, 250).click();
		//wait//
		//Thread.sleep(3000);
		//BuyersGuid1click.click();
		//Thread.sleep(5000);
		//wait//

	}

	public void apppartsvehicldropdown(String vehicletypename0) throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		WebElement vehiclesselect = drpVehicleType;
		Select select = new Select(vehiclesselect);
		select.selectByVisibleText(vehicletypename0);
		
		Thread.sleep(5000);
	}

	public void apppartsmakedropdown(String makename) throws InterruptedException {
		
		WebElement makeselect = drpMake;
		Select select = new Select(makeselect);
		select.selectByVisibleText(makename);
		
		Thread.sleep(5000);
	}

	public void apppartsmodeldropdown(String modelname) throws InterruptedException {
		WebElement modelselect = drpModel;
		Select select = new Select(modelselect);
		select.selectByVisibleText(modelname);
		
		Thread.sleep(5000);
	}

	public void apppartsearch() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, searchbtn, 250).click();
		///wait//
		//searchbtn.click();
		//Thread.sleep(8000);
		///wait//
	}

	
	
	public void Alcheck() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, checkALL, 250).click();
		//wait//
		//checkALL.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void savebtn() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		btnSave.click();
		Thread.sleep(8000);
	}

	public void updatebtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnUpdate);
		btnUpdate.click();
		Thread.sleep(8000);
	}

	
	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + "application added " + alert.getText());
		alert.accept();
		Thread.sleep(4000);
	}

	public void acceptAlert1() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + "application deleted" + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
	}
	

	public void editappparts() throws InterruptedException {
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", appartsedit_btn);

		appartsedit_btn.click();
		Thread.sleep(2000);

	}
	

	public void apppartsnote(String apppartnotes) throws InterruptedException {
		Thread.sleep(2000);

		Baseclass.waitForElementToBeVisible(driver, apppartsnotes, 250).sendKeys(apppartnotes);
		//apppartsnotes.sendKeys(apppartnotes);

	}

	public void deletebuyerappln() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Delete_checkbox2);
		Delete_checkbox2.click();
		js.executeScript("arguments[0].scrollIntoView();", apppartdelete);
		apppartdelete.click();
		Thread.sleep(3000);

	}

	public void bguideverification() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, efilter, 250).sendKeys(pro.getProperty("EnterInvalidYear"));
		Baseclass.waitForElementToBeVisible(driver, efilter2, 250).sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		
		//wait//
		//efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//wait//
		

		String actualText = everifynon1ACES.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(pro.getProperty("EnterInvalidYear"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void deleteAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", deletealert);
		deletealert.click();;
		Thread.sleep(2000);
		
	}
	
	public void bguideverificationdel() throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver,efilter, 250).sendKeys(pro.getProperty("EnterInvalidYear"));
		Baseclass.waitForElementToBeVisible(driver,efilter2, 250).sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		//wait//
		//efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		//wait//
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = everifynon1ACESdel.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains("No data available in table")) {
			System.out.println("Deleted successfully");
		} else {
			System.out.println("Both are not same");
		}

	}
	
	public void appartsenginetextbox() throws InterruptedException
	{
		Baseclass.waitForElementToBeClickable(driver, drptext, 250).click();
		Baseclass.waitForElementToBeClickable(driver, drpcheckbox, 250).click();
		//wait//
	//drptext.click();
	//Thread.sleep(2000);
	//drpcheckbox.click();
		//wait//
	}

	
}
