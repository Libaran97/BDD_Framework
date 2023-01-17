package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class Extendedinfo_POM extends Baseclass {

	
	
	public Extendedinfo_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='ExtendedInfo']")
	private WebElement clkextended;
	
	
	@FindBy(xpath="//select[@id='drpcodedesc']")
	private WebElement drpcodedesc;
	
	
	@FindBy(xpath="//select[@id='Drplanguage']")
	private WebElement Drplanguage;
	
	@FindBy(xpath="//button[@id='btnSave_Exd']")
	private WebElement btnSave;
	
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[5]/div/input")
	private WebElement imgDelete;
	
	
	@FindBy(xpath="//select[@id='drpEXPIDATA']")
	private WebElement drpEXPIDATAtxt;
	
	
	@FindBy(xpath="//table[@id='MainContent_GVextended']//preceding-sibling::td[2]")
	private WebElement Vextended;
	
	@FindBy(xpath="//input[@placeholder='EXPIDATA']")
	private WebElement vcodesc;
	
	//@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[2]")
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr")
	private WebElement vcodescget;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td")
	private WebElement delinvalidtex;
	
	
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;
	
	
	
	/*
	 * 
	 * extendedinfo add and delete
	 */
	
	public void extendframe() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, clkextended, 250).click();
		//wait//
		//clkextended.click();
		Thread.sleep(2000);
		//wait//
	}
	
	
	
	public void selectextenddrop() throws InterruptedException {
		//driver.switchTo().frame(0);
		
		Thread.sleep(4000);
		WebElement codedesc = drpcodedesc ;
		Select select = new Select(codedesc);
		select.selectByVisibleText("Country of Origin 2 (CTP)");
		Thread.sleep(4000);
	}
	
	public void entertextextend() throws InterruptedException {
		
		WebElement codedesc = drpEXPIDATAtxt ;
		Select select = new Select(codedesc);
		select.selectByVisibleText(pro.getProperty("EXPIDATA"));
		Thread.sleep(4000);
	
	}
	
	
	
	public void selectlanguage() throws InterruptedException {
		//driver.switchTo().frame(0);
		WebElement language = Drplanguage ;
		Select select = new Select(language);
		select.selectByVisibleText("English (EN)");
		Thread.sleep(2000);
	}
	
	
	public void btsave1() throws InterruptedException {
		Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 250).click();
		Thread.sleep(3000);
		//wait//
		//btnSave.click();
		//Thread.sleep(1000);
		//wait//
	}
	
	
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Extended Info " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	public void acceptAlert1() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Thread.sleep(2000);
		Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 250).click();
		
		Thread.sleep(2000);
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(8000);
		//wait//
	}
	public void extverification() throws InterruptedException{
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, vcodesc, 150).sendKeys("US");
		//wait//
		//vcodesc.sendKeys("Country of Origin 2 (CTP)");
		//Thread.sleep(3000);
		//wait//
		
		Thread.sleep(2000);
		String Actualtext= vcodescget.getText();
		System.out.println("Actual text is.."+Actualtext);
		
		if (Actualtext.contains("US"))
		{
		System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Both are not same");
		}
	}
	
	public void extverificationdel() throws InterruptedException{
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, vcodesc, 150).sendKeys("US");
		//wait//
		//vcodesc.sendKeys("Country of Origin 2 (CTP)");
		//Thread.sleep(3000);
		//wait//
		
		String Actualtext= delinvalidtex.getText();
		System.out.println("Actual text is.."+Actualtext);
		
		if (Actualtext.contains(pro.getProperty("DeleteProducttxt")))
		{
			System.out.println("deleted successfully");
		}
		if (Actualtext.contains(pro.getProperty("DeleteProducttxt2")))
		{
			System.out.println("deleted successfully");
		}
		else 
		{
			System.out.println("Both are not same");
		}
	}
	
	
	public void deleteinfo() throws InterruptedException {
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete);
		Baseclass.waitForElementToBeClickable(driver, imgDelete,250).click();
		
		//wait//
		//imgDelete.click();
		//Thread.sleep(3000);
		//wait//
	}	
}
