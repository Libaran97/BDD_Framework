package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ImportExcel_POM;
import pageobjectmodel.Masterproductrelated_POM;
import pageobjectmodel.PartsBom;
import utility.Baseclass;

public class TC029_Data_ImportPmt extends Baseclass {

	ExtentTest loginfo = null;
	ImportExcel_POM IE;

	@Given("^User will go to master and choose product line_import$")
	public void user_will_go_to_master_and_choose_product_line_import() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete")
					.assignCategory("Product Line Tag");
			test = test.createNode(Scenario.class, "Add product Line for import");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose product line_import");

			IE = new ImportExcel_POM();
			IE.clickproductlinecode();

			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {

			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will click on add button and enter the line code and line name_import$")
	public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name_import() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the line code and line name_import");

			IE.addcategory01();
			IE.addproductline(pro.getProperty("linecode2"), pro.getProperty("textbox"));
			IE.savebutton();
			IE.acceptAlert01();
			IE.ClickonBackButton();
			loginfo.pass("Product line trying to add & entering the value");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully alert and verify the record has come in the grid_import$")
	public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid_import() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully alert and verify the record has come in the grid_import");

			IE.verifyproductline01(pro.getProperty("linecode2"));

			System.out.println("Product Line  Added in the grid");

			loginfo.pass("Product line added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}

	}

	///// parts add///
	@Given("^User will mouseover the master and click Excel in dataimport$")
	public void user_will_mouseover_the_master_and_click_Excel_in_dataimport() throws Throwable {
		try {
		    extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for excel partspage");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouseover the master and click Excel in dataimport");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("PartAdd landing to adding page");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatype and product line$")
	public void user_will_choose_datatype_and_product_line() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "User will choose datatype and product line");

			IE.datatypepart();
			IE.productline();

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@And("^User will upload the file and click the upload button$")
	public void user_will_upload_the_file_and_click_the_upload_button() throws Throwable {
		try {
			test = extent.createTest(Feature.class, "^User will upload the file and click the upload button")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			IE.choosepart();
			IE.update();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will click the partspage and verify that part$")
	public void User_will_click_the_partspage_and_verify_that_part() throws Throwable {
		try {
			test = extent.createTest(Feature.class, "User will click the partspage and verify that part")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));

			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
		
	}

	////////////////////////////////// pies add./////////////////////////
	// import pies add//

	@Given("^User will goto master and navigate to import excel$")
	public void user_will_goto_master_and_navigate_to_import_excel() throws Throwable {
		try {
			 //extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Navigate to import excel ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will goto master and navigate to import excel");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@When("^Select Datatype and productline$")
	public void select_Datatype_and_productline() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select Datatype and productline");
			IE.datatypepies();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@And("^Choose Pies import template and click upload$")
	public void choose_Pies_import_template_and_click_upload() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Choose Pies import template and click upload");
			IE.choosepies();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^Accept the alert and verfiy Added Piesnotes$")
	public void accept_the_alert_and_verfiy_Added_Piesnotes() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Accept the alert and verfiy Added Piesnotes");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.piesdes(pro.getProperty("piesverify"));

			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}

	}

	//////////////////////// pies deleted/////////////////////////////////

	@Given("^User move to master and select import excel$")
	public void user_move_to_master_and_select_import_excel() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Navigate to import excel ");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User move to master and select import excel");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^Choose Datatype and productline$")
	public void choose_Datatype_and_productline() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Choose Datatype and productline");
			IE.datatypepies();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@And("^Select pies import delete template and click upload button$")
	public void select_pies_import_delete_template_and_click_upload_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select pies import delete template and click upload button");

			IE.choosepiesdeleted();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^Accept the alert and verify the Deleted piesnotes$")
	public void accept_the_alert_and_verify_the_Deleted_piesnotes() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Accept the alert and verify the Deleted piesnotes");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.piesdes(pro.getProperty("piesverify"));

			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	/////Application with yr range add///
	
	@Given("^User will moved master and redirect to import excel$")
	public void user_will_moved_master_and_redirect_to_import_excel() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Navigate to import excel ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will moved master and redirect to import excel");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@When("^Select the Datatype and productline$")
	public void select_the_Datatype_and_productline() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select the Datatype and productline");
			IE.datatypeapplnwith();
			IE.productline();
			
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@And("^Choose Application with year range template and click upload$")
	public void choose_Application_with_year_range_template_and_click_upload() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"Choose Application with year range template and click upload");

