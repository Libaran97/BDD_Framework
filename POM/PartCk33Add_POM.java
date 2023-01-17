package pageobjectmodel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import utility.Baseclass;

public class PartCk33Add_POM extends Baseclass{

		
		public PartCk33Add_POM(){
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
		@CacheLookup
		private WebElement master;
		
		@FindBy(xpath="//a[@id=\"ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_12\"]")
		private WebElement CK33;
		
		//@FindBy(xpath="//span[@id=\'select2-drpCK31Component-container\']")
		@FindBy(xpath="//span[@class='select2-selection__rendered']")
		private WebElement systemck31;
		
		@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_13']")
		private WebElement systemck33;
		
	    @FindBy(xpath="/html/body/span/span/span[1]/input")
	    private WebElement searchbox;
	    
	  //  @FindBy(xpath = "//input[@class='glowing-border']")
	    @FindBy(xpath = "//span[@id='select2-drpCK31Component-container']")
		private WebElement searchfilter6;
		
	    
	    @FindBy(xpath="//table[@id='DataTableViewer']/tfoot/tr/th[2]/input")
	    private WebElement searchbox33;
	  
	    @FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[3]")
		private WebElement verifytextsec;
///////////////////////CK33 FINDBY closed///////////////////////////////////////////////////////////
	    
	    @FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
		private WebElement partspageheaderclick;
	    
	    @FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
		private WebElement partspageheaderclick2;
		
	    @FindBy(xpath="//*[@id='txtsearchpartno']")
	    private WebElement partsearch;
	    
	 //   @FindBy(xpath="//div[@id='MainContent_pnlSearch']")//*[@id=\"ACBehavior_completionListElem\"]
	    @FindBy(xpath="//ul[@id=\"ACBehavior_completionListElem\"]")////ul[@id=\"ACBehavior_completionListElem\"]
	    private WebElement parttextsearch;
	    
	    @FindBy(xpath="(//input[@class='button_search'])")
	    private WebElement partsearchbutton;
	    
	    @FindBy(xpath="//div[@id='btnAdd']")
		private WebElement addbutton;
		
	    @FindBy(xpath="//input[@id='MainContent_txtvmrs']")
	    private WebElement vrmscode;
	   
	    @FindBy(xpath="//ul[@id='ACBehaviorVMRS_completionListElem']")
	    private WebElement vrmscodeexp;
	    
	    @FindBy(xpath="//select[@id='drpProductCategoryAdd']")	
		private WebElement selectproductcategory;
	    
	    @FindBy(xpath="//select[@id='drpProductSubCategoryAdd']")	
		private WebElement selectsubcategorydropdown;
	    
	    @FindBy(xpath="//select[@id='drpPartDescriptionAdd']")	
		private WebElement selectpartdescdropdown;
	    
	    @FindBy(xpath="//select[@id='drpproductline']")	
		private WebElement drpproductline;
	    
	    @FindBy(xpath="//textarea[@id='MainContent_txtPart']")
		private WebElement txtPart1;
		
	    @FindBy(xpath="//input[@id='btnSave']")	
		private WebElement btnSave;
		
///////////////////////////CK33//////////////////////////////////////////////////////////////
		public void ck33click() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Baseclass.waitForElementToBeClickable(driver, CK33, 250).click();
			
			//wait//
			Thread.sleep(5000);
			//CK33.click();
			//Thread.sleep(8000);
			//wait//
		}
		
		public void systemck31() throws InterruptedException {
			Baseclass.waitForElementToBeClickable(driver,systemck31, 250).click();
			Thread.sleep(2000);
			Baseclass.waitForElementToBeVisible(driver, searchbox, 250).sendKeys("001 - AIR CONDITIONING, HEATING & VENTILATING SYSTEM"+Keys.ENTER);
			Thread.sleep(2000);
			//searchbox.sendKeys(Keys.ENTER);
			//Baseclass.waitForElementToBeVisible(driver, searchbox, 250).sendKeys(Keys.ENTER);
			//wait//
		//systemck31.click();
		//Thread.sleep(3000);
		//searchbox.sendKeys("001 | AIR CONDITIONING, HEATING & VENTILATING SYSTEM");
		//searchbox.sendKeys(Keys.ENTER);
			Thread.sleep(3000);	
		//wait//
		}
		
	public void VerifyingCk33() throws InterruptedException {
		//Baseclass.waitForElementToBeVisible(driver,searchfilter6, 250).sendKeys(Partype);
	
		//searchbox33.sendKeys(pro.getProperty("Ck33description"));
		searchbox33.sendKeys("AIR CONDITIONING ASSEMBLY ");
		//searchfilter6.sendKeys(Partype);
		
	
		
		
		Thread.sleep(3000);

		String actualtext = verifytextsec.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(pro.getProperty("Ck33description"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		Thread.sleep(3000);
	}
	/////////////////////////////CK33 METHOD closed///////////////////////////////////////
	
	public void partsearch(String partvalue11) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,partsearch, 150).sendKeys(partvalue11);
		//wait//
		//partsearch.sendKeys(partvalue11);
		//wait//
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-11 | Engine oil test | Autoapatest")) {
				list.get(i).click();
			break;
			
}}
	Thread.sleep(4000);	
	}
	public void partslandingpage1() throws InterruptedException{
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick2, 150).click();
		//wait//
		//partspageheaderclick2.click();
		//Thread.sleep(7000);
		//wait//
		
	}
	public void partsearchbut() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, partsearchbutton, 150).click();
		//wait//
		Thread.sleep(8000);	
		//partsearchbutton.click();
		//Thread.sleep(8000);
		//wait//
	}
	
	public void partslandingpage() throws InterruptedException{
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 150).click();
		Baseclass.waitForElementToBeClickable(driver, addbutton, 150).click();
		//wait//
		//partspageheaderclick.click();
		//Thread.sleep(7000);
		//addbutton.click();
		//Thread.sleep(7000);
		//wait//
	}
	
	public void vrmscodeadd(String partvrmscode) throws InterruptedException {
		
		Baseclass.waitForElementToBeVisible(driver, vrmscode,250).sendKeys(partvrmscode);
		//wait//
		//vrmscode.sendKeys(partvrmscode);
		//wait//
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehaviorVMRS_completionListElem']"));
			System.out.println("total number of parts-->" + list.size());
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().equalsIgnoreCase("001001001 | AIR CONDITIONING ASSEMBLY")) {
					list.get(i).click();
				break;
				}
				}
	}
			
	public void partsadd1() throws InterruptedException {
		Thread.sleep(5000);
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(5000);
				
	}
	public void partsadddrp21() throws InterruptedException {
		Thread.sleep(3000);
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(3000);
	}
	
	public void partsadddrp31() throws InterruptedException {
		Thread.sleep(3000);
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(3000);
	}
	public void partsadddrp41() throws InterruptedException {
		Thread.sleep(2000);
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecode12"));
		Thread.sleep(3000);
	}
	public void savenewpart1(String partno1) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Baseclass.waitForElementToBeVisible(driver, txtPart1,250).sendKeys(partno1);
		//wait//
		//txtPart1.sendKeys(partno1);
		//wait//
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 250).click();
		//wait//
		//btnSave.click();
		//Thread.sleep(5000);
		//wait//
	}
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	}
	
		
