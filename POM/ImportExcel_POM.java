package pageobjectmodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.Baseclass;

public class ImportExcel_POM extends Baseclass {

	ExtentTest loginfo = null;

	public ImportExcel_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_4']")
	private WebElement prdtline;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addcategory;

	@FindBy(xpath = "//input[@id='txt_linecode']")
	private WebElement txtlinecode02;

	@FindBy(xpath = "//input[@id='txt_linename']")
	private WebElement txtlinename01;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savebutton;
	
	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn;


	@FindBy(xpath = "//input[@placeholder='Line Code']")
	private WebElement linefilter;

	@FindBy(xpath = "//td[@class='sorting_1']")
	private WebElement verifytext;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr")
	private WebElement verifytext1;
    
	@FindBy(xpath="//table[@id=\"Tbl_Attribute\"]/tbody")
	private WebElement verifytextattribute;
	
	@FindBy(xpath = "//td[text()='No data available in table']")
	private WebElement verifytxt;

	///////////////////////////////// closed product line element////////////////

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	
	

	@FindBy(xpath = "//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='DigitalAsset']")
	private WebElement clkasset;

	@FindBy(xpath = "//input[@placeholder='FileName']")
	private WebElement searchfile;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr/td[10]/div/input")
	private WebElement digassetdel;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement delclk;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement delclkmessage;

	@FindBy(xpath = "//input[@placeholder='Competitor Name']")
	private WebElement searchcompetitor;

	@FindBy(xpath = "//div[@id='btnAdd']")
	private WebElement addbutton;

	@FindBy(xpath = "//select[@id='drpProductCategoryAdd']")
	private WebElement selectproductcategory;

	@FindBy(xpath = "//select[@id='drpProductSubCategoryAdd']")
	private WebElement selectsubcategorydropdown;

	@FindBy(xpath = "//select[@id='drpPartDescriptionAdd']")
	private WebElement selectpartdescdropdown;

	@FindBy(xpath = "//select[@id='drpproductline']")
	private WebElement drpproductline;

	@FindBy(xpath = "//textarea[@id='MainContent_txtPart']")
	private WebElement txtPart01;

	@FindBy(xpath = "//input[@id='btnSave']")
	private WebElement btnSave02;

	////////////////////////////////////////// closed partNo////////////////////

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_3_lnkLink3_0']")
	private WebElement excelclick;

	@FindBy(xpath = "//a[text()='XML']")
	private WebElement xmlclick;

	@FindBy(xpath = "//select[@id='MainContent_ddldata']")
	private WebElement Datatype;

	@FindBy(xpath = "//select[@id='MainContent_drpProductLine']")
	private WebElement productlineimp;

	@FindBy(xpath = "//select[@name='ctl00$MainContent$ddldata']")
	private WebElement importtype;

	@FindBy(xpath = "//select[@id='MainContent_drpMfrBrand']")
	private WebElement productlinexml;

	@FindBy(xpath = "//input[@id='MainContent_FileUpload1']")
	private WebElement choosefile01;

	@FindBy(xpath = "//input[@id='MainContent_btnUpload']")
	private WebElement update;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[10]/div/input")
	private WebElement Del;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[2]")
	private WebElement Delinter01;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	private WebElement Delalert;

	@FindBy(xpath = "///html/body/div[2]/div/div[3]/button[1]")
	private WebElement Delalertinter01;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr[1]/td[4]/div/input[2]")
	private WebElement Delinterchange;

	// @FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr[1]/td[2]")
	private WebElement PLverify;

	@FindBy(xpath = "//input[@placeholder='Competitor Part #']")
	private WebElement verifyinterchange;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement Delintermessage;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tfoot/tr/th[1]/input")
	private WebElement filename;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement filenameinter01;

	@FindBy(xpath = "//div[@id='interchange']/img")
	private WebElement inter;
	//////////////////////////// extended info///////////////////////

	@FindBy(xpath = "//div[@id='ExtendedInfo']")
	private WebElement ExtendedInfo;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[3]/input")
	private WebElement Expidata;

	@FindBy(xpath = "//input[@placeholder='Package Level GTIN']")
	private WebElement Packageinfo;

	@FindBy(xpath = "//div[@id='Package']/img")
	private WebElement packageinfoclk;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[3]")
	private WebElement Verfysortextended;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[5]/div/input")
	private WebElement deleteextended;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement delextended;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement deletesucextended;

	//////////////////// import price////////////////////
	@FindBy(xpath = "//*[@id='Price']/img")
	private WebElement ePricepage;

