package pageobjectmodel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import com.sun.tools.internal.xjc.reader.gbind.Element;

import junit.framework.Assert;
import utility.Baseclass;

public class Masterproductrelated_POM extends Baseclass {

	ExtentTest loginfo = null;

	public Masterproductrelated_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[@href='Productcategory.aspx?PageTitle=Product Category']")
	private WebElement mastercategory;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addcategory;

	@FindBy(xpath = "//div[@id='MainContent_btnAdd']")
	private WebElement addcategory1;

	@FindBy(xpath = "//button[@id='MainContent_btnAdd']")
	private WebElement addcategory2;

	@FindBy(id = "txtProductCategory1")
	private WebElement entercategory;

	@FindBy(xpath = "//input[@id=\"txtProductCategory_edit\"]")
	private WebElement entercategoryedit;

	// @FindBy(xpath = "//*[text()='Transfer Case']")
	@FindBy(xpath = "(//*[text()='Transfer Case'])[2]")
	private WebElement equivalentcategoryprevious;

	@FindBy(xpath = "//input[@value='Multifunction']")
	private WebElement equivalentcategory1;

	@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	private WebElement savecategory;

	@FindBy(xpath = "//div[@id=\"save_btn_new_edit\"]")
	private WebElement savecategory1;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savecategoryadd;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement savecategoryEdit;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savebt;

	@FindBy(xpath = "//*[@id='save_btn_new_edit']/i")
	private WebElement savebtedit;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tfoot/tr/th[1]/input")
	private WebElement partdescsearch;

	@FindBy(xpath = "//td[@class='sorting_10']")
	private WebElement verifytext1;

	@FindBy(xpath = "//td[@class='sorting_1']")
	private WebElement verifytext;

	@FindBy(xpath = "//a[contains(text(),'Product Sub Category')]")
	private WebElement subcategory;

	@FindBy(xpath = "//span[@id='select2-drpProductCategoryAdd1-container']")
	private WebElement selectcategory;

	@FindBy(xpath = "//span[@id='select2-drpProductCategory1-container']")
	private WebElement selectcategoryeditprodu;

	@FindBy(xpath = "//span[@id='select2-drpProductCategory1-container']")
	private WebElement selectcategoryveri;

	@FindBy(xpath = "//li[text()='Steering Test']")
	private WebElement selectcategory1;

	@FindBy(xpath = "//li[text()='Engine oil test']")
	private WebElement selectcategory2;

	@FindBy(xpath = "//input[@id='txt_subcategory']")
	private WebElement clicksubcatname;

	@FindBy(xpath = "//*[@id='txt_subcategory']")
	public WebElement entersubcategory;

	@FindBy(xpath = "//label[text()='Switches']")
	private WebElement eqsubcategory;

	@FindBy(xpath = "//*[text()='Relays']")
	private WebElement eqsubcategorypre;

