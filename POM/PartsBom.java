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

import junit.framework.Assert;
import utility.Baseclass;

public class PartsBom extends Baseclass {


	
	public PartsBom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;	
	
	@FindBy(xpath="//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;	
	
	@FindBy(xpath="//input[@class='button_search']")
	private WebElement btnPsearch;
	
	
	@FindBy(xpath="//*[@id=\"btnEdit\"]/input")
	private WebElement eeditsave;
	@FindBy(xpath="//*[@id=\"MainContent_chkIsUnit\"]")
	private WebElement eunitbtcheck;
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	private WebElement eunitsaves;
	
	
	@FindBy(xpath="//div[@id='BOM']")
	private WebElement ebomclick;
	
	@FindBy(xpath="//div[@id='Units']")//@FindBy(xpath="//*[@id=\"Units\"]/img")
	private WebElement eunitclick;
	
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[1]")
	private WebElement euniteditclick;
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[4]/div/input[2]")
	private WebElement eunitdelclick;
	
	
	@FindBy(xpath="//input[@id='txtBomPartno']")//*[@id="ui-id-4"]
	private WebElement ebompart;
	
	@FindBy(xpath="//input[@id='txtunitpartno']")
	private WebElement eunitpart;
	
	
	@FindBy(xpath="//input[@id='txtqty']")
	private WebElement ebomqty;
	
	@FindBy(xpath="//input[@id='txtqty']")
	private WebElement euomqty;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[8]/div/input[2]")
	private WebElement ebomdel;
	
	//@FindBy(xpath="(//input[@id=\"btnSave\"])[2]")//(//input[@id='btnSave'])[2]
	@FindBy(xpath="//input[@id='btnSave_BOM']")
	private WebElement btnSave;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement savalertedit;
	
	@FindBy(xpath="//input[@id='btnSave_Unit']")
	private WebElement isunitsave;
	
	@FindBy(xpath="(//button[@type=\"button\"])[2]")
	private WebElement btnSavedel;
	
	
	@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
	private WebElement eAcceptalert;
	
	@FindBy(xpath = "//input[@placeholder='BOM-Part']")
	private WebElement searchbompart;
	
	@FindBy(xpath = "//input[@placeholder='Units']")
	private WebElement searcunitpart;
	
	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tfoot/tr/th[3]/input")
	private WebElement searchbomqtytedit;
	
	
	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr/td[8]/div/input[1]")
	private WebElement eBOMEditbt;
	
	@FindBy(xpath="/html/body/div[3]/div/div[3]/button[1]")
	private WebElement acceptdelete;
	

	@FindBy(xpath="//*[@class='swal2-confirm swal2-styled']")
	private WebElement acceptdelete1;
	
	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement clkdel;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement Vrfy;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[3]")
	private WebElement Vrfy1;
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement eVrfydel;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[1]")
	private WebElement ebtnEdit;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[2]")
	private WebElement ebtnDelete;
	
	@FindBy(xpath="//input[@class='edit_icon_new']")
	private WebElement partsedit;
	
	@FindBy(xpath="//*[@id=\"MainContent_chkIsUnit\"]")
	private WebElement isunit;
	
	 @FindBy(xpath="//div[@id='btnAdd']")
	 private WebElement addbutton;
	
	 @FindBy(xpath="//select[@id='drpProductCategoryAdd']")	
	 private WebElement selectproductcategory;
	 
	 @FindBy(xpath="//select[@id='drpProductSubCategoryAdd']")	
	 private WebElement selectsubcategorydropdown;
	 
	 @FindBy(xpath="//select[@id='drpPartDescriptionAdd']")	
	 private WebElement selectpartdescdropdown;
	 
	 @FindBy(xpath="//*[@id='drpproductline']")	
	 private WebElement drpproductline;
	 
	 @FindBy(xpath="//textarea[@id='MainContent_txtPart']")
	 private WebElement txtPart1;
	 
	 @FindBy(xpath="//input[@id='btnSave']")	
	 private WebElement btnSave2;
	 
	 @FindBy(xpath="//input[@id='MainContent_chkIsUnit']")
	 private WebElement isnot;
	 
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
	public void partsadd1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(4000);
				
	}
	public void partsadddrp21() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(4000);
	}
	
	public void partsadddrp31() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(4000);
	}
	public void partsadddrp41() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", drpproductline);
		Thread.sleep(6000);
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecodename"));
		Thread.sleep(4000);
	}
	public void isunitnot() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, isnot, 150).isSelected();
		Baseclass.waitForElementToBeClickable(driver, isnot, 150).click();
		//wait//
		//isnot.isSelected();
		//isnot.click();
		//Thread.sleep(2000);
		//wait//
	}
	public void savenewpart1(String partno12) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Baseclass.waitForElementToBeVisible(driver, txtPart1, 150).sendKeys(partno12);
		//wait//
		//txtPart1.sendKeys(partno12);
		//Thread.sleep(2000);
		//wait//
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", btnSave2);
		//Baseclass.waitForElementToBeClickable(driver, btnSave2, 150).click();
		
		//wait//
		btnSave2.click();
		Thread.sleep(5000);
		//wait//
	}
	public void acceptAlert() throws InterruptedException{
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	
	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 150).click();
		//wait//
		//partspageheaderclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait//
	}
