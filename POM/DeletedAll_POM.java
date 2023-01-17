package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class DeletedAll_POM extends Baseclass {
	
	public DeletedAll_POM(){
		PageFactory.initElements(driver, this);

	}
	////////deleting Related partno///////////////
	
	@FindBy(xpath="//a[text()='Parts']")
	private WebElement partclick;
	
	@FindBy(xpath="//select[@id='drpProductCategory']")
	private WebElement selectcategory;
	
	@FindBy(xpath="//select[@id='drpPart']")
	private WebElement selectpartnumber;
	
	@FindBy(xpath="(//input[@class='button_search'])[3]")
	private WebElement clicksearchbtn;
	
	@FindBy(xpath="//input[@class='button_delete']")
	private WebElement deletedpart;
	
	////////////////////////////deleted vehicel started///////////////////////////
	@FindBy(xpath="//a[text()='Vehicle']")
	private WebElement clkvehicel;
	
	@FindBy(xpath="//select[@name='ctl00$MainContent$drpMake1']")
	private WebElement clkmake;
	  
	@FindBy(xpath="//select[@id='drpModel1']")
	private WebElement clkmodel;
	
	@FindBy(xpath="//button[@class='button_search_new imgbtnsearchnew']")
	private WebElement clksearchbtn;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$GVData$ctl02$imgDelete']")
	private WebElement clkdelete;
	
////////////////////////////deleted vehicel end////////////////////////////
	
/////////////////////////////////////interchange part deleted started ...////////////////////
	
	
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_1']")
	WebElement eInterchangepart;
	
	@FindBy(xpath="//span[@Class='select2-selection__rendered']")
	WebElement eIntnameDDBox;
	
	@FindBy(xpath="//input[@Class='select2-search__field']")
	WebElement eIntnamesearchBox;
	
	@FindBy(xpath="//li[@Class='select2-results__option select2-results__option--highlighted']")
	WebElement eIntnamesearchresult;
	
	@FindBy(xpath="(//input[@class='glowing-border'])[1]")
	WebElement eIntPartSTbox;
	
	@FindBy(xpath ="(//div[@Class='edit_icon_ver'])[2]")
	WebElement eDeleteButtonPart;
	
	
	@FindBy(xpath="//*[@id='MainContent_drpCompetitor']")
	WebElement eInterchangeDDbox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//li[@Class='select2-results__option select2-results__message']")
	public WebElement ePDverify;
	
/////////////////////////////////////interchange part deleted ended ..////////////////////
	
	
	/////////////////////////////////////interchange name deleted started ...////////////////////
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
	public WebElement esearchboxName;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverifyName;
	////////////////////////////////////////////////interchange name end///////////////////////////////////////////
	
	
	
	
	/////////////////engine oil test////////////////////////////////////////////////////////////////////////////////
	public void partclk() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		partclick.click();
	}
	public void seldropdowncategory(String pcategorysel) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select category =new Select(selectcategory);
		category.selectByVisibleText(pcategorysel);
	}
	
		public void seldropdownpartno(String pPartNO) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Select Partnum=new Select(selectpartnumber);
		Partnum.selectByVisibleText(pPartNO);
		
			}
		
		public void commandmethod() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			clicksearchbtn.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			deletedpart.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Baseclass.acceptAlertdel();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			Baseclass.acceptAlertdel();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		
		public void seldropdownpartno1(String pPartNO1) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		Select Partnum=new Select(selectpartnumber);
		Partnum.selectByVisibleText(pPartNO1);
		
			}
		
		public void seldropdownpartno2(String pPartNO2) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		Select Partnum=new Select(selectpartnumber);
		Partnum.selectByVisibleText(pPartNO2);
		
	}
		///////////////////////////////////////Steering Test start /////////////////////////////////
		
		public void seldropdowncategoryST(String pcategoryselST) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select category =new Select(selectcategory);
			category.selectByVisibleText(pcategoryselST);
		}
		
		public void seldropdownPartNoST(String pPartNOST) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select partNOST = new Select(selectpartnumber);
			partNOST.selectByVisibleText(pPartNOST);
			
		}
		public void seldropdownpartnoST01(String pPartNOST01) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select partNOST = new Select(selectpartnumber);
			partNOST.selectByVisibleText(pPartNOST01);
			
		}
		public void seldropdownpartnoST02(String pPartNOST02) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select partNOST = new Select(selectpartnumber);
			partNOST.selectByVisibleText(pPartNOST02);
			
		}
		public void seldropdownpartnoST03(String pPartNOST03) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select partNOST = new Select(selectpartnumber);
			partNOST.selectByVisibleText(pPartNOST03);
			
		}
		public void seldropdownpartnoST04(String pPartNOST04) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select partNOST = new Select(selectpartnumber);
			partNOST.selectByVisibleText(pPartNOST04);
			
		}
		///////////////////////////////////////Steering Test  end/////////////////////////////////
		
		public void vehicle() {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			clkvehicel.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		public void selvehcile(String vMake) {
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Select veh=new Select(clkmake);
			veh.selectByVisibleText(vMake);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			
			/*
			 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 * clkdelete.click();
			 */
	
		}
		public void selvehmodel(String vModel) {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Select veh=new Select(clkmodel);
			veh.selectByVisibleText(vModel);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		public void clksh() {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",clksearchbtn);
			clksearchbtn.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		public void cldel() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", clkdelete);
			clkdelete.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
////////////////////////////interchange partNO deleted started/////////////////////////////////////////
		public void clickonInterchangePart() throws Throwable {
			
			Actions action = new Actions(driver);
			action.moveToElement(emaster).build().perform();
			Thread.sleep(3000);
			eInterchangepart.click();
			Thread.sleep(5000);
		}
		
		
		public void SelectIntName(String InterchangeNameValue) throws InterruptedException {

			eIntnameDDBox.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			eIntnamesearchBox.sendKeys(InterchangeNameValue);
			
			Thread.sleep(6000);
			eIntnamesearchresult.click();	
			Thread.sleep(5000);
		}
		public void SearchIntchgpartValue(String interchangepartno) throws InterruptedException {
			eIntPartSTbox.sendKeys(interchangepartno);
			Thread.sleep(3000);
		}
		public void ClickDeletePart1() throws InterruptedException {
			eDeleteButtonPart.click();
			Thread.sleep(3000);
			}
		public void acceptAlertPart1() throws InterruptedException{
			WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
			Thread.sleep(5000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			pop.click();
			Thread.sleep(18000);
			}
		

		public void verifytext1(String InterchangeNameValue,String interchangepartno, String DeleteProducttxt) throws InterruptedException{
			
			
			
			try
			{
				eIntnameDDBox.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				eIntnamesearchBox.sendKeys(InterchangeNameValue);
				
				Thread.sleep(6000);
				
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String actualText= ePDverify.getText();
				System.out.println("Text"+actualText);
				actualText.equals(DeleteProducttxt);
				System.out.println("Both are same: Deleted Successfully");
				
			}
			catch (Exception e)
			{
				System.out.println("Not Deleted Successfully");
			}
			
		}
////////////////////////////interchange partNO deleted end/////////////////////////////////////////
		
		
		
		
		////////////////////////////interchange name deleted started/////////////////////////////////////////
	 
		public void clickonInterchangeName() throws Throwable {
			
			Actions action = new Actions(driver);
			action.moveToElement(emaster).build().perform();
			Thread.sleep(3000);
			eInterchangeName.click();
			Thread.sleep(5000);
		}
		public void SearchIntchgNameValue(String InterchangeNameValue) throws InterruptedException {
			eIntnameSTbox.sendKeys(InterchangeNameValue);
			Thread.sleep(3000);
		}
		public void ClickDeleteName() throws InterruptedException {
			eDeleteButton.click();
			Thread.sleep(3000);
			}
		public void acceptAlertName() throws InterruptedException{
			WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
			Thread.sleep(5000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			pop.click();
			Thread.sleep(10000);
		
			}
	public void verifytextName(String InterchangeNameValue, String DeleteProducttxt) throws InterruptedException{
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		esearchboxName.sendKeys(InterchangeNameValue);
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= ePDverifyName.getText();
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
//////////////////////////////////////interchange name deleted end///////////////////////////
	}