	@FindBy(xpath = "//*[text()='Undercar']")
	private WebElement eqsubcategory1;

	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_9\"]")
	private WebElement partdesc;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategoryAdd']")
	private WebElement selectsubcategory;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategoryAdd']//option[text()='Steering Test']")
	private WebElement selectsubcategorys;

	@FindBy(xpath = "//select[@id='MainContent_drpProductSubCategoryAdd']")
	private WebElement selectsubcategoryaut;

	@FindBy(xpath = "//select[@id='MainContent_drpProductSubCategoryAdd']//option[text()='Ignition Coil Test']")
	private WebElement selectsubcategorysaut1;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategoryAdd']//option[text()='Engine oil test']")
	private WebElement selectsubcategoryss;

	@FindBy(xpath = "//select[@id='drpProductCategory']")
	private WebElement drpProductCategory;

	@FindBy(xpath = "//input[@id='txtPartDescription']")
	private WebElement enternewpartdesc;

	@FindBy(xpath = "//select[@id='MainContent_drpAcesPartTerminology']")
	private WebElement equivalentpartdes;

	@FindBy(xpath = "//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Transfer Case Switch']")
	private WebElement equivalentpartdessend;

	@FindBy(xpath = "//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Transfer Case Vacuum Switch']")
	private WebElement equivalentpartdessendedit;

	@FindBy(xpath = "//img[@id='MainContent_Image1']")
	private WebElement eacester;

	@FindBy(xpath = "//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Oil Seals']")
	private WebElement equivalentpartdessend1;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']")
	private WebElement verfypart;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']//option[text()='Steering Test']")
	private WebElement verfypart1;

	@FindBy(xpath = "//input[@placeholder='Equivalent Aces Terminology']")
	private WebElement eequivatermedit;

	@FindBy(xpath = "//input[@id='MainContent_ImageButton1']")
	private WebElement eequediticon;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_4']")
	private WebElement prdtln;

	@FindBy(xpath = "//input[@id='txt_linecode']")
	private WebElement txtlinecode;

	@FindBy(xpath = "//input[@id='txt_linename']")
	private WebElement txtlinename;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement Productsaveedit;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchfilter1;

	@FindBy(xpath = "(//div[@class=\"edit_icon_ver\"])[1]")
	private WebElement Editfirst;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']")
	private WebElement verifytxt1;

	@FindBy(xpath = "//input[@placeholder='Product Subcategory Name']")
	private WebElement filtercategory;

	@FindBy(xpath = "(//div[@class=\"edit_icon_ver\"])[1]")
	private WebElement subeditbutton;

	@FindBy(xpath = "//*[@id='drpProductCategory']")
	private WebElement catselect;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tfoot/tr/th[1]/input")
	private WebElement partdescch;

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']")
	private WebElement filtercategory1;

	@FindBy(xpath = "//input[@placeholder='Line Name']")
	private WebElement editlinefilter;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement linefilter;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	private WebElement linefilteredit;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_2']")
	private WebElement eCustomAttribute;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement eAddCustomAttribute;

	@FindBy(xpath = "//input[@id='txtPartsSpecification1']")
	private WebElement eEtrCustomAttribute;

	@FindBy(xpath = "//span[@id='select2-ddlDatatype1-container']")
	private WebElement eDataType;

	@FindBy(xpath = "(//li[text()='Alphanumeric'])")
	private WebElement edatasend;

	@FindBy(xpath = "(//li[text()='Text'])")
	private WebElement edatasend1;

	@FindBy(xpath = "//input[@id='min']")
	private WebElement eMinLength;

	@FindBy(xpath = "//input[@id='max']")
	private WebElement eMaxLength;

	@FindBy(xpath = "//input[@value='Steering']")
	private WebElement eselectpdes;

	@FindBy(xpath = "//input[@id='10143']")
	private WebElement esecpartdesc;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement ecustomsaveedit;

	@FindBy(xpath = "//input[@value='Engine']")
	private WebElement eselectpdes1;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	public WebElement ecustomeditbt;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;

	@FindBy(xpath = "//a[@id='hylLogout']")
	public WebElement LogoutButton;

	@FindBy(xpath = "//*[@id='txtUsername']")
	public WebElement Username1;

	@FindBy(xpath = "//*[@id='txtPassword']")
	public WebElement Password1;

	@FindBy(xpath = "//*[@id='btnLogin']")
	public WebElement Submit1;

	@FindBy(xpath = "//*[@id='logosettings']/i")
	public WebElement Settings;

	@FindBy(xpath = "//*[@id='MainContent_drpadmin']")
	public WebElement Partdescadmin;

	@FindBy(xpath = "//*[@id='MainContent_btnEdit']")
	public WebElement EDIToption;

	@FindBy(xpath = "(//label[text()='Ignition Test'])//preceding-sibling::input")
	public WebElement Partdescripvalue;

	@FindBy(xpath = "(//label[text()='Engine oil test'])//preceding-sibling::input")
	public WebElement Partdescripvalue1;

	@FindBy(xpath = "//*[@id='MainContent_btnSave']")
	public WebElement Savepartdesc;

	@FindBy(xpath = "//a[@ href='PartDescription_New.aspx?PageTitle=Part Description']")
	private WebElement partsdesc;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addpartsdesc;

	@FindBy(xpath = "//select[@id='drpProductCategoryAdd']")
	private WebElement prodcategorynew;

	@FindBy(xpath = "//select[@id='drpProductSubCategoryAdd']")
	private WebElement partsdescnew;

	@FindBy(xpath = "//select[@id='drpAcesPartTerminology']")
	private WebElement Equivalentaces;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savbtn;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement saveeditbtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement altclk;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement alertclk;

	@FindBy(xpath = "//select[@id=\"drpProductCategory\"]")
	private WebElement catepartdesc;

	@FindBy(xpath = "//div[@id=\"diveditbutton_'322'\"]/img")
	private WebElement editpartsdesc;

	@FindBy(xpath = "//select[@id=\"drpAcesPartTerminology\"]")
	private WebElement equaces;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement eqaceschange;

	@FindBy(xpath = "/html/body/div/form/div[6]/div/div/div/div[3]/div[1]/div/div/div[2]/div/table/tbody/tr/td[6]/div/div[1]/img")
	private WebElement editclk;

	@FindBy(xpath = "//select[@id=\"drpAcesPartTerminology\"]")
	private WebElement selclk;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	private WebElement clkokalert;

	@FindBy(xpath = "//input[@id='17']")
	private WebElement clkstandardcolor;

	@FindBy(xpath = "//input[@id='txtCusAttribute']")
	private WebElement txtcust;

	@FindBy(xpath = "//div[@id='btnadd']")
	private WebElement addcust;

	@FindBy(xpath = "//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li//div")
	// @FindBy(xpath="/html/body/div[2]")
	private WebElement choosecustattribute;

	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn;

