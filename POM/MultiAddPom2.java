package pageobjectmodel;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class MultiAddPom2 extends Baseclass {

	public MultiAddPom2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"MainContent_GVData_lblPartsLinked_0\"]")
	WebElement ePartsLinked;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[1]")
	WebElement eproductline;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[2]")
	WebElement epartdesc;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[3]")	
	WebElement epartno;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[4]")
	WebElement eqty;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[5]")
	WebElement enotes;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[6]")
	WebElement eposition;

	//@FindBy(xpath = "//*[@id='GridView1_Image1_0']")
	@FindBy(xpath="//*[@id='GridView1_EditButton_0']")
	private WebElement eedit;

	@FindBy(xpath = "//*[@id='GridView1_Image3_0']")
	private WebElement evieweditCancel;

	@FindBy(xpath = "//input[@name='GridView1$ctl02$ctl01']")
	private WebElement eeditverifynotes;

	@FindBy(xpath = "//a[@id='GridView1_UpdateButton_0']")
	private WebElement eok;

	@FindBy(xpath = "//*[@id='GridView1_Image2_0']")
	private WebElement evieweditdelete;

	@FindBy(xpath = "//*[@id='GridView1']/tbody/tr/td")
	private WebElement everifyvieweditdelete;
	
	@FindBy(xpath="//span[@id='MainContent_GVData_lblPartsLinked_0']")
	private WebElement partlink;
	
	
	
	public void partlinkednew() throws InterruptedException {
		//Thread.sleep(2000);
	//Baseclass.waitForElementToBeClickable(driver, partlink, 250).click();
	//Thread.sleep(2000);
		//wait//
		Thread.sleep(5000);
		partlink.click();
	
	}
	

	String actual = "";

	public void POPEdit(String vehicletypename0) throws InterruptedException {
		
		Baseclass.waitForElementToBeClickable(driver,eeditverifynotes, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eeditverifynotes, 250).sendKeys(pro.getProperty("vehicletypename0"));
		
		//wait//
		//eeditverifynotes.clear();
		//eeditverifynotes.sendKeys(pro.getProperty("vehicletypename0"));
		//Thread.sleep(5000);
		//wait//
		
		
		actual = eeditverifynotes.getText();
		System.out.println("actual");
		
		Baseclass.waitForElementToBeClickable(driver,eok, 250).click();
		//wait//
		//eok.click();
		//Thread.sleep(5000);
		//wait//

	}

	public void viewedit() throws Throwable {
		//WebElement element=driver.findElement(By.xpath(".//[@id='welcome-menu']/ul/li[2]/a"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", eedit);		
		//eedit.click();
		//Thread.sleep(5000);
	}

	public void windowhandler() {
		// Switch between windows
		try {
			String MainWindow = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();

				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

					// Switching to Child window
					driver.switchTo().window(ChildWindow);
					driver.manage().window().maximize();
					Thread.sleep(5000);
					// String price =
					// driver.findElement(By.xpath("//span[@id=\"prcIsum\"]")).getText();

					// Closing the Child Window.
					// driver.close();
				}
			}

			// Switching to Parent window i.e Main Window.
			// driver.switchTo().window(MainWindow);
		} catch (Exception e) {
			driver.close();
			System.out.println("Popup is not open....");
			e.printStackTrace();
		}
	}

	public void acceptAlert() throws InterruptedException {
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related: " + pro.getProperty("vehicletypename0") + alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}

	public void verifyedit(String vehicletypename0) {
		
		
		String expect = pro.getProperty("vehicletypename0");
		// actual = eeditverifynotes.getText();
		assertEquals(expect, actual);
		System.out.println("NOtes is matched");
	}

	public void vieweditcancel(String vehicletypename0) throws Throwable {
		
		Baseclass.waitForElementToBeClickable(driver, eeditverifynotes, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, eeditverifynotes,250).sendKeys(pro.getProperty("vehicletypename0"));
		Baseclass.waitForElementToBeClickable(driver, evieweditCancel, 250).click();
		//wait//
		//eeditverifynotes.clear();
		//eeditverifynotes.sendKeys(pro.getProperty("vehicletypename0"));
		//Thread.sleep(2000);
		//evieweditCancel.click();
		//Thread.sleep(5000);
		//wait//
		System.out.println("Passed the Cancel button");
	
	}

	public void vieweditdelete() throws Throwable {
		Baseclass.waitForElementToBeClickable(driver,evieweditdelete, 250).click();
		//wait//
		//evieweditdelete.click();
		//Thread.sleep(3000);
		//wait//
	}

	public void verifyvieweditdelete() throws Throwable {

		String actualText = everifyvieweditdelete.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains("No Records Found...")) {
			System.out.println("Both are same");
		} else if (actualText.contains("United states")) {
			System.out.println("Both are same");
		} else {
			System.out.println("No Records Found.");

		}
		Thread.sleep(3000);
		System.out.println("No Records Found...");
	}

	public void SortPartDescription_TC037() throws Exception {
		List<WebElement> el = driver.findElements(By.xpath("//*[@id=\"MainContent_drpVehicleType\"]/option"));
		System.out.println(el);
		int selsize = el.size();
		System.out.println("The size of the elements in the array is >>>>>>>>>>>>>>> " + selsize);
		ArrayList<String> AllEle = new ArrayList<String>();
		ArrayList<String> AllEleBeforeSort = new ArrayList<String>();
		String element = "";
		
		Select sel=new Select(driver.findElement(By.name("ctl00$MainContent$drpVehicleType")));
		List<WebElement> option1 = sel.getOptions();
		
		for (int i=1; i<=selsize-1; i++) {
			element = option1.get(i).getText();
			System.out.println("The selected element is >>>>>>> " + element);
			AllEle.add(element);
			System.out.println("The elements in the array AllEle is >>>>>>> " + AllEle);
			Thread.sleep(1000);
			try {
			AllEleBeforeSort.add(element);
			} catch(Exception e) {
				System.out.println("Cannot add to this array >>>>>>> ");
			}
			System.out.println("i am here 1 >>>>>>> ");
		}		
		System.out.println("i am here 111111 >>>>>>> ");		
		Thread.sleep(1000);
		
		System.out.println("The elements in the array AllEleBeforeSort is >>>>>>> " + AllEleBeforeSort);		
		Collections.sort(AllEle);
		System.out.println("After sort order is:::"+AllEle);
		System.out.println("before sort order is:::"+AllEleBeforeSort);
		Thread.sleep(5000);
		
		boolean flag = true;
		for (int i=0; i<selsize-2; i++) {
			String ValueBeforeSort = AllEleBeforeSort.get(i);
			System.out.println("The element number before sort " + i + " is " + ValueBeforeSort);
			Thread.sleep(1000);
			String ValueAfterSort = AllEle.get(i);
			System.out.println("The element number after sort is " + i + " is " + ValueAfterSort);
			if (ValueBeforeSort.equalsIgnoreCase(ValueAfterSort)) {
				continue;
			} else {
				flag = false;
				break;
			}
		}		
		if (flag == true) {
			System.out.println("The Vehicle details are already in correct order");
		} else {
			System.out.println("The Vehicle details were NOT in correct order");
		} 		
		}
	
	
	}
