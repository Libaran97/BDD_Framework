package pageobjectmodel;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class Interchange_POM extends Baseclass{

		
		public Interchange_POM() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
		private WebElement partspageheaderclick;
		
		
		
		@FindBy(xpath="//*[@id='txtsearchpartno']")
		private WebElement txtpartsearch;
		
		
		@FindBy(xpath="(//input[@class='button_search'])")
		private WebElement btnPsearch;
		
		
		@FindBy(xpath="//div[@id='interchange']")
		private WebElement interchangeclick;
		
		
		@FindBy(xpath="//select[@id='drpCompetitorName']")
		private WebElement drpCompetitorName;
		
		
		@FindBy(xpath="//input[@id='txtCompetitorPartno1']")
		private WebElement txtCompetitorPartno1;
		
		
		
		@FindBy(xpath="(//input[@class='button_save'])[4]")
		private WebElement btnSave;
		
		
		
		@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/input[1]")
		private WebElement imgEdit_0;
		
		
		
		@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/input[2]")
		private WebElement imgDelete_0;
		
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[2]/input")
		private WebElement eIntpartfilter;
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[2]")
		private WebElement	ePDverify;
		
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td")
		private WebElement eDeleteVryText;
		
		
		public void partslanding() {
			
			Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 150).click();
			//wait//
			//partspageheaderclick.click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//wait//
		}
		
		public void partsearch(String partnoenter) throws InterruptedException {
			//Baseclass.waitForElementToBeVisible(driver,txtpartsearch, 250).sendKeys(partnoenter);
			//wait//
			//txtpartsearch.sendKeys(partnoenter);
			//wait//
			Baseclass.waitForElementToBeVisible(driver,txtpartsearch, 250).sendKeys(partnoenter);
			Thread.sleep(3000);
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
			System.out.println("total number of parts-->" + list.size());
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
				//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
					list.get(i).click();
					break;
				}
			}
			Baseclass.waitForElementToBeClickable(driver, btnPsearch, 150).click();
			//wait//
			//btnPsearch.click();
			//Thread.sleep(3000);
			//wait//
		}
		
		
		public void interchangesclick() throws InterruptedException {
			Baseclass.waitForElementToBeClickable(driver, interchangeclick, 150).click();
			
			//wait//
			//interchangeclick.click();
			//Thread.sleep(2000);
			//wait//
		}
		
		
		
		public void interchangedrpdownnotes() throws InterruptedException {
			//driver.switchTo().frame(0);
			Thread.sleep(3000);
			WebElement intnotesselect = drpCompetitorName ;
			Select select = new Select(intnotesselect);
			select.selectByVisibleText("Test IntName 1");
			//select.selectByValue("2");
			Thread.sleep(2000);
		}
		
		
		public void Competitorpartno(String Enterpartpart) throws InterruptedException {
			Baseclass.waitForElementToBeVisible(driver,txtCompetitorPartno1, 150).sendKeys(Enterpartpart);
			//wait//
			//txtCompetitorPartno1.sendKeys(Enterpartpart);
			//Thread.sleep(2000);
			//wait//
		}
		
		
		public void savebtn() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", btnSave);
			//Baseclass.waitForElementToBeClickable(driver, btnSave, 150).click();
			//wait//
			Thread.sleep(5000);
			btnSave.click();
			Thread.sleep(4000);
			//wait//
		}
		
		/*
		 * alert accept & fetching text
		 */
		public void acceptAlert() throws InterruptedException{
			Thread.sleep(5000);
			WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
			Thread.sleep(5000);                         
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			pop.click();
			Thread.sleep(5000);
		}
		
		
		
		
		public void editinterchange(String partno3) throws InterruptedException {
			Thread.sleep(2000);
			//driver.switchTo().frame(0);
			JavascriptExecutor js = (JavascriptExecutor) driver;
     		js.executeScript("arguments[0].scrollIntoView();", imgEdit_0);
     		Baseclass.waitForElementToBeClickable(driver, imgEdit_0, 150).click();
     		Baseclass.waitForElementToBeClickable(driver, txtCompetitorPartno1, 150).clear();
     		Baseclass.waitForElementToBeVisible(driver, txtCompetitorPartno1, 150).sendKeys(partno3);
     		//wait//
			//imgEdit_0.click();
			//Thread.sleep(2000);
			//txtCompetitorPartno1.clear();
			//txtCompetitorPartno1.sendKeys(partno3);
			//wait//
			
		}
		
		
		public void deletepartinter() throws InterruptedException {
			Thread.sleep(2000);
			//driver.switchTo().frame(0);
			JavascriptExecutor js = (JavascriptExecutor) driver;
     		js.executeScript("arguments[0].scrollIntoView();", imgDelete_0);
     		Baseclass.waitForElementToBeClickable(driver, imgDelete_0, 150).click();
     		//wait//
			//imgDelete_0.click();
			//Thread.sleep(2000);
			//wait//
		}
		
		
		public void VerifyInterchange(String Enterpartpart) throws InterruptedException{
			try
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         		JavascriptExecutor js = (JavascriptExecutor) driver;
         		Baseclass.waitForElementToBeVisible(driver, eIntpartfilter, 150).sendKeys(Enterpartpart);
         		
         		//wait//
				//eIntpartfilter.sendKeys(Enterpartpart);
				Thread.sleep(10000);
				//wait//
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				js.executeScript("arguments[0].scrollIntoView();", ePDverify);
				String actualText= ePDverify.getText();
				System.out.println("Text"+actualText);
				actualText.equals(Enterpartpart);
				System.out.println("Both are same");
				
			}
			catch (Exception e)
			{
				System.out.println("Both are not same");
			}
		}
		
	
		public void VerifyDeleteIntchange(String partno3, String DeleteProducttxt) throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eIntpartfilter);
			Baseclass.waitForElementToBeVisible(driver, eIntpartfilter, 150).sendKeys(partno3);
			
			//wait//
			Thread.sleep(5000);
			//eIntpartfilter.sendKeys(partno3);
			//Thread.sleep(5000);
			//wait//
			
			String text = eDeleteVryText.getText();
			if (!text.equals(eIntpartfilter)) {
				System.out.println("parts Interchange Deleted succesfully");

			} else {
				System.out.println("Parparts Interchange  Not Deleted succesfully");
			}

		}
		public void acceptDeleteAlert() throws InterruptedException{
			
			Thread.sleep(5000); 
			WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
			Thread.sleep(5000);                         
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			Baseclass.waitForElementToBeClickable(driver, pop, 150).click();
			//wait//
			//pop.click();
			//Thread.sleep(5000);
			//wait//
			
		}
		
		public void acceptDeleteAlert2() throws InterruptedException{
			Thread.sleep(5000);
			WebElement pop1=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
			Thread.sleep(5000);      
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("arguments[0].scrollIntoView();", pop1);
			Baseclass.waitForElementToBeClickable(driver, pop1, 150).click();
			
			//wait//
			//pop1.click();
			//Thread.sleep(5000);
			//wait//
		}	
}

