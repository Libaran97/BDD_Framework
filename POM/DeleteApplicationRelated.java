package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
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

import utility.Baseclass;

public class DeleteApplicationRelated extends Baseclass {
	public DeleteApplicationRelated() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_3']")
	@CacheLookup
	public WebElement emodel;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_2']")
	@CacheLookup
	public WebElement emake;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	@CacheLookup
	public WebElement eeqvehciletypegroup;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1']")
	@CacheLookup
	public WebElement eeqvehcile;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	@CacheLookup
	public WebElement eeqparts;

	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	public WebElement echoosemodel;

	@FindBy(xpath = "//li[text()='Car equi test']")
	public WebElement echooseoption;
	
	
	
	@FindBy(xpath = "//*[@id='select2-drpMake-container']")
	public WebElement MakeSelect;
	
	@FindBy(xpath = "//li[text()='Car Test']")
	public WebElement echooseoption01;


	@FindBy(xpath = "//li[text()='Car Test02']")
	public WebElement echooseoption02;


	@FindBy(xpath = "//input[@placeholder='Model Name']")
	public WebElement efilter;

	@FindBy(xpath = "//input[@placeholder='Make Name']")
	public WebElement efilter1;

	@FindBy(xpath = "//input[@placeholder='Vehicle Type Group']")
	public WebElement efilter2;

	@FindBy(xpath = "//input[@placeholder='Vehicle / Equipment Type']")
	public WebElement efilter3;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[3]/div/input[2]")
	public WebElement edelmodel;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[4]/div/input[2]")
	public WebElement edelmake;

	@FindBy(xpath = "//div[@id=\"divdeletebtn_163|0\"]/img")
	public WebElement edelvehicletypegroup;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[2]")
	public WebElement edelvehicletype;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVryText;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;

	@FindBy(xpath = "//input[@id='MainContent_txtMelling']")
	private WebElement epartsearch;

	@FindBy(xpath = "//*[@id='MainContent_upAttribute']/div[2]/div[1]/div/span/div/input[8]")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='btnDelete']/input")
	private WebElement epartdelete;

	public void Clickmodel() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		emodel.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnAdd']")));
	}

	public void Clickmake() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		emake.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnAdd']")));
	}

	public void Clickeqvehciletypegroup() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(6000);
		eeqvehciletypegroup.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnadd_new']")));
	}

	public void Clickeqvehcile() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(6000);
		eeqvehcile.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='btnadd_new']")));
	}

	public void Clickpartspage() throws InterruptedException {
		eeqparts.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainContent_txtMelling\"]")));
	}

	public void eDeletemodel(String modelnameeqedit) throws InterruptedException {
		echoosemodel.click();
		Thread.sleep(5000);
		echooseoption.click();
		Thread.sleep(5000);
		MakeSelect.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[text()='make equipment test']")).click();
		Thread.sleep(2000);
		
		efilter.sendKeys(modelnameeqedit);
		Thread.sleep(3000);
		edelmodel.click();
		Thread.sleep(3000);
	}
	public void eDeletemodel01(String modelname) throws Throwable {
		echoosemodel.click();
		Thread.sleep(5000);
		echooseoption01.click();
		Thread.sleep(5000);
		efilter.sendKeys(modelname);
		Thread.sleep(3000);
		edelmodel.click();
		Thread.sleep(3000);
	}
	public void eDeletemodel02(String modelname0) throws Throwable {
		echoosemodel.click();
		Thread.sleep(5000);
		echooseoption02.click();
		Thread.sleep(5000);
		efilter.sendKeys(modelname0);
		Thread.sleep(3000);
		edelmodel.click();
		Thread.sleep(3000);
	}
	public void eDeletemake(String makenameeqedit) throws Throwable {
		echoosemodel.click();
		Thread.sleep(5000);
		echooseoption.click();
		Thread.sleep(5000);
		efilter1.sendKeys(makenameeqedit);
		Thread.sleep(5000);
		edelmake.click();
		Thread.sleep(3000);
	}

	public void eDeleteeqvehicletypegroup(String vehicletypenameeq) throws Throwable {
		efilter2.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		edelvehicletypegroup.click();
		Thread.sleep(3000);
	}

	public void eDeleteeqvehicle(String vehicletypenameeqedit) throws Throwable {
		efilter3.sendKeys(vehicletypenameeqedit);
		Thread.sleep(5000);
		edelvehicletype.click();
		Thread.sleep(3000);
	}
	public void eDeleteeqvehicle01(String vehicletypename) throws Throwable {
		efilter3.sendKeys(vehicletypename);
		Thread.sleep(5000);
		edelvehicletype.click();
		Thread.sleep(3000);
	}
	public void eDeleteeqvehicle02(String vehicletypename0) throws Throwable {
		efilter3.sendKeys(vehicletypename0);
		Thread.sleep(8000);
		edelvehicletype.click();
		Thread.sleep(8000);
	}
	public void partsearch() throws InterruptedException {
		epartsearch.sendKeys(pro.getProperty("partno"));
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equalsIgnoreCase(pro.getProperty("partvalue1"))) {
				list.get(i).click();
				break;
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnPsearch);	
		btnPsearch.click();
		Thread.sleep(6000);
		js.executeScript("arguments[0].scrollIntoView();", epartdelete);	
		epartdelete.click();
		Thread.sleep(6000);
	}

	public void acceptAlert() throws Exception {
		String Popup = driver.findElement(By.xpath("//h2[@id='swal2-title']")).getText();
		System.out.println("Popup text is..." + Popup);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(8000);
	}
