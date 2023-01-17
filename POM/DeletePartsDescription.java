package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class DeletePartsDescription extends Baseclass{
	public DeletePartsDescription() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_3']")
	private WebElement ePartsDescription;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	WebElement eCategoryDDBox;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategory']")
	WebElement eSubCategoryDDBox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//input[@id='MainContent_delete']")
	public WebElement eDeleteButton;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;
	
	
	public void clickonPartsDescription() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		ePartsDescription.click();
		Thread.sleep(3000);
	}
	
	
	public void SelectCategory(String categoryname) throws InterruptedException {
		Select Category = new Select(eCategoryDDBox);
		Category.selectByVisibleText(categoryname);
		Thread.sleep(3000);
	}
	public void SelectSubCategory(String subcategoryname) throws InterruptedException {
		Select SubCategory = new Select(eSubCategoryDDBox);
		eSubCategoryDDBox.clear();
		Thread.sleep(3000);
		SubCategory.selectByVisibleText(subcategoryname);
		Thread.sleep(3000);
	}
	
	
	public void SelectsearchTextbox(String subcategoryname) throws InterruptedException {
		Thread.sleep(3000);
		esearchbox.sendKeys(subcategoryname);
		Thread.sleep(3000);
	}
	public void SelectsearchTextbox01(String subcategoryname1) throws InterruptedException {
		Thread.sleep(3000);
		esearchbox.sendKeys(subcategoryname1);
		Thread.sleep(3000);
	}
	public void ClickDelete() throws InterruptedException {
		eDeleteButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		}
	//public void verifytext1(String DeleteProducttxt, String categoryname, String subcategoryname, String partdesc) throws Exception
	public void verifytext1(String categoryname,String DeleteProducttxt) throws Exception
	{
		
		try {
			Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname);
			Thread.sleep(3000);
			
			/*
			 * Select SubCategory = new Select(eSubCategoryDDBox);
			 * SubCategory.selectByVisibleText(subcategoryname); Thread.sleep(3000);
			 * 
			 * esearchbox.sendKeys(partdesc); Thread.sleep(3000);
			 */
			
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= ePDverify.getText();
		System.out.println("Text"+actualText);
		actualText.equals(DeleteProducttxt);
		
			System.out.println("Both are same"+ actualText );
		}
		catch(Exception e)
		{
			System.out.println("Category or sub category not selected part description deleted successfully");
		}
		
		Thread.sleep(3000);
		
		
	}
	
	public void verifytext2(String DeleteProducttxt, String categoryname1, String subcategoryname1)
	{
		
		try {
			Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname1);
			Thread.sleep(3000);
			
			Select SubCategory = new Select(eSubCategoryDDBox);
			SubCategory.selectByVisibleText(subcategoryname1);
			Thread.sleep(3000);
			
			esearchbox.sendKeys(subcategoryname1);
			Thread.sleep(3000);
			
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= ePDverify.getText();
		System.out.println("Text"+actualText);
		actualText.equals(DeleteProducttxt);
		
			System.out.println("Both are same"+ actualText );
		}
		catch(Exception e)
		{
			System.out.println("Category or sub category not selected part description deleted successfully");
		}
		
	}

}