	@FindBy(xpath = "//input[@placeholder='Price']")
	private WebElement pop;

	/////////////////////// pies////////////////////
	@FindBy(xpath = "//div[@id='Description']")
	private WebElement piesdescclick;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[4]/input")
	private WebElement PDverifypies;

	//////////////////////////// application///////////
	@FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement buyerguideclick;

	/////////////////////// BOM/////////////////
	@FindBy(xpath = "//div[@id='BOM']")
	private WebElement Bomclick1;

	@FindBy(xpath = "//*[@placeholder='BOM-Part']")
	private WebElement Bompart1;
	
	//application//

    @FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement Buyersclick;
	
	//@FindBy(xpath="//div[@id=\"tbl_apppartstable_wrapper\"]/div[2]/div/div/div[2]/div/table/tfoot/tr/th[4]/input")
	@FindBy(xpath="//input[@placeholder='Year Range']")
	private WebElement Yearrange;
	
	/*
	 * @FindBy(xpath="(//input[@placeholder='Year Range'])[1]") private WebElement
	 * verify;
	 */
	
	
	///attribute without add and delete
	  @FindBy(xpath="//*[@id=\"Attribute\"]/img")
	  private WebElement verifyatt;
	  
	  @FindBy(xpath="//input[@id='chkSelectAll']")
	  private WebElement verifycheckbox;
	  
	  @FindBy(xpath="//input[@placeholder='No-Override']")
	  private WebElement verifyattribute; 
	  
	  @FindBy(xpath="//input[@placeholder='Attribute Name']")
	  private WebElement verifyattributename;
	

	public void clickproductlinecode() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		prdtline.click();
		Thread.sleep(6000);
	}

	public void addcategory01() throws Throwable {
		addcategory.click();
		Thread.sleep(8000);
	}

	public void addproductline(String linecode2, String linename01) throws Exception {

		txtlinecode02.sendKeys(linecode2);
		txtlinename01.sendKeys(linename01);
		Thread.sleep(5000);

	}

	public void savebutton() throws InterruptedException {

		savebutton.click();
		Thread.sleep(6000);

	}

	public void acceptAlert01() throws InterruptedException, IOException {

		WebElement pop01 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop01);
		pop01.click();
		Thread.sleep(10000);

	}
	
	public void ClickonBackButton() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}


	public void verifyproductline01(String linecode2) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		linefilter.sendKeys(linecode2);
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(linecode2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}
	////////////////////////// closed product line /////////////////////////

	public void ClickpartsPage() throws InterruptedException {
		partspageheaderclick.click();
		Thread.sleep(7000);
		addbutton.click();
		Thread.sleep(7000);
	}

	public void partsadd() throws InterruptedException {
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(5000);

	}

	public void partsadddrp01() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(5000);
	}

	public void partsadddrp02() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(5000);
	}

	public void partsadddrp03() throws InterruptedException {
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecode2"));
		Thread.sleep(5000);
	}

	public void newpart(String partno13) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		txtPart01.sendKeys(partno13);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave02);
		btnSave02.click();
		Thread.sleep(5000);
	}

	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + alert.getText());
		alert.accept();
		Thread.sleep(4000);

	}

	//////////////////////////////// part addd//////////////////////
	public void datatypepart() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypepart"));
		Thread.sleep(5000);
	}

	public void choosepart() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("Partimportfile"));
		Thread.sleep(16000);

	}
	public void choosepartdelete() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("Partimportfiledeleted"));
		Thread.sleep(16000);

	}

	///////////////////////////////////// closed partno ////////////////////
	public void clickimportexcel() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		excelclick.click();
		Thread.sleep(6000);
	}

	public void clickimportxml() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		xmlclick.click();
		Thread.sleep(6000);
	}

	public void datatype() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypedisasset"));
		Thread.sleep(5000);
	}

	public void datatypeinterchange() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeinterch"));
		Thread.sleep(5000);
	}

	public void productline() throws InterruptedException {
		WebElement selectproductline = productlineimp;
		Select selectpdtline = new Select(selectproductline);
		selectpdtline.selectByVisibleText(pro.getProperty("productline"));
		Thread.sleep(5000);
	}

	////////////////////////////////////// aces and pies xml import
	////////////////////////////////////// /////////////////////
	public void productlinexml() throws InterruptedException {
		WebElement selectproductline = productlinexml;
		Select selectpdtline = new Select(selectproductline);
		selectpdtline.selectByVisibleText(pro.getProperty("productlinexml"));
		Thread.sleep(5000);
	}

	public void choosexmlaces() throws InterruptedException {

		WebElement fileaces = choosefile01;
		fileaces.sendKeys(pro.getProperty("xmlimportfile"));
		Thread.sleep(8000);
	}

	public void clickxmlaces() throws InterruptedException {
		packageinfoclk.click();
		Thread.sleep(4000);
	}

	///////////// pies//////////////////
	public void choosexmlpies() throws InterruptedException {

		WebElement filepies = choosefile01;
		filepies.sendKeys(pro.getProperty("xmlimportfilepies"));
		Thread.sleep(8000);
	}

	public void clickxmlpies() throws InterruptedException {
		packageinfoclk.click();
		Thread.sleep(4000);
	}

