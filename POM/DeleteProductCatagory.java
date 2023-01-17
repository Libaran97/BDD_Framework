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

import utility.Baseclass;

public class DeleteProductCatagory extends Baseclass {
	public DeleteProductCatagory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_0']")
	private WebElement emastercategory;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[2]")
	public WebElement eDeleteButton;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePcverify;

	public void clickonproductcategory() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Baseclass.waitForElementToBeClickable(driver, emastercategory, 90).click();
		
		//wait//
		//Thread.sleep(3000);
		//emastercategory.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void SelectsearchTextbox(String categoryname) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 90).sendKeys(categoryname);
		//wait//
		//esearchbox.sendKeys(categoryname);
		//Thread.sleep(3000);
		//wait//
	}

	public void SelectsearchTextbox1(String categoryname1) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, esearchbox, 90).clear();
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 90).sendKeys(categoryname1);
		//wait//
		//esearchbox.clear();
		//Thread.sleep(3000);
		//esearchbox.sendKeys(categoryname1);
		//Thread.sleep(3000);
		//wait//
	}

	public void ClickDelete() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eDeleteButton, 90).click();
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
		System.out.println("Record newly to be deleted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);

	}

	public void verifytext1(String categoryname, String DeleteProducttxt) throws Exception {
		try {
			/*
			 * esearchbox.click(); Thread.sleep(3000);
			 */
			Baseclass.waitForElementToBeVisible(driver,esearchbox, 90).sendKeys(categoryname);
			//wait//
			//esearchbox.sendKeys(categoryname);
			//Thread.sleep(3000);
			//wait//
			String actualText = ePcverify.getText();
			System.out.println("Text" + actualText);
			actualText.equals(DeleteProducttxt);

			/*
			 * esearchbox.sendKeys(categoryname); Thread.sleep(3000);
			 */

			System.out.println("Both are same" + actualText);

		} catch (Exception e) {
			System.out.println("Category not available in dropdown  part description deleted successfully");
		}

	}

	public void verifytext2(String categoryname1, String DeleteProducttxt) throws Exception {
		try {
			/*
			 * esearchbox.click(); Thread.sleep(3000);
			 */
			Baseclass.waitForElementToBeVisible(driver,esearchbox, 90).sendKeys(categoryname1);
			//wait//
			//esearchbox.sendKeys(categoryname1);
			//Thread.sleep(3000);
			//wait//
			String actualText = ePcverify.getText();
			System.out.println("Text" + actualText);
			actualText.equals(DeleteProducttxt);
			/*
			 * esearchbox.sendKeys(categoryname1); Thread.sleep(3000);
			 */

			System.out.println("Both are same" + actualText);

		} catch (Exception e) {

			System.out.println("Category not available in dropdown  part description deleted successfully");
		}

	}

}
