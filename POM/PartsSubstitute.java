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

public class PartsSubstitute extends Baseclass {

	public PartsSubstitute() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	@FindBy(xpath = "//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='Substitute']")
	private WebElement esubsclick;

	@FindBy(xpath = "//div[@id='Parts_Manufacturer']")
	private WebElement ebrandsclick;

	@FindBy(xpath = "//div[@id='Hazardous']")
	private WebElement eHazprodousclickclick;

	@FindBy(xpath = "//*[@id='drpRegulated']")
	public WebElement eregulated;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[4]/div/input")
	private WebElement ebranddel;

	@FindBy(xpath = "//input[@id=\"txtbrandmaster\"]")
	private WebElement ebrandsearch;

	@FindBy(xpath = "//input[@id=\"txtSubstituteno\"]")
	private WebElement esubpartno;

	@FindBy(xpath = "//input[@id=\"txtDescription\"]")
	private WebElement esubdesc;

	@FindBy(xpath = "//*[@id='btnSave_Brand']")
	private WebElement esubsave;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[2]/input")
	private WebElement everifysub;

	@FindBy(xpath = "//input[@placeholder=\"Brand Name\"]")
	private WebElement everifybrand;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[2]")
	private WebElement everifygettext;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[4]/div/input")
	private WebElement esubdel;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td")
	private WebElement edelget;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[1]")
	private WebElement ebrandfirst;

	@FindBy(xpath = "//*[@id='drpSProductLine']")
	private WebElement esubproductline;

	@FindBy(xpath = "//select[@id='drpShippingScope']")
	private WebElement eshipscope;

	@FindBy(xpath = "//*[@id=\"drpBulk\"]")
	private WebElement ebulk;

	@FindBy(xpath = "//*[@id=\"drpRegCountry\"]")
	private WebElement ecountry;

	@FindBy(xpath = "//*[@id=\"drpTransportMethod\"]")
	private WebElement etransport;

	@FindBy(xpath = "//*[@id=\"btnsavehazardous\"]")
	private WebElement esavehaz;

	@FindBy(xpath = "//*[@id='btnSave_Sub']")
	private WebElement subsave;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement yesclick;

	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 150).click();

	}

	public void partsearch(String partnoenter) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, txtpartsearch, 250).sendKeys(partnoenter);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equalsIgnoreCase("Testpart-1 | Ignition Coil Test | Autoapa3APATest")) {
				list.get(i).click();
				break;
			}
		}
		Baseclass.waitForElementToBeClickable(driver, btnPsearch, 150).click();

	}

	public void Substituteclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, esubsclick, 150).click();

	}

	public void brandclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ebrandsclick, 150).click();
	}

	public void Hazprodousclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eHazprodousclickclick, 150).click();
	}

	public void Hazprodousdetails() throws InterruptedException {
		Thread.sleep(3000);
		Select shipscope = new Select(eshipscope);
		shipscope.selectByVisibleText("International (INT)");
		Thread.sleep(3000);
		Select bulk = new Select(ebulk);
		bulk.selectByVisibleText("Bulk (B)");
		Thread.sleep(3000);
		Select country = new Select(ecountry);
		country.selectByVisibleText("United States (US)");
		Thread.sleep(3000);
		Select transport = new Select(etransport);
		transport.selectByVisibleText("Rail (R)");
		Thread.sleep(3000);

		Select Regulated = new Select(eregulated);
		Regulated.selectByVisibleText("Yes");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", esavehaz);
		Baseclass.waitForElementToBeClickable(driver, esavehaz, 150).click();

	}

	public void branddel() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, everifybrand, 150).sendKeys(pro.getProperty("brandnamesub"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebranddel);
		Baseclass.waitForElementToBeClickable(driver, ebranddel, 150).click();
	}

	public void brandsearch(String brandname) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, ebrandsearch, 150).sendKeys("cnc");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-5']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals(pro.getProperty("brandname"))) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
	}

	public void subdel() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", esubdel);
		Baseclass.waitForElementToBeClickable(driver, esubdel, 250).click();
		Thread.sleep(2000);
		// wait//
		// esubdel.click();
		// Thread.sleep(3000);
		// wait//
	}

	public void Substituteclickentry(String partno1, String textbox) throws Exception {
		Baseclass.waitForElementToBeVisible(driver, esubpartno, 250).sendKeys(partno1);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals(partno1)) {
				list.get(i).click();
				break;
			}
		}
		Baseclass.waitForElementToBeVisible(driver, esubdesc, 150).sendKeys(textbox);
	}

	public void save() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", esubsave);
		Baseclass.waitForElementToBeClickable(driver, esubsave, 150).click();
		Thread.sleep(2000);
		// wait//
		// esubsave.click();
		// Thread.sleep(3000);
		// wait//
	}

	public void subsaving() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", subsave);
		Thread.sleep(4000);
		subsave.click();
		Thread.sleep(4000);

	}

	public void AcceptAlert() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 250).click();
	}

	public void AcceptAlertnotdel() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		String Text = driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText();
		System.out.println(Text);
		Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 150).click();
		// wait//
		// eAcceptalert.click();
		// Thread.sleep(5000);
		// wait//

		if (Text.equals("Atleast One Part Manufacturer is Mandatory")) {
			System.out.println("Working fine");
		} else {
			System.out.println("Working not fine");
		}
	}

	public void verifysub(String partno1) throws Exception {
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, everifysub, 150).sendKeys(partno1);
		String Text = everifygettext.getText();
		System.out.println(Text);
		if (Text.equals(pro.getProperty("partno1"))) {
			System.out.println("Both are same");

		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifydel(String DeleteProducttxt2) throws Exception {
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, everifysub, 150).sendKeys(pro.getProperty("partno1"));
		String text = edelget.getText();
		System.out.println(text);
		if (text.equals(pro.getProperty("DeleteProducttxt2"))) {
			System.out.println("Deleted success");
		} else {
			System.out.println("Deleted not success");
		}
	}

	public void verifybranddel() throws Exception {
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, everifybrand, 150).sendKeys(pro.getProperty("brandnamesub"));

		String text = edelget.getText();
		System.out.println(text);
		if (text.equals(pro.getProperty("DeleteProducttxt"))) {
			System.out.println("Deleted success");
		} else {
			System.out.println("Deleted not success");
		}
	}

	public void verifybrand() throws Exception {
		Thread.sleep(2000);
		Baseclass.waitForElementToBeVisible(driver, everifybrand, 150).sendKeys(pro.getProperty("brandnamesub"));
		String text = ebrandfirst.getText();
		System.out.println(text);
		if (text.equals(pro.getProperty("brandnamesub"))) {
			System.out.println("Brand add success");
		} else {
			System.out.println("Brand not add success");
		}
	}

	public void acceptalertsub() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", yesclick);
		Baseclass.waitForElementToBeClickable(driver, yesclick, 250).click();
	}
}