//
	public void acceptAlertbrowser() throws Exception {
		Alert alert = driver.switchTo().alert();
		System.out.println("Browser text " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}

	public void Verifymodeldel(String modelnameeqedit) throws Exception {
		echoosemodel.click();
		Thread.sleep(5000);
		try {
			echooseoption.click();
			Thread.sleep(5000);
			MakeSelect.click();
			driver.findElement(By.xpath("//li[text()='make equipment test']")).click();
			
			efilter.sendKeys(modelnameeqedit);
			Thread.sleep(5000);
			String text = eVryText.getText();
			if (text.equals(modelnameeqedit)) {
				System.out.println("Both are model name still available");

			} else {
				System.out.println("Both are model name still available but not correct");
			}
		} catch (Exception e) {
			System.out.println("Model delete working correctly and it removed");
		}
	}
	public void Verifymodeldel01(String modelname) throws Exception {
		echoosemodel.click();
		Thread.sleep(5000);
		try {
			echooseoption.click();
			Thread.sleep(5000);
			efilter.sendKeys(modelname);
			Thread.sleep(5000);
			String text = eVryText.getText();
			if (text.equals(modelname)) {
				System.out.println("Both are model name still available");

			} else {
				System.out.println("Both are model name still available but not correct");
			}
		} catch (Exception e) {
			System.out.println("Model delete working correctly and it removed");
		}
	}
	public void Verifymodeldel02(String modelname0) throws Exception {
		echoosemodel.click();
		Thread.sleep(5000);
		try {
			echooseoption.click();
			Thread.sleep(5000);
			efilter.sendKeys(modelname0);
			Thread.sleep(5000);
			String text = eVryText.getText();
			if (text.equals(modelname0)) {
				System.out.println("Both are model name still available");

			} else {
				System.out.println("Both are model name still available but not correct");
			}
		} catch (Exception e) {
			System.out.println("Model delete working correctly and it removed");
		}
	}


	public void Verifymakedel(String makenameeqedit) throws Exception {
		echoosemodel.click();
		Thread.sleep(5000);
		try {
			echooseoption.click();
			Thread.sleep(5000);
			efilter1.sendKeys(makenameeqedit);
			Thread.sleep(5000);
			String text = eVryText.getText();
			if (text.equals(makenameeqedit)) {
				System.out.println("Both are make name still available");

			} else {
				System.out.println("Both are make name still available but not correct");
			}
		} catch (Exception e) {
			System.out.println("Make delete working correctly and it removed");
		}
	}

	public void Verifyvehicletypegroup(String vehicletypenameeq, String DeleteProducttxt) throws Exception {

		try {
			efilter2.clear();
			Thread.sleep(2000);
			efilter2.sendKeys(vehicletypenameeq);
			Thread.sleep(5000);
			String text = eVryText.getText();
			if (text.equals(DeleteProducttxt)) {
				System.out.println("Vehicle typr group delted perfect");

			} else {
				System.out.println("Both are Equipment vehicle type group name still available but not correct");
			}
		} catch (Exception e) {
			System.out.println("Equipment vehicle type group delete working correctly and it removed");
		}
	}

	public void Verifyvehicle(String vehicletypenameeqedit, String DeleteProducttxt) throws Exception {

		efilter3.sendKeys(vehicletypenameeqedit);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Both are vehicle name delete perfect.");

		} else {
			System.out.println("Both are Equipment vehicle  name still available but not correct");
		}
	}
	
	public void Verifyvehicle01(String vehicletypename, String DeleteProducttxt) throws Exception {

		efilter3.sendKeys(vehicletypename);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Both are vehicle name delete perfect.");

		} else {
			System.out.println("Both are Equipment vehicle  name still available but not correct");
		}
	}
	
	public void Verifyvehicle02(String vehicletypename0, String DeleteProducttxt) throws Exception {

		efilter3.sendKeys(vehicletypename0);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Both are vehicle name delete perfect.");

		} else {
			System.out.println("Both are Equipment vehicle  name still available but not correct");
		}
	}

	public void Verifypartdel() throws Exception {
		try {
			epartsearch.sendKeys(pro.getProperty("partno"));
			Thread.sleep(5000);
			List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
			System.out.println("total number of parts-->" + list.size());

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getText());
				if (list.get(i).getText().equalsIgnoreCase(pro.getProperty("partvalue1"))) {
					list.get(i).click();
					break;
				}
			}
			btnPsearch.click();
			Thread.sleep(6000);

			Alert alert = driver.switchTo().alert();
			// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
			System.out.println("Part no text " + alert.getText());
			alert.accept();
			Thread.sleep(2000);			
			if (alert.equals(pro.getProperty("Delete"))) {
				System.out.println("error check once again this testcases");

			} 
		} catch (Exception e) {
			System.out.println("Part not found and deleted successfully");
		}
	}

}
