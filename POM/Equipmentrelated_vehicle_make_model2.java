package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Baseclass;

public class Equipmentrelated_vehicle_make_model2 extends Baseclass {

	public Equipmentrelated_vehicle_make_model2() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[@href='VehicleType.aspx?PageTitle=Vehicle Type']")
	@CacheLookup
	private WebElement vehicletype;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addbutton;

	@FindBy(xpath = "//div[@id='btnAdd']")
	private WebElement addbutton1;

	@FindBy(xpath = "//div[@id='btn_back_new']")
	private WebElement Backbtn;

	@FindBy(xpath = "//div[@id='btnBack']")
	private WebElement Backbtn1;
	
	@FindBy(xpath = "//div[@id='btnBack_new']")
	private WebElement Backbtn2;
	

		@FindBy(xpath = "//input[@id='txt_vehicle_type']")
	private WebElement vehicleentertextbox;

	@FindBy(xpath = "//label[text()='Air Compressor']")
	private WebElement eqeditchangeequa;

	@FindBy(xpath = "//span[@id='select2-drpVehicleGroup1-container']")
	private WebElement eGroup;

	@FindBy(xpath = "//li[text()='Equipment']")
	private WebElement egroupoption;

	@FindBy(xpath = "//label[(text()='2-Wheel Drive Tractor')]")
	private WebElement equivalentvehicle;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savebutton;

	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement savebuttonedit;

	@FindBy(xpath = "//div[@id='btnSave']")
	private WebElement savebutton1;

	//span[@id='select2-drpMake-container']
	@FindBy(xpath = "//*[text()='Make']")
	private WebElement clickmake;
	
	@FindBy(xpath = "//span[@id='select2-drpMake-container']")
	private WebElement Selectmake;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeAdd-container']")
	private WebElement vehicletypeselect;

	@FindBy(xpath = "//*[@id='select2-drpVehicleType-container']")
	private WebElement vehicletypeselectadd;

	@FindBy(xpath = "//li[text()='Car equipment test']")
	private WebElement vehicletypesend;

	@FindBy(xpath = "//li[text()='Car equi test']")
	private WebElement vehicletypesend3;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[4]/div/input[1]")
	private WebElement editicon;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[3]/div/input[1]")
	private WebElement editicon1;

	@FindBy(xpath = "//input[@id='txtMake']")
	private WebElement maketextbox;

	@FindBy(xpath = "//label[text()='Friend']")
	private WebElement eqmakeradibutton;

	@FindBy(xpath = "//label[text()='AGCO']")
	private WebElement eqmakeradibuttonedit;

	@FindBy(xpath = "//*[text()='Model']")
	private WebElement modelselect;

	@FindBy(xpath = "//span[@id='select2-drpMakeAdd-container']")
	private WebElement dropdownmakeselect;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement makesearch;

	@FindBy(xpath = "//li[text()='make equipment test']")
	private WebElement dropdownmakesend;

	//	@FindBy(xpath = "//span[@id='select2-drpMakeAdd-container']")
	//	private WebElement dropdownmakesend3;

	@FindBy(xpath = "//input[@id='txtModel']")
	private WebElement modeltextbox;

	@FindBy(xpath = "//label[@id='1707']")
	private WebElement eqmodelradiobutton;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement eqmodelradiobutton1;

	@FindBy(xpath = "//i[@class='fas fa-th-large theme_txt_clr sec_lv_menu']")
	private WebElement clickdashboard;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eSearchBox;

	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	private WebElement eequipeditbt;
	
//	//*[@id="DataTableViewer"]/tbody
	@FindBy(xpath ="//*[@id=\"DataTableViewer\"]/tbody/tr")
	private WebElement eVryText;
	
	
	
	//*[@id="DataTableViewer"]/tbody/tr

	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	private WebElement eselectddVehicle;

	// Vehicle Type Group

	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	private WebElement VehicleTypeGroup;

	@FindBy(xpath = "//input[@id='txtVehicleTypegroup']")
	private WebElement VehicleTypegroupname;

	@FindBy(xpath = "//span[@id='select2-drpVehicleGroup1-container']")
	private WebElement equivehigroup;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeACesgruop1-container']")
	private WebElement equavalentchose1;

	@FindBy(xpath = "//li[text()='Marine']")
	private WebElement equavalentchosesend;

	@FindBy(xpath = "//li[text()='Industrial']")
	private WebElement equavalentchosesend2;

	@FindBy(xpath = "//label[(text()='Car equi test')]")
	private WebElement equivalentvehicle1;

	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	private WebElement eequimentmodelvehcile;

