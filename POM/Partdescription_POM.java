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

public class Partdescription_POM extends Baseclass {

	public Partdescription_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	@FindBy(xpath = "//*[@id='txtsearchpartno']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "//input[@class='button_search']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='Description']")
	private WebElement partdescclick;

	@FindBy(xpath = "//textarea[@class='note-codable']")
	private WebElement desnotes;

	@FindBy(xpath = "//select[@id='MainContent_drpSProductLine']")
	private WebElement drpNotesType;

	@FindBy(xpath = "//select[@id='drpNotesType']")
	private WebElement drpNotesType1;

	@FindBy(xpath = "//*[@id='piespages']/div[2]/div[2]/div[4]/div[1]/div[3]/textarea")
	private WebElement des;

	@FindBy(xpath = "//select[@id='drpNotesType']")
	private WebElement txtNotes;

	@FindBy(xpath = "//td[@class='pad_top_15']")
	private WebElement clk;

	@FindBy(xpath = "//input[@id='piesbtnSave']")
	private WebElement btnSave;

	@FindBy(xpath = "(//input[@type='image'])[4]")
	private WebElement imgEdit_0;

	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr/td[6]/div/input[2]")
	private WebElement imgDelete_0;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[4]/input")
	private WebElement eDescriptionfilter;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[4]")
	private WebElement ePDverify;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement eDeleteVryText;

	public void partslanding() {

		Baseclass.waitForElementToBeClickable(driver, partspageheaderclick, 250).click();

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
		Baseclass.waitForElementToBeClickable(driver, btnPsearch, 250).click();
		Thread.sleep(2000);

	}

	public void descriptionclick() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, partdescclick, 250).click();

		Thread.sleep(5000);

	}

	public void descriptiondrpdownnotes(String notestype) throws InterruptedException {

		Thread.sleep(3000);
		WebElement descnote = drpNotesType1;
		Select select = new Select(descnote);
		select.selectByVisibleText(notestype);
		Baseclass.waitForElementToBeVisible(driver, des, 150).sendKeys(pro.getProperty("descnotes"));

	}

	public void savebtn() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		Thread.sleep(6000);

	}

	public void acceptAlert() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);

	}
	public void DelacceptAlert() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);

	}

	public void Verifydescription(String descnotes) throws InterruptedException {
		try {
			Baseclass.waitForElementToBeVisible(driver, eDescriptionfilter, 150).sendKeys(descnotes);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText = ePDverify.getText();
			System.out.println("Text:" + actualText);
			actualText.equals(descnotes);
			System.out.println("Both are same");

		} catch (Exception e) {
			System.out.println("Both are not same");
		}
	}

	public void EditVerifydescription(String editdescnotes) throws InterruptedException {
		try {
			Baseclass.waitForElementToBeVisible(driver, eDescriptionfilter, 150).sendKeys(editdescnotes);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText = ePDverify.getText();
			System.out.println("Text:" + actualText);
			actualText.equals(editdescnotes);
			System.out.println("Both are same");

		} catch (Exception e) {
			System.out.println("Both are not same");
		}
	}

	public void editpartdesc(String editdescnotes) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgEdit_0);
		Baseclass.waitForElementToBeClickable(driver, imgEdit_0, 150).click();
		des.clear();
		Thread.sleep(5000);
		Baseclass.waitForElementToBeVisible(driver, des, 150).sendKeys(editdescnotes);

		Thread.sleep(2000);

	}

	public void deletepartdesc(String editdescnotes) throws Exception {
		Baseclass.waitForElementToBeClickable(driver, eDescriptionfilter, 150).sendKeys(editdescnotes);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete_0);
		Baseclass.waitForElementToBeClickable(driver, imgDelete_0, 150).click();

	}

	public void VerifyDeletedescription(String editdescnotes, String DeleteProducttxt) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, eDescriptionfilter, 150).sendKeys(editdescnotes);

		Thread.sleep(3000);
		String text = eDeleteVryText.getText();
		if (!text.equals(editdescnotes)) {
			System.out.println("Partdescription Deleted succesfully");

		} else {
			System.out.println("Partdescription Not Deleted succesfully");
		}

	}

}
