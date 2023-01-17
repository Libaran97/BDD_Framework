package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class PartSize_POM extends Baseclass{


	public PartSize_POM() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//div[@id='Size']")
	private WebElement Sizelanding;

	//input[@id='MainContent_chklstsizes_0']//following::label
	//input[@type='checkbox']//following::label

	//@FindBy(xpath="//input[@id='MainContent_chklstsizes_0']/following::label[2]")
	@FindBy(xpath="(//input[@type='checkbox'and@name='chklstsizes'] /following:: input)[1]")
	private WebElement chklstsize;

	@FindBy(xpath="//*[@id='chkSelect']")
	private WebElement chkSelect;


	@FindBy(xpath="//input[@id='btnSave_Size']")
	private WebElement btnSave;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;



	/*
	 *partsize check and uncheck 
	 */

	public void partsizelanding() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, Sizelanding, 150).click();
		//wait//
		//Sizelanding.click();
		//Thread.sleep(3000);
		//wait//
	}


	public void addsize() throws InterruptedException {
		//driver.switchTo().frame(0);
		//List<WebElement> sizes = driver.findElements(By.xpath("//input[@id='MainContent_chklstsizes_0']/following::label"));
		/*List<WebElement> sizes = driver.findElements(By.xpath("//input[@type='checkbox'and@name='chklstsizes'] /following::label"));
		//String sizes =
		System.out.println("Available size are ---->" + sizes.size());
		int i=0;
		int k=i+1;
		for(k=1; i<sizes.size(); i++) {
			//System.out.println("List of sizes are----->"+sizes.get(i).getText());
		if(sizes.get(i).getText().equals(pro.getProperty("partsize")))
		{
			chklstsize.click();
			System.out.println("Part Size are checked");
			break;
		}else
		{
			System.out.println("Size is not available");
		}
	}*/
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"chkSelect\"]")).click();
		chkSelect.click();
		System.out.println("Part Size are checked");
		Thread.sleep(3000);
	}

	public void savesize() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		Baseclass.waitForElementToBeClickable(driver, btnSave,150).click();
		//wait//
		//btnSave.click();		
		//Thread.sleep(3000);
		//wait//
	}


	public void acceptalert() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Size" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	public void acceptAlert1() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		Baseclass.waitForElementToBeClickable(driver, eAcceptalert, 250).click();
		//wait//
		//eAcceptalert.click();
		//Thread.sleep(8000);
		//wait//
	}


	public void unchecksize() throws Exception {
		//String size = chklstsize.getText();
		//System.out.println("Available size are ---->" +size);
		/*driver.switchTo().frame(0);
			boolean ischecked = false;
			ischecked = chklstsize.isSelected();
			if(ischecked = true) {
				chklstsize.click();
				System.out.println("Size is Unchecked");
			}else {
				System.out.println("Size is not unchecked");
			}*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"chkDeselect\"]")).click();
		System.out.println("Part Size are unchecked");
		Thread.sleep(3000);

	}


	public void verifysize() throws InterruptedException {
		//driver.switchTo().frame(0);
		//List<WebElement> sizes = driver.findElements(By.xpath("//input[@id='MainContent_chklstsizes_0']/following::label"));
		//System.out.println("Available size are ---->" + sizes.size());
		//for(int i=0; i<sizes.size(); i++) {
		//System.out.println("List of sizes are----->"+sizes.get(i).getText());
		Thread.sleep(3000);
		if(chkSelect.isSelected())
		{
			//chklstsize.isSelected();
			System.out.println("Part Size are checked verified");

		}else
		{
			System.out.println("Size is unchecked verified");
		}

	}


	/*public void verifysizeremove(String givensize) {
		driver.switchTo().frame(0);
		String size = chklstsize.getText();
		System.out.println("Checked size are ---->" +size);
		if(size==givensize)
		{
			chklstsize.isSelected();
			System.out.println("Size is Unchecked");
		}else
		{
			System.out.println("Size is still checked");
		}
	}*/

}
