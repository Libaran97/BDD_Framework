package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
// import org.testng.Assert;
import org.junit.Test;

import utility.Baseclass;

public class MyCatalogApplicationsPom extends Baseclass {

	public MyCatalogApplicationsPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// <My Catalogs> menu link
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_5\"]")
	public WebElement MyCatalogs;

	// <Applications> submenu link
	//@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_0\"]")
	@FindBy(xpath="//*[@id='ucMenu_rptLevel1_rptLevel2_5_lnkLink2_0']")
	public WebElement MyCatalogApplications;

	// <Search> button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnSearch\"]")
	public WebElement SearchButton;

	// <View Application Data> button
	//@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylAppln_0\"]")
	@FindBy(xpath="//*[@id=\"tr_0\"]/td[6]/a")
	public WebElement ViewApplicationDataButton;


	// Highlighted Record
	@FindBy(xpath = "//tr[@style=\"background-color:#499BEA;\"]")
	public WebElement HighlightedRecord;


	// <View Part Data> button
	@FindBy(xpath = "//*[@id=\"tr_0\"]/td[6]/a")
	public WebElement ViewPartDataButton;


	// Verify part details (Attributes)
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement Attributes;

	// Verify part details (Interchanges)
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[6]")
	public WebElement Interchanges;

	// Select Make
	@FindBy(name = "ctl00$MainContent$drpMake")
	public WebElement SelectMake;

	// Select Model
	@FindBy(name = "ctl00$MainContent$drpModel")
	public WebElement SelectModel;	

	// Select Year
	@FindBy(name = "ctl00$MainContent$drpYear")
	public WebElement SelectYear;

	// Select Status
	@FindBy(name = "ctl00$MainContent$drpstatus")
	public WebElement SelectStatus;	

	// Back button
	@FindBy(xpath = "//button[@id=\"MainContent_btnBack\"]")
	public WebElement BackButton;	


	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;	

	@FindBy(xpath="//div[@id='btnAdd']")
	private WebElement addbutton;

	@FindBy(xpath="//select[@id='drpProductCategoryAdd']")	
	private WebElement selectproductcategory;

	@FindBy(xpath="//select[@id='drpProductSubCategoryAdd']")	
	private WebElement selectsubcategorydropdown;

	@FindBy(xpath="//select[@id='drpPartDescriptionAdd']")	
	private WebElement selectpartdescdropdown;

	@FindBy(xpath="//select[@id='drpproductline']")	
	private WebElement drpproductline;

	@FindBy(xpath="//input[@id='MainContent_chkIsUnit']")
	private WebElement isnot;

	@FindBy(xpath="//textarea[@id='MainContent_txtPart']")
	private WebElement txtPart1;

	@FindBy(xpath="//input[@id='btnSave']")	
	private WebElement btnSave2;

	@FindBy(xpath = "//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "(//input[@class='button_search'])[2]")
	private WebElement btnPsearch;

	@FindBy(xpath = "//input[@id='MainContent_txtMelling']")
	private WebElement epartsearch;

	@FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement BuyersGuid1click;

	@FindBy(xpath="//input[@id='MainContent_txtenginebase']")
	private WebElement drptext;

	@FindBy(xpath="//input[@id='chk9_0']")
	private WebElement drpcheckbox;

	@FindBy(xpath = "//input[@id='MainContent_searchbtn']")
	private WebElement searchbtn;

	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
	private WebElement checkALL;

	@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	private WebElement btnSave;

	@FindBy(xpath = "(//input[@placeholder='Year Range'])[1]")
	WebElement efilter;

	@FindBy(xpath = "(//input[@placeholder='Engine Details'])[1]")
	WebElement efilter2;

	@FindBy(xpath="(//input[@placeholder='Year Range'])[1]")
	WebElement everifynon1ACES;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	private WebElement drpVehicleType;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	private WebElement drpMake;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	private WebElement drpModel;

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

	public void partslanding() {
		partspageheaderclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void partsearch(String partnoenter) throws InterruptedException {
		txtpartsearch.sendKeys(partnoenter);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Testpart-08 | Engine oil test | Autoapatest"))
			{
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(8000);
	}


	public void acceptAlertbrowser() throws Exception {
		Alert alert = driver.switchTo().alert();
		System.out.println("Browser text " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}
	@SuppressWarnings("unlikely-arg-type")
	public void Verifypartdel() throws Exception {
		try {
			epartsearch.sendKeys(pro.getProperty("partno08"));
			Thread.sleep(5000);
			List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
			System.out.println("total number of parts-->" + list.size());

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getText());
				if (list.get(i).getText().equalsIgnoreCase(pro.getProperty("Testpart-08 | Engine oil test | Autoapatest"))) {
					list.get(i).click();
					break;
				}
			}
			btnPsearch.click();
			Thread.sleep(6000);

			Alert alert = driver.switchTo().alert();
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

	public void buyerguideclick() throws InterruptedException {
		Thread.sleep(3000);
		BuyersGuid1click.click();
		Thread.sleep(5000);

	}
	public void apppartsvehicldropdown(String vehicletypename0) throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement vehiclesselect = drpVehicleType;
		Select select = new Select(vehiclesselect);
		select.selectByVisibleText(vehicletypename0);
		Thread.sleep(5000);
	}

	public void apppartsmakedropdown(String makename) throws InterruptedException {

		WebElement makeselect = drpMake;
		Select select = new Select(makeselect);
		select.selectByVisibleText(makename);
		Thread.sleep(5000);
	}

	public void apppartsmodeldropdown(String modelname) throws InterruptedException {
		WebElement modelselect = drpModel;
		Select select = new Select(modelselect);
		select.selectByVisibleText(modelname);
		Thread.sleep(5000);
	}
	public void appartsenginetextbox() throws InterruptedException
	{
		drptext.click();
		Thread.sleep(2000);
		drpcheckbox.click();
	}
	public void apppartsearch() throws InterruptedException {
		searchbtn.click();
		Thread.sleep(8000);
	}

	public void Alcheck() throws InterruptedException {
		checkALL.click();
		Thread.sleep(3000);
	}
	public void savebtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		btnSave.click();
		Thread.sleep(8000);
	} 
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	public void partslandingpage() throws InterruptedException{
		partspageheaderclick.click();
		Thread.sleep(7000);
		addbutton.click();
		Thread.sleep(7000);
	}
	public void partsadd1() throws InterruptedException {
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(5000);

	}
	public void partsadddrp21() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(5000);
	}

	public void partsadddrp31() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(5000);
	}
	public void partsadddrp41() throws InterruptedException {
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("linecode1"));
		Thread.sleep(5000);
	}
	public void isunitnot() throws InterruptedException {
		isnot.isSelected();
		isnot.click();
		Thread.sleep(2000);
	}
	public void savenewpart08(String partno12) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		txtPart1.sendKeys(partno12);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave2);
		btnSave2.click();
		Thread.sleep(5000);
	}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Parts Related " + alert.getText());
		alert.accept();
		Thread.sleep(4000);

	}
	public void bguideverification() throws InterruptedException {


		efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		String actualText = everifynon1ACES.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(pro.getProperty("EnterInvalidYear"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

	// Click the <My Catalogs> menu link
	public void MyCatalogsClick() throws Exception {
		MyCatalogs.click();	
	}

	// Click the <Applications> submenu link
	public void MyCatalogApplicationsClick() throws Exception {
		MyCatalogApplications.click();
	}

	// Select the <make>,<model>,<year> and <status> fields
	public void SelectMakeModelYearStatus() throws Exception {

		try {
			//Select make = new Select(SelectMake);
			SelectMake.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("option[text()='Test Chevrolet02']")).click();
			//make.selectByIndex(1);
			Thread.sleep(3000);

			Select model = new Select(SelectModel);		
			try {
				model.selectByIndex(1);
			} catch(Exception e) {
				model.selectByIndex(0);
			}
			Thread.sleep(3000);

			Select year = new Select(SelectYear);	
			try {
				year.selectByIndex(1);
			} catch(Exception e) {
				year.selectByIndex(0);
			}
			Thread.sleep(5000);

			Select status = new Select(SelectStatus);
			try {
				status.selectByIndex(1);
			} catch(Exception e) {
				status.selectByIndex(0);
			}
			Thread.sleep(5000);


		} catch(Exception e) {

			Select make = new Select(SelectMake);
			make.selectByIndex(1);
			Thread.sleep(5000);

			Select model = new Select(SelectModel);		
			model.selectByIndex(0);
			Thread.sleep(5000);

			Select year = new Select(SelectYear);	
			year.selectByIndex(0);
			Thread.sleep(5000);

			Select status = new Select(SelectStatus);
			status.selectByIndex(0);
			Thread.sleep(5000);
		}

	}


	// Click the <Search> button
	public void ClickSearchButton(){
		SearchButton.click();		
	}

	// Click the <View application data> button
	public void ClickViewApplicationDataButton() {
		ViewApplicationDataButton.click();
	}

	// Verify the Highlighted record
	public void VerifyHighlightedRecord() {
		try {
			String highlightText = HighlightedRecord.getText();
			System.out.println("The highlighted text is >>>>>>> " + highlightText);
		} catch(Exception e) {
			System.out.println("The highlighted text is not found >>>>>>> ");
		}

	}

	// Click the <Back> button
	public void ClickBackButton() throws Exception {
		BackButton.click();
		Thread.sleep(5000);

	}


	// Click the <View Part Data> button
	public void ClickViewPartDataButton() throws Exception {
		ViewPartDataButton.click();
		Thread.sleep(5000);
	}

	// Verify the <Part Data> details
	public void VerifyPartDataDetails() {
		try {
			String AttText = Attributes.getText();
			System.out.println("The value for Attributes is >>>>>>> " + AttText);
		} catch(Exception e) {
			System.out.println("Clicking <Part Data> link does not fetch any details >>>>>>>");
		}
	}

	// Click the Back Navigation button
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}

	// Click the logout button
	public void ClickLogoutButton() {
		LogoutButton.click();
	}



}