//////////////////////////////////////aces and pies xml import /////////////////////
	public void choose01() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("DigitalAsset"));
		Thread.sleep(16000);

	}

	public void choose01deleted() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("DigitalAssetDeleted"));
		Thread.sleep(16000);

	}

	public void choose02() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("interchangeimportfile"));
		Thread.sleep(8000);

	}

	public void choose02deleted() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("interchangeimportfiledelted"));
		Thread.sleep(16000);

	}

	public void choose04deleted() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("pakageinfoimportfiledeleted"));
		Thread.sleep(16000);

	}

	public void update() throws InterruptedException {
		update.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("ImportExcel " + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void updatepies() throws InterruptedException {
		update.click();
		Thread.sleep(5000);
	}

	//////////////////////////////// interchange import closed /////////////////////
	
	
	//////////////////////////// packageinfo////////////////////////////////////////
	public void datatypepakageinfo() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypepackageinfo"));
		Thread.sleep(5000);
	}

	public void choosepakageinfo() throws InterruptedException {

		WebElement filepackageinfo = choosefile01;
		filepackageinfo.sendKeys(pro.getProperty("pakageinfoimportfile"));
		Thread.sleep(8000);
	}

	public void clickpackageInfo() throws InterruptedException {
		packageinfoclk.click();
		Thread.sleep(4000);
	}

	//////////////////////// Extendedinfo start //////////////////////

	public void datatypeExtendedinfo() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeExtendedinfo"));
		Thread.sleep(5000);
	}

	public void chooseExtendedinfo() throws InterruptedException {

		WebElement fileExtendedinfo = choosefile01;
		fileExtendedinfo.sendKeys(pro.getProperty("Extendedinfoimportfile"));
		Thread.sleep(8000);
	}

	public void clickExtendedInfo() throws InterruptedException {
		ExtendedInfo.click();
		Thread.sleep(4000);
	}

	public void chooseExtdeleted() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("Extendedinfoimportfiledeleted"));
		Thread.sleep(16000);

	}

	public void clickpackageinfo() throws InterruptedException {
		packageinfoclk.click();
		Thread.sleep(4000);
	}

	public void verifyExtendedInfo(String US) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Expidata.sendKeys(US);
		Thread.sleep(3000);
		String actualtext = verifytext1.getText();
		System.out.println("Text present as :" + actualtext);
		if (actualtext.equals(US)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same Deleted Successfull");
		}

	}

	public void verifytextextentedinfo(String US) {
		try {

			Thread.sleep(5000);
			Expidata.sendKeys(US);
			Thread.sleep(5000);

			String actualText = PLverify.getText();

			Thread.sleep(5000);

			System.out.println("Text" + actualText);

			if (actualText.equals(US)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so Deleted successfull");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}
	}

	public void deleteextendedinfo() throws InterruptedException {
		deleteextended.click();
		Thread.sleep(3000);
		delextended.click();
		Thread.sleep(3000);

		deletesucextended.click();
		Thread.sleep(5000);
	}

	public void partslanding() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		partspageheaderclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void partsearch(String linecode2) throws InterruptedException {

		txtpartsearch.sendKeys(linecode2);
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equalsIgnoreCase("ImportExcel-01 | Alternator | ImportExcel")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(8000);
	}

	public void clickasset() throws InterruptedException {
		clkasset.click();
		Thread.sleep(4000);
	}

	public void clickinterchange() throws InterruptedException {
		inter.click();
		Thread.sleep(4000);
	}

	public void verifytextdel(String FileName, String Sample1) {
		try {
			Del.click();
			Thread.sleep(5000);
			Delalert.click();
			Thread.sleep(5000);
			Delalert.click();
			Thread.sleep(5000);
			filename.sendKeys(FileName);
			Thread.sleep(5000);

			String actualText = PLverify.getText();
			Thread.sleep(5000);
			System.out.println("Text" + actualText);

			if (actualText.equals(Sample1)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so some digistasset there");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}
	}

	public void veriftytext() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		searchfile.sendKeys("Sample1.jpg");
		Thread.sleep(5000);

		String actualText = verifytext1.getText();

		Thread.sleep(5000);

		System.out.println("Text" + actualText);

	}

	public void deleteddigasset() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		digassetdel.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		delclk.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		delclk.click();
	}

	public void veriftytextinterchange() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		searchcompetitor.sendKeys("T-intername1");

		Thread.sleep(5000);

		String actualText = verifytext1.getText();

		Thread.sleep(5000);

		System.out.println("Text" + actualText);

	}

	public void verifytextdel02(String filenameinter, String Tested1) {
		try {
			Delinterchange.click();
			Thread.sleep(5000);
			Delintermessage.click();
			Thread.sleep(5000);
			Delintermessage.click();
			Thread.sleep(5000);
			filenameinter01.sendKeys(filenameinter);
			Thread.sleep(5000);

			String actualText = verifyinterchange.getText();
			Thread.sleep(5000);
			System.out.println("Text :" + actualText);

			if (actualText.equals(Tested1)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so some interchange there");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}
	}

	public void veriftytextExinfo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Expidata.sendKeys("US");
		Thread.sleep(5000);

		String actualText = verifytext1.getText();

		Thread.sleep(5000);

		System.out.println("Text :" + actualText);
	}

	public void veriftytextpackageinfo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Packageinfo.sendKeys("10765809243153");
		String actualText = verifytext1.getText();

		Thread.sleep(5000);

		System.out.println("Text :" + actualText);
	}

	public void verifytextdeldigasset(String FileName, String Sample1) {
		try {
			digassetdel.click();
			Thread.sleep(6000);
			delclk.click();
			Thread.sleep(5000);
			delclk.click();
			Thread.sleep(5000);
			filenameinter01.sendKeys(FileName);
			Thread.sleep(5000);

			String actualText = PLverify.getText();

			Thread.sleep(5000);

			System.out.println("Text :" + actualText);

			if (actualText.equals(Sample1)) {

			} else {
				System.out.println("Both are same so some digistasset there");
			}

		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}
	}

	public void verifytextdeldigsasset(String FileName, String Sample1) {
		try {

			Thread.sleep(5000);
			filenameinter01.sendKeys(FileName);
			Thread.sleep(5000);

			String actualText = PLverify.getText();

			Thread.sleep(5000);

			System.out.println("Text" + actualText);

			if (actualText.equals(Sample1)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same so Deleted successfull");
			}
		} catch (InterruptedException e) {
			System.out.println("Both are not same so some custome attribute there second");
		}
	}

	///////////////////////////////////////// aces//////////////////////////////////////////
	public void Importtype() throws InterruptedException {
		WebElement selectdatatype = importtype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("importtype"));
		Thread.sleep(5000);
	}

	public void Importtypepies() throws InterruptedException {
		WebElement selectdatatype = importtype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("importtypepies"));
		Thread.sleep(5000);
	}

