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



public class DeleteIntchgName extends Baseclass{
	public DeleteIntchgName() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_0']")
	public WebElement eInterchangeName;
	
	@FindBy(xpath="(//input[@Class='glowing-border'])[1]")
	WebElement eIntnameSTbox;
	
	@FindBy(xpath ="(//div[@Class='edit_icon_ver'])[2]")
	WebElement eDeleteButton;
	
	@FindBy(xpath ="(//input[@Class='glowing-border'])[1]")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;
	
 
	public void clickonInterchangeName() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Baseclass.waitForElementToBeClickable(driver, eInterchangeName, 90).click();
		//wait//
		//Thread.sleep(3000);
		//eInterchangeName.click();
		//Thread.sleep(5000);
		//wait//
	}
	public void SearchIntchgNameValue(String InterchangeNameValue) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eIntnameSTbox,90).sendKeys(InterchangeNameValue);
		//wait//
		//eIntnameSTbox.sendKeys(InterchangeNameValue);
		//Thread.sleep(3000);
		//wait//
	}
	public void ClickDelete() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eDeleteButton, 90).click();
		//wait//
		//eDeleteButton.click();
		//Thread.sleep(3000);
		//wait//
		}
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(2000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
	
		}
public void verifytext1(String InterchangeNameValue, String DeleteProducttxt) throws InterruptedException{
		
	Baseclass.waitForElementToBeVisible(driver, esearchbox, 90).sendKeys(InterchangeNameValue);
	//wait//
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//esearchbox.sendKeys(InterchangeNameValue);
	//wait//
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String actualText= ePDverify.getText();
	System.out.println("Text"+actualText);
	if(actualText.equals(DeleteProducttxt))
	{
		System.out.println("Both are same");
	}
	else
	{
		System.out.println("Both are not same");
	}
			
		
	}

}
