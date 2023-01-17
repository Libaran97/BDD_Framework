package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Masterproductrelated_POM2 extends Baseclass {

	ExtentTest loginfo = null;

	public Masterproductrelated_POM2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//*[@id=\"feedbacknew\"]/i")
	private WebElement Feedbackbt;

	@FindBy(xpath = "//*[@id=\"hylLogout\"]/i") // a[text()="Web Category"]
	private WebElement elogout;

	@FindBy(xpath = "//a[text()='Web Category']")
	private WebElement Webcategory01;

	@FindBy(xpath = "//a[@href='PartsManufacture.aspx?PageTitle=Brand Master']")
	private WebElement mastercategorybrand;

	@FindBy(xpath = "//a[@href='Subproductline.aspx?PageTitle=Sub Product Line Master']")
	private WebElement mastercategorysub;

	@FindBy(xpath = "//a[@href='CK31.aspx?PageTitle=System (CK31)']")
	private WebElement mastercategoryck31;

	@FindBy(xpath = "//a[@href='CK32.aspx?PageTitle=Assembly (CK32)']")
	private WebElement mastercategoryckass32;

	@FindBy(xpath = "//a[@href='CK33.aspx?PageTitle=Component (CK33)']")
	private WebElement mastercategoryckass33;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement eaddproductgroup;

	@FindBy(xpath = "//input[@id='txt_subproductlinecode']")
	private WebElement esubproductlinecode;

	@FindBy(xpath = "//input[@id='txt_subproductlinevalue']")
	private WebElement esubproductlinename;
	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement esaveeditsec;

	@FindBy(xpath = "//select[@id='selectconcadenate1']")
	private WebElement eoption;

	@FindBy(xpath = "//input[@id='txt_productcategory']")
	private WebElement eaddproductcategory;

	@FindBy(xpath = "//input[@id='txt_productorder']")
	private WebElement eaddproductorder;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	private WebElement eeditproductorder;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement esave;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement esaveedit;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;

	@FindBy(xpath = "//input[@id='txtbrandmaster']")
	private WebElement brandsearchbox;

	@FindBy(xpath = "//li[@class='ui-menu-item'] //div[text()='Diamond Audio']")
	private WebElement brandsearchboxdrop;

	@FindBy(xpath = "//input[@id='btnsearch_html']")
	private WebElement brandsearch;

	@FindBy(xpath = "//input[@placeholder='Brand ID']")
	private WebElement ebrandid;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement invaliddata;

	@FindBy(xpath = "//*[@id='swal2-title']")
	private WebElement emptypop;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[3]")
	private WebElement validgrid;

	@FindBy(xpath = "//input[@placeholder='Web Category']")
	private WebElement searchfilter1;

	@FindBy(xpath = "//input[@placeholder='Description']")
	private WebElement searchfilter2;

	@FindBy(xpath = "//input[@placeholder='Code']")
	private WebElement searchfilter3;
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement searchfilter4;
	@FindBy(xpath = "//input[@placeholder='CK33 Name']")
	private WebElement searchfilter5;

	@FindBy(xpath = "//input[@placeholder='PartsType']")
	private WebElement searchfilter6;

	@FindBy(xpath = "//input[@placeholder='Sub-Product Line Code']")
	private WebElement efilter;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement esubcode;

	@FindBy(xpath = "//label[text()='Ignition Coil Test']")
	private WebElement ePartype;

	
	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn;
	
	// need to arrange the productrelated2 add before this then change subproduct
	@FindBy(xpath = "//label[text()='Ignition Coil Test']")
	private WebElement ePartypeagain;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement ecompsave;

	@FindBy(xpath = "//span[@id='select2-drpCK32-container']")
	private WebElement eselectsystem;

	@FindBy(xpath = "//span[@id='select2-drpCK31Component-container']")
	private WebElement eselectsystems;

	@FindBy(xpath = "//option [text()='001 | AIR CONDITIONING, HEATING & VENTILATING SYSTEM']")
	private WebElement eselectedsystem1;
	@FindBy(xpath = "//option[text()='001 - AIR CONDITIONING, HEATING & VENTILATING SYSTEM']")
	private WebElement eselectedsystem;

	@FindBy(xpath = "//td[@class='sorting_1']")
	private WebElement verifytext;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[2]")
	private WebElement verifytextsec;

	@FindBy(xpath = "//*[@class='dataTables_empty']")
	private WebElement verifyEmptytext;

	public void clickonproductcategory() throws Throwable {
		Thread.sleep(8000);
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		Webcategory01.click();
		Thread.sleep(5000);
	}

	public void clickonBrandmaster() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategorybrand.click();
		Thread.sleep(8000);
	}

	public void clcikonSubmaster() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategorysub.click();
		Thread.sleep(8000);
	}

	public void clickonsystemck31() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategoryck31.click();
		Thread.sleep(8000);
	}

	public void clickonassembly32() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategoryckass32.click();
		Thread.sleep(8000);
	}

	public void clickonassembly33() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategoryckass33.click();
		Thread.sleep(8000);
	}

	public void addsubproductline(String partnoenter) throws Throwable {
		eaddproductgroup.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
		esubproductlinecode.sendKeys(partnoenter);
		Thread.sleep(3000);
		esubproductlinename.sendKeys(partnoenter);
		Thread.sleep(3000);

		Select options = new Select(eoption);
		options.selectByValue("Suffix");
		Thread.sleep(5000);
		esave.click();
		Thread.sleep(8000);
	}

	public void editsubproductline(String partnoenter, String partdesc) throws Throwable {
		efilter.sendKeys(partnoenter);
		Thread.sleep(5000);
		eeditproductorder.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_edit']")));
		Thread.sleep(3000);
		esubproductlinecode.clear();
		Thread.sleep(3000);
		esubproductlinecode.sendKeys(partdesc);
		Thread.sleep(3000);
		esubproductlinename.clear();
		Thread.sleep(3000);
		esubproductlinename.sendKeys(partdesc);
		Thread.sleep(3000);

		Select options = new Select(eoption);
		options.selectByValue("Prefix");
		Thread.sleep(5000);
		esaveeditsec.click();
		Thread.sleep(8000);
	}

	public void clicksystemck31search(String ck31, String ck31description) throws Throwable {
		searchfilter3.sendKeys(ck31);
		Thread.sleep(5000);
		searchfilter4.sendKeys(ck31description);
		Thread.sleep(5000);
	}

	public void clickassemblyck32search(String systemvalue, String ck32description) throws Throwable {
		eselectsystem.click();
		Thread.sleep(5000);
		eselectedsystem1.click();
		Thread.sleep(5000);
		searchfilter3.sendKeys(systemvalue);
		Thread.sleep(5000);
		searchfilter4.sendKeys(ck32description);
		Thread.sleep(5000);
	}

	public void eFeedbackbt() throws Exception {
		Feedbackbt.click();
		Thread.sleep(5000);
	}

	public void Logout() throws Exception {
		elogout.click();
		Thread.sleep(5000);
	}

	public void clickcomponentck33search(String Compnenentvalue) throws Throwable {
		eselectsystems.click();
		Thread.sleep(5000);
		eselectedsystem.click();
		Thread.sleep(5000);
		searchfilter2.sendKeys(Compnenentvalue);
		Thread.sleep(5000);
		eeditproductorder.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnBack_new']")));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ePartype);
		Thread.sleep(5000);
		ePartype.click();
		Thread.sleep(8000);
		js.executeScript("arguments[0].scrollIntoView();", esaveedit);
		esaveedit.click();
		Thread.sleep(5000);

	}

	public void clickcomponentck33searchdel(String Compnenentvalue) throws Throwable {
		eselectsystems.click();
		Thread.sleep(5000);
		eselectedsystem.click();
		Thread.sleep(5000);
		searchfilter5.sendKeys(Compnenentvalue);
		Thread.sleep(5000);
		eeditproductorder.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_edit']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ePartype);
		ePartype.click();
		Thread.sleep(8000);
		js.executeScript("arguments[0].scrollIntoView();", ePartypeagain);
		ePartypeagain.click();
		Thread.sleep(8000);
		js.executeScript("arguments[0].scrollIntoView();", esaveedit);
		esaveedit.click();
		Thread.sleep(5000);
	}

	public void addproductgroup(String Productcategory, String qtydata) throws Throwable {
		eaddproductgroup.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
		eaddproductcategory.sendKeys(Productcategory);
		Thread.sleep(2000);
		eaddproductorder.sendKeys(qtydata);
		Thread.sleep(2000);
		esave.click();
		Thread.sleep(5000);
	}

	public void editproductgroup(String Productcategory, String Equchose, String Length) throws Throwable {
		searchfilter1.sendKeys(Productcategory);
		Thread.sleep(5000);
		eeditproductorder.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
		Thread.sleep(2000);
		eaddproductcategory.clear();
		Thread.sleep(2000);
		eaddproductcategory.sendKeys(Equchose);
		Thread.sleep(2000);
		eaddproductorder.clear();
		Thread.sleep(2000);
		eaddproductorder.sendKeys(Length);
		Thread.sleep(2000);
		esave.click();
		Thread.sleep(6000);

	}

	public void invalidbrandsearchmaster(String linename) throws Throwable {
		brandsearchbox.sendKeys(linename);
		Thread.sleep(3000);
		brandsearch.click();
		Thread.sleep(6000);

		String invalid = invaliddata.getText();
		if (invalid.equals("No data available in table")) {
			System.out.println("Invalid text Both are same");
		} else {
			System.out.println("Invalid text Both are not same");
		}
	}

	public void emptybrandsearchmaster() throws Throwable {
		brandsearchbox.clear();
		Thread.sleep(3000);
		brandsearch.click();
		Thread.sleep(6000);
		String eemptypop = emptypop.getText();
		if (eemptypop.equals("Please enter few characters")) {
			System.out.println("empty text Both are same");
		} else {
			System.out.println("empty text Both are not same");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(8000);

	}

	public void validbrandsearchmaster(String brandvalue, String Brandid) throws Throwable {
		brandsearchbox.clear();
		Thread.sleep(3000);
		brandsearchbox.sendKeys(brandvalue);
		Thread.sleep(3000);
		brandsearchboxdrop.click();
		Thread.sleep(3000);
		brandsearch.click();
		Thread.sleep(6000);
		ebrandid.sendKeys(Brandid);
		Thread.sleep(3000);

		String eemptypop = validgrid.getText();
		if (eemptypop.equals(Brandid)) {
			System.out.println("valid text Both are same");
		} else {
			System.out.println("valid text Both are not same");
		}

	}

	public void validsubmaster(String partnoenter) throws Throwable {
		efilter.sendKeys(partnoenter);
		Thread.sleep(8000);
		String subcode = esubcode.getText();
		if (subcode.equals(partnoenter)) {
			System.out.println("Subproduct line is same");
		} else {
			System.out.println("Subproduct line is not same");
		}
	}

	public void valideditsubmaster(String partdesc) throws Throwable {
		efilter.sendKeys(partdesc);
		Thread.sleep(8000);
		String subcode = esubcode.getText();
		if (subcode.equals(partdesc)) {
			System.out.println("Subproduct line edit is same");
		} else {
			System.out.println("Subproduct line edit is not same");
		}
	}

	public void acceptAlert() throws Exception {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();

	}
	
	public void ClickonBackButton() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}

	public void verifyingtext(String Productcategory) throws Exception {
		Thread.sleep(5000);
		searchfilter1.sendKeys(Productcategory);
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(Productcategory)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingck31(String ck31) throws Exception {
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(pro.getProperty("ck31"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingck32(String systemvalue) throws Exception {
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(pro.getProperty("systemvalue"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingck33(String subcategoryname) throws Exception {
		eselectsystems.click();
		Thread.sleep(5000);
		eselectedsystem.click();
		Thread.sleep(5000);
		searchfilter6.sendKeys(subcategoryname);
		Thread.sleep(5000);

		String actualtext = verifytextsec.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(pro.getProperty("Partype"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		Thread.sleep(5000);
	}

	public void verifyingck33del(String Partype) throws Exception {
		try {
			eselectsystems.click();
			Thread.sleep(5000);
			eselectedsystem.click();
			Thread.sleep(5000);
			searchfilter6.sendKeys(Partype);
			Thread.sleep(5000);

			String actualtext = verifytextsec.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(pro.getProperty("Partype"))) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
		} catch (Exception e) {
			System.out.println("Uncheck the parttype successfully");
		}
		Thread.sleep(5000);
	}

	public void Editagain() throws Exception {

		eeditproductorder.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_edit']")));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ePartypeagain);
		Thread.sleep(5000);
		ePartypeagain.click();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", esaveedit);
		esaveedit.click();
		Thread.sleep(5000);
	}

	public void verifyEditagain(String subcategoryname) throws Exception {
		eselectsystems.click();
		Thread.sleep(5000);
		eselectedsystem.click();
		Thread.sleep(5000);
		searchfilter6.sendKeys(subcategoryname);
		Thread.sleep(5000);

		String actualtext = verifyEmptytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.contains(pro.getProperty("DeleteProducttxt"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifyingtextedit(String Equchose) throws Exception {
		Thread.sleep(8000);
		searchfilter1.sendKeys(Equchose);
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(Equchose)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

}
