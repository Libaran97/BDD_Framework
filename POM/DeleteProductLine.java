package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class DeleteProductLine extends Baseclass {
	public DeleteProductLine() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_5']")
	private WebElement eProductLine;
	
	@FindBy(xpath="//a[text()='Web Category']")
	private WebElement eWebCategory;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_2']")
	private WebElement eProductcustomattr;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[2]")
	public WebElement eDeleteButton;

	@FindBy(xpath = "//button[text()='OK']")
	public WebElement eaccept;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePLverify;

	public void clickonproductLine() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eProductLine.click();
		Thread.sleep(3000);
	}
	public void clickonwebcategory() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eWebCategory.click();
		Thread.sleep(3000);
	}

	public void clickoncustomattribute() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eProductcustomattr.click();
		Thread.sleep(3000);
	}

	public void SelectsearchTextbox(String linecode) throws InterruptedException {
		Thread.sleep(3000);
		esearchbox.sendKeys(linecode);
		Thread.sleep(3000);
	}
	public void SelectWebCategoryTextbox(String Equchose) throws InterruptedException {
		Thread.sleep(3000);
		esearchbox.sendKeys(Equchose);
		Thread.sleep(3000);
	}

	public void SelectsearchTextbox1(String linecode1) throws InterruptedException {
		esearchbox.clear();
		Thread.sleep(3000);
		esearchbox.sendKeys(linecode1);
		Thread.sleep(3000);
	}

	public void SelectsearchTextboxcus2(String editattrvalue) throws InterruptedException {
		esearchbox.sendKeys(editattrvalue);
		Thread.sleep(3000);
	}

	public void SelectsearchTextboxcus3(String AttributeName1) throws InterruptedException {
		esearchbox.clear();
		Thread.sleep(3000);
		esearchbox.sendKeys(AttributeName1);
		Thread.sleep(3000);
	}

	public void ClickDelete() throws InterruptedException {
		eDeleteButton.click();
		Thread.sleep(3000);
	}

	public void acceptAlert() throws InterruptedException {
		
		eaccept.click();
		Thread.sleep(5000);
		eaccept.click();
		Thread.sleep(5000);
	}

	public void verifytext1(String DeleteProducttxt) {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = ePLverify.getText();
		System.out.println("Text" + actualText);
		if (actualText.equals(DeleteProducttxt)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same so some product line there");
		}

	}
	

	public void verifytextcusdel(String editattrvalue,String DeleteProducttxt) throws Throwable {
		try {
			esearchbox.sendKeys(editattrvalue);
			Thread.sleep(4000);			
			String actualText = ePLverify.getText();
			Thread.sleep(5000);	
			System.out.println("Text" + actualText);
			if (actualText.equals(DeleteProducttxt)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so some custome attribute there");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there first");
		}
		Thread.sleep(8000);	
	}
	
	public void verifytextcusdelanother(String AttributeName1,String DeleteProducttxt) {
		try {
			esearchbox.sendKeys(AttributeName1);
			Thread.sleep(5000);	
			
			String actualText = ePLverify.getText();
			Thread.sleep(5000);	
			System.out.println("Text" + actualText);
			if (actualText.equals(DeleteProducttxt)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so some custome attribute there");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}

	}
	

}