public void partsearch1(String partno12) throws InterruptedException {
	Baseclass.waitForElementToBeVisible(driver, txtpartsearch, 150).sendKeys(partno12);
	Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
		//System.out.println("total number of parts-->" + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-04 | Engine oil test | AutoapatestAPATest"))
					
			{
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

public void scrolldown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",partsedit);
		Baseclass.waitForElementToBeClickable(driver, partsedit,150).click();
		Baseclass.waitForElementToBeClickable(driver,isunit, 150).click();
		//wait//
		//partsedit.click();
		//Thread.sleep(5000);
		//isunit.click();
		//Thread.sleep(5000);
		//wait//
		
	}


	public void partsearch(String partnoenter) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver,txtpartsearch, 150).sendKeys(partnoenter);
		//wait//
		//txtpartsearch.sendKeys(partnoenter);
		//wait//
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-1 | Engine oil test | Autoapa3APATest")) {
				list.get(i).click();
				break;
			}
			
		}
		Baseclass.waitForElementToBeClickable(driver,btnPsearch, 150).click();
		
		//wait//
		//btnPsearch.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void partsearchunit(String partnoenter) throws InterruptedException {
		
		Baseclass.waitForElementToBeVisible(driver, txtpartsearch,150).sendKeys(partnoenter);
		//wait//
		//txtpartsearch.sendKeys(partnoenter);
		//wait//
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-2 | Ignition Coil Test | Autoapa3")) {
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
	
	public void parteditsave() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",eeditsave);
		Baseclass.waitForElementToBeClickable(driver, eeditsave, 150).click();
		Baseclass.waitForElementToBeClickable(driver, eunitbtcheck, 150).click();
		//wait//
		//eeditsave.click();
		//Thread.sleep(3000);
		//eunitbtcheck.click();
		//Thread.sleep(3000);
		//wait//
		
		js.executeScript("arguments[0].scrollIntoView();",eunitsaves);
		Baseclass.waitForElementToBeClickable(driver,eunitsaves, 150).click();
		//wait//
		//eunitsaves.click();
		//wait//
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("parts is..:" + alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(4000);
		
	}
	public void bomclick() throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver,ebomclick, 150).click();
		//wait//
		//ebomclick.click();
	//	Thread.sleep(8000);
		//wait//
		}
	
	public void unitclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,eunitclick, 150).click();
		
		//wait//
		//Thread.sleep(2000);
		//eunitclick.click();
		//Thread.sleep(3000);
		//wait//
		}
	public void uniteditclick() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",euniteditclick);
		Baseclass.waitForElementToBeClickable(driver,euniteditclick, 150).click();
		Thread.sleep(2000);
		//wait//
		//euniteditclick.click();
		//Thread.sleep(3000);
		//wait//
		}
	
	public void unitdelclick() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",eunitdelclick);
		Baseclass.waitForElementToBeClickable(driver,eunitdelclick, 150).click();
		//wait//
		//eunitdelclick.click();
		//Thread.sleep(3000);
		//wait//
		
		
		js.executeScript("arguments[0].scrollIntoView();",acceptdelete);
		Baseclass.waitForElementToBeClickable(driver,acceptdelete, 150).click();
		//wait//
		Thread.sleep(3000);
		acceptdelete.click();
		Thread.sleep(3000);
		//wait//
		
		}
	
	
	public void BOMEditbt() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",eBOMEditbt);
		Baseclass.waitForElementToBeClickable(driver,eBOMEditbt, 150).click();
		
		//wait//
		//eBOMEditbt.click();
		Thread.sleep(2000);
		//wait//
		}
	
	//String partnoenter,
	public void bompartandqty(String partno12) throws Exception {
		Baseclass.waitForElementToBeVisible(driver, ebompart, 250).sendKeys(partno12);
		
		
		//wait//
		//ebompart.sendKeys(partnoenter);
		//Thread.sleep(2000);
		//wait//
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
				if(list.get(i).getText().equals("Testpart-04 | Engine oil test | AutoapatestAPATest")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver,ebomqty, 150).sendKeys(pro.getProperty("qtydata"));
		//wait//
		//ebomqty.sendKeys(pro.getProperty("qtydata"));
		//Thread.sleep(3000);
		//wait//
		
	}
	
	public void unitpartandqty(String partno1) throws Exception
	{
		Baseclass.waitForElementToBeVisible(driver,eunitpart, 150).sendKeys(partno1);
		//wait//
		//eunitpart.sendKeys(partnoenter);
		//Thread.sleep(2000);
		//wait//
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(partno1)) {
				list.get(i).click();
				break;
			}
		}
		
		
		
	}
	
	public void unitpartandqtyedit(String partnoenter,String Enterpartpart) throws Exception
	{
		
		Baseclass.waitForElementToBeClickable(driver, ebomqty, 150).click();
		Baseclass.waitForElementToBeVisible(driver,ebomqty, 150).sendKeys(pro.getProperty("qtydata"));
		//wait//
		//ebomqty.clear();
		//Thread.sleep(2000);
		//ebomqty.sendKeys(pro.getProperty("qtydata"));
		//Thread.sleep(2000);
		//wait//
	}
	public void bompartandqtyedit(String partnoenter) throws Exception{
		Baseclass.waitForElementToBeVisible(driver,ebompart, 150).sendKeys(partnoenter);
		
		//wait//
			//ebompart.sendKeys(partnoenter);
			//wait//
		Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
			System.out.println("total number of parts-->" + list.size());
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().equalsIgnoreCase("Testpart-2 | Ignition Coil Test | Autoapa3APATest")) {
					list.get(i).click();
					break;
				}
			}
	
	}
	
	public void UomQty() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ebomqty, 150).clear();
		Baseclass.waitForElementToBeVisible(driver,ebomqty, 150).sendKeys(pro.getProperty("UomQtyEdit"));
		
		//wait//
		//ebomqty.clear();
		//Thread.sleep(2000);
		//ebomqty.sendKeys(pro.getProperty("UomQtyEdit"));
		//Thread.sleep(3000);
		//wait//
		
	}
	public void bomdelbt() throws Exception{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",ebomdel);
		Baseclass.waitForElementToBeClickable(driver, ebomdel, 150).click();
		//wait//
		//ebomdel.click();
		Thread.sleep(2000);
		//wait//
		
		js.executeScript("arguments[0].scrollIntoView();",acceptdelete1);
		Baseclass.waitForElementToBeClickable(driver, acceptdelete1, 150).click();
		//wait//
		Thread.sleep(4000);
		acceptdelete1.click();
		Thread.sleep(4000);
		//wait//
	}
	
		
	public void SaveisunitAlert1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",isunitsave);
		Baseclass.waitForElementToBeClickable(driver,isunitsave, 150).click();
		
		//wait//
		//isunitsave.click();
		//wait//
		WebElement pop=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);
		//Thread.sleep(3000);
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		//Thread.sleep(8000);
	}

	public void SaveAcceptAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",btnSave);
		Baseclass.waitForElementToBeClickable(driver,btnSave, 150).click();
		Thread.sleep(2000);
		//wait//
		//btnSave.click();
		//Thread.sleep(3000);
		//wait//
		
	
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver,eAcceptalert, 150).click();
		Thread.sleep(2000);
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(6000);
		//wait//
	}
	public void Unitpartandqtyedit() throws Exception{
		Baseclass.waitForElementToBeClickable(driver,euomqty, 150).clear();
		Baseclass.waitForElementToBeVisible(driver, euomqty, 150).sendKeys(pro.getProperty("qtydata"));
		
		//wait//
		//euomqty.clear();
		///Thread.sleep(2000);
		//euomqty.sendKeys(pro.getProperty("qtydata"));
		//Thread.sleep(3000);
		//wait//
		
	}
	public void SaveAcceptAlertdel() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",isunitsave);
		Baseclass.waitForElementToBeClickable(driver,isunitsave, 150).click();
		
		//wait//
		////btnSave.click();
		///sThread.sleep(3000);
		//wait//
		
	}
	public void savealert() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver,savalertedit, 150).click();
		//wait//
		//savalertedit.click();
		//Thread.sleep(2000);
		//wait//
	}
	@SuppressWarnings("deprecation")
	public void Verify() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchbompart);
		Baseclass.waitForElementToBeVisible(driver, searchbompart, 150).sendKeys(pro.getProperty("partno_"));
		//wait//
		//searchbompart.sendKeys(pro.getProperty("partno_12"));
		//wait//
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("partno_")))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	public void Verifyunit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searcunitpart);
		Baseclass.waitForElementToBeVisible(driver,searcunitpart, 150).sendKeys(pro.getProperty("partno1"));
		//wait//
		//searcunitpart.sendKeys(pro.getProperty("Enterpartpart1"));
		//wait//
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("partno1")))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	public void Verifyunitedit() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
		Baseclass.waitForElementToBeVisible(driver, searchbomqtytedit, 150).sendKeys(pro.getProperty("qtydata"));
		//wait//
		//searchbomqtytedit.sendKeys(pro.getProperty("qtydata"));
		//wait//
		
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy1);
		String Text=Vrfy1.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("qtydata")))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	
	public void Verifyedit() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
		Baseclass.waitForElementToBeVisible(driver, searchbomqtytedit, 150).sendKeys(pro.getProperty("UomQtyEdit"));
		//wait//
		//searchbomqtytedit.sendKeys(pro.getProperty("UomQtyEdit"));
		//wait//
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy1);
		String Text=Vrfy1.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("UomQtyEdit")))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	
	public void ClickEditButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnEdit);
		Baseclass.waitForElementToBeClickable(driver, ebtnEdit,150).click();
		//wait//
		//ebtnEdit.click();
		//Thread.sleep(3000);
		//wait//
	}
	
			
	@SuppressWarnings("deprecation")
	public void DeleteVerifybom() throws InterruptedException {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
			Baseclass.waitForElementToBeVisible(driver, searchbomqtytedit, 150).sendKeys(pro.getProperty("UomQtyEdit"));
			//wait//
			//searchbomqtytedit.sendKeys(pro.getProperty("UomQtyEdit"));
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//wait//
			
			js.executeScript("arguments[0].scrollIntoView();", eVrfydel);
			Baseclass.waitForElementToBeClickable(driver, eVrfydel,150).click();
			//wait//
			//eVrfydel.click();
			//wait//
			
			
			String Text=eVrfydel.getText();
             
			System.out.println(Text);
			
			if (Text.contains(pro.getProperty("UomQtyEdit")))
			{
				System.out.println("Both are same");
			}
			else
			{
				System.out.println("Both are not same");
			}
		
			
		}
			
		
		
	
	
public void DeleteVerifyunit() throws InterruptedException {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
			Baseclass.waitForElementToBeVisible(driver, searchbomqtytedit, 150).sendKeys(pro.getProperty("qtydata"));
			
			//wait//
			//searchbomqtytedit.sendKeys(pro.getProperty("qtydata"));
			//wait//
			
			js.executeScript("arguments[0].scrollIntoView();", eVrfydel);
			String Text=eVrfydel.getText();
			
			System.out.println(Text);
		
			
			if (Text.contains(pro.getProperty("DeleteProducttxt")))
			{
				System.out.println("unit deleted success");
			}
			if (Text.contains(pro.getProperty("DeleteProducttxt2")))
					{
						System.out.println("unit deleted successs");
					}
			else
			{
				System.out.println("Both are not same");
			}
		} catch (Exception e) {
			System.out.println("bom deleted success");
		}
	
	}
}
