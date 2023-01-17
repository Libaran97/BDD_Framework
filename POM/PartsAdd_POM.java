package pageobjectmodel;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import utility.Baseclass;

public class PartsAdd_POM extends Baseclass {

	
	public PartsAdd_POM(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	//@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	@FindBy(xpath="//div[@id='btnAdd']")
	private WebElement addbutton;
	
	
	//@FindBy(xpath="//select[@id='MainContent_drpProductCategoryAdd']")
	@FindBy(xpath="//select[@id='drpProductCategoryAdd']")	
	private WebElement selectproductcategory;
	
	
	//@FindBy(xpath="//select[@id='MainContent_drpProductSubCategoryAdd']")
	@FindBy(xpath="//select[@id='drpProductSubCategoryAdd']")	
	private WebElement selectsubcategorydropdown;
	
	
	//@FindBy(xpath="//select[@id='MainContent_drpPartDescriptionAdd']")
	@FindBy(xpath="//select[@id='drpPartDescriptionAdd']")	
	private WebElement selectpartdescdropdown;
	
	
    //@FindBy(xpath="//select[@id='MainContent_drpproductline']")
	@FindBy(xpath="//select[@id='drpproductline']")	
	private WebElement drpproductline;
	
	
	
	//@FindBy(xpath="//*[@id='MainContent_txtPart']")
	@FindBy(xpath="//textarea[@id='MainContent_txtPart']")
	private WebElement txtPart;
	
	//@FindBy(xpath="//textarea[@id='MainContent_txtPart']")
	@FindBy(xpath="//textarea[@id='MainContent_txtPart']")
	private WebElement txtPart1;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpMinQtyUOM']")
	private WebElement drpMinQtyUOM;
	
	
	//@FindBy(xpath="//input[@id='MainContent_btnSave']")
	@FindBy(xpath="//input[@id='btnSave']")	
	private WebElement btnSave;
	
	
	@FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement BuyersGuid1click;
	
	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	private WebElement drpVehicleType;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	private WebElement drpMake;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	private WebElement drpModel;
	
	@FindBy(xpath="//input[@id='MainContent_txtenginebase']")
	private WebElement drptext;
	
	@FindBy(xpath="//input[@id='chk9_All']")
	private WebElement drpcheckbox;
	
	@FindBy(xpath = "//input[@id='MainContent_searchbtn']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
	//@FindBy(xpath="//input[@id='chk9_All']")
	private WebElement checkALL;

	@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	private WebElement btnSavebuyerlistall;
	
	@FindBy(xpath="(//input[@placeholder='Year Range'])[1]")
	WebElement everifynon1ACES;
	
	@FindBy(xpath = "(//input[@placeholder='Year Range'])[1]")
	WebElement efilter;

	@FindBy(xpath = "(//input[@placeholder='Engine Details'])[1]") //
	WebElement efilter2;

	
	//@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	@FindBy(xpath="//select[@id='drpProductCategoryAdd']")
	private WebElement drpProductCategory;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategory']")
	private WebElement drpProductSubCategory;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpPartDescription']")
	private WebElement drpPartDescription;
	
	
	@FindBy(xpath="//select[@id='MainContent_dropproductline']")
	private WebElement dropproductline;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpPart']")
	private WebElement drpPart;
	
	
	//@FindBy(xpath="//input[@id='MainContent_btnSearch']")
	@FindBy(xpath="//*[@id='hiding_search']/input")
	private WebElement btnSearch;
	
	@FindBy(xpath="//input[@id='MainContent_txtPart']")
	private WebElement txtPartverify;
	
	@FindBy(xpath="//input[@id=\"MainContent_chkIsUnit\"]")
	private WebElement unitparts;
	
	
	
	public void partslandingpage() throws InterruptedException{
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 250).click();
		Baseclass.waitForElementToBeClickable(driver, addbutton, 250).click();
		//wait//
		//partspageheaderclick.click();
	//	Thread.sleep(7000);
		//addbutton.click();
		//Thread.sleep(7000);
		//wait//
	}
	
	public void scrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)");
		// Thread.sleep(3000);

	}
	
	public void partsadd() throws InterruptedException {
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(3000);
		
	}
	
	public void partsadd1() throws InterruptedException {
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(5000);
				
	}
	
	
	public void partsadddrp2() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(3000);
	}
	
	public void partsadddrp21() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(3000);
	}
	
	
	public void partsadddrp3() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(3000);
	}
	
	public void partsadddrp31() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(5000);
	}
	
	
	
	public void partsadddrp4() throws InterruptedException {
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecode"));
		Thread.sleep(4000);
	}
	
	public void partsadddrp41() throws InterruptedException {
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecode12"));
		Thread.sleep(5000);
	}
	
	
	
	public void savenewpart(String partno3) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,txtPart, 250).sendKeys(partno3);
		
		//wait//
		//txtPart.sendKeys(partno3);
		//wait//
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", unitparts);
		Baseclass.waitForElementToBeClickable(driver, unitparts, 250).click();
		
		//wait//
		//unitparts.click();
		//Thread.sleep(2000);
		//wait//
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 250).click();
		//wait//
		//btnSave.click();
		//Thread.sleep(2000);
		//wait//
	}
	
	public void savenewpart1(String partno) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Baseclass.waitForElementToBeVisible(driver, txtPart1,250).sendKeys(partno);
		//wait//
	//	txtPart1.sendKeys(partno);
	//	Thread.sleep(2000);
		//wait//
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 250).click();
		//wait//
		//btnSave.click();
		//Thread.sleep(5000);
		//wait//
	}
	
	public void savenewpartlistall(String partno08) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Baseclass.waitForElementToBeVisible(driver, txtPart1, 250).sendKeys(partno08);
		//wait//
		//txtPart1.sendKeys(partno08);
		//Thread.sleep(2000);
		//wait//
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave,250).click();
		//wait//
		//btnSave.click();
		//Thread.sleep(5000);
		//wait//
	}
	

	public void buyerguideclick() throws InterruptedException {
		Thread.sleep(2000);
		Baseclass.waitForElementToBeClickable(driver,BuyersGuid1click, 250).click();
		//wait//
		//Thread.sleep(3000);
		//BuyersGuid1click.click();
		//Thread.sleep(5000);
		//wait//

	}
	public void apppartsvehicldropdown(String vehicletypename0) throws InterruptedException {
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
	public void appartsenginetextbox() throws InterruptedException
	{
		Thread.sleep(2000);
		Baseclass.waitForElementToBeClickable(driver, drptext, 250).click();
		Baseclass.waitForElementToBeClickable(driver, drpcheckbox, 250).click();
		//wait//
	//drptext.click();
	//Thread.sleep(2000);
	//drpcheckbox.click();
	//wait//
	}

	public void apppartsmodeldropdown(String modelname) throws InterruptedException {
		Thread.sleep(2000);
		WebElement modelselect = drpModel;
		Select select = new Select(modelselect);
		select.selectByVisibleText(modelname);
		
		Thread.sleep(5000);
	}
	public void apppartsearch() throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver,searchbtn, 250).click();
		//wait//
		//searchbtn.click();
		//Thread.sleep(8000);
		//wait//
	}

	
	
	public void Alcheck() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, checkALL, 250).click();
		//wait//
		//checkALL.click();
	//	Thread.sleep(3000);
		//wait//
	}
	
	
	public void btnSavebuyer() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSavebuyerlistall);
		Baseclass.waitForElementToBeClickable(driver, btnSavebuyerlistall, 250).click();
		
		//wait//
		//btnSavebuyerlistall.click();
		//Thread.sleep(8000);
		//wait//
	}
	public void acceptAlertlistall() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + "application added " + alert.getText());
		alert.accept();
		Thread.sleep(4000);
	}
	public void bguideverification() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, efilter, 250).sendKeys(pro.getProperty("EnterYear"));
		Baseclass.waitForElementToBeVisible(driver,efilter2, 250).sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		
		//wait//
		//efilter.sendKeys(pro.getProperty("EnterYear"));
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
	
	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + alert.getText());
		alert.accept();
		Thread.sleep(4000);
		
	}
	
	
	public void verifypart() {
		
	}
	
	public void partslandingpage2() throws InterruptedException{
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick,250).click();
		
		//wait//
		//partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
		
	}
	
	
	public void dropdownfiltercategory() throws InterruptedException{
		Thread.sleep(2000);
		WebElement categoryfilterselect = drpProductCategory;
		Select select = new Select(categoryfilterselect);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(2000);
	}
	
	
	/*
	public void dropdownfiltersubcategory() throws InterruptedException{
		WebElement subcategoryfilterselect = drpProductSubCategory;
		Select select = new Select(subcategoryfilterselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterpartdesc() throws InterruptedException{
		WebElement partdescfilterselect = drpPartDescription;
		Select select = new Select(partdescfilterselect);
		select.selectByVisibleText(pro.getProperty("partdesc"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterprdtln() throws InterruptedException{
		WebElement linefilterselect = dropproductline;
		Select select = new Select(linefilterselect);
		select.selectByVisibleText(pro.getProperty("productline"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterpartno() throws InterruptedException{
		WebElement partnofilterselect = drpPart;
		Select select = new Select(partnofilterselect);
		select.selectByVisibleText(pro.getProperty("partname"));
		Thread.sleep(2000);
	}
	*/
	
	
	public void filetrpartno() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,btnSearch, 250).click();
		
		//wait//
		//btnSearch.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	
	
	
	
	
	
	
	
	
	
}

