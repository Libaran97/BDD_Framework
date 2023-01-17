package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utility.Baseclass;

public class Productattribute_POM extends Baseclass{

	
	public Productattribute_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='Attribute_new']/img")

	private WebElement attrlanding;
	

	@FindBy(xpath="//input[@id='chkSelectAll']")
	private WebElement chklstattr;
	
	@FindBy(xpath="//input[@id='input1']")
	private WebElement attributeName;
	
	@FindBy(xpath="//input[@id='btnSaveData']")
	private WebElement btnSave;
	
	@FindBy(xpath="//input[@id='btnSaveAttri']")
	private WebElement btnsave1;
	
	//@FindBy(xpath = "(//button[@type='button'])[2]")
	@FindBy(xpath="/html/body/div[3]/div/div[3]/button[1]")
	private WebElement eAcceptalert;
	
	@FindBy(xpath = "//table[@id=\"Tbl_Attribute\"]/tbody/tr/td[3] //input[@type='text']")
	private WebElement attrvalue;
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[7]/div/input[1]")
	private WebElement clkedit;
	
	@FindBy(xpath="//input[@id=\"txtAttrData\"]")
	private WebElement attributedata;
	
	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[7]/div/input[2]")
	private WebElement deleattru;
	
	//@FindBy(xpath="/html/body/div[2]/div/div[3]/button[1]")
		//private WebElement delAcceptalert;
		
	@FindBy(xpath="//select[@id='drpAttrName']")
	private WebElement attrname;
	
	@FindBy(xpath="//input[@id='txtAttrData']")
	private WebElement attrdata;
	
	/*
	 *partsize check and uncheck 
	 */
	
	public void partattrlanding() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,attrlanding, 250).click();
		//wait//
		//attrlanding.click();
		Thread.sleep(2000);
		//wait//
	}
	
	
	public void attrbut() throws InterruptedException {		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();	
		Baseclass.waitForElementToBeClickable(driver,attrname, 150).sendKeys(pro.getProperty("Attributemasnameedit"));
		attrdata.sendKeys("1");
		//wait//
		//Thread.sleep(3000);
		//attrvalue.sendKeys(pro.getProperty("newpartnos"));
		//Thread.sleep(3000);
		//wait//
	}
	public void attrbutedit() throws InterruptedException {	
		Thread.sleep(4000);
		clkedit.click();
		attributedata.clear();
		Thread.sleep(2000);
		attributedata.sendKeys("2");
		//driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();	
		//Baseclass.waitForElementToBeClickable(driver,attrvalue, 150).sendKeys(pro.getProperty("newpartno"));
		Thread.sleep(2000);
		
		
		//wait//
		//Thread.sleep(3000);
		//attrvalue.sendKeys(pro.getProperty("newpartno"));
		//Thread.sleep(3000);
		//wait//
	}
	public void saveattr() throws InterruptedException {
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnsave1);
		Baseclass.waitForElementToBeClickable(driver, btnsave1, 150).click();
		//wait//
		//btnSave.click();		
		//Thread.sleep(3000);
		//wait//
	}
	
	
	public void acceptalert() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Size" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	public void acceptAlert1() throws Exception {
		Thread.sleep(4000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 250).click();
		//Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 250).click();
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(5000);
		//wait//
	}
	
	
	public void delcheckbox() throws InterruptedException
	{
		Thread.sleep(4000);
		Baseclass.waitForElementToBeClickable(driver, chklstattr,250).click();
		
		
	}
	
	public void delattr() throws Exception {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", deleattru);
		Baseclass.waitForElementToBeClickable(driver, deleattru, 250).click();
		Thread.sleep(5000);
		//Baseclass.waitForElementToBeVisible(driver, attrvalue, 250).sendKeys(pro.getProperty("newpartnos"));
		//wait//
		//deleattru.click();
		//attrvalue.sendKeys(pro.getProperty("newpartnos"));
		//Thread.sleep(3000);
		//wait//
	}
	
	public void verify1() throws InterruptedException {
		Thread.sleep(2000);
		attributeName.sendKeys("testcurs12");
	}
	
	
	
	public void verifyattr() {

		if (chklstattr.isSelected()) {
			String Valus = attrvalue.getAttribute("value");
			System.out.println("Part attr are checked verified " + Valus);	

		} else {
			System.out.println("Attr is not verified");
		}

	}
	public void verifyattr1() throws Throwable {
		
		
		//wait//
		//chklstattr.click();
		Thread.sleep(5000);
		//wait//
		
		if (chklstattr.isSelected()) {			
			System.out.println("Attr is not wrong");

		} else {			
			String Valus = attrvalue.getAttribute("value");
			System.out.println("Part attr are deleted verified " + Valus);	
		}

	}
	
	
	
	/*public void verifysizeremove(String givensize) {
		driver.switchTo().frame(0);
		String size = chklstsize.getText();
		System.out.println("Checked size are ---->" +size);
		if(size==givensize)
		{
			chklstsize.isSelected();
			System.out.println("Size is Unchecked");
		}else
		{
			System.out.println("Size is still checked");
		}
	}*/
	
}
