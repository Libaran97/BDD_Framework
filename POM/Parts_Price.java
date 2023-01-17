package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.Baseclass;

public class Parts_Price extends Baseclass {
	public Parts_Price() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;
	
	
	//@FindBy(xpath="//*[@id='MainContent_upAttribute']/div[2]/div[1]/div/span/div/input[8]")
	@FindBy(xpath="//*[@class='button_search']")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//*[@id='Price']/img")
	private WebElement ePricepage;
	
	@FindBy(xpath="//*[@id='drpPriceType']")
	private WebElement ePriceType;
	
	@FindBy(xpath="//*[@id='txtPriceSheet']")
	private WebElement ePricesheet;
	
	@FindBy(xpath="//*[@id='txtPrice']")
	private WebElement ePrice;
	
	@FindBy(xpath="//*[@id='drpPriceUOM']")
	private WebElement ePriceUOM;
	
	@FindBy(xpath="//*[@id='btnpriSave']")
	private WebElement ebtnSave;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[6]/input")
	private WebElement eVerifyprice;
	
	//@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[10]/div/input[1]")
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[10]/div/input[1] ")
	private WebElement eEdit;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[10]/div/input[2]")
	private WebElement eDelete;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[6]")
	private WebElement eVry;
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement Verifytextdelete;
	
	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick,150).click();
		
		//wait//
		//partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
	}
	
	public void partsearch(String partnoenter) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, txtpartsearch, 250).sendKeys(partnoenter);
		//wait//
		//txtpartsearch.sendKeys(partnoenter);
		//wait//
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
				
				//if(list.get(i).getText().contains("Testpart-3 | Ignition Coil Test | Autoapa3")) {
				list.get(i).click();
				break;
			}
		}
		Baseclass.waitForElementToBeClickable(driver, btnPsearch,150).click();
		//wait//
		//btnPsearch.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void ClickPricepage() throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver, ePricepage,150).click();
		//wait//
		//Thread.sleep(3000);
		//ePricepage.click();
		//Thread.sleep(3000);
		//wait//
		}
	

	public void Selectpricetype() throws InterruptedException {
	
		Thread.sleep(2000);
		Select PriceType = new Select(ePriceType);
		PriceType.selectByIndex(3);
		Thread.sleep(2000);
	}



	public void PriceDetails() throws InterruptedException {
	
		
		Select PriceUOM = new Select(ePriceUOM);
		PriceUOM.selectByIndex(4);
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, ePricesheet, 150).sendKeys("2");
		Baseclass.waitForElementToBeVisible(driver, ePrice, 150).sendKeys("20");
	}
		public void PriceDetailsedit() throws InterruptedException {
			
			
			Select PriceUOM = new Select(ePriceUOM);
			PriceUOM.selectByIndex(4);
			Thread.sleep(2000);
			Baseclass.waitForElementToBeVisible(driver, ePricesheet, 150).sendKeys("2");
			//Baseclass.waitForElementToBeVisible(driver, ePrice, 150).sendKeys("20");
			
		
		
	}
	
	public void saveAcceptAlert() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ebtnSave,150).click();
		//wait//
		//Thread.sleep(3000);
		//ebtnSave.click();
		//Thread.sleep(3000);
		//wait//
		
		Thread.sleep(4000);
		WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop,150).click();
		
		//pop.click();
		//Thread.sleep(10000);
	}
	
	
	
	public void ClickEdit() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		Baseclass.waitForElementToBeClickable(driver, eEdit,150).click();
		
		//wait//
		//eEdit.click();
		Thread.sleep(2000);
		//wait//
		}
	
	public void Verifyprice() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVerifyprice);
		Thread.sleep(3000);
		eVerifyprice.sendKeys("20");
		Thread.sleep(6000);
		String Text=eVry.getText();
		Thread.sleep(3000);
		if (Text.equals("20")) {
			Thread.sleep(4000);
			System.out.println("Price Added Successfully");
		
		} 
		else {
			
			System.out.println("Price not  Added");
		}
}
	public void Editprice() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ePrice, 150).clear();
		Baseclass.waitForElementToBeVisible(driver, ePrice, 150).sendKeys("30");
		
		//wait//
		//ePrice.clear();
		Thread.sleep(2000);
		//ePrice.sendKeys("30");
		//Thread.sleep(3000);
		//wait//
	}
	
	public void EditVerifyprice() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVerifyprice);
		Thread.sleep(3000);
		eVerifyprice.sendKeys("30");
		String Text=eVry.getText();
		Thread.sleep(3000);
		if (Text.equals("30")) {
			System.out.println("Price Updated Successfully");
		} 
		else {
			
			System.out.println("Price not  Updated");
			}
		}
	
	public void VryDelete() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVerifyprice);
		Thread.sleep(3000);
		eVerifyprice.sendKeys("30");
		Thread.sleep(4000);
		String text = eVerifyprice.getText();
		if (!text.equals(Verifytextdelete)) {
			System.out.println("Price Deleted succesfully");

		} else {
			System.out.println("Price Not Deleted");
		}
	}
	
	
	
	
	
	public void ClickDelete() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		Baseclass.waitForElementToBeClickable(driver, eDelete, 150).click();
		//wait//
		//eDelete.click();
		//wait//
		Thread.sleep(2000);
		}
	public void acceptAlert1() throws InterruptedException{
		Thread.sleep(3000);
		WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();
		//wait//
		//pop.click();
		//Thread.sleep(5000);
		//wait//
		
	}
	public void acceptAlert2() throws InterruptedException{
		Thread.sleep(4000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();
	}}
	
