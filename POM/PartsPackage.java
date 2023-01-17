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

import junit.framework.Assert;
import utility.Baseclass;

public class PartsPackage extends Baseclass {


	
	public PartsPackage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//*[@class='button_search']")////*[@id="MainContent_upAttribute"]/div[2]/div[1]/div/div[3]/div/input[8]
	private WebElement btnPsearch;//(//input[@class='button_search'])[2]
	
	@FindBy(xpath="//div[@id='Package']")
	private WebElement ePackageclick;
	
	@FindBy(xpath="//select[@id='drpPackageUom']")
	private WebElement ePackageUom;
	
	@FindBy(xpath="//input[@id='txtQtyPackage']")
	private WebElement eUomQty;
	
	@FindBy(xpath="//input[@id=\"txtHeight\"]")
	private WebElement eHeight;
	
	@FindBy(xpath="//input[@id=\"txtWidth\"]")
	private WebElement eWidth;
	
	@FindBy(xpath="//input[@id='txtLength']")
	private WebElement eLength;
	
	@FindBy(xpath="//input[@id='btnSavePkg']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
	private WebElement eAcceptalert;
	
	//@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[12]")
	@FindBy(xpath="//table[@id=\"DataTableViewer\"]/tbody/tr/td")
	private WebElement Vrfy;
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td")
	private WebElement Vrfy1;
	

	@FindBy(xpath="//input[@placeholder='Package Qty / UOM']")
	private WebElement searchuom;
	
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[1]")
	private WebElement ebtnEdit;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[2]")
	private WebElement ebtnDelete;
	
	
	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver,partspageheaderclick,150).click();
		
		//wait//
		//partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
	}
	
	public void partsearch(String partnoenter) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,txtpartsearch, 250).sendKeys(partnoenter);
		//wait//
		//txtpartsearch.sendKeys(partnoenter);
		//wait//
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
				list.get(i).click();
				break;
			}
		}
		Baseclass.waitForElementToBeClickable(driver,btnPsearch,150).click();
		
		//wait//
		//btnPsearch.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void Packageclick() throws InterruptedException {
		//Thread.sleep(2000);	
		Baseclass.waitForElementToBeClickable(driver,ePackageclick,150).click();
		
		//wait//
		//ePackageclick.click();
		Thread.sleep(2000);
		//wait//
		}
	
	public void SelectPackageUom() throws InterruptedException {
		//driver.switchTo().frame(0);
		Select uom = new Select(ePackageUom);
		uom.selectByIndex(1);
		Thread.sleep(2000);	
	}
	
	public void EnterUomQty() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,eUomQty, 150).sendKeys(pro.getProperty("UomQty"));
		
		//wait//
		//eUomQty.sendKeys(pro.getProperty("UomQty"));
		Thread.sleep(2000);	
		//wait//
	}
	public void EnterHeightWidthLength() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,eHeight, 150).sendKeys(pro.getProperty("Height"));
		Baseclass.waitForElementToBeVisible(driver,eWidth, 150).sendKeys(pro.getProperty("Width"));
		Baseclass.waitForElementToBeVisible(driver,eLength, 150).sendKeys(pro.getProperty("Length"));
		
		///wait//
		//eHeight.sendKeys(pro.getProperty("Height"));
		  Thread.sleep(2000);	
		//eWidth.sendKeys(pro.getProperty("Width"));
		//Thread.sleep(2000);
		//eLength.sendKeys(pro.getProperty("Length"));
		//Thread.sleep(4000);
		///wait//
	}
	public void SaveAcceptAlert() throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 150).click();
		
		///wait//
		//btnSave.click();
		Thread.sleep(2000);
		///wait//
		
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
	
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver,eAcceptalert, 150).click();
		///wait//
		//eAcceptalert.click();
		Thread.sleep(4000);
		///wait//
	}
	
	@SuppressWarnings("deprecation")
	public void Verify() throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		Baseclass.waitForElementToBeVisible(driver,searchuom, 150).sendKeys("2 - CA");
		///wait//
		//searchuom.sendKeys("2 - CA");
		///wait//
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains("2 - CA"))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	public void Verifyedit() throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		Baseclass.waitForElementToBeVisible(driver,searchuom, 150).sendKeys("4 - CA");
		Thread.sleep(2000);
		//wait//
		//searchuom.sendKeys("4 - CA");
		//wait//
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains("4 - CA"))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	public void EditUomQty() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eUomQty, 150).clear();
		Baseclass.waitForElementToBeVisible(driver,eUomQty, 150).sendKeys(pro.getProperty("UomQtyEdit"));
		//wait//
		//eUomQty.clear();
		//Thread.sleep(2000);	
		//eUomQty.sendKeys(pro.getProperty("UomQtyEdit"));
		//Thread.sleep(2000);	
		//wait//
	}
	public void ClickEditButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnEdit);
		Baseclass.waitForElementToBeClickable(driver, ebtnEdit, 150).click();
		
		//wait//
		//ebtnEdit.click();
		//Thread.sleep(3000);
		//wait//
	}
	
	public void ClickDeleteButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnDelete);
		Baseclass.waitForElementToBeClickable(driver, ebtnDelete, 150).click();
		//wait//
		//ebtnDelete.click();
		//Thread.sleep(3000);
		//wait//
		
		
		/*Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver,eAcceptalert, 150).click();
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(3000);
		//wait//
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver,eAcceptalert, 150).click();
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(3000);
		//wait//
	}
		
	@SuppressWarnings("deprecation")
	public void DeleteVerify(String DeleteProducttxt,String DeleteProducttxt2) throws InterruptedException {
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		Baseclass.waitForElementToBeVisible(driver,searchuom, 150).sendKeys("4 - CA");
		//wait//
		//searchuom.sendKeys("4 - CA");
		//wait//
		js.executeScript("arguments[0].scrollIntoView();", Vrfy1);
		String Text=Vrfy1.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("DeleteProducttxt")))
		{
			System.out.println("Package deleted success");
		}
		if (Text.contains(pro.getProperty("DeleteProducttxt2")))
				{
					System.out.println("Package deleted successs");
				}
		else
		{
			System.out.println("Both are not same");
		}
	
	}
	
	
}
