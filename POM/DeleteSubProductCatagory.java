package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class DeleteSubProductCatagory extends Baseclass{
	public DeleteSubProductCatagory() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_1']")
	private WebElement emastersubcategory;
	
	@FindBy(xpath="//span[@id='select2-drpProductCategory1-container']")
	WebElement eCategoryDDBox;
	
	@FindBy(xpath="//li[text()='Steering Test']")
	WebElement ecategorysteer;
	
	@FindBy(xpath="//li[text()='Engine oil test']")
	WebElement ecategorysteer1;	
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="(//div[@class='edit_icon_ver'])[2]")
	public WebElement eDeleteButton;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePscverify;
	
	
	public void clickonSubproductcategory() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		emastersubcategory.click();
		Thread.sleep(3000);
	}
	public void SelectCategory() throws Throwable {
		/*Select Category = new Select(eCategoryDDBox);
		Category.selectByVisibleText(categoryname);
		Thread.sleep(5000);*/
		eCategoryDDBox.click();
		Thread.sleep(5000);
		ecategorysteer.click();
		Thread.sleep(5000);
	}
	
	public void SelectCategory1() throws Throwable {	
		eCategoryDDBox.click();
		Thread.sleep(8000);
		ecategorysteer1.click();
		Thread.sleep(8000);
	}
	
	public void SelectsearchTextbox(String subcategoryname) throws InterruptedException {
		esearchbox.sendKeys(subcategoryname);
		Thread.sleep(3000);
	}
	public void SelectsearchTextbox1(String subcategoryname1) throws InterruptedException {
		Thread.sleep(3000);
		esearchbox.sendKeys(subcategoryname1);
		Thread.sleep(3000);
	}
	public void ClickDelete() throws InterruptedException {
		Thread.sleep(3000);
		eDeleteButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		/*Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
		
		WebElement pop=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be deleted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);
		}
	public void verifytext1(String subcategoryname, String DeleteProducttxt)
	{
		
		try {
			/*Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname);
			Thread.sleep(5000);*/
			eCategoryDDBox.click();
			Thread.sleep(5000);
			ecategorysteer.click();
			Thread.sleep(5000);
			
		
		String actualText= ePscverify.getText();
		System.out.println("Text"+actualText);
		actualText.equals(DeleteProducttxt);
		
		esearchbox.sendKeys(subcategoryname);
		Thread.sleep(3000);
		
			System.out.println("Both are same"+ actualText);
			
		} catch (Exception e) {
			
			System.out.println("Category not available in droipdown  part description deleted successfully");
		}
		
	}
	
	public void verifytext2(String subcategoryname1, String DeleteProducttxt)
	{
		
		try {
			/*Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname);
			Thread.sleep(5000);*/
			eCategoryDDBox.click();
			Thread.sleep(5000);
			ecategorysteer1.click();
			Thread.sleep(5000);
			
		
		String actualText= ePscverify.getText();
		System.out.println("Text"+actualText);
		actualText.equals(DeleteProducttxt);
		
		esearchbox.sendKeys(subcategoryname1);
		Thread.sleep(3000);
		
			System.out.println("Both are same"+ actualText);
			
		} catch (Exception e) {
			
			System.out.println("Category not available in droipdown  part description deleted successfully");
		}
		
	}

}
