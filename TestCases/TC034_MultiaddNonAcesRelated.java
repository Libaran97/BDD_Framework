package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MultiAddPom;
import utility.Baseclass;

public class TC034_MultiaddNonAcesRelated extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1 = new MultiAddPom();

	// Check the Non Aces files in multi add [TC034]
	@Given("^: user will create the application pages$")
	public void user_will_create_the_application_pages() throws Throwable {

		try {
			extent = setup();
			test = extent.createTest(Feature.class, "TC017_Check the Non Aces in vehicle_Mul")
					.assignCategory("MultiAdd NonAces Vehicle Tag").pass("Non Aces values verified");
			test = test.createNode(Scenario.class, "Multiadd Non-aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"), "user will create the application pages");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will check the all$")
	public void user_will_check_the_all() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			mpom1.checkallbox();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all part types$")
	public void user_will_check_the_all_part_types() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all part types");
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will successfully saved particular non aces product line and verify that the record has come$")
	public void user_will_successfully_saved_particular_non_aces_product_line_and_verify_that_the_record_has_come()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),

					"User will successfully saved particular non aces product line and verify that the record has come");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			//mpom1.NonACesverify("EnterInvalidYear", "SearchTextAcesallEngine");
			mpom1.NonACesverify01("EnterInvalidYear");
			loginfo.pass("Save or Pop up aleat was working");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the Show attributes non ACES[TC034]
	@Given("^: user will create the application pages and multiadd pages$")
	public void user_will_create_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "TC017_Check the Non Aces attributes files in vehicle_Mul")
					.assignCategory("MultiAdd Non Aces attibute-Tag ").pass("Non Aces attributes values verified");
			test = test.createNode(Scenario.class, "Multiadd Non-aces attributes values reflected to buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd pages");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all Vehicle,make and model and click the search$")
	public void user_will_check_the_all_Vehicle_make_and_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make and model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			mpom1.checkallbox();
			loginfo.pass("Multi add landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will check the checkbox and use nonaces attributes$")
	public void user_will_check_the_checkbox_and_use_nonaces_attributes() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox and use nonaces attributes");
			
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			mpom1.attributepage10();
			mpom1.scrolldown();
			mpom1.Attrvalues(pro.getProperty("Region"));
			mpom1.scrolldown();
			loginfo.pass("Show non aces attributes pages is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^:  user will select the product, description, part number$")
	public void user_will_select_the_product_description_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will do save option and alert popup to accept or not$")
	public void user_will_do_save_option_and_alert_popup_to_accept_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will do save option and alert popup to accept or not");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			//mpom1.NonAcesattverify("EnterInvalidYear", "SearchTextAcesallEngine");
			mpom1.NonAcesattverify("EnterInvalidYear");
			loginfo.pass("Product,desc,part...is working");
			System.out.println("**Show non-aces attributes succussfully added**");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

}