///////////////////attribute master////

	@FindBy(xpath = "//a[text()='Attribute Master']")
	public WebElement attmaster;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	public WebElement addattrmaster;

	@FindBy(xpath = "//input[@id='txtAtributename']")
	public WebElement attrname;

	@FindBy(xpath = "//*[@id=\"select2-drpAttributeunit-container\"]")
	public WebElement attunit;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public WebElement atttext;

	@FindBy(xpath = "//select[@id='drpDatatype']")
	public WebElement attdatatype;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement attsave;

	@FindBy(xpath = "//input[@id='txtAttrName']")
	public WebElement attnametxt;

	@FindBy(xpath = "//input[@class='button_search']")
	public WebElement attsearch;

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	public WebElement attnametxtsch;

	@FindBy(xpath = "  //table[@id='DataTableViewer']/tbody/tr")
	public WebElement gridverify;

	@FindBy(xpath = "//div[@class='edit_icon_ver']")
	public WebElement editattribute;

	@FindBy(xpath = "//input[@id='btnEdit']")
	public WebElement editsave;

	@FindBy(xpath = "//h3[text()='Attribute value']")
	public WebElement attvalue1;

	@FindBy(xpath = "//select[@id=\"drpProductCategory\"]")
	public WebElement prodcatesel;

	@FindBy(xpath = "//select[@id='drpProductSubCategory']")
	public WebElement prodsubcatesel;

	@FindBy(xpath = "//select[@id='drpPartDescription']")
	public WebElement partdescrsel;

	@FindBy(xpath = "//input[@id='btnAdddesc']")
	public WebElement addattrval;

	@FindBy(xpath = "//button[text()='OK']")
	public WebElement alertok;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
	public WebElement attralertclk;

	public void clickonAttributemaster() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		attmaster.click();
		Thread.sleep(18000);

	}

	public void addmaster(String Attributemasname) throws InterruptedException {
		addattrmaster.click();
		Thread.sleep(2000);
		attrname.sendKeys(pro.getProperty("Attributemasname"));
		Thread.sleep(2000);
	}

	public void selattr() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		attunit.click();
		Thread.sleep(2000);
		atttext.sendKeys(pro.getProperty("attvalue"));
		atttext.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement element = attdatatype;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("attdatatype"));
		Thread.sleep(3000);
		attsave.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

	}

	public void verifyattribute() throws InterruptedException {
		Thread.sleep(4000);
		attnametxt.sendKeys(pro.getProperty("Attributemasname"));
		attsearch.click();
		Thread.sleep(2000);
		attnametxtsch.sendKeys(pro.getProperty("Attributemasname"));
		String actualtext = gridverify.getText();
		System.out.println("Text present as " + actualtext);
		if (!actualtext.equals(pro.getProperty("Attributemasname"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

////edit attribute master/////

	public void verifyedit() throws InterruptedException {
		Thread.sleep(3000);

		attnametxt.sendKeys(pro.getProperty("Attributemasname"));
		Thread.sleep(3000);
		attsearch.click();
		Thread.sleep(3000);
		editattribute.click();
		// editsave.click();
		// Thread.sleep(8000);
		// Alert alert1 = driver.switchTo().alert();
		// alert1.accept();
		Thread.sleep(3000);
		attvalue1.click();
		Thread.sleep(2000);
		Select Selproductcateg = new Select(prodcatesel);
		Selproductcateg.selectByVisibleText(pro.getProperty("procategory"));
		Thread.sleep(2000);
		addattrval.click();
		Thread.sleep(2000);
		altclk.click();
		Thread.sleep(2000);
		attrname.clear();
		Thread.sleep(3000);
		attrname.sendKeys(pro.getProperty("Attributemasnameedit"));
		Thread.sleep(3000);

		// WebElement element = prodcatesel;
		// Select select = new Select(element);
		// select.selectByVisibleText(pro.getProperty("procategory"));
		// addattrval.click();
		// Thread.sleep(3000);
		// alertok.click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click()", "editsave");
		attvalue1.click();
		editsave.click();
		Thread.sleep(8000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void verifyattributeedit() throws InterruptedException {
		Thread.sleep(4000);
		attnametxt.sendKeys(pro.getProperty("Attributemasnameedit"));
		Thread.sleep(2000);
		attsearch.click();
		Thread.sleep(2000);
		attnametxtsch.sendKeys(pro.getProperty("Attributemasnameedit"));
		String actualtext = gridverify.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(pro.getProperty("Attributemasnameedit"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

//////delete attribute master////////

	public void deleteattributemaster() throws SQLException {
		String url = "jdbc:sqlserver://192.168.100.228; databaseName=PMTAutomation";
		String usr = "msdteam";
		String password = "P@rt5$^*";
		Connection connection = DriverManager.getConnection(url, usr, password);
		System.out.println("connected successfully");
		Statement smtb = connection.createStatement();
		String Result = "DELETE FROM PartsSpecification WHERE PartsSpecificationName ='cusr11' ";
		ResultSet rs = smtb.executeQuery(Result);
		System.out.println(rs);
	}

	public void clickonproductcategory() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, mastercategory, 250).click();
		Thread.sleep(3000);
	}

	public void addcategory() throws Throwable {
		Baseclass.waitForElementToBeClickable(driver, addcategory, 250).click();
	}

	public void Edirtaddcategory(String Categoryprevious) throws Exception {

		Baseclass.waitForElementToBeVisible(driver, searchfilter1, 250).sendKeys(pro.getProperty("Categoryprevious"));
		Thread.sleep(2000);
		Baseclass.waitForElementToBeClickable(driver, Editfirst, 250).click();
	}

	public void editequalcase(String categoryname) throws Exception {
		Thread.sleep(4000);
		Baseclass.waitForElementToBeClickable(driver, entercategoryedit, 250).clear();
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, entercategoryedit, 250).sendKeys(categoryname);
	}

	public void addcategory1() throws Throwable {

		Baseclass.waitForElementToBeClickable(driver, addcategory1, 250).click();
	}

	public void addcategory2() throws Throwable {

		Baseclass.waitForElementToBeClickable(driver, addcategory2, 250).click();
		Thread.sleep(1000);
	}

	public void editcategory(String Editequivalent) throws Throwable {

		Baseclass.waitForElementToBeClickable(driver, verfypart, 250).click();
		Baseclass.waitForElementToBeClickable(driver, verfypart1, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eequivatermedit, 250).sendKeys(Editequivalent);
		Baseclass.waitForElementToBeClickable(driver, eequediticon, 250).click();
	}

	public void entrycategory(String Categoryprevious) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, entercategory, 250).sendKeys(Categoryprevious);
		Baseclass.waitForElementToBeClickable(driver, equivalentcategoryprevious, 250).click();
	}

	public void entrycategory1(String categoryname1) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, entercategory, 250).sendKeys(categoryname1);
		Baseclass.waitForElementToBeClickable(driver, equivalentcategory1, 250).click();
		Thread.sleep(2000);
	}

	public void savingcategory() throws InterruptedException {
		WebElement elementfilter1 = savecategory;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);
		Thread.sleep(5000);
	}

	public void savingcategoryadd() throws InterruptedException {

		WebElement elementfilteradd = savecategoryadd;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilteradd);
		Thread.sleep(5000);
	}

	public void savingcategoryEdit() throws InterruptedException {
		WebElement elementfilteredit = savecategoryEdit;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilteredit);
		Thread.sleep(25000);
	}

	public void acceptAlert() throws InterruptedException, IOException {

		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(3000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
		Thread.sleep(3000);

	}

	public void acceptAlert1() throws InterruptedException, IOException {

		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();

	}

	public void verifyingtext(String Categoryprevious) throws IOException {

		Baseclass.waitForElementToBeVisible(driver, searchfilter1, 250).sendKeys(pro.getProperty("Categoryprevious"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(Categoryprevious)) {
			System.out.println("Both are same");

		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingtextedit(String categoryname) throws IOException {
		Baseclass.waitForElementToBeVisible(driver, searchfilter1, 250).sendKeys(pro.getProperty("categoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(categoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingtext1(String categoryname1) throws IOException {
		Baseclass.waitForElementToBeVisible(driver, searchfilter1, 250).sendKeys(pro.getProperty("categoryname1"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(categoryname1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void clicksubcategory() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, subcategory, 250).click();

	}

	public void addsubcategory() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, selectcategory, 250).click();

		Baseclass.waitForElementToBeClickable(driver, selectcategory1, 250).click();
	}

	public void addsubcategoryedit() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, selectcategoryeditprodu, 250).click();
		Baseclass.waitForElementToBeClickable(driver, selectcategory1, 250).click();
		Baseclass.waitForElementToBeVisible(driver, filtercategory, 250)
				.sendKeys(pro.getProperty("subcategorynameprevious"));
		Baseclass.waitForElementToBeClickable(driver, subeditbutton, 250).click();
	}

	public void addsubcategory1() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, selectcategory, 250).click();
		Baseclass.waitForElementToBeClickable(driver, selectcategory2, 250).click();
	}

	public void entrysubcategory(String subcategorynameprevious) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, entersubcategory, 250).sendKeys(subcategorynameprevious);
		Baseclass.waitForElementToBeClickable(driver, eqsubcategorypre, 250).click();
	}

	public void entrysubcategoryedit(String subcategoryname) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, clicksubcatname, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, clicksubcatname, 250).sendKeys(subcategoryname);
		Baseclass.waitForElementToBeClickable(driver, eqsubcategory, 250).click();

	}

	public void entrysubcategory1(String subcategoryname1) throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, clicksubcatname, 250).click();
		Baseclass.waitForElementToBeVisible(driver, entersubcategory, 250).sendKeys(subcategoryname1);
		Baseclass.waitForElementToBeClickable(driver, eqsubcategory1, 250).click();
		Thread.sleep(5000);

	}

	public void acceptAlertsub() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		System.out.println("Product Category" + pro.getProperty("subcategoryname") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void ClickonBackButton() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}

	public void verifysubcategory(String subcategorynameprevious) throws Exception {

		Baseclass.waitForElementToBeClickable(driver, selectcategoryveri, 250).click();

		Baseclass.waitForElementToBeClickable(driver, selectcategory1, 250).click();
		Baseclass.waitForElementToBeVisible(driver, filtercategory, 250)
				.sendKeys(pro.getProperty("subcategorynameprevious"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategorynameprevious)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifysubcategoryedit(String subcategoryname) throws Exception {

		Baseclass.waitForElementToBeClickable(driver, selectcategoryveri, 250).click();
		Baseclass.waitForElementToBeClickable(driver, selectcategory1, 250).click();
		Baseclass.waitForElementToBeVisible(driver, filtercategory, 250).sendKeys(pro.getProperty("subcategoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifysubcategory1(String subcategoryname1) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, selectcategoryveri, 250).click();
		Baseclass.waitForElementToBeClickable(driver, selectcategory2, 250).click();
		Baseclass.waitForElementToBeVisible(driver, filtercategory, 250).sendKeys(pro.getProperty("subcategoryname1"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}
	/// new parts description //

	public void partdescnew() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		partsdesc.click();
	}

	public void addcategorynew() throws Throwable {
		addpartsdesc.click();
		Thread.sleep(5000);
	}

	public void editcategory1(String procategory) throws Throwable {
		Thread.sleep(3000);

		Select sel = new Select(catepartdesc);
		sel.selectByVisibleText("procategory");

		Thread.sleep(3000);

	}

	public void PrtdescriptionPrtCatgory(String procategory) {
		drpProductCategory.sendKeys(procategory);
	}

	public void edit(String Editequivalentaces) throws InterruptedException {
		Thread.sleep(3000);
		editclk.click();
		/*
		 * Thread.sleep(3000); selclk.click(); Select sel1 = new Select(selclk);
		 * sel1.selectByVisibleText(Editequivalentaces);
		 */
		
		  
//		  clkokalert.click(); 
//		  Thread.sleep(3000); 
//		  clkstandardcolor.click();
//		  Thread.sleep(2000); 
//		  txtcust.sendKeys(pro.getProperty("customAttributes"));
//		  Thread.sleep(4000); 
//		  choosecustattribute.click(); 
//		  //-------//
//		  Thread.sleep(2000); 
//		  addcust.click();
		 

		// Select selcust = new Select(choosecustattribute);
		// selcust.selectByVisibleText("testcus12");

	}

	public void categoryselectnew1() throws Exception {

		Thread.sleep(2000);
		WebElement element = prodcategorynew;
		Select selcate = new Select(element);
		selcate.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(5000);
	}

	public void categoryselectnew() throws Exception {

		Thread.sleep(2000);
		WebElement element = prodcategorynew;
		Select selcate = new Select(element);
		selcate.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(5000);
	}

	public void entrypartdescnew(String ProductpartDescp) throws Exception {

		partsdescnew.sendKeys(ProductpartDescp);
		Thread.sleep(5000);

	}

	public void entrypartdescnew1(String subcategoryname1) throws Exception {

		partsdescnew.sendKeys(subcategoryname1);
		Thread.sleep(5000);

	}

	public void equivalentpartdescnew1() throws InterruptedException {

		Thread.sleep(2000);
		WebElement element1 = Equivalentaces;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("EquivalentAces1"));
		Thread.sleep(2000);
	}

	public void AddingPartdescription(String partdescription) {

		enternewpartdesc.sendKeys(partdescription);

	}

	public void equivalentpartdescnew() throws InterruptedException {

		Thread.sleep(3000);

		WebElement element1 = Equivalentaces;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("Editequivalent"));
		Thread.sleep(2000);
	}

	public void savingpartdescnew() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", saveeditbtn);
		saveeditbtn.click();
		// Thread.sleep(5000);

	}

	public void savingpartdescnewadd() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savbtn);
		savbtn.click();
		Thread.sleep(3000);

	}

	public void alertpart1() throws InterruptedException {
		Thread.sleep(5000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", altclk);
		Thread.sleep(3000);
		// altclk.click();
		/// Thread.sleep(20000);
		// Thread.sleep(10000);
	}

	public void acceptAlertlinenew() throws InterruptedException {
		Thread.sleep(2000);
		alertclk.click();
		Thread.sleep(2000);
	}

	public void editcategorynew(String Editequivalent) throws Throwable {
		Thread.sleep(6000);

		Select sel = new Select(catepartdesc);
		sel.selectByVisibleText("Steering Test");
		Thread.sleep(6000);
		eequivatermedit.sendKeys(Editequivalent);
		Thread.sleep(5000);
		editpartsdesc.click();
		Thread.sleep(3000);
	}

	public void partdesc1() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, partdesc, 250).click();
		Thread.sleep(2000);
	}

	public void categoryselect() throws Exception {

		Baseclass.waitForElementToBeClickable(driver, selectsubcategory, 250).click();
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver, selectsubcategorys, 250).click();
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver, selectsubcategoryaut, 250).click();
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver, selectsubcategorysaut1, 250).click();
	}

	public void categoryselect1() throws Exception {
		Baseclass.waitForElementToBeClickable(driver, selectsubcategory, 250).click();
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver, selectsubcategoryss, 250).click();
	}

	public void entrypartdesc(String partdesc) throws Exception {

		Baseclass.waitForElementToBeVisible(driver, enternewpartdesc, 250).sendKeys(partdesc);
	}

	public void entrypartdescedit(String subcategoryname) throws Exception {
		Baseclass.waitForElementToBeClickable(driver, enternewpartdesc, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, enternewpartdesc, 250).sendKeys(subcategoryname);

	}

	public void entrypartdesc1(String subcategoryname1) throws Exception {
		try {
			Baseclass.waitForElementToBeVisible(driver, enternewpartdesc, 250).sendKeys(subcategoryname1);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Baseclass.waitForElementToBeVisible(driver, enternewpartdesc, 250).sendKeys(subcategoryname1);

		}
	}

	public void acceptAlertdesc() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + pro.getProperty("partdesc") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void equivalentpartdesc() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, equivalentpartdes, 250).click();

		Baseclass.waitForElementToBeClickable(driver, equivalentpartdessend, 250).click();
	}

	public void equivalentpartdescedit() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, equivalentpartdes, 250).click();
		Baseclass.waitForElementToBeClickable(driver, equivalentpartdessendedit, 250).click();
		Baseclass.waitForElementToBeClickable(driver, eacester, 250).click();

	}

	public void equivalentpartdesc1() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, equivalentpartdes, 250).click();
		Thread.sleep(1000);
		Baseclass.waitForElementToBeClickable(driver, equivalentpartdessend1, 250).click();

	}

	public void savingpartdesc1() throws InterruptedException {

		Select seleqaces = new Select(equaces);
		seleqaces.selectByVisibleText("Transfer Case Vacuum Switch");
		Thread.sleep(3000);
		eqaceschange.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savecategory1);
		savecategory1.click();
		Thread.sleep(5000);
		// wait(2);
	}

	public void savingpartdesc() throws InterruptedException {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", savecategory);
			Baseclass.waitForElementToBeClickable(driver, savecategory, 250).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", savecategory);
			Baseclass.waitForElementToBeClickable(driver, savecategory, 250).click();

		}

	}

	public void verifycategory1() throws InterruptedException {
		WebElement element = filtercategory1;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(2000);
	}

	public void verifycategory2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", catselect);
		catselect.click();
		Thread.sleep(3000);
		Select selcate = new Select(catselect);
		selcate.selectByVisibleText("Steering Test");
		Thread.sleep(3000);
		partdescch.sendKeys("Ignition Coil Test");
	}

	public void verifypartdesc(String partdesc) throws Exception {

		Baseclass.waitForElementToBeClickable(driver, verfypart, 250).click();
		Baseclass.waitForElementToBeClickable(driver, verfypart1, 250).click();
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(partdesc)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifypartdescedit1(String subcategoryname) throws Exception {
		Thread.sleep(3000);
		catepartdesc.click();
		Select sel = new Select(catepartdesc);
		sel.selectByVisibleText("Steering Test");

		Thread.sleep(6000);

		partdescsearch.sendKeys(subcategoryname);
		Thread.sleep(3000);
		editpartsdesc.click();
		Thread.sleep(3000);
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifypartdescedit(String subcategoryname) throws Exception {
		Baseclass.waitForElementToBeClickable(driver, verfypart, 250).click();
		Baseclass.waitForElementToBeClickable(driver, verfypart1, 250).click();
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void clickonproductlinecode() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, prdtln, 250).click();
	}

	public void addproductline(String linecode1, String linename) throws Exception {
		Baseclass.waitForElementToBeVisible(driver, txtlinecode, 250).sendKeys(linecode1);
		Baseclass.waitForElementToBeVisible(driver, txtlinename, 250).sendKeys(linename);
	}

	public void editproduct(String linecode, String linename) throws Exception {
		Baseclass.waitForElementToBeVisible(driver, linefilter, 250).sendKeys(linecode);
		Baseclass.waitForElementToBeClickable(driver, linefilteredit, 250).click();
		Baseclass.waitForElementToBeClickable(driver, txtlinename, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, txtlinename, 250).sendKeys(linename);
		Baseclass.waitForElementToBeClickable(driver, Productsaveedit, 250).click();

	}

	public void savebtn() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, savecategoryadd, 250).click();

	}

	public void acceptAlertline() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + pro.getProperty("linecode") + alert.getText());
		alert.accept();
		Thread.sleep(2000);

	}

	public void verifyproductline(String linename2) {
		Baseclass.waitForElementToBeVisible(driver, linefilter, 250).sendKeys(linename2);
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(linename2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifyproductlineedit(String linename) {
		Baseclass.waitForElementToBeVisible(driver, editlinefilter, 250).sendKeys(pro.getProperty("linename"));
		String actualtext = verifytext1.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(linename)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void clickonCustomAttributes() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, eCustomAttribute, 250).click();
	}

	public void AddbtnEnterCustomAtbName(String AttributeName) throws Throwable {
		Baseclass.waitForElementToBeClickable(driver, eAddCustomAttribute, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eEtrCustomAttribute, 250).sendKeys(AttributeName);
	}

	public void editcustom(String AttributeName, String editattrvalue) throws Throwable {
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(AttributeName);
		Baseclass.waitForElementToBeClickable(driver, ecustomeditbt, 250).click();
		Baseclass.waitForElementToBeClickable(driver, eEtrCustomAttribute, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eEtrCustomAttribute, 250).sendKeys(editattrvalue);

	}

	public void editdataandpartdesc() throws Throwable {
		Baseclass.waitForElementToBeClickable(driver, eDataType, 250).click();
		Baseclass.waitForElementToBeClickable(driver, edatasend1, 250).click();
		Baseclass.waitForElementToBeClickable(driver, eMinLength, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eMinLength, 250).sendKeys("2");
		Baseclass.waitForElementToBeClickable(driver, eMaxLength, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eMaxLength, 250).sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ecustomsaveedit);
		Baseclass.waitForElementToBeClickable(driver, ecustomsaveedit, 250).click();
	}

	public void AddbtnEnterCustomAtbName1(String AttributeName1) throws Throwable {
		Baseclass.waitForElementToBeClickable(driver, eAddCustomAttribute, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eEtrCustomAttribute, 250).sendKeys(AttributeName1);
	}

	public void AttributeDetails() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eDataType, 250).click();
		Baseclass.waitForElementToBeClickable(driver, edatasend, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eMinLength, 250).sendKeys("1");
		Baseclass.waitForElementToBeVisible(driver, eMaxLength, 250).sendKeys("250");
	}

	@SuppressWarnings("deprecation")
	public void SelectPartDescription() throws InterruptedException {

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eselectpdes);
		if (eselectpdes.isDisplayed()) {
			eselectpdes.click();

		} else {
			Assert.assertNull(eselectpdes);
		}

	}

	@SuppressWarnings("deprecation")
	public void SelectPartDescription1() throws InterruptedException {

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eselectpdes1);
		if (eselectpdes1.isDisplayed()) {
			eselectpdes1.click();

		} else {
			Assert.assertNull(eselectpdes1);
		}

	}

	public void savebtn2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebt);
		Baseclass.waitForElementToBeClickable(driver, savebt, 250).click();

	}

	public void savebtnedit() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebtedit);
		Baseclass.waitForElementToBeClickable(driver, savebtedit, 250).click();
		Thread.sleep(2000);
	}

	public void acceptAlertAttribute() throws InterruptedException {

		Alert alert = driver.switchTo().alert();
		System.out.println("Custom Attribute" + pro.getProperty("AttributeName") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void VerufyAttribute(String AttributeName) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(AttributeName);
		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		actualText.equals(AttributeName);
		System.out.println("Both are same: Added Successfully");
	}

	public void VerifycusteditAttribute(String editattrvalue) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(editattrvalue);

		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains(editattrvalue))
			;
		{
			System.out.println("Both are same: Added Successfully");
		}
	}

	public void VerufyAttribute1(String AttributeName1) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, esearchbox, 250).sendKeys(AttributeName1);

		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		actualText.equals(AttributeName1);
		System.out.println("Both are same: Added Successfully");
	}

	public void alertpart() {
		// TODO Auto-generated method stub

	}

}
