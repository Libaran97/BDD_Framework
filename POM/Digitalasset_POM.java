package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class Digitalasset_POM extends Baseclass {

	public Digitalasset_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='DigitalAsset']")
	private WebElement clkasset;

	@FindBy(xpath = "//input[@id='fuImage']")
	private WebElement imageselect;

	@FindBy(xpath = "//input[@id='txtSortBy']")
	private WebElement txtSortBy;

	@FindBy(xpath = "//div[@id='btnSave_digital']")
	private WebElement btnSave;

	@FindBy(xpath = "//div[@id='btnEdit_digital']")
	private WebElement btnEditSave;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[10]/div/input")
	private WebElement imgDelete;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eFilter;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVerifyText;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement eVerifytextdelete;

	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[9]/div/input")
	private WebElement edit;

	@FindBy(xpath = "//Select[@id='drpOrientationView']")
	private WebElement orient;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tfoot/tr/th[6]/input")
	private WebElement editcheck;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[6]")
	private WebElement editverifytext;

	public void clickasset() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, clkasset, 150).click();
	}

	public void imagesselect() throws Exception {
		Baseclass.waitForElementToBeVisible(driver, imageselect, 150)
				.sendKeys("E:\\apapmt_automation\\Store\\Parttest.jpg");
		Baseclass.waitForElementToBeVisible(driver, txtSortBy, 150).sendKeys("1");
	}

	public void savebutton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave, 150).click();
		Thread.sleep(8000);

	}

	public void assetAlert() throws InterruptedException {

		Thread.sleep(8000);
		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();

	}

	public void deleteimg() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete);
		Baseclass.waitForElementToBeClickable(driver, imgDelete, 150).click();
	}

	public void assetAlertdelete() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 150).click();
	}

	public void verifyImageadd(String Imagefilename) throws InterruptedException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eFilter);
			Baseclass.waitForElementToBeVisible(driver, eFilter, 150).sendKeys(Imagefilename);

			String actualText = eVerifyText.getText();
			System.out.println("Filename:" + actualText);
			actualText.equals(Imagefilename);
			System.out.println("Both are same");

		} catch (Exception e) {
			System.out.println("Both are not same");
		}
	}

	public void verifyDelete(String Imagefilename, String Deleteverifytext) throws InterruptedException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eFilter);
			Baseclass.waitForElementToBeVisible(driver, eFilter, 150).sendKeys(Imagefilename);
			String actualText = eVerifytextdelete.getText();
			System.out.println("Text:" + actualText);
			actualText.equals(Deleteverifytext);
			System.out.println("Deleted");

		} catch (Exception e) {
			System.out.println("Not deleted");
		}
	}

//Image Edit //

	public void editclick() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", edit);
		Thread.sleep(6000);
		edit.click();
		Thread.sleep(6000);
		WebElement orientation = orient;
		Select select = new Select(orientation);
		orientation.click();
		select.selectByVisibleText("Front (FRO)");
		Thread.sleep(6000);
		btnEditSave.click();
		Thread.sleep(6000);

	}

	public void editverify(String datas, String editverifytext) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", editcheck);
			Baseclass.waitForElementToBeVisible(driver, editcheck, 150).sendKeys(datas);
			Thread.sleep(5000);
			String actualText = editcheck.getText();
			actualText.equals(editverifytext);
			System.out.println("Orientation view:"+datas);
			System.out.println("Updated");

		} catch (Exception e) {
			System.out.println("Not Updated");
		}
	}

}
