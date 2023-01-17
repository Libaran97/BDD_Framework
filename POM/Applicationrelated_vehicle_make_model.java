package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class Applicationrelated_vehicle_make_model extends Baseclass {

	public Applicationrelated_vehicle_make_model() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//*[@id=\"ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1\"]")
	@CacheLookup
	private WebElement vehicletype;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addbutton;

	@FindBy(xpath = "//div[@id='btnAdd']")
	private WebElement addbutton1;

	@FindBy(xpath = "//div[@id='btn_back_new']")
	private WebElement Backbtn;

	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn1;
	
	@FindBy(xpath = "//div[@id='btnBack']")
	private WebElement Backbtn2;

	@FindBy(xpath = "//input[@id='txt_vehicle_type']")
	private WebElement vehicleentertextbox;

	@FindBy(xpath = "//label[(text()='Car')]")
	private WebElement equivalentvehicle;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savebutton;

	@FindBy(xpath = "//div[@id='btnSave']")
	private WebElement savebutton1;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement savebutton2;

	@FindBy(xpath = "//*[text()='Make']")
	private WebElement clickmake;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeAdd-container']")
	private WebElement vehicletypeselect;

	@FindBy(xpath = "//li[text()='Car Test02']")
	private WebElement vehicletypesend01;

	@FindBy(xpath = "//li[text()='Car Test']")
	private WebElement vehicletypesend;


	@FindBy(xpath = "//li[text()='Test Chevrolet02']")
	private WebElement clkmakesel;

	@FindBy(xpath="//span[@id='select2-drpMake-container']")
	private WebElement clkmake;

	@FindBy(xpath = "//li[text()='Car Test02']")
	private WebElement vehicletypesend02;

	@FindBy(xpath = "//input[@id='txtMake']")
	private WebElement maketextbox;

	@FindBy(xpath = "//label[text()='Chevrolet']")
	private WebElement eqmakeradibutton;

	@FindBy(xpath = "//*[text()='Model']")
	private WebElement modelselect;

	@FindBy(xpath = "//*[@id='select2-drpMakeAdd-container']")
	private WebElement dropdownmakeselect;

	@FindBy(xpath = "//li[text()='Test Chevrolet02']")
	private WebElement dropdownmakesend01;

	@FindBy(xpath = "//li[text()='Test Chevrolet']")
	private WebElement dropdownmakesend;

	@FindBy(xpath = "//input[@id='txtModel']")
	private WebElement modeltextbox;

	@FindBy(xpath = "//label[@id='6641']")
	private WebElement eqmodelradiobutton;

	@FindBy(xpath = "//i[@class='fas fa-th-large theme_txt_clr sec_lv_menu']")
	private WebElement clickdashboard;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eSearchBox;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVryText;

	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	private WebElement eselectddVehicle;

	// Vehicle Type Group

	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	private WebElement VehicleTypeGroup;

	@FindBy(xpath = "//input[@id='txtVehicleTypegroup']")
	private WebElement VehicleTypegroupname;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeACesgruop1-container']")
	private WebElement equavalentchose1;

	@FindBy(xpath = "(//input[@name='rbCategories'])[4]")
	private WebElement cartest02;

	@FindBy(xpath = "//li[text()='Light Duty']")
	private WebElement equavalentchosesend;

	@FindBy(xpath = "//label[(text()='Car Test')]")
	private WebElement equivalentvehicle1;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[3]/div/input[1]")
	WebElement eEditBtn; // Model Edit

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[1]")
	WebElement eEditMakeBtn;

	@FindBy(xpath = "(//div[@Class='edit_icon_ver'])[1]")
	WebElement eEditVgroupBtn;

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[3]/div/input[2]")
	WebElement eDeleteBtn; // Model

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[2]")
	WebElement eDeleteMakeBtn;

	@FindBy(xpath = "(//div[@Class='edit_icon_ver'])[2]")
	WebElement eDeleteVgrouBtn;

	/*
	 * choosing vehicle type group & add button click
	 */

	public void clickonvehicletypgroup() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, VehicleTypeGroup, 250).click();
	}

	public void vehicletypegroups(String vehicletypename, String Equchose) throws Exception {
		Baseclass.waitForElementToBeClickable(driver, addbutton, 250).click();
		Baseclass.waitForElementToBeVisible(driver, VehicleTypegroupname, 250).sendKeys(vehicletypename);
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, equavalentchose1, 250).click();
		Baseclass.waitForElementToBeClickable(driver, equavalentchosesend, 250).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle1);
		Baseclass.waitForElementToBeClickable(driver, equivalentvehicle1, 250).click();
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
	}
	////// tc019mpmtmutliadd/////////

	public void vehicletypegroups01(String vehicletypename0, String Equchose) throws Exception {
		Baseclass.waitForElementToBeClickable(driver, addbutton, 250).click();
		Baseclass.waitForElementToBeVisible(driver, VehicleTypegroupname, 250).sendKeys(vehicletypename0);
		Baseclass.waitForElementToBeClickable(driver, equavalentchose1, 250).click();
		Baseclass.waitForElementToBeClickable(driver, equavalentchosesend, 250).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle1);
		Baseclass.waitForElementToBeClickable(driver, cartest02, 250).click();
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
	}

	public void VerifyVehicletypegroup(String vehiclename) throws InterruptedException {
		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
		Backbtn.click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehiclename);
		String text = eVryText.getText();
		if (text.equals(vehiclename)) {
			System.out.println("Both are same vehicle type group verified");

		} else {
			System.out.println("Both are not same vehicle type group verified");
		}

	}

	public void VerifyVehicletypegroup01(String vehiclename) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehiclename);
		String text = eVryText.getText();
		if (text.equals(vehiclename)) {
			System.out.println("Both are same vehicle type group verified");

		} else {
			System.out.println("Both are not same vehicle type group verified");
		}
	}

	public void SelectVehicletypegroup(String vehiclename) throws InterruptedException {
		Thread.sleep(5000);
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehiclename);
		Thread.sleep(5000);

	}

	public void SelectVehicletypegrouptest02(String vehicletypename0) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehicletypename0);

	}

	public void SelectVehicletypegroup02(String vehicletypenameeq) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehicletypenameeq);
	}

	public void Editvehicletypegroups(String vehicletypename) throws Exception {
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, eEditVgroupBtn, 250).click();
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, VehicleTypegroupname, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, VehicleTypegroupname, 250).sendKeys(vehicletypename);
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton2);
		Baseclass.waitForElementToBeClickable(driver, savebutton2, 250).click();
	}

	public void DeleteVehicleTypegroup() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eDeleteVgrouBtn, 250).click();
	}

	public void VerifyDeleteVehicletypegroup(String vehicletypename0, String DeleteProducttxt)
			throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehicletypename0);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Vehicletypegroup Deleted successfully");

		} else {
			System.out.println("Vehicletypegroup Not Deleted successfully");
		}

	}

	/*
	 * choosing vehicle type & add button click
	 */
	public void clickonvehicletype() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, vehicletype, 250).click();

	}

	/*
	 * entering new vehicle type name, equivalent vehicle & save
	 */
	public void vehicletypename(String vehicletypename) throws Exception {
		Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver, addbutton, 250).click();
		Baseclass.waitForElementToBeVisible(driver, vehicleentertextbox, 250).sendKeys(vehicletypename);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle);
		Baseclass.waitForElementToBeClickable(driver, equivalentvehicle, 250).click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
	}

	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Print-navigation");
		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
	}

	public void Clickonbackbtn() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}
	
	public void Clickonbackbtn1() throws InterruptedException {
		Backbtn1.click();
		Thread.sleep(2000);
	}
	
	public void Clickonbackbtn2() throws InterruptedException {
		Backbtn2.click();
		Thread.sleep(2000);
	}
	
	
	public void accpalert1() throws InterruptedException {
		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
	}

	public void VerifyVehicle(String vehicletypename) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehicletypename);
		String text = eVryText.getText();
		if (text.equals(vehicletypename)) {
			System.out.println("Both are same vehicle verified");

		} else {
			System.out.println("Both are not same vehicle verified");
		}

	}

	public void SelectVehicle(String vehicletypename) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(vehicletypename);
	}

	public void Editvehicletypename(String vehicletypename) throws Exception {
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, eEditVgroupBtn, 250).click();
		/*Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver, vehicleentertextbox, 250).click();
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, vehicleentertextbox, 250).clear();
		Thread.sleep(8000);
		Baseclass.waitForElementToBeVisible(driver, vehicleentertextbox, 250).sendKeys(vehicletypename);
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton2);
		Baseclass.waitForElementToBeClickable(driver, savebutton2, 250).click();
		Thread.sleep(6000);*/
	}

	/*
	 * 
	 * choosing make & clicking on the add button
	 */
	public void clickonmake() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, clickmake, 250).click();
	}

	public void addmakename() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, addbutton1, 250).click();
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
		Thread.sleep(8000);
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		Thread.sleep(8000);
		//Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
		Thread.sleep(8000);
	}

	public void addmakename01() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, addbutton1, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend01, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
	}

	/*
	 * 
	 * enter make name,choose equivalent aces make & save
	 */
	public void newmakename(String makename) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, maketextbox, 250).sendKeys(makename);
		Thread.sleep(8000);
		//maketextbox.sendKeys(pro.getProperty("makename0"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", eqmakeradibutton);
		//Thread.sleep(8000);
		//Baseclass.waitForElementToBeClickable(driver, eqmakeradibutton, 250).click();

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
		Thread.sleep(2000);
	}

	public void newmakename01(String makename0) throws InterruptedException {

		Baseclass.waitForElementToBeVisible(driver, maketextbox, 250).sendKeys(makename0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eqmakeradibutton);
		Baseclass.waitForElementToBeClickable(driver, eqmakeradibutton, 250).click();
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
	}

	/*
	 * 
	 * make successfull & alert accept
	 */
	public void acceptAlertformake() throws InterruptedException {

		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
		Thread.sleep(6000);
	}
	public void acceptAlert1make() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
		Thread.sleep(6000);
	}

	public void accpalertmake() throws InterruptedException {
		WebElement pop = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
	}

	public void VerifyMake(String makename0) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		//Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename0);
		String text = eVryText.getText();
		if (text.equals(makename0)) {
			System.out.println("Both are same Make verified");

		} else {
			System.out.println("Both are not same Make verified");
		}

	}

	public void VerifyMake01(String makename0) throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend01, 250).click();
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename0);

		String text = eVryText.getText();
		if (text.equals(makename0)) {
			System.out.println("Both are same Make verified");

		} else {
			System.out.println("Both are not same Make verified");
		}

	}

	public void SearchMake(String makename) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename);
	}

	public void SearchMake02(String makename0) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend02, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename0);
	}

	public void SearchMake01(String makename0) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend01, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename0);
	}

	public void Editmakename(String makename) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eEditMakeBtn, 250).click();
		Baseclass.waitForElementToBeClickable(driver, maketextbox, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, maketextbox, 250).sendKeys(makename);

		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		Baseclass.waitForElementToBeClickable(driver, savebutton, 250).click();
	}

	public void Deletemakename() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, eDeleteMakeBtn, 250).click();
	}

	/*
	 * 
	 * master mouse hover, choose model, addbuton click
	 */
	public void clickonmodel() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, modelselect, 250).click();
		Thread.sleep(3000);
		Baseclass.waitForElementToBeClickable(driver, addbutton1, 250).click();
		Thread.sleep(3000);
	}

	/*
	 * 
	 * vehicle type choose, make choose, model name add & equivalent model choose
	 */
	public void addmodelname() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		Thread.sleep(6000);

	}

	public void addmodelname01() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, vehicletypeselect, 250).click();
		Thread.sleep(5000);
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend01, 250).click();
		Thread.sleep(2000);

	}

	public void addmodeldrp2() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, dropdownmakeselect, 250).click();
		Thread.sleep(4000);
		Baseclass.waitForElementToBeClickable(driver, dropdownmakesend01, 250).click();

	}

	public void addmodeldrp01() throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, dropdownmakeselect, 250).click();
		Thread.sleep(5000);
		Baseclass.waitForElementToBeClickable(driver, dropdownmakesend01, 250).click();
		Thread.sleep(5000);

	}

	/*
	 * 
	 * model name add,equivalent model choose & save
	 */
	public void modelnameadd(String modelname0) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, modeltextbox, 250).sendKeys(modelname0);
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js1.executeScript("arguments[0].scrollIntoView();", eqmodelradiobutton);
		//Baseclass.waitForElementToBeClickable(driver, eqmodelradiobutton, 250).click();
		Thread.sleep(2000);

		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		Baseclass.waitForElementToBeClickable(driver, savebutton1, 250).click();
		Thread.sleep(3000);
	}

	public void modelnameadd01(String modelname) throws InterruptedException {
		Baseclass.waitForElementToBeVisible(driver, modeltextbox, 250).sendKeys(modelname);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", eqmodelradiobutton);
		Baseclass.waitForElementToBeClickable(driver, eqmodelradiobutton, 250).click();
		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		Baseclass.waitForElementToBeClickable(driver, savebutton1, 250).click();
	}

	/*
	 * 
	 * added model successfull & alert accept
	 */
	public void acceptAlertformodel() throws InterruptedException {
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
	}
	public void accepalert1model() throws InterruptedException {
		WebElement pop = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		Baseclass.waitForElementToBeClickable(driver, pop, 250).click();
	}

	public void VerifyModel(String modelname0) throws InterruptedException {
		Thread.sleep(5000);
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		//Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();

		Baseclass.waitForElementToBeClickable(driver, clkmake, 250).click();

		//Baseclass.waitForElementToBeClickable(driver, clkmakesel, 250).click();
		//Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(modelname0);
		String text = eVryText.getText();
		if (text.equals(modelname0)) {
			System.out.println("Both are same Model verified");

		} else {
			System.out.println("Both are not same Model verified");
		}

	}

	public void VerifyModel01(String modelname0) throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend01, 250).click();
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(modelname0);
		String text = eVryText.getText();
		if (text.equals(modelname0)) {
			System.out.println("Both are same Model verified");

		} else {
			System.out.println("Both are not same Model verified");
		}

	}

	public void clickonmodel3() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Baseclass.waitForElementToBeClickable(driver, modelselect, 250).click();

	}

	public void SeletModel(String modelname0) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
		Thread.sleep(3000);
		clkmake.click();
		//driver.findElement(By.xpath("//span[@aria-owns='select2-drpMake-results']")).click();
		//driver.findElement(By.xpath("(//span[@role='textbox'])[2]")).click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='search']"));
		Thread.sleep(2000);
		searchbox.click();
		searchbox.sendKeys("Test Chevrolet02");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@role='option']")).click();
		//Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
		Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(modelname0);
	}

	public void Editmodelname(String modelname0) throws InterruptedException {
		Baseclass.waitForElementToBeClickable(driver, eEditBtn, 250).click();
		Baseclass.waitForElementToBeClickable(driver, modeltextbox, 250).clear();
		Baseclass.waitForElementToBeVisible(driver, modeltextbox, 250).sendKeys(modelname0);

		Thread.sleep(8000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		Baseclass.waitForElementToBeClickable(driver, savebutton1, 250).click();
	}

	public void DeleteModel() throws InterruptedException {

		Baseclass.waitForElementToBeClickable(driver, eDeleteBtn, 250).click();
	}

	public void VerifyDeleteMake(String makename, String DeleteProducttxt) throws InterruptedException {

		try {
			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename);
			String text = eVryText.getText();
			if (text.equals(DeleteProducttxt)) {
				System.out.println("Make Deleted successfully");

			} else {
				System.out.println("Make Not Deleted successfully");
			}
		} catch (Exception e) {
			System.out.println("Vehicle not found so Makel Not Deleted successfully");
		}

	}

	public void VerifyDeleteMake02(String makename0, String DeleteProducttxt) throws InterruptedException {

		try {
			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(makename0);

			String text = eVryText.getText();
			if (text.equals(DeleteProducttxt)) {
				System.out.println("Make Deleted successfully");

			} else {
				System.out.println("Make Not Deleted successfully");
			}
		} catch (Exception e) {
			System.out.println("Vehicle not found so Makel Not Deleted successfully");
		}

	}

	public void VerifyModelDeleted(String modelname, String DeleteProducttxt) throws InterruptedException {

		try {

			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeClickable(driver, vehicletypesend, 250).click();
			Baseclass.waitForElementToBeClickable(driver, eselectddVehicle, 250).click();
			Baseclass.waitForElementToBeVisible(driver, eSearchBox, 250).sendKeys(modelname);
			String text = eVryText.getText();
			if (text.equals(DeleteProducttxt)) {
				System.out.println("Model Deleted successfully");

			} else {
				System.out.println("Model Not Deleted successfully");
			}
		} catch (Exception e) {
			System.out.println("Vehicle not found so Model Not Deleted successfully");
		}

	}
}
