package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class Catalogbuyerguide extends Baseclass{

	
	
	public Catalogbuyerguide() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_5']")
	@CacheLookup
	public WebElement MyCatalogs;
	
	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_rptLevel2_5_lnkLink2_1']")
	public WebElement BuyersGuide;
	
	@FindBy(xpath="//*[@name='ctl00$MainContent$txtMelling']")
	public WebElement Parttext;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnSearch']")
	public WebElement btnPsearch;
	
	@FindBy(xpath="//*[@id=\"MainContent_GVData_hylPartno_0\"]")
	public WebElement partsdataclick;
	
	
	
	public void MyCatalogclick() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(MyCatalogs).build().perform();
		Baseclass.waitForElementToBeClickable(driver,BuyersGuide, 150).click();
		
		//wait//
		//Thread.sleep(5000);
		//BuyersGuide.click();
		//Thread.sleep(8000);
		//wait//
	}
	
	public void partsearch(String partnoenter1) throws InterruptedException {
		
		//Parttext.sendKeys(partnoenter);
		Baseclass.waitForElementToBeVisible(driver, Parttext, 250).sendKeys(partnoenter1);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ACBehavior_completionListElem\"]"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
			//if(list.get(i).getText().equalsIgnoreCase("tesapapmt | Engine oil test | Autoapatest")) {
				list.get(i).click();
			break;
			
}}

		
		}
	
	public void search() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, btnPsearch,150).click();
		
		//wait//
//	btnPsearch.click();
	//Thread.sleep(8000);
		//wait//
	
	}
	
	
	
	public void partsdata() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,partsdataclick,150).click();
		//wait//
		//partsdataclick.click();
		//Thread.sleep(8000);
		//wait//
}}