			IE.choosewithyradd();
			IE.update();

		}

		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}

	}

	@Then("^Accept the alert and verfiy Added Application with year range template$")
	public void accept_the_alert_and_verfiy_Added_Application_with_year_range_template() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),

					"Accept the alert and verfiy Added Application with year range template");
			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.appln(pro.getProperty("appverify"));
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	// Import Application with Year range Delete
	@Given("^User will go master and redirect to import excel$")
	public void user_will_go_master_and_redirect_to_import_excel() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Navigate to import excel ");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go master and redirect to import excel");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}

	}

	@When("^Select to Datatype and productline$")
	public void select_to_Datatype_and_productline() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select to Datatype and productline");
			IE.datatypeapplnwith();
			IE.productline();
			
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@And("^Choose Application with year range template-Delete and click upload$")
	public void choose_Application_with_year_range_template_Delete_and_click_upload() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"Choose Application with year range template-Delete and click upload");

			IE.choosewithyrdel();
			IE.update();
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	@Then("^Accept the alert and verfiy Deleted Application with year range template$")
	public void accept_the_alert_and_verfiy_Deleted_Application_with_year_range_template() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Accept the alert and verfiy Deleted Application with year range template");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.appln(pro.getProperty("appverify"));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	

	// Import price//

	@Given("^User will click on Import excel and it should redirect to import excel page$")
	public void user_will_click_on_Import_excel_and_it_should_redirect_to_import_excel_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Import price");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on Import excel and it should redirect to import excel page");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^Select Data type and Productline$")
	public void select_Data_type_and_Productline() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select Data type and Productline");
			IE.datatypeprice();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@And("^Choose file in specified folder and click upload$")
	public void choose_file_in_specified_folder_and_click_upload() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Choose file in specified folder and click upload");

			IE.chooseprice();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^Handle the alert and verify the price$")
	public void handle_the_alert_and_verify_the_price() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Handle the alert and verify the price");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.price(pro.getProperty("priceverify"));

			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	///////// import price deleted ////////////////
	@Given("^User will move on master to import excel$")
	public void user_will_move_on_master_to_import_excel() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Import Delete price ");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will move on master to import excel");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^Choose Datatype and Productline$")
	public void choose_Datatype_and_Productline() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select Data type and Productline");
			IE.datatypeprice();
			IE.productline();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@And("^Select price delete file ion folder and Click upload$")
	public void select_price_delete_file_ion_folder_and_Click_upload() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select price delete file ion folder and Click upload");

			IE.choosepricedeleted();
			IE.update();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@Then("^Accept the alert and Verify deleted price$")
	public void accept_the_alert_and_Verify_deleted_price() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Accept the alert and Verify deleted price");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.price(pro.getProperty("priceverify"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}

	///////////////////////////////// interchange
	///////////////////////////////// add//////////////////////////////////////////////////

	@Given("^User will go to master and choose the Excelinterchange$")
	public void user_will_go_to_master_and_choose_the_Excelinterchange() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete")
					.assignCategory("Parts Add Interchange").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for excel interchange");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excelinterchange");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("Add Interchange landed successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatypeinterch and productline02$")
	public void user_will_choose_datatypeinterch_and_productline02() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will choose datatypeinterch and productline02");

			IE.datatypeinterchange();
			IE.productline();

			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert messageinterchange$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_messageinterchange() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message02");

			IE.choose02();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click interchange$")
	public void User_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_interchange()
			throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click interchange");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickinterchange();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will delete successfully and verifyinterchange$")
	public void User_will_delete_successfully_and_verifyinterchange() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"), "User will delete successfully and verifyinterchange");
			IE.veriftytextinterchange();
			// IE.verifytextdel02(pro.getProperty("filenameinter"), null);
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	////////////////// interchange
	////////////////// deleted///////////////////////////////////////////

	@Given("^User will go to master and choose the Excel interchange deleted$")
	public void user_will_go_to_master_and_choose_the_Excel_interchange_deleted() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete")
					.assignCategory("Parts Deleted Interchange").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for excel interchange delete");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excel interchange deleted");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			loginfo.pass("Parts Deleted Interchange landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatypeinterch and productline02 interchange deleted$")
	public void user_will_choose_datatypeinterch_and_productline02_interchange_deleted() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatypeinterch and productline02 interchange deleted");

			IE.datatypeinterchange();
			IE.productline();

			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert message interchange deleted$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_message_interchange_deleted()
			throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message interchange deleted");

			IE.choose02deleted();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click interchange deleted$")
	public void User_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_interchange_deleted()
			throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click interchange deleted");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickinterchange();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will delete successfully and verifyinterchange interchange deleted$")
	public void User_will_delete_successfully_and_verify_interchange_deleted() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will delete successfully and verify interchange deleted");

			IE.veriftytextinterchange();
			// IE.verifytextdel02(pro.getProperty("filenameinter"), null);

			loginfo.pass("Interchange Deleted successfully");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	//Digital asset add///
	@Given("^User will go to master and choose the Excel$")
	public void user_will_go_to_master_and_choose_the_Excel() throws Throwable {
		try {
			 //extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, " Click the dataimport for Digital asset add excel  ");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose the Excel");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatype and productline$")
	public void user_will_choose_datatype_and_productline() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "User will choose datatype and productline");

			IE.datatype();
			IE.productline();

			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert message$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_message() throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message");

			IE.choose01();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click digist asset$")
	public void User_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_digist_asset()
			throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickasset();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will delete successfully and verifys$")
	public void User_will_delete_successfully_and_verifys() throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");

			IE.veriftytext();
			// IE.verifytextdeldigasset(pro.getProperty("FileName"), null);

			loginfo.pass("Digist asset uploaded successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	/// digist asset deleted //////////////
	
	@Given("^User will go to master and choose the Excel digist asset deleted$")
	public void user_will_go_to_master_and_choose_the_Excel_digist_asset_deleted() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for Digital asset del excel");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excel digist asset deleted");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatype and productline digist asset deleted$")
	public void user_will_choose_datatype_and_productline_digist_asset_deleted() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatype and productline digist asset deleted");

			IE.datatype();
			IE.productline();

			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert message digist asset deleted$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_message_digist_asset_deleted()
			throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message digist asset deleted");

			IE.choose01deleted();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click digist asset deleted$")
	public void User_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_digist_asset_deleted()
			throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click digist asset deleted ");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickasset();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will delete successfully and verifys digist asset deleted$")
	public void User_will_delete_successfully_and_verifys_digist_asset_deleted() throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will delete successfully and verifys digist asset deleted");

			IE.veriftytext();
			// IE.verifytextdeldigasset(pro.getProperty("FileName"), null);

			loginfo.pass("Digist ALL Data Deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	
	
	
	
	/// Extended Info Add////

	@Given("^User will go to master and choose the ExcelExtendedinfo$")
	public void user_will_go_to_master_and_choose_the_ExcelExtendedinfo() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for extended info add excel  ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the ExcelExtendedinfo");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("Import excel page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatypeExtendedinfo and productline(\\d+)$")
	public void user_will_choose_datatypeExtendedinfo_and_productline(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatypeExtendedinfo and productline");

			IE.datatypeExtendedinfo();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert messageextenededinfo$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_messageextenededinfo()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message");
			IE.chooseExtendedinfo();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click Extendedinfo$")
	public void user_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_Extendedinfo()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click Extendedinfo");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickExtendedInfo();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will delete successfully and verifyExtendedinfo$")
	public void user_will_delete_successfully_and_verifyExtendedinfo() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will delete successfully and verifyExtendedinfo");

			IE.verifyExtendedInfo(pro.getProperty("filenameextended"));
			//IE.deleteextendedinfo();
			//IE.veriftytextExinfo();
			//extent.flush();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	///Extended Info delete///
	
	
	@Given("^User will go to master and choose the ExcelExtendedinfo deleted$")
	public void user_will_go_to_master_and_choose_the_ExcelExtendedinfo_deleted() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for extended info del excel ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excel Extendedinfo deleted");

			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("Import excel page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatype Extendedinfo and productline(\\d+)$")
	public void user_will_choose_datatype_Extendedinfo_and_productline(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatype Extendedinfo and productline");

			IE.datatypeExtendedinfo();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert message Extenededinfo deleted$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_message_Extenededinfo_deleted()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert message");
			IE.chooseExtdeleted();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click Extendedinfo deleted$")
	public void user_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_Extendedinfo_deleted()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click Extendedinfo deleted");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickExtendedInfo();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will delete successfully and verify Extendedinfo deleted$")
	public void user_will_delete_successfully_and_verify_Extendedinfo_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will delete successfully and verify Extendedinfo deleted");

			IE.verifyExtendedInfo(pro.getProperty("filenameextended"));
			//IE.deleteextendedinfo();
			//IE.veriftytextExinfo();

		//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	///BOM add//
	@Given("^User will go the master and redirect to import excel page$")
	public void user_will_go_the_master_and_redirect_to_import_excel_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
					.pass("Import page landed");
			test = test.createNode(Scenario.class, "Import BOM Template ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go the master and redirect to import excel page");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^Select Datatype and productline in import page$")
	public void select_Datatype_and_productline_in_import_page() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Select Datatype and productline in import page");

			IE.datatypebom();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@And("^Choose BOM template and click upload$")
	public void choose_BOM_template_and_click_upload() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("And"), "Choose BOM template and click upload");
			IE.choosebom();
			IE.update();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@Then("^Accept the alert and verfiy BOM$")
	public void accept_the_alert_and_verfiy_BOM() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("Then"), "Accept the alert and verfiy BOM");
			IE.partslanding();
			IE.partsearch1(pro.getProperty("linecode2"));
			IE.clickbom();
			IE.bom(pro.getProperty("Bomverify"));

		//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//	extent.flush();

		}
	}
	
	
	///import BOm Delete//
    @Given("^User will go the master and redirect to excel import page$")
    public void user_will_go_the_master_and_redirect_to_excel_import_page() throws Throwable {
        try {
           //extent = setup();
            test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
                    .pass("Import page landed");
            test = test.createNode(Scenario.class, "Import BOM Template Delete ");
            loginfo = test.createNode(new GherkinKeyword("Given"),
                    "User will go the master and redirect to excel import page");
            IE = new ImportExcel_POM();
			IE.clickimportexcel();
            
        } catch (Exception e) {
            TestStep("Fail", driver, loginfo, e);
            System.out.println(e);
            loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
            
        }
    }

 

    @When("^Select Datatype and productline in excel import page$")
    public void select_Datatype_and_productline_in_excel_import_page() throws Throwable {
        try {
            loginfo = test.createNode(new GherkinKeyword("When"), "Select Datatype and productline in excel import page");
            IE.datatypebom();
			IE.productline();

        } catch (Exception e) {
            TestStep("Fail", driver, loginfo, e);
            System.out.println(e);
            loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
        }
        
    }

    @And("^Choose BOM delete template and click upload$")
    public void choose_BOM_delete_template_and_click_upload() throws Throwable {
        try {

            loginfo = test.createNode(new GherkinKeyword("And"),
                    "Choose BOM delete template and click upload");
            IE.choosebomdeleted();
			IE.update();
            
        } catch (Exception e) {
            TestStep("Fail", driver, loginfo, e);
            System.out.println(e);
            loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
        
        }
    }
    @Then("^Accept the alert and verfiy delete BOM$")
    public void accept_the_alert_and_verfiy_delete_BOM() throws Throwable {
        try {
            loginfo = test.createNode(new GherkinKeyword("Then"),
                    "Accept the alert and verfiy BOM");
            
            IE.partslanding();
			IE.partsearch1(pro.getProperty("linecode2"));
			IE.clickbom();
			IE.bom(pro.getProperty("Bomverify"));
      
      // extent.flush();
    }
        catch (Exception e) {
        TestStep("Fail", driver, loginfo, e);
        System.out.println(e);
        loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
       //extent.flush();
    
    }
    }
    
    ///package info addd////
    @Given("^User will go to master and choose the Excelpackageinfo$")
	public void user_will_go_to_master_and_choose_the_Excelpackageinfo() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory(" Add packageinfo")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, "Click the dataimport for package info add excel  ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excelpackageinfo");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("packageinfo page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatypepackageinfo and productline(\\d+)$")
	public void user_will_choose_datatypepackageinfo_and_productline(int arg1) throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatypepackageinfo and productline");

			IE.datatypepakageinfo();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert messages$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_messages() throws Throwable {

		try {

			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert messages packageinfo");

			IE.choosepakageinfo();
			IE.update();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click packageinfos$")
	public void user_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_packageinfos()
			throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click packageinfo");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickpackageinfo();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will delete successfully and verifypackageinfos$")
	public void user_will_delete_successfully_and_verifypackageinfos() throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will delete successfully and verifypackageinfo");
			IE.veriftytextpackageinfo();

			loginfo.pass("DELETED successfully");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

//////////////////////////////////////package info deleted ////////////////////////////////

	@Given("^User will go to master and choose the Excel packageinfo deleted$")
	public void user_will_go_to_master_and_choose_the_Excel_packageinfo_deleted() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory(" Add packageinfo")
					.pass("Part added thanks");
			test = test.createNode(Scenario.class, " Click the dataimport for package info add excel  ");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose the Excel packageinfo deleted");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();

			loginfo.pass("packageinfo page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will choose datatype packageinfo deleted and productline(\\d+)$")
	public void user_will_choose_datatype_packageinfo_and_productline(int arg1) throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatypepackageinfo and productline");

			IE.datatypepakageinfo();
			IE.productline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will choose the file and click the update and accept alert messages packageinfo deleted$")
	public void user_will_choose_the_file_and_click_the_update_and_accept_alert_messages_packageinfo_deleted()
			throws Throwable {

		try {

			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will choose the file and click the update and accept alert messages packageinfo deleted");

			IE.choose04deleted();
			IE.update();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will click the parts and Enter the partNo and click search and click packageinfo deleted$")
	public void user_will_click_the_parts_and_Enter_the_partNo_and_click_search_and_click_packageinfo_deleted()
			throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search and click packageinfo deleted");

			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickpackageinfo();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will delete successfully and verify packageinfo deleted$")
	public void user_will_delete_successfully_and_verifypackageinfo_deleted() throws Throwable {
		try {

			
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will delete successfully and verify packageinfo deleted");
			IE.veriftytextpackageinfo();

			loginfo.pass("DELETED successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
    

			///////Applicationadd//////

	@Given("^User will mouseover the master and click Excel in dataimport application$")
	public void user_will_mouseover_the_master_and_click_Excel_in_dataimport_application() throws Throwable {
	
	try {
		//extent=setup();
		test = extent.createTest(Feature.class, "User will mouseover the master and click Excel in dataimport application")
				.assignCategory("Parts Add Tag").pass("Part added thanks");
		test = test.createNode(Scenario.class, "Add product Line-import application add");
		loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line_import");
		
		IE = new ImportExcel_POM();
		IE.clickimportexcel();
		
		loginfo.pass("Application line landing to adding page");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
		TestStep("Fail", driver, loginfo, e);
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}
	@When("^User will choose datatype and product line application$")
	public void user_will_choose_datatype_and_product_line_application() throws Throwable {
		

		try {
		
			test = extent.createTest(Feature.class, "User will choose datatype and product line application")
					.assignCategory("Parts Add Tag").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import application ");
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatype and productline");
			
			IE.datatypeapplication();
			IE.productline();
			
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	    
	@And("^User will upload the file and click the upload button application$")
	public void user_will_upload_the_file_and_click_the_upload_button_application() throws Throwable {
		
		try {
			test = extent.createTest(Feature.class, "User will upload the file and click the upload button for application add")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import application ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			IE.chooseapplication();
			IE.updateapplication();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickapplication();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		   //extent.flush();
	}
	@Then("^User will click the partspage and verify that application is successfully added$")
	public void user_will_click_the_partspage_and_verify_that_application() throws Throwable {
		
		try {
			test = extent.createTest(Feature.class, "User will click the partspage and verify that application in buyersguide")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import application ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			//IE.partslanding();
			//IE.partsearch(pro.getProperty("linecode2"));
			//IE.clickapplication();
			//IE.veriftytextapplication();
			
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		  // extent.flush();
		
		
	}
///////application delete///////
	
	@Given("^User will mouseover the master and click Excel in dataimport application delete$")
	public void user_will_mouseover_the_master_and_click_Excel_in_dataimport_application_delete() throws Throwable {
		
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "User will mouseover the master and click Excel in dataimport application")
					.assignCategory("Parts Add Tag").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Add product Line-import");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line_import");
			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	
	  
	}
	@When("^user will choose datatype and product line application delete$")
	public void user_will_choose_datatype_and_product_line_application_delete() throws Throwable {
		
		try {
			
			test = extent.createTest(Feature.class, "User will choose datatype and product line application")
					.assignCategory("Parts Add Tag").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import ");
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose datatype and productline");
			IE.datatypeapplication();
			IE.productline();

			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}  
	}

	@And("^user will upload the file and click the upload button application delete$")
	public void user_will_upload_the_file_and_click_the_upload_button_application_delete() throws Throwable {
		
		try {
			test = extent.createTest(Feature.class, "^User will upload the file and click the upload button for application add")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			
			IE.chooseapplicationdeleted();
			IE.updateapplication();
			
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	   
	}

	@Then("^user will click the partspage and verify that application is successfully deleted$")
	public void user_will_click_the_partspage_and_verify_that_application_is_successfully_deleted() throws Throwable {
		try {
			test = extent.createTest(Feature.class, "User will click the partspage and verify that part")
					.assignCategory("Parts search and digist asset").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Adding partNO for import ");
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will click the parts and Enter the partNo and click search");
			
			IE.partslanding();
			IE.partsearch(pro.getProperty("linecode2"));
			IE.clickapplication();
			IE.veriftytextapplication();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		  //  extent.flush();
		
		
	}
//////////////product attribute without parttype add////
	@Given("^User will mouseover the master and click Excel in dataimport attribute type$")
	public void user_will_mouseover_the_master_and_click_Excel_in_dataimport_attribute_type() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "User will mouseover the master and click Excel in dataimport application")
			.assignCategory("Parts Add Tag").pass("Part added thanks");
			test = test.createNode(Scenario.class, "Add product Line-import");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line_import");
			
			IE = new ImportExcel_POM();
			IE.clickimportexcel();
			
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
}
	}		
		@When("^user will choose datatype and product line attribute type$")
		public void user_will_choose_datatype_and_product_line_attribute_type() throws Throwable {
		
		try {
				
				test = extent.createTest(Feature.class, "User will choose datatype and product line application")
						.assignCategory("Parts Add Tag").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will choose datatype and productline");
				
				IE.datatypeproductwithout();
				IE.productline();
				
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@And("^user will upload the file and click the upload button attribute type$")
		public void user_will_upload_the_file_and_click_the_upload_button_attribute_type() throws Throwable {

			try {
				test = extent.createTest(Feature.class, "^User will upload the file and click the upload button for application add")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will click the parts and Enter the partNo and click search");
				IE.chooseproductwithout();
				IE.update();
				
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
		   
		}

		@Then("^user will click the partspage and verify that attribute type is successfully added$")
		public void user_will_click_the_partspage_and_verify_that_attribute_type_is_successfully_added() throws Throwable {
			try {
				test = extent.createTest(Feature.class, "User will click the partspage and verify that part")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will click the parts and Enter the partNo and click search");
				IE.partslanding();
				IE.partsearch(pro.getProperty("linecode2"));
				IE.clickproductwithout();
				IE.veriftytextwithoutattribute();
				
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
			    //extent.flush();
			
		   
		}
		 ////// //////////////product attribute without parttype delete////
		
		@Given("^User will mouseover the master and click Excel in dataimport attribute type delete$")
		public void user_will_mouseover_the_master_and_click_Excel_in_dataimport_attribute_type_delete() throws Throwable {
			try {
				//extent=setup();
				test = extent.createTest(Feature.class, "User will mouseover the master and click Excel in dataimport application")
						.assignCategory("Parts Add Tag").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Add product Line-import");
				loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line_import");
				IE = new ImportExcel_POM();
				IE.clickimportexcel();
				loginfo.pass("Product line landing to adding page");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	              
		@When("^user will choose datatype and product line attribute type delete$")
		public void user_will_choose_datatype_and_product_line_attribute_type_delete() throws Throwable {

			try {
					
					test = extent.createTest(Feature.class, "User will choose datatype and product line application")
							.assignCategory("Parts Add Tag").pass("Part added thanks");
					test = test.createNode(Scenario.class, "Adding partNO for import ");
					loginfo = test.createNode(new GherkinKeyword("When"),
							"User will choose datatype and productline");
					IE.datatypeproductwithout();
					IE.productline();
					loginfo.pass("Parts page landed successfully");
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				} catch (Exception e) {
					TestStep("Fail", driver, loginfo, e);
					System.out.println(e);
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
					
		}

		@And("^user will upload the file and click the upload button attribute type delte$")
		public void user_will_upload_the_file_and_click_the_upload_button_attribute_type_delte() throws Throwable {
			try {
				test = extent.createTest(Feature.class, "^User will upload the file and click the upload button for application add")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will click the parts and Enter the partNo and click search");
				IE.chooseproductwithoutdeleted();
				IE.update();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
		}

		@Then("^user will click the partspage and verify that attribute type is successfully deleted$")
		public void user_will_click_the_partspage_and_verify_that_attribute_type_is_successfully_deleted() throws Throwable {
			try {
				test = extent.createTest(Feature.class, "User will click the partspage and verify that part")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will click the parts and Enter the partNo and click search");
				IE.partslanding();
				IE.partsearch(pro.getProperty("linecode2"));
				IE.clickproductwithout();
				IE.veriftytextwithoutattribute();
				
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
			  // extent.flush();
		}
	///////////////part deleted///////////////////
		@Given("^User will mouseover the master and click Excel in dataimport delete$")
		public void user_will_mouseover_the_master_and_click_Excel_in_dataimport_delete() throws Throwable {
			try {
			    //extent=setup();
				test = extent.createTest(Feature.class, "PMT Parts Import Add and Delete").assignCategory("Parts Add Tag")
						.pass("Part added thanks");
				test = test.createNode(Scenario.class, "Click the dataimport for excel partspage");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will mouseover the master and click Excel in dataimport delete");

				IE = new ImportExcel_POM();
				IE.clickimportexcel();

				loginfo.pass("PartAdd landing to adding page");

				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}

		}

		@When("^User will choose datatype and product line delete$")
		public void user_will_choose_datatype_and_product_line_delete() throws Throwable {
			try {

				loginfo = test.createNode(new GherkinKeyword("When"), "User will choose datatype and product line delete");

				IE.datatypepart();
				IE.productline();

				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@And("^User will upload the file and click the upload button delete$")
		public void user_will_upload_the_file_and_click_the_upload_button_delete() throws Throwable {
			try {
				test = extent.createTest(Feature.class, "^User will upload the file and click the upload button")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will upload the file and click the upload button delete");
				IE.choosepartdelete();
				IE.update();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@Then("^User will click the partspage and verify that part delete$")
		public void user_will_click_the_partspage_and_verify_that_part_delete() throws Throwable {
			try {
				test = extent.createTest(Feature.class, "User will click the partspage and verify that part")
						.assignCategory("Parts search and digist asset").pass("Part added thanks");
				test = test.createNode(Scenario.class, "Adding partNO for import ");
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will click the partspage and verify that part delete");
				IE.partslanding();
				IE.partsearch(pro.getProperty("linecode2"));
				IE.acceptAlertdel();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
			
		}

}

	