///////////////////////////////import price /////////////////////////

	public void chooseprice() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportpricefile"));
		Thread.sleep(8000);
	}

	public void choosepricedeleted() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportpricefiledeleted"));
		Thread.sleep(8000);
	}

	public void datatypeprice() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeprice"));
		Thread.sleep(5000);
	}

	public void price(String priceverify) throws InterruptedException {
		ePricepage.click();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Thread.sleep(10000);
		pop.sendKeys("20");

		String actualtext = verifytext1.getText();
		System.out.println("Text present as :" + actualtext);

	}

	////////////////// pies ////////////////////////////

	public void datatypepies() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypepies"));
		Thread.sleep(5000);
	}

	public void choosepies() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportpiesfile"));
		Thread.sleep(8000);
	}

	public void choosepiesdeleted() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportpiesfiledeleted"));
		Thread.sleep(8000);
	}

	public void piesdes(String piesverify) throws InterruptedException {
		piesdescclick.click();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", PDverifypies);
		Thread.sleep(10000);
		PDverifypies.sendKeys("data1");

		String actualtext = verifytext1.getText();
		System.out.println("Text present as :" + actualtext);

	}

///////////////////////application add/////////////////////
	

	public void chooseapplcation() throws InterruptedException {

		WebElement file1 = choosefile01;
		file1.sendKeys(pro.getProperty("excelimportfile"));
		Thread.sleep(16000);

	}

	public void clickApplication() throws InterruptedException {
		buyerguideclick.click();
		Thread.sleep(4000);
	}

	public void update1() throws InterruptedException {
		update.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("ImportExcel " + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	//////////// BOM////////////
	public void datatypebom() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypebom"));
		Thread.sleep(5000);
	}

	public void choosebom() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportbomfile"));
		Thread.sleep(8000);
	}

	public void choosebomdeleted() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportbomfiledeleted"));
		Thread.sleep(8000);
	}

	public void clickbom() throws InterruptedException {
		Bomclick1.click();
		Thread.sleep(4000);
	}

	public void partsearch1(String linecode2) throws InterruptedException {

		txtpartsearch.sendKeys(linecode2);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equalsIgnoreCase("ImportExcel-01 | Alternator | ImportExcel")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void bom(String Bomverify) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Bompart1);
		Thread.sleep(10000);
		Bompart1.sendKeys("ImportExcel-02 | Alternator");

		String actualtext = verifytext1.getText();
		System.out.println("Text present as :" + actualtext);

	
}

