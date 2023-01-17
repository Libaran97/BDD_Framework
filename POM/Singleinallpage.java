package pageobjectmodel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.Baseclass;

public class Singleinallpage extends Baseclass {

	public Singleinallpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='txt_cat_partNo']")
	WebElement esingleSearch;
	@FindBy(xpath = "//*[@id='txt_cat_partNo_in']")
	WebElement esingleSearch1;
	
	@FindBy(xpath="(//input[@placeholder='Year Range'])[1]")
	WebElement yearrangetext;
	
	
	//@FindBy(xpath = "(//input[@id='btn_part_details_quickview'])[1]")(//input[@value='Search'])[1]
	//@FindBy(xpath="//*[@id='divMenus_dashboard']/input[2]")
	@FindBy(xpath="(//input[@value='Search'])[1]")
	WebElement esearchbt;
	
	//@FindBy(xpath = "(//input[@id='btn_part_details_quickview'])[2]")
	@FindBy(xpath="(//input[@class='btn_part_details_quickview'])[1]")
	WebElement esearchbt1;

	@FindBy(xpath = "//*[@id='btnAddApp']")
	WebElement evehicleadd;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	WebElement evehicledrop;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	WebElement emakedrop;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	WebElement emodeldrop;

	@FindBy(xpath = "//input[@name='ctl00$MainContent$searchbtn']")
	WebElement esearchbutton;
	
	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
	WebElement checkaces;

	/*@FindBy(xpath = "//*[@id='MainContent_GvApplications_chkActivee1_2']")//(//*[@id="lbl_QW_description1"])[1]
	WebElement eaceschkbox;*/

	@FindBy(xpath = "//*[@id='MainContent_GvApplications_chkActivee1_1']")
	WebElement enonaceschkbox;

	@FindBy(xpath="//input[@value='Save']")
	WebElement esave;

	@FindBy(xpath = "(//input[@class='glowing-border'])[12]")
	WebElement eyear;

	@FindBy(xpath = "(//input[@class='glowing-border'])[13]")
	WebElement eenginer;

	
	@FindBy(xpath="//label[text()='1995-1995']")
	WebElement eyere1;
	

	@FindBy(xpath="//label[text()='2001-2001']")
	WebElement eyere02;
	
	
	//@FindBy(xpath="//label[text()='1999-1999']")
	//WebElement eyere2;

	@FindBy(xpath = "//*[@id='1']/td[7]/div/img[1]")
	WebElement eEdit;

	@FindBy(xpath = "//*[@id='MainContent_GvApplications_txtapppartsnotes_1']")
	WebElement enotes;

	@FindBy(xpath = "//*[@id='MainContent_GvApplications_txtquantity_1']")
	WebElement eqty;

	@FindBy(xpath = "//*[@id='MainContent_btnUpdate']")
	WebElement eupdate;

	@FindBy(xpath = "//tr[@id='1']/td[7]/div/img[2]")
	WebElement edelvehicle;

	@FindBy(xpath = "//*[@id='tbl_catalog_application']/tr/td")
	WebElement edeletnot;

	@FindBy(xpath = "//*[@id='btnAdd_Desc']")
	WebElement edescadd;

	/*
	 * @FindBy(xpath = "//*[@id='MainContent_drpSProductLine']") WebElement
	 * edessubprodline;
	 */

	
	@FindBy(xpath="//select[@id='drpNotesType']")
	WebElement edesnotes;

	@FindBy(xpath = "//input[@id='txtDes']")
	public WebElement edessequence;
	
	@FindBy(xpath="//table[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/input[1]")
	private WebElement Editdesaction;

	@FindBy(xpath = "//input[@id='txtNotes']")
	WebElement edesdescription;

	
	@FindBy(xpath="//input[@value='Save']")
	WebElement edessave;
 
	@FindBy(xpath="//button[text()='OK']")
	WebElement addalert;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement editalert;
	
	@FindBy(xpath="(//input[@placeholder='Code'])[2]")
	WebElement everify1;


	@FindBy(xpath="(//*[@id='lbl_QW_description1'])[1]")
	WebElement everify2;
	

	//@FindBy(xpath = "//*[@id='MainContent_gv']/tbody/tr[2]/td[4]")
	@FindBy(xpath="(//*[@id='lbl_QW_description1'])[2]")
	WebElement everify3;
	
	@FindBy(xpath="//input[@id='MainContent_txtenginebase']")
	private WebElement drptext;
	
	@FindBy(xpath="//input[@id='chk9_0']")
	private WebElement drpcheckbox;
	
	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
	private WebElement checkALL;
	

	//@FindBy(xpath = "//*[@id='1']/td[5]/div/img[1]")
	//@FindBy(xpath="//table[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/input[1]")

	//@FindBy(xpath = "//*[@id='1']/td[5]/div/img[1]")
	@FindBy(xpath="//input[@id='btnAdd_Desc']")
	WebElement edescedit;

	//@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[5]/div/input[2]")
	@FindBy(xpath= " /html/body/div[2]/div[4]/div/div/div[2]/div/table/tbody/tr/td[5]/div/input[2]")
	WebElement edescdele;
	////////////// *******************************************////////////////////////////

	@FindBy(xpath = "//*[@id='btnAddPart_New']")
	WebElement eadd;

	@FindBy(xpath = "//*[@id='drpPartDesc']")
	public WebElement epartdesc;

	@FindBy(xpath = "//*[@id='drpProductLine']")
	WebElement epartpro;

	@FindBy(xpath = "//*[@id='drp_qtyuom']")
	WebElement eqtyuom;

	@FindBy(xpath = "//*[@id='btnSave_AddPopup']")
	WebElement epartsave;
	
	@FindBy(xpath = "//*[@id='btnCancel_AddPopup']")
	WebElement epartcancel;
	
	@FindBy(xpath = "//*[@id='tblPartDetail']/tbody/tr/td[1]")
	WebElement epartfilter;
	
	
	@FindBy(xpath="(//*[@id='close_img'])[2]")
	public WebElement Closeup;
	
	@FindBy(xpath="//input[@id='MainContent_txtenginebase']")
	public WebElement enginebasetextbox;
	
	@FindBy(xpath="(//input[@name='chklistitem10'])[2]")
	public WebElement checkedbox;
	
	public void partadd(String newpartno,String subcategoryname1, String linecode13, String adduom) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement elementclose = driver.findElement(By.xpath("(//*[@id='close_img'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementclose);
		Thread.sleep(3000);
		eadd.click();
		Thread.sleep(3000);

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='txtAddPartNew']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element.sendKeys("tesapapmt");
		Thread.sleep(3000);

		Select desc = new Select(epartdesc);
		desc.selectByVisibleText(pro.getProperty("subcategoryname1"));
		Thread.sleep(2000);

		Select prop = new Select(epartpro);
		prop.selectByVisibleText(pro.getProperty("linecode13"));
		Thread.sleep(2000);

		Select qtyuom = new Select(eqtyuom);
		qtyuom.selectByVisibleText(pro.getProperty("adduom"));
		Thread.sleep(2000);

		epartsave.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Single in all page is..:" + alert.getText());
		String match=alert.getText();
		alert.accept();		
		//driver.switchTo().window(MainWindow);
		Thread.sleep(5000);	
		
		if(match.contains("Part# added successfully")) 
		{
			System.out.println("**Part number created successfully**");
		}
		else 
		{
			epartcancel.click();
			Thread.sleep(5000);			
			
			WebElement elementfilter = driver.findElement(By.xpath("//*[@id='tblPartDetail_wrapper']/div[2]/div/div/div[2]/div/table/tfoot/tr/th[1]/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter);		
			Thread.sleep(3000);
			elementfilter.sendKeys(pro.getProperty("newpartno"));
			Thread.sleep(5000);
			
			WebElement elementfilter1 = epartfilter;
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);		
			Thread.sleep(5000);
		}
		
	}

	public void searchsingles(String newpartnos) throws Exception {
		esingleSearch.sendKeys(pro.getProperty("newpartnos"));
		Thread.sleep(5000);
	}
	
	
	public void Searchsingles01(String newpartno) throws Exception {
		esingleSearch.sendKeys(pro.getProperty("newpartno"));
		Thread.sleep(5000);
	}
		
	public void Searchsingle(String newpartno) throws Throwable {
		esingleSearch.click();
		esingleSearch.clear();
		esingleSearch.sendKeys(pro.getProperty("newpartno"));
		Thread.sleep(5000);
	}
	public void verifyNOTesandqty01() {
		
		yearrangetext.sendKeys(pro.getProperty("EnterYearaces"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void alertclk() throws InterruptedException {
	Alert alert = driver.switchTo().alert();
	System.out.println("Single in all page is..:" + alert.getText());
	alert.dismiss();
	Thread.sleep(5000);
}
	public void partdetails() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement elementfilter = driver.findElement(By.xpath("//*[@id='tblPartDetail_wrapper']/div[2]/div/div/div[2]/div/table/tfoot/tr/th[1]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter);		
		Thread.sleep(3000);
		elementfilter.sendKeys(pro.getProperty("newpartno"));
		Thread.sleep(5000);
		
		WebElement elementfilter1 = epartfilter;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);		
		Thread.sleep(5000);
		
	}
	
	
	public void searchbt() throws Exception {
		Thread.sleep(8000);
		esearchbt.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void searchbt1() throws Exception {
		//driver.switchTo().frame(0);
		esearchbt1.click();
		Thread.sleep(8000);
	}

	public void vehicleadd() throws Exception {

		evehicleadd.click();
		Thread.sleep(5000);
	}

	public void vehiclepop(String vehicletypenameaces, String makenameaces, String modelnameaces) throws Throwable {
		// driver.switchTo().frame(1);
		Thread.sleep(3000);
		System.out.println("**Enter the Popup page**");
		Select evehi = new Select(evehicledrop);
		evehi.selectByVisibleText(pro.getProperty("vehicletypenameaces"));
		Thread.sleep(3000);

		Select emake = new Select(emakedrop);
		emake.selectByVisibleText(pro.getProperty("makenameaces"));
		Thread.sleep(3000);

		Select emodel = new Select(emodeldrop);
		emodel.selectByVisibleText(pro.getProperty("modelnameaces"));
		Thread.sleep(5000);
		
		enginebasetextbox.click();
		Thread.sleep(5000);
		checkedbox.click();
		Thread.sleep(8000);
		
	
	}
	public void searchbox() throws InterruptedException{
		Thread.sleep(3000);
		esearchbutton.click();

		Thread.sleep(3000);
		System.out.println("Values chosen");
		
	}
	public void checkaces() throws InterruptedException{
		Thread.sleep(2000);
		checkaces.click();
		Thread.sleep(2000);
	}

	String MainWindow = null;

	public void windowhandler() {
		// Switch between windows
		try {
			MainWindow = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();

				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

					// Switching to Child window
					driver.switchTo().window(ChildWindow);
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

	public void aceschkbox() throws Throwable {		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());

		int j = 0;
		int z=0;
		int k=0;
		for (int i = 1; i < list.size(); i++) {
			j = i+1;	
			z=i-1;
			k=i+1;
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications\"]/tbody/tr["+ j +"]/td[2]")).getText();
		    String Engine = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications\"]/tbody/tr["+ k +"]/td[3]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications_lblacesnonaces_" + z + "\"]")).getText();
			                                                                 
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.equals(pro.getProperty("EnterYear"))) && (Type.equals(pro.getProperty("Acesvalue")))&&(Engine.equals(pro.getProperty("SearchTextAcesEngine")))) {				
				
				driver.findElement(By.xpath("(//span[@class='chkBottomItem'])[" + i + "]")).click();
				
			} else {
				continue;
			}

		}

		
		
		//eaceschkbox.click();
		Thread.sleep(3000);
	}
	public void appartsenginetextbox() throws InterruptedException
	{
		Thread.sleep(3000);
	drptext.click();
	Thread.sleep(2000);
	drpcheckbox.click();
	}
	public void Alcheck() throws InterruptedException {
		checkALL.click();
		Thread.sleep(3000);
	}

	public void Nonaceschkbox() throws Throwable {
		//enonaceschkbox.click();		
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());

		int j = 0;
		int z=0;
		for (int i = 1; i < list.size(); i++) {
			j = i+1;
			z= i-1;
			//String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblYear_" + j + "\"]")).getText();
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications\"]/tbody/tr["+ j +"]/td[2]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications_lblacesnonaces_" + z + "\"]")).getText();
			                                                     
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.contains(pro.getProperty("EnterInvalidYear")))&& (Type.contains(pro.getProperty("NonAcesvalue")))) {					
				driver.findElement(By.xpath("(//span[@class='chkBottomItem'])[" + i + "]")).click();
				
			} else {
				continue;
			}

		}
		Thread.sleep(3000);
	}

	public void save() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", esave);
		esave.click();
		Thread.sleep(6000);
	}
	
	public void zoomin() throws Exception {
		Thread.sleep(5000);
	 for(int i=0; i<4; i++)
	 {   
		  driver.findElement(By.tagName("/html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
	 }
	 Thread.sleep(5000);
	}
	public void acceptAlert() throws Exception {		
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Single in all page is..:" + alert.getText());
		alert.accept();
		Thread.sleep(5000);
		driver.switchTo().window(MainWindow);
		Thread.sleep(8000);
	}

	public void verifydata(String EnterYearaces) throws Throwable {
		//driver.switchTo().window(ChildWindow);
		//Closeup.click();
		
		eyear.sendKeys(pro.getProperty("EnterYearaces"));
		Thread.sleep(3000);
		//eenginer.sendKeys("");

		String actualText = eyere1.getText();
		System.out.println("Parts Linked value is.." + actualText);
		if (actualText.contains(pro.getProperty("EnterYearaces"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifydata1(String EnterYear) throws Throwable {
		Thread.sleep(1000);
		eyear.sendKeys(pro.getProperty("EnterYear"));
		Thread.sleep(5000);
		//eenginer.sendKeys("");

		String actualText = eyere02.getText();
		System.out.println("Parts Linked value is.." + actualText);
		if (actualText.contains(pro.getProperty("EnterYear"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void EdIT() throws Exception {
		eEdit.click();
		Thread.sleep(8000);
	}

	public void Notes(String textbox, String qtydata) throws Throwable {		
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());
		int j = 0;
		int z=0;
		int k=0;
		int L=0;
		int M=0;
		for (int i = 1; i < list.size(); i++) {
			j = i+1;	
			z=i-1;
			k=i+1;
			L=i-1;
			M=i-1;
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications\"]/tbody/tr["+ j +"]/td[2]")).getText();
		    String Engine = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications\"]/tbody/tr["+ k +"]/td[3]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications_lblacesnonaces_" + z + "\"]")).getText();
			System.out.println("Type value is..." + Engine);                                                               
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.equals(pro.getProperty("EnterYear"))) && (Type.equals(pro.getProperty("Acesvalue")))&&(Engine.equals(pro.getProperty("SearchTextAcesEngine")))) {				
				
				driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications_txtapppartsnotes_"+ L +"\"]")).sendKeys(pro.getProperty("textbox"));
								
				
				driver.findElement(By.xpath("//*[@id=\"MainContent_GvApplications_txtquantity_"+ M +"\"]")).sendKeys(pro.getProperty("qtydata"));
				//enotes.clear();
				//enotes.sendKeys(pro.getProperty("textbox"));
				//eqty.clear();
				//eqty.sendKeys(pro.getProperty("qtydata"));
				
				
			} else {
				continue;
			}
			
			
		
		}
		eupdate.click();
		Thread.sleep(8000);
		}

		/*
		 * public void verifyNOTesandqty() { String Actual =
		 * enotes.getAttribute("value"); String Actual1 = eqty.getAttribute("value");
		 * String Expected = pro.getProperty("textbox"); String Expected1 =
		 * pro.getProperty("qtydata"); if (Actual.equals(Expected)) {
		 * System.out.println("*Notes* Both are same "); } if
		 * (Actual1.equals(Expected1)) { System.out.println("*qty* Both are same "); }
		 * else { System.out.println("*Notes* and Qty Both are not same"); } }
		 */

	/// Delete functionality purpose
	public void VerifyDeletefunc() throws Throwable {
		// eyear.sendKeys(pro.getProperty("acesexpectedtext2"));
		// Thread.sleep(8000);
		edelvehicle.click();
		Thread.sleep(5000);
	}

	public void Verifydatadel() {
		String Deletenotes = edeletnot.getText();
		System.out.println(Deletenotes);
		String expected = "No data available in table";
		Assert.assertEquals(expected, Deletenotes, "assert was not match");

	}

	public void SortPartDescription_TC037() {

		WebElement TogetRows = driver.findElement(By.xpath("//table[@id=\"tbl_catalog_application_grid\"]//tbody"));
		List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : " + TotalRowsList.size());

		ArrayList<String> obtainedList = new ArrayList<>();

		for (WebElement we : TotalRowsList) {
			obtainedList.add(we.getText());

		}
		System.out.println("Before sort List" + obtainedList);

		// System.out.println(obtainedList);
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
			Collections.sort(sortedList);
		}
		//Assert.assertTrue(sortedList.equals(obtainedList));

		System.out.println("After sort list" + sortedList);

	}

	// Description to start...........
	public void descripitonadd() throws Exception {	
		WebElement elementfilter1 = edescadd;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);		
		Thread.sleep(5000);
		edescadd.click();
		Thread.sleep(5000);
	}

	public void descriptionaddoption(String descriptionNotestype,String Region) throws Throwable {
		Select eset = new Select(edesnotes);
		eset.selectByVisibleText(pro.getProperty("descriptionNotestype"));
		Thread.sleep(5000);
		edessequence.sendKeys("12");
		Thread.sleep(5000);
		edesdescription.sendKeys(pro.getProperty("Region"));
		Thread.sleep(5000);
		edessave.click();
		Thread.sleep(5000);
		addalert.click();
		/*
		 * Alert alert = driver.switchTo().alert(); //
		 * logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		 * System.out.println("Alertmessage is..:" + alert.getText());
		 * alert.accept();//button[text()='OK'] Thread.sleep(5000);
		 */
		
		 driver.switchTo().window(MainWindow);
		 
		

	}

	public void Verifydescriptionadd(String descriptionNotestype,String Region) throws Throwable {
		Thread.sleep(3000);
		String Actual1 = everify1.getText();
		System.out.println("code notes type value is.. " + Actual1);
		/*String Actual2 = everify2.getText();
		System.out.println("Sequence value is.. " + Actual2);*/
		String Actual3 = everify3.getText();
		System.out.println("Description value is.. " + Actual3);
		Thread.sleep(3000);
		/*
		 * if (Actual1.contains(pro.getProperty("descriptionNotestype"))) {
		 * System.out.println("**Notestype is same**"); }
		 */
		/*if (Actual2.contains(pro.getProperty("partno"))) {
			System.out.println("**sequence value is. same**");
		}*/
		if (Actual3.equals(pro.getProperty("Region"))) {
			System.out.println("**Description value same**");
		} else {
			System.out.println("Not same Description values once again**");
		}

	}

	public void descedit() throws Exception {
			Thread.sleep(8000);
			//driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  js.executeScript("arguments[0].scrollIntoView()", edescedit); 
		  edescedit.click();
		  Thread.sleep(10000);
	}

	public void descchange(String qtydata, String notesdata) throws Throwable {			
		Thread.sleep(5000);
		Editdesaction.click();
		Thread.sleep(5000);
		edessequence.clear();
		//Thread.sleep(5000);
		edessequence.sendKeys(pro.getProperty("qtydata"));
		edesdescription.clear();
		Thread.sleep(5000);
		edesdescription.sendKeys(pro.getProperty("notesdata"));
		Thread.sleep(3000);
		edessave.click();
		Thread.sleep(2000);
		editalert.click();
		
		
		/*
		 * Alert alert = driver.switchTo().alert(); //
		 * logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		 * System.out.println("Alertmessage is..:" + alert.getText()); alert.accept();
		 * Thread.sleep(2000);
		 */
		
		driver.switchTo().window(MainWindow);
		
	}

	public void VerifyEditchange(String notesdata) throws Throwable {

		String Actual2 = everify2.getText();
		System.out.println("Sequence Edited value is.. " + Actual2);
		//String Actual3 = everify3.getText();
		//System.out.println("Description Edited value is.. " + Actual3);
		Thread.sleep(3000);
		/*
		 * if (Actual1.contains(pro.getProperty("descriptionNotestype"))) {
		 * System.out.println("**Notestype is same**"); }
		 */
		if (Actual2.contains(pro.getProperty("notesdata"))) {
			System.out.println("**sequence value is. same**");
		}
		//if (Actual3.equals(pro.getProperty("notesdata"))) {
		//	System.out.println("**Description value same**");}
		 else {
			System.out.println("Not same Description Edited values once again**");
		}

	}

	public void delete() throws Exception {
		Thread.sleep(8000);
		//driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView()", edescdele); 
	    edescdele.click();
		Thread.sleep(3000);
	}
}
