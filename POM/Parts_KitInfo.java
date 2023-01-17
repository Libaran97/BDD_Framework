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

public class Parts_KitInfo extends Baseclass {

	public Parts_KitInfo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	@FindBy(xpath = "//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='kit_info']")
	private WebElement eKitinfoclick;

	@FindBy(xpath = "//input[@id='txtCpartNumber']")
	private WebElement eCompPart;

	@FindBy(xpath = "//select[@id='drpDescCode']")
	private WebElement eDescode;

	@FindBy(xpath = "//*[@id='TxtMaintenance']")
	private WebElement eMType;

	@FindBy(xpath="//input[@id='txtqtykit']")
	private WebElement eQtyinkit;

	@FindBy(xpath = "//*[@id='drpLanguageCode']")
	private WebElement eLangcode;

	@FindBy(xpath = "//*[@id='drpQtyuom']")
	private WebElement eQtyUOM;

	@FindBy(xpath = "//*[@id='txtdescription']")
	private WebElement eDes;

	@FindBy(xpath = "//*[@id='drpSoldSeperately']")
	private WebElement eSold;

	@FindBy(xpath = "//*[@id='btnSaveKit']")
	private WebElement ebtnSave;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVry;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[9]/div/input[1]")
	private WebElement eEdit;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[5]")
	private WebElement eVryEdit;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr/td[9]/div/input[2]")
	private WebElement eDelete;

	@FindBy(xpath = "//*[@id=\'DataTableViewer\']/tfoot/tr/th[1]/input")
	private WebElement searchpartverf;

	@FindBy(xpath = "//*[@id=\'DataTableViewer\']/tbody/tr/td")
	private WebElement Vrfy;

	public void partslanding() {
		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 150).click();

	}

	public void partsearch(String partnoenter) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, txtpartsearch, 150).sendKeys(partnoenter);
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

	public void Kitinfoclick() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, eKitinfoclick, 150).click();
	}

	public void ComponentPart() throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eCompPart, 150).sendKeys("Testpart-3");
	}

	public void FillKitDetails() throws InterruptedException {
		Thread.sleep(2000);
		Select Descode = new Select(eDescode);
		Descode.selectByIndex(1);
		Thread.sleep(4000);
		Baseclass.waitForElementToBeVisible(driver, eQtyinkit, 150).sendKeys("2");
		Thread.sleep(2000);
		Select Langcode = new Select(eLangcode);
		Langcode.selectByIndex(1);
		Thread.sleep(2000);

	}

	public void FillKitDetails2() throws InterruptedException {
		// Select Quantity UOM
		Select QtyUOM = new Select(eQtyUOM);
		QtyUOM.selectByIndex(3);
		Thread.sleep(2000);

		// Enter Description
		Baseclass.waitForElementToBeVisible(driver, eDes, 150).sendKeys("TestQc");
		// wait//
		// eDes.sendKeys("TestQc");
		// wait//
		Thread.sleep(2000);

		// Select Sold Separately
		Select Sold = new Select(eSold);
		Sold.selectByIndex(1);
		Thread.sleep(2000);

	}

	public void editalert() throws InterruptedException {
		ebtnSave.click();
		Thread.sleep(4000);
		WebElement pop1 = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop1);
		Baseclass.waitForElementToBeClickable(driver, pop1, 150).click();

	}

	public void saveAcceptAlert() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ebtnSave, 150).click();

		Thread.sleep(4000);

		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();

	}

	public void saveAcceptAlert2() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, ebtnSave, 150).click();

		Thread.sleep(4000);

		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();

	}

	public void Verifykit() throws InterruptedException {

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVry);
		String Text = eVry.getText();
		Thread.sleep(3000);
		if (Text.equals("Testpart-3")) {
			System.out.println("Kit info Added Successfully");
		} else {

			System.out.println("Kit info  not Added");
		}
	}

	public void ClickEdit() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		Baseclass.waitForElementToBeClickable(driver, eEdit, 250).click();
		Thread.sleep(3000);

	}

	public void EditQtyinkit() throws InterruptedException {
		Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver, eQtyinkit, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eQtyinkit, 250).sendKeys("4");

		Thread.sleep(3000);
	}

	public void VryEdit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVryEdit);
		String Text1 = eVryEdit.getText();
		Thread.sleep(3000);
		if (Text1.equals("4")) {
			System.out.println("Kit info Updated Successfully");
		} else {

			System.out.println("Kit info not Updated");
		}
	}

	public void ClickDelete() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eDelete);
		Baseclass.waitForElementToBeClickable(driver, eDelete, 250).click();

		Thread.sleep(3000);

	}

	public void acceptAlert1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();

		Thread.sleep(4000);

	}

	public void acceptAlert2() throws InterruptedException {
		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();

	}

	public void VryDelete() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchpartverf);
		Baseclass.waitForElementToBeVisible(driver, searchpartverf, 150).sendKeys(pro.getProperty("Enterpartpart1"));

		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text = Vrfy.getText();

		System.out.println(Text);

		if (!Text.contains(pro.getProperty("Enterpartpart1"))) {
			System.out.println("Kit info deleted Successfully");
		} else {
			System.out.println("Kit info Not deleted ");
		}

	}

}
