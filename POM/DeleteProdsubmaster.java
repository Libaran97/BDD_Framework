package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class DeleteProdsubmaster extends Baseclass {
	public DeleteProdsubmaster() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_7']")
	private WebElement emastercategory;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_8']")
	private WebElement emastercategory1;
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_11']")
	private WebElement emastercategory2;

	@FindBy(xpath = "//input[@placeholder='Product Category']")
	public WebElement esearchbox;

	@FindBy(xpath = "//input[@placeholder='Sub-Product Line Code']")
	public WebElement esearchbox1;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[2]")
	public WebElement eDeleteButton;

	@FindBy(xpath = "//td[@class='sorting_1']")
	public WebElement ePcverify;
	
	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[1]")
	public WebElement ePsubverify;
	

	public void clickonproductgroupmaster() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Baseclass.waitForElementToBeClickable(driver, emastercategory, 90).click();
		
		//Thread.sleep(3000);
		//emastercategory.click();
		//Thread.sleep(3000);
	}

	public void clickonsubproductgroupmaster() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Baseclass.waitForElementToBeClickable(driver, emastercategory1,90).click();
		//wait//
		//Thread.sleep(3000);
		//emastercategory1.click();
		//Thread.sleep(3000);
		//wait//
	}
	

	public void SelectsearchTextbox(String Equchose) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,esearchbox,90).sendKeys(Equchose);
		
		//wait//
		//esearchbox.sendKeys(Equchose);
		//Thread.sleep(3000);
		//wait//
	}

	public void SelectsearchTextbox1(String partdesc) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,esearchbox1,90).sendKeys(partdesc);
		//wait//
		//esearchbox1.sendKeys(partdesc);
		//Thread.sleep(3000);
		//wait//
	}

	public void ClickDelete() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eDeleteButton,90).click();
		//wait//
		//eDeleteButton.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void acceptAlert() throws InterruptedException {
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println("Acess: " +
		 * alert.getText()); alert.accept(); Thread.sleep(3000);
		 */
		Thread.sleep(2000);
		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		// System.out.println("Record newly to be deleted");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);

	}

	public void verifyproductgroupmasterdel(String Equchose, String DeleteProducttxt) throws Exception {
		try {
			Baseclass.waitForElementToBeVisible(driver, esearchbox, 90).sendKeys(Equchose);
			
			//wait//
			//esearchbox.sendKeys(Equchose);
			//Thread.sleep(3000);
			//wait//
			
			
			String actualText = ePcverify.getText();
			System.out.println("Text" + actualText);
			actualText.equals(DeleteProducttxt);
			System.out.println("Both are same" + actualText);
		} catch (Exception e) {
			System.out.println("Category not available in dropdown  product group master deleted successfully");
		}

	}

	public void verifysubproductgroupmasterdel(String partdesc, String DeleteProducttxt) throws Exception {
		try {
			
			Baseclass.waitForElementToBeVisible(driver, esearchbox, 90).sendKeys(partdesc);
			//wait//
			//esearchbox.sendKeys(partdesc);
			//Thread.sleep(3000);
			//wait//
			String actualText = ePsubverify.getText();
			System.out.println("Text" + actualText);
			actualText.equals(DeleteProducttxt);
			System.out.println("Both are same" + actualText);
		} catch (Exception e) {
			System.out.println("Category not available in dropdown  product group master deleted successfully");
		}

	}

}