	public void clickonvehicletypgroup() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		VehicleTypeGroup.click();
		Thread.sleep(5000);
		addbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickonvehicletypgroupedit() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		VehicleTypeGroup.click();
		Thread.sleep(5000);
	}

	public void vehicletypegroups(String vehicletypenameeqedit) throws Exception {
		Thread.sleep(5000);
		VehicleTypegroupname.sendKeys(vehicletypenameeqedit);
		Thread.sleep(5000);

		equivehigroup.click();
		Thread.sleep(5000);
		egroupoption.click();
		Thread.sleep(5000);

		equavalentchose1.click();
		Thread.sleep(5000);
		equavalentchosesend.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle1);
		equivalentvehicle1.click();

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(5000);
	}

	public void vehicletypegroupsedit(String vehicletypenameeqedit, String vehicletypenameeq) throws Exception {
		eSearchBox.sendKeys(vehicletypenameeqedit);
		Thread.sleep(5000);
		eequipeditbt.click();
		Thread.sleep(5000);
		VehicleTypegroupname.clear();
		Thread.sleep(2000);
		VehicleTypegroupname.sendKeys(vehicletypenameeq);
		Thread.sleep(3000);
		equavalentchose1.click();
		Thread.sleep(5000);
		equavalentchosesend2.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebuttonedit);
		savebuttonedit.click();
		Thread.sleep(5000);
	}

	public void VerifyequVehicletypegroup(String vehicletypenameeqedit) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeqedit);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeqedit)) {
			System.out.println("Both are same equipment vehicle type group verified");

		} else {
			System.out.println("Both are not same equipment vehicle type group verified");
		}

	}

	public void VerifyequVehicletypegroupedit(String vehicletypenameeq) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeq)) {
			System.out.println("Both are same equipment vehicle type group verified");

		} else {
			System.out.println("Both are not same equipment vehicle type group verified");
		}

	}

	/*
	 * choosing vehicle type & add button click
	 */
	public void clickonvehicletype() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		vehicletype.click();
		Thread.sleep(5000);
		addbutton.click();
		Thread.sleep(5000);
	}

	public void clickonvehicletypeedit() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		vehicletype.click();
		Thread.sleep(5000);
	}

	public void vehcileediticon(String vehicletypenameeq, String vehicletypenameeqedit) throws Throwable {

		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		eequipeditbt.click();
		Thread.sleep(5000);
		vehicleentertextbox.clear();
		Thread.sleep(3000);
		vehicleentertextbox.sendKeys(vehicletypenameeqedit);
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eqeditchangeequa);
		eqeditchangeequa.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", savebuttonedit);
		savebuttonedit.click();
		Thread.sleep(5000);
	}

	/*
	 * entering new vehicle type name, equivalent vehicle & save
	 */
	public void vehicletypename(String vehicletypenameeq) throws Exception {
		vehicleentertextbox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		eGroup.click();
		Thread.sleep(5000);
		egroupoption.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle);
		equivalentvehicle.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(5000);
	}

	public void vehicletypenameedit(String vehicletypenameeq) throws Exception {
		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(3000);

		eequipeditbt.click();
		Thread.sleep(4000);

		vehicleentertextbox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		eGroup.click();
		Thread.sleep(5000);
		egroupoption.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle);
		equivalentvehicle.click();

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(5000);
	}

	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException {

		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		// System.out.println("Record newly to be inserted");

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(3000);

	}

	public void ClickonBackButton() throws InterruptedException {
		Backbtn.click();
		Thread.sleep(2000);
	}
	
	
	public void ClickonBackButton1() throws InterruptedException {
		Backbtn1.click();
		Thread.sleep(2000);
	}

	public void ClickonBackButton2() throws InterruptedException {
		Backbtn2.click();
		Thread.sleep(2000);
	}

	public void VerifyEquipment(String vehicletypenameeq) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(3000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeq)) {
			System.out.println("Both are same vehicle verified");

		} else {
			System.out.println("Both are not same vehicle verified");
		}

	}

	public void VerifyEquipmentedit(String vehicletypenameeqedit) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeqedit);
		Thread.sleep(3000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeqedit)) {
			System.out.println("Both are same vehicle verified");

		} else {
			System.out.println("Both are not same vehicle verified");
		}

	}

	/*
	 * 
	 * choosing make & clicking on the add button
	 */
	public void clickonmake() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		clickmake.click();
		Thread.sleep(5000);

		addbutton1.click();
		Thread.sleep(8000);
	}

	public void clickonmakeedit() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		clickmake.click();
		Thread.sleep(5000);

	}

	/*
	 * 
	 * vehicle type choose, make name add & equivalent make choose
	 */
	public void addmakename() throws InterruptedException {

		vehicletypeselect.click();
		Thread.sleep(6000);

		vehicletypesend3.click();
		Thread.sleep(6000);

	}

	public void addmakenameedit(String makenameeqedit) throws InterruptedException {

		vehicletypeselectadd.click();
		Thread.sleep(6000);

		vehicletypesend3.click();
		Thread.sleep(6000);

		editicon.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
		maketextbox.clear();
		Thread.sleep(2000);
		maketextbox.sendKeys(makenameeqedit);
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(2000);

	}

	/*
	 * 
	 * enter make name,choose equivalent aces make & save
	 */
	public void newmakename(String makenameeq) throws InterruptedException {

		maketextbox.sendKeys(makenameeq);
		Thread.sleep(6000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eqmakeradibutton);
		eqmakeradibutton.click();
		Thread.sleep(6000);

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(2000);

	}

	/*
	 * 
	 * make successfull & alert accept
	 */
	public void acceptAlertformake() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		System.out.println("Application Related " + pro.getProperty("makename") + alert.getText());
		alert.accept();

	}

	public void VerifyMake(String makenameeqedit) throws InterruptedException {

		vehicletypeselectadd.click();
		Thread.sleep(5000);

		vehicletypesend3.click();
		Thread.sleep(5000);

		eSearchBox.sendKeys(makenameeqedit);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(makenameeqedit)) {
			System.out.println("Both are same Make verified");

		} else {
			System.out.println("Both are not same Make verified");
		}

	}

	/*
	 * 
	 * master mouse hover, choose model, addbuton click
	 */
	public void clickonmodel() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		modelselect.click();
		Thread.sleep(5000);

		addbutton1.click();
		Thread.sleep(8000);
	}

	public void clickonmodeledit() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		modelselect.click();
		Thread.sleep(5000);

	}

	/*
	 * 
	 * vehicle type choose, make choose, model name add & equivalent model choose
	 */
	public void addmodelname() throws InterruptedException {

		vehicletypeselect.click();
		Thread.sleep(6000);

		vehicletypesend3.click();
		Thread.sleep(5000);
	}

	public void addmodelnameedit(String modelnameeqedit,String makenameeq) throws InterruptedException {

		vehicletypeselectadd.click();
		Thread.sleep(6000);
		vehicletypesend3.click();
		Thread.sleep(5000);

		Selectmake.click();
		Thread.sleep(3000);
		makesearch.sendKeys(makenameeq);
		driver.findElement(By.xpath("//ul[@id='select2-drpMake-results']")).click();
		Thread.sleep(3000);
		editicon1.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtModel']")));
		modeltextbox.clear();
		Thread.sleep(2000);
		modeltextbox.sendKeys(modelnameeqedit);
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton1);
		savebutton1.click();
		Thread.sleep(3000);

	}

	public void addmodeldrp2(String makenameeq) throws InterruptedException {

		dropdownmakeselect.click();
		Thread.sleep(5000);
		makesearch.sendKeys(makenameeq);
		//dropdownmakeselect.sendKeys(makenameeq);
		driver.findElement(By.xpath("//li[text()='make equipment test']")).click();
		Thread.sleep(5000);

	}

	/*
	 * 
	 * model name add,equivalent model choose & save
	 */
	public void modelnameadd(String modelnameeq) throws InterruptedException {
		Thread.sleep(2000);
		modeltextbox.sendKeys(modelnameeq);
		Thread.sleep(9000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		savebutton1.click();
		Thread.sleep(5000);
	}

	/*
	 * 
	 * added model successfull & alert accept
	 */
	public void acceptAlertformodel() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related " + pro.getProperty("modelname") + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}

	public void Verifymodeleq(String modelnameeq,String makenameeq) throws InterruptedException {

		eequimentmodelvehcile.click();
		Thread.sleep(6000);

		vehicletypesend3.click();
		Thread.sleep(5000);

//		eSearchBox.sendKeys(modelnameeq);
//		Thread.sleep(5000);
		
		Selectmake.click();
		Thread.sleep(3000);
		makesearch.sendKeys(makenameeq);
		driver.findElement(By.xpath("//ul[@id='select2-drpMake-results']")).click();
		System.out.println("Print- Navigation");
		String text = eVryText.getText();
		if (text.equals(modelnameeq)) {
			System.out.println("Both are same equipment vehicle type group verified"+" "+text);

		} else {
			System.out.println("Both are not same equipment vehicle type group verified"+" "+text);
		}

	}

}
