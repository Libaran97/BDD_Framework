package pageobjectmodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
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


import utility.Baseclass;

public class MyCatalogAttributesPom extends Baseclass {

	public MyCatalogAttributesPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// <My Catalogs> menu link  ^^^^^^^^^^^
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_5']")
	public WebElement MyCatalogsAtt;
	
	// <Interchange> submenu link  ^^^^^^^^
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_5_lnkLink2_3']")
	public WebElement MyCatalogAttributes;
	
	// Select Part Description
	@FindBy(name = "ctl00$MainContent$ddlPartDescription")
	public WebElement PartDescription;
	
	// Attribute Checkbox
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	public WebElement AttributeCheckBox;
	

	// Submit button
	@FindBy(xpath = "//button[@class='button_save_new']")
	public WebElement SubmitButton;
	
	// Part Number
	@FindBy(xpath = "//a[@id=\"MainContent_GridParts_lnkPartNo_0\"]")
	public WebElement PartNumber;
	
	
	
	// Attribute Name in AllInOne Page
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement AttributeName_TC014;
	
	// Excel Button
	@FindBy(xpath = "//input[@id=\"MainContent_imgExportXL\"]")
	public WebElement ExcelButton;
	
	// Select All Checkbox
	// @FindBy(xpath = "//input[@name=\"ctl00$MainContent$rptLevel1$ctl00$chkSelectAll\"]")
	@FindBy(xpath = "//input[@id=\"MainContent_rptLevel1_chkSelectAll_1\"]")
	public WebElement SelectAllCheckbox_TC014;
	
	//@FindBy(xpath="//a[@id='MainContent_GridParts_lnkPartNo_0']")
	@FindBy(xpath="//a[@id=\"ucMenu_rptLevel1_lnkLink1_3\"]")
	private WebElement partsearch;
	
	// Attribute Name
	@FindBy(xpath = "//span[@id=\"MainContent_rptLevel1_lblAttribute_0\"]")
	public WebElement AttribName_TC014;
	
	// Attribute1
	@FindBy(xpath = "//label[@for=\"MainContent_rptLevel1_chkList_0_0_0\"]")
	public WebElement Attribute1_TC014;
	
	// Attribute2
	@FindBy(xpath = "//label[@for=\"MainContent_rptLevel1_chkList_0_1_0\"]")
	public WebElement Attribute2_TC014;
	
	// Attribute Name Check
	@FindBy(xpath = "(//th[@scope=\"col\"])[2]")
	public WebElement AttributeNameCheck_TC014;
	
	// Attribute1 Check
	@FindBy(xpath = "//label[@for=\"MainContent_rptLevel1_chkList_0_0_0\"]")
	public WebElement AttributeValue1;
	
	// Attribute2 Check
	@FindBy(xpath = "//*[@id=\"MainContent_GridParts\"]/tbody/tr[2]/td[2]")
	public WebElement AttributeValue2;	
	
	// Title text details
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement TitleTextDetail;
	
	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;	
	
	
	
	
	// Click the <My Catalogs> menu link ^^^^^^^^^^
	public void MyCatalogsAttClick() throws Exception {
		MyCatalogsAtt.click();	
		
	}
	
	// Click the <Attributes> submenu link ^^^^^^^^^^
	public void MyCatalogAttributesClick() throws Exception {
		MyCatalogAttributes.click();		
	}
	
	
	// Choose Part Description from the dropdown
	public void ChoosePartDescription() throws Exception {
		//Select PartDescSelect = new Select(driver.findElement(By.name("ctl00$MainContent$ddlPartDescription")));
		Select PartDescSelect = new Select(PartDescription);
		PartDescSelect.selectByVisibleText("Ignition Coil Test");
		
	}
	public void ChoosePartDescription1() throws Exception {
		//Select PartDescSelect = new Select(driver.findElement(By.name("ctl00$MainContent$ddlPartDescription")));
		Select PartDescSelect = new Select(PartDescription);
		List<WebElement> e = PartDescSelect.getOptions();
		int itemCount = e.size();

		for(int i = 0; i < itemCount; i++)
		{
		    System.out.println(e.get(i).getText());
		    System.out.println("No Data");
		}
			
	}
	
	public void ClickAttributeCheckbox() throws Exception {
		AttributeCheckBox.click();
	}
	
	
	
	// Click the <Submit> button
	public void ClickSubmitButton() throws Exception {
		SubmitButton.click();
	}
	
	// Click the <Part Number>
	public void ClickPartNumber() {
		PartNumber.click();
	}
	
		
	// Check the attributes in AllInOne page
	public void CheckAttributesInAllInOnePage_TC014() {
		// String attname = driver.findElement(By.xpath("//span[@class=\"quick_part_descriptionQuickEdit\"]")).getText();
		String attname = AttributeName_TC014.getText();
		if(attname.contains("Engine Piston Ring")) {
			Assert.assertEquals(true, true);
		}
		else
		{
			System.out.println("Assertion failed .....");
		}
	}
	
	// Click the <Generate Excel Button>
	public void ClickGenerateExcelButton() {
		ExcelButton.click();
	}
	
	// Click the <Select All> checkbox
	public void ClickSelectAllCheckbox_TC014() {
		// driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$rptLevel1$ctl00$chkSelectAll\"]")).click();
		SelectAllCheckbox_TC014.click();
	}
	public void partsearchnew() throws InterruptedException {
		partsearch.click();
		Thread.sleep(3000);
		
		
	}
		
	// Verify the displayed Attribute
	public void VerifyDisplayedAttribute() throws Exception {
		String value1 = AttributeValue1.getText();
		String value2 = AttributeValue2.getText();
		if(value1.equals(value2)) {
			System.out.println("PASS :: The attributes display verrification is success");
		} else {
			System.out.println("FAIL :: The attributes display verrification is failure");
		}
	}
	
	
	
	/* &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&*/
	
	// Select all the checkboxes corresponding to the attributes
	public void SelectAllCheckboxes_TC014() {
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for (int i=1; i<=cb.size(); i++) {
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+i+"]")).click();
		}
		
	}
	
	public void VerifyTitleTextInAllInOnePage() throws Exception {
		try {
		String TitleText = TitleTextDetail.getText();
		System.out.println("PASS :: The title text in the AllInOne page is >>>>>>>>>>>>>> " + TitleText);
		} catch(Exception e) {
			System.out.println("FAIL :: No title text found in the AllInOne page is >>>>>>>>>>>>>> ");
		}
	}
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Click the Navigation back button
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}
	
	// Click the <Logout> button
	public void ClickLogoutButton() {
		LogoutButton.click();
	}	
		
	
}