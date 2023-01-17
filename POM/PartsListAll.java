package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class PartsListAll extends Baseclass{
	public PartsListAll(){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	WebElement ePartsButton;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnPartsList']")
	WebElement eListAll;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	WebElement eCategoryDDBox;
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategory']")
	WebElement eSubCategoryDDBox;
	
	@FindBy(xpath ="//select[@id='MainContent_drp_PartDescription']")
	WebElement ePartsDescription;
	
	@FindBy(xpath ="//select[@id='MainContent_dropproductline']")
	WebElement eProductLine1;
	
	@FindBy(xpath ="//input[@id='MainContent_btn_Search']")
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchTbox;
	
	@FindBy(xpath="//*[@id=\"MainContent_ImageButton1\"]")
	public WebElement eEditButton;
	
	@FindBy(xpath="//*[@id='parttitle_desc_heading']")
	public WebElement eTitle;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton2']")
	public WebElement eDeleteButton;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td")
	public WebElement eVerify;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton3']")
	public WebElement eDuplicateButton;
	
	@FindBy(xpath ="//input[@id='MainContent_txtPartno']")
	public WebElement epartTbox;
	
	@FindBy(xpath="//input[@id='MainContent_btnsave']")
	public WebElement eSaveButton;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton4']")
	public WebElement ecopyButton;
	
	@FindBy(xpath ="//select[@id='MainContent_drpPartDescription']")
	WebElement eCPartsDescription;
	@FindBy(xpath ="//select[@id='MainContent_drpProductLine']")
	WebElement eCProductLine;
	@FindBy(xpath ="//input[@id='MainContent_txtPartno_apparts']")
	WebElement eAsearch;
	@FindBy(xpath ="//input[@id='MainContent_btnsearch']")
	WebElement ePartsearch;
	@FindBy(xpath ="//input[@id='MainContent_GridView1_checkAllrow1']")
	WebElement eSelectallbtn;
	@FindBy(xpath ="//input[@id='MainContent_btnsaveappparts']")
	WebElement ecreateduplicatebtn;
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_6']")
	WebElement eReports;
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_6_rptLevel3_1_lnkLink3_1']")
	WebElement eDropedPart;
	
	@FindBy(xpath="//select[@id='MainContent_drpPartDescription']")
	WebElement ePartdes;
	
	@FindBy(xpath="//select[@id='MainContent_drpReason']")
	WebElement eReason;
	
	@FindBy(xpath="//button[@id='MainContent_btnSearch']")
	WebElement eSearchbtn;
	
	@FindBy(xpath="//table[@id='MainContent_GVData']/tbody/tr[2]/td[1]")
	WebElement eVerifyTable;
	
	public void clickonParts() throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver,ePartsButton, 250).click();
		
		//wait//
		//ePartsButton.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	public void clickonListAll() throws Throwable {
		Baseclass.waitForElementToBeClickable(driver,eListAll, 250).click();
		//wait//
		//Thread.sleep(3000);
		//eListAll.click();
		//Thread.sleep(3000);
		//wait//
	}
	
	
	public void SelectCategory(String categoryname) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select Category = new Select(eCategoryDDBox);
		Category.selectByVisibleText(categoryname);
		Thread.sleep(3000);
	}
	public void SelectSubCategory(String subcategoryname) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select Subcategory = new Select(eSubCategoryDDBox);
		Subcategory.selectByVisibleText(subcategoryname);
		
	}
	public void SelectPartsDescription(String partdesc) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select Prodes = new Select(ePartsDescription);
		Prodes.selectByVisibleText(partdesc);
		
	}

	
	 public void SelectProductLine(String linecode) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); Select
	  ProdLine1 = new Select(eProductLine1);
	  ProdLine1.selectByVisibleText(linecode); 
	  Thread.sleep(3000);
	 
	 }
	 
	public void Clicksearch() throws InterruptedException {
		Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver,eSearchButton, 250).click();
		//wait//
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//eSearchButton.click();
		//Thread.sleep(3000);
		//wait//
		}
	
	public void EnterSearchText(String partno) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, esearchTbox, 150).sendKeys(partno);
		
		//wait//
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//esearchTbox.sendKeys(partno);
		//Thread.sleep(3000);
		//wait//
	}
	public void ClickEditButton() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eEditButton, 250).click();
		//wait//
		//eEditButton.click();
		//Thread.sleep(3000);
		//wait//
	}
	public void VerifyEdit(String Allinone) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*String title = driver.getTitle();
		System.out.println("First"+title);*/
		String title2 =eTitle.getText();
		System.out.println(title2);
		if(title2.contains("Testpart-1 |  Ignition Coil Test | Autoapa3")){
			System.out.println("Both are same");
		}else
		{
			System.out.println("Both are not same");
		}
	}
	public void ClickDeleteButton() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eDeleteButton, 250).click();
		//wait//
		//eDeleteButton.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	public void acceptAlert() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println("NonAcess: " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		}
	public void Verifydelete(String DeleteProducttxt2, String DeleteProducttxt, String categoryname, String subcategoryname, String partdesc, String linecode, String partno) throws InterruptedException {
		try {
			Baseclass.waitForElementToBeClickable(driver,eSearchButton, 250).click();
			//wait//
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//eSearchButton.click();
			////Thread.sleep(3000);
			//wait//
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText1= eVerify.getText();
			System.out.println("Text"+actualText1);
			if(actualText1.equals(DeleteProducttxt2)) {
				System.out.println("Both are same"+ actualText1 + "Deleted Successfully" );
			}
			
			else {
				System.out.println("Both are not same"+ actualText1 + " Not Deleted " );
			}
			
		} catch (Exception e) {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname);
			Thread.sleep(3000);
			
			Select SubCategory = new Select(eSubCategoryDDBox);
			SubCategory.selectByVisibleText(subcategoryname);
			Thread.sleep(3000);
			
			Select Prodes = new Select(ePartsDescription);
			Prodes.selectByVisibleText(partdesc);
			Thread.sleep(3000);
			
			  Select ProdLine = new Select(eProductLine1);
			 ProdLine.selectByVisibleText(linecode); Thread.sleep(3000);
			 
			 Baseclass.waitForElementToBeClickable(driver,eSearchButton, 250).click();
			 Baseclass.waitForElementToBeVisible(driver, esearchTbox, 250).sendKeys(partno);
			//wait//
			//eSearchButton.click();
			//Thread.sleep(3000);
			//esearchTbox.sendKeys(partno);
			//Thread.sleep(3000);
			//wait//
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText= eVerify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(DeleteProducttxt);
			
			if(actualText.equals(DeleteProducttxt2)) {
				System.out.println("Both are same:"+ actualText + " -Deleted Successfully" );
			}
			
			else {
				System.out.println("Both are same:"+ actualText + " -Deleted Successfully " );
			}
		}
	}
	public void ClickDuplicateButton() throws InterruptedException {
		
		 Baseclass.waitForElementToBeClickable(driver,eDuplicateButton, 250).click();
		//wait//
		//eDuplicateButton.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	
	public void EnterDpartno(String partno2) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, epartTbox, 150).sendKeys(partno2);
		 Baseclass.waitForElementToBeClickable(driver,eSaveButton, 250).click();
		//wait//
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//epartTbox.sendKeys(partno2);
		//Thread.sleep(3000);
		//eSaveButton.click();
		//Thread.sleep(3000);
		//wait//
	}
	
	public void acceptAlert2() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		}
	public void verifyDuplicate(String partno2)
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eVerify.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(partno2))
		{
			System.out.println("Both are same " +actualText + " Duplicate part successfully");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
	
	public void DuplicateAppprtsButton() throws InterruptedException {
		 Baseclass.waitForElementToBeClickable(driver,ecopyButton, 250).click();
		//wait//
		//ecopyButton.click();
		Thread.sleep(3000);
		//wait//
	}
	public void createAppartsDuplicate(String subcategoryname, String linecode, String Asearchpart, String partno3) throws InterruptedException {
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Select Prodes1 = new Select(eCPartsDescription);
		Prodes1.selectByVisibleText(subcategoryname);
		Thread.sleep(3000);
		
		Select ProdLine1 = new Select(eCProductLine);
		ProdLine1.selectByVisibleText(linecode);
		Thread.sleep(3000);
		 Baseclass.waitForElementToBeVisible(driver, eAsearch, 150).sendKeys(Asearchpart);
		//wait//
		//eAsearch.sendKeys(Asearchpart);
		//wait//
		
		
		System.out.println("Part no enter in Text box ");
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='MainContent_ListDivisor']/div"));
		System.out.println("total number of parts in drop down -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase(partno3)) {
				list.get(i).click();
				break;
			}
		}
		 Baseclass.waitForElementToBeClickable(driver,ePartsearch, 250).click();
		 Baseclass.waitForElementToBeClickable(driver,eSelectallbtn, 250).click();
		 Baseclass.waitForElementToBeClickable(driver,ecreateduplicatebtn, 250).click();
		//wait//
		//Thread.sleep(5000);
		//ePartsearch.click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//eSelectallbtn.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//ecreateduplicatebtn.click();
		//wait//
		
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		
			
	}
	
public void clickonReports() throws InterruptedException {
	 Baseclass.waitForElementToBeClickable(driver,eReports, 250).click();
	//wait//
		//eReports.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	
	public void clickonDropedPart() throws Throwable {
		 Baseclass.waitForElementToBeClickable(driver,eDropedPart, 250).click();
		//wait//
		////eDropedPart.click();
		//Thread.sleep(3000);
		//wait//
	}
	
	public void SelectDescription(String subcategoryall) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select Description = new Select(ePartdes);
		Description.selectByVisibleText(subcategoryall);
		Thread.sleep(3000);
	}
	
	public void SelectReason(String Reason1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select Reason = new Select(eReason);
		Reason.selectByVisibleText(Reason1);
		 Baseclass.waitForElementToBeClickable(driver,eSearchbtn, 250).click();
		//wait//
		//Thread.sleep(5000);
		//eSearchbtn.click();
		//wait//
	}
	public void Verify(String partno3) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String actualText1= eVerifyTable.getText();
	System.out.println("Text "+actualText1);
	if(actualText1.equals(partno3)) {
		System.out.println("Both are same"+ actualText1  );
	}
	
	else {
		System.out.println("Both are not same"+ actualText1 );
	}
	}
	
}
