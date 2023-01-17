package pageobjectmodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import utility.Baseclass;

public class MyCatalogInterchangePom extends Baseclass {

	public MyCatalogInterchangePom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// <My Catalogs> menu link  ^^^^^^^^^^^
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
		
	@FindBy(xpath="//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;

	@FindBy(xpath="//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath="//div[@id='interchange']")
	private WebElement interchangeclick;

	@FindBy(xpath="//select[@id='drpCompetitorName']")
	private WebElement drpCompetitorName;
    
	//@FindBy(xpath="//*[@id='select2-drpCompetitorName-container']")
	//private WebElement drpCompetitorName;

	@FindBy(xpath="//input[@id='txtCompetitorPartno1']")
	private WebElement txtCompetitorPartno1;

	//@FindBy(xpath="(//input[@id='btnSaveInter']")
	@FindBy(xpath="(//input[@class='button_save'])[4]")
	private WebElement btnSave;

	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[2]/input")
	private WebElement eIntpartfilter;

	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[2]")
	private WebElement	ePDverify;


	 /////Interchange add End..

	///Interchange search Add...
	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_lnkLink1_5']")
	public WebElement MyCatalogs;

	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_rptLevel2_5_lnkLink2_2']")
	public WebElement MyCatalogInterchange;

	@FindBy(xpath = "//input[@id='MainContent_txtCompetitor']")
	public WebElement InterchangePartNumber;

	@FindBy(name = "ctl00$MainContent$drpsearch")
	public WebElement equals;
		
	@FindBy(xpath="//*[@id='MainContent_btnSearch']")
	public WebElement Search;

	@FindBy(xpath="//*[@id='MainContent_GVData_hylPartno_0']")
	public WebElement part;

	///Interchange search End ...

	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[5]/div/input[2]")
	private WebElement imgDelete_0;

	@FindBy(xpath="//*[@class='dataTables_empty']")
	private WebElement eDeleteVryText;



	public void partslanding() {
		partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}


	public void partsearch(String Partvalue) throws InterruptedException {
		txtpartsearch.sendKeys(Partvalue);
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		//System.out.println("total number of parts-->" + list.size());
		
		//for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i).getText());
			//if(list.get(i).getText().contains("Testpart-1 | Ignition Coil Test | Autoapa3")) {
			//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
				//list.get(i).click();
				//break;
			//}
		//}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void interchangesclick() throws InterruptedException {
		interchangeclick.click();
		Thread.sleep(2000);
	}
	public void interchangedrpdownnotes() throws InterruptedException {
		//driver.switchTo().frame(0);
		Thread.sleep(8000);
		WebElement intnotesselect = drpCompetitorName ;
		Select select = new Select(intnotesselect);
		select.selectByVisibleText("Test IntName 1");
		//select.selectByValue("2");
		Thread.sleep(4000);
	}

	public void Competitorpartno(String Enterpartpart) throws InterruptedException {
		txtCompetitorPartno1.sendKeys(Enterpartpart);
		Thread.sleep(4000);
	}
	public void savebtn() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", btnSave);
		//Actions a = new Actions(driver);
		//a.keyDown(Keys.SHIFT);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Thread.sleep(4000);
		btnSave.click();
		Thread.sleep(4000);
	}
	public void acceptAlert() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(5000);                         
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);
	}

	public void VerifyInterchange(String Enterpartpart) throws InterruptedException{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", eIntpartfilter);
			eIntpartfilter.sendKeys(Enterpartpart);
			Thread.sleep(10000);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			js.executeScript("arguments[0].scrollIntoView();", ePDverify);
			String actualText= ePDverify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(Enterpartpart);
			System.out.println("Both are same");
			
		}
		catch (Exception e)
		{
			System.out.println("Both are not same");
		}
	}

	public void MyCatalogsClick() throws Exception {
		MyCatalogs.click();	
		Thread.sleep(5000);
		
	}

	public void MyCatalogInterchangeClick() throws Exception {
		MyCatalogInterchange.click();
		Thread.sleep(5000);
	}
	public void EnterInterchangePartNumber(String Enterpartpart) throws Exception {
		InterchangePartNumber.sendKeys(Enterpartpart);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Testpart-2")) {
			//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
	}
	public void EqualsOption() throws Exception {
		Select Equals = new Select(equals);
		Equals.selectByIndex(3);
		Thread.sleep(5000);
	}

	public void ClickSearchButton() throws Exception {
		Search.click();	
		Thread.sleep(5000);
	}

	public void partclick() throws InterruptedException
	{
		part.click();
		Thread.sleep(5000);
	}
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}

	public void ClickBackNavigationButton1() {
		driver.navigate().back();
	}

	public void deletepartinter() throws InterruptedException {
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete_0);
		Baseclass.waitForElementToBeClickable(driver, imgDelete_0, 150).click();
		
		
		//wait//
		//imgDelete_0.click();
		//Thread.sleep(2000);
		//wait//
	}

	public void acceptDeleteAlert() throws InterruptedException{
		Thread.sleep(5000);
		WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(5000);                         
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();
		
		//wait//
		//pop.click();
		//Thread.sleep(5000);
		//wait//
		
	}

	public void VerifyDeleteIntchange(String partno2, String DeleteProducttxt) throws InterruptedException{
		Baseclass.waitForElementToBeVisible(driver, eIntpartfilter, 150).sendKeys(partno2);
		//wait//
		//Thread.sleep(5000);
		//eIntpartfilter.sendKeys(partno2);
		//Thread.sleep(5000);
		//wait//
		
		
		String text = eDeleteVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Interchange Not Deleted succesfully");

		} else {
			System.out.println("Interchange  Deleted succesfully");
		}

	}

	public void acceptinvalidalert() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();	
	}
	}