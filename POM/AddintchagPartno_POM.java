package pageobjectmodel;



import java.util.List;
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



public class AddintchagPartno_POM extends Baseclass{
	
	public AddintchagPartno_POM() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	//@FindBy(xpath ="//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1']")
	@FindBy(xpath ="//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_1']")
	public WebElement eInterchangepart;
	
	@FindBy(xpath="//div[@Class='add_button_icon']")
	WebElement eAddintpartBtn;
	
	@FindBy(xpath="(//span[@Class='select2-selection__rendered'])[2]")
	WebElement eIntnameDDBox;
	
	
	@FindBy(xpath="//input[@Class='select2-search__field']")
	WebElement eIntnamesearchBox;
	
	@FindBy(xpath="//li[@Class='select2-results__option select2-results__option--highlighted']")
	WebElement eIntnamesearchresult;
	
	
	@FindBy(xpath="//input[@id='txt_CompetitorPartno']")
	WebElement eIntnamePartTbox;
	
	@FindBy(xpath="//span[@id='select2-drp_QualityGradeLevel-container']")
	WebElement eGradeLevelDDBox;
	

	@FindBy(xpath="//div[@Class='edit_icon_ver']")
	WebElement eEditBtn;
	
	@FindBy(xpath="//input[@id='txt_InternalNotes']")
	WebElement eInternalNotes;
	
	@FindBy(xpath="//input[@id='txt_InterchangeNotes']")
	WebElement eInterchangeNotes;
	
	@FindBy(xpath ="//div[@id='save_btn_new_add']")
	public WebElement eSaveButton;
	
	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn;

	@FindBy(xpath ="//div[@id='save_btn_new_edit']")
	public WebElement eEditSaveButton;
	
	@FindBy(xpath="//*[@id='select2-drpCompetitor1-container']")
	WebElement eInterchangeDDbox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;

	public void clickonInterchangePart() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		
		Baseclass.waitForElementToBeClickable(driver,eInterchangepart, 250).click();
		
		//wait//
		//Thread.sleep(3000);
		//eInterchangepart.click();
		//Thread.sleep(5000);
		//wait//
	}
	
	public void clickAdd() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eAddintpartBtn, 250).click();
		
		//wait//
		//eAddintpartBtn.click();
		//Thread.sleep(3000);
		//wait//
		
	}
	public void EnterIntName(String InterchangeNameValue) throws InterruptedException {
	
		Baseclass.waitForElementToBeClickable(driver,eIntnameDDBox, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eIntnamesearchBox, 250).sendKeys(InterchangeNameValue);
		Baseclass.waitForElementToBeClickable(driver,eIntnamesearchresult, 250).click();
		
		//wait//
		//eIntnameDDBox.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//eIntnamesearchBox.sendKeys(InterchangeNameValue);
		//Thread.sleep(6000);
		//eIntnamesearchresult.click();	
		//Thread.sleep(5000);
		//wait//
	}
	public void EnterIntchgpartValue(String interchangepartno) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eIntnamePartTbox, 250).sendKeys(interchangepartno);
		
		
		//wait//
		//eIntnamePartTbox.sendKeys(interchangepartno);
		//Thread.sleep(3000);
		//wait//
	}
	public void SelectGradeLevel(String GradeLevelValue) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eGradeLevelDDBox, 250).click();
		
		//wait//
		//eGradeLevelDDBox.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@Class='select2-results__option']"));
		System.out.println("total number of Grade -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase(GradeLevelValue)) {
				list.get(i).click();
				break;
			}
		}
	}

	public void EnterInternalNotes(String InternalNotesValue) {
		Baseclass.waitForElementToBeVisible(driver, eInternalNotes, 250).sendKeys(InternalNotesValue);
		//eInternalNotes.sendKeys(InternalNotesValue);
	}
	public void EnterInterchangeNotes(String InterchangeNotesValue) {
		Baseclass.waitForElementToBeVisible(driver, eInterchangeNotes, 250).sendKeys(InterchangeNotesValue);
		//eInterchangeNotes.sendKeys(InterchangeNotesValue);
	}
	
	public void SelectPartno(String InterchangeNameValue, String interchangepart) throws InterruptedException{
		Baseclass.waitForElementToBeClickable(driver, eInterchangeDDbox, 250).click();
		
		//wait//
		//eInterchangeDDbox.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@Class='select2-results__option']"));
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase(InterchangeNameValue)) {
				list.get(i).click();
				break;
			}
		}

		Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(interchangepart);
		Baseclass.waitForElementToBeClickable(driver, eEditBtn, 250).click();
		
		//wait//
		//esearchbox.sendKeys(interchangepart);
		//Thread.sleep(3000);
		//eEditBtn.click();
		//Thread.sleep(3000);
		//wait//
	}
	
	public void Editpartno(String interchangepartno) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eIntnamePartTbox, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eIntnamePartTbox, 250).sendKeys(interchangepartno);
		
		//wait//
		//eIntnamePartTbox.clear();
		//Thread.sleep(3000);
	//	eIntnamePartTbox.sendKeys(interchangepartno);
		//Thread.sleep(3000);
		//wait//
		
	}
	
	public void Clicksave() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eSaveButton, 250).click();
		
		//wait//
		//eSaveButton.click();
		//Thread.sleep(3000);
		//wait//
		}
	
	public void ClickEditsave() throws InterruptedException {
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver,eEditSaveButton, 250).click();
		Thread.sleep(2000);
		//wait//
		//eEditSaveButton.click();
		//Thread.sleep(3000);
		//wait//
		}
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(3000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		}
	public void acceptEditAlert() throws InterruptedException{
		Thread.sleep(2000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(4000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	
	public void ClickonBackButton() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}
	
	public void verifytext1(String InterchangeNameValue,String interchangepartno) throws InterruptedException{
		
		
		
		try
		{
			
			Baseclass.waitForElementToBeClickable(driver, eInterchangeDDbox, 250).click();
			//wait//
			//eInterchangeDDbox.click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//wait//
			List<WebElement> list = driver.findElements(By.xpath("//li[@Class='select2-results__option']"));
			System.out.println("total number of code -->" + list.size());
			Thread.sleep(3000);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().equalsIgnoreCase(InterchangeNameValue)) {
					list.get(i).click();
					break;
				}
			}
			Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(interchangepartno);
			//wait//
			//esearchbox.sendKeys(interchangepartno);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//wait//
			
			String actualText= ePDverify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(interchangepartno);
			System.out.println("Both are same");
			
		}
		catch (Exception e)
		{
			System.out.println("Both are not same");
		}
		
	}
	
}