///application with year range//
	public void datatypeapplnwith() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeapplnyr"));
		Thread.sleep(5000);
	}
	public void choosewithyradd() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportyearaddfile"));
		Thread.sleep(8000);
	}

	public void choosewithyrdel() throws InterruptedException {

		WebElement fileprice = choosefile01;
		fileprice.sendKeys(pro.getProperty("excelimportyeardelfile"));
		Thread.sleep(8000);
	}
	
	public void appln(String appverify) throws InterruptedException {
		Buyersclick.click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Yearrange);
		Thread.sleep(10000);
		Yearrange.sendKeys("1964-1964");

		String actualtext = verifytext1.getText();
		System.out.println("Text present as :" + actualtext);

}
	
	//////////////////////application add and deleted /////////////////////
	public void datatypeapplication() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeapplication"));
		Thread.sleep(5000);
	}

	public void chooseapplication() throws InterruptedException {

		WebElement filepackageinfo = choosefile01;
		filepackageinfo.sendKeys(pro.getProperty("applicationimportfile"));
		Thread.sleep(8000);
	}
	
	public void updateapplication() throws InterruptedException {
		update.click();
		Thread.sleep(30000);
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("ImportExcel " + alert.getText());
			alert.accept();
			Thread.sleep(30000);
		}catch(Exception e)
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			partspageheaderclick.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		//Alert alert = driver.switchTo().alert();
		//System.out.println("ImportExcel " + alert.getText());
		//alert.accept();
		//Thread.sleep(30000);
	}

	public void clickapplication() throws InterruptedException {
		Thread.sleep(2000);
		buyerguideclick.click();
		//Thread.sleep(4000);
		//driver.quit();
	}
	public void chooseapplicationdeleted() throws InterruptedException {

		WebElement filepackageinfo = choosefile01;
		filepackageinfo.sendKeys(pro.getProperty("applicationimportfiledeleted"));
		Thread.sleep(8000);
	}
	
	
	public void veriftytextapplication() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Yearrange.sendKeys("2009");
		String actualText = verifytext1.getText();

		Thread.sleep(5000);

		System.out.println("Text :" + actualText);
	}


//////////////product attribute without parttype add////
	public void datatypeproductwithout() throws InterruptedException {
		WebElement selectdatatype = Datatype;
		Select selectdata = new Select(selectdatatype);
		selectdata.selectByVisibleText(pro.getProperty("datatypeproductwithout"));
		Thread.sleep(5000);
	}

	public void chooseproductwithout() throws InterruptedException {

		WebElement filepackageinfo = choosefile01;
		filepackageinfo.sendKeys(pro.getProperty("excelimportproductattwithout"));
		Thread.sleep(8000);
	}

	public void clickproductwithout() throws InterruptedException {
		verifyatt.click();
		Thread.sleep(4000);
		verifycheckbox.click();
	}

	public void chooseproductwithoutdeleted() throws InterruptedException {

		WebElement filepackageinfo = choosefile01;
		filepackageinfo.sendKeys(pro.getProperty("excelimportproductattwithoutdeleted"));
		Thread.sleep(8000);
	}
	

	public void veriftytextwithoutattribute() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		verifyattributename.sendKeys("test entry");
		String actualText = verifytextattribute.getText();

		Thread.sleep(5000);

		System.out.println("Text :" + actualText);
	}


}




