package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MultiAddPom;
import utility.Baseclass;

public class TC033_MultiaddAcesRelated extends Baseclass {

	ExtentTest loginfo = null;
	MultiAddPom mpom1 = new MultiAddPom();

	@Given("^User will Click the Application page and multiadd page$")
	public void user_will_Click_the_Application_page_and_multiadd_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Check the ACES in multi add page and verify to buyerguide-TC033")
					.assignCategory("PIES MultiAdd ").pass("Aces values verified");
			test = test.createNode(Scenario.class, "Multiadd aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will Click the Application page and multiadd page");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.fail("Application and Multiadd page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}

	}

	@When("^User will select vehicle,make,model and will click the search option$")
	public void user_will_select_vehicle_make_model_and_will_click_the_search_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select vehicle,make,model and will click the search option");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will check the checkbox button and product line,part description,part number will chose$")
	public void user_will_check_the_checkbox_button_and_product_line_part_description_part_number_will_chose()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will check the checkbox button and product line,part description,part number will chose");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			// mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will successfully saved particular product line and verify that the record has come$")
	public void user_will_successfully_saved_particular_product_line_and_verify_that_the_record_has_come()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will successfully saved particular product line and verify that the record has come");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.ACesverify("EnterYear", "engine1");
			loginfo.pass("Save or Pop up aleat was working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Save or Pop up aleat was not working" + e.getMessage());
			loginfo.fail("Save or Pop up aleat was not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^Finally macthed successfully$")
	public void finally_macthed_successfully() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally macthed successfully");
			//extent.flush();
			loginfo.pass("Aces is successfully working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Aces is successfully working**");
		} catch (Exception e) {
			loginfo.fail("Aces is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Aces is not working**");
			// extent.flush();
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will create the application pages and multiadd links pages$")
	public void user_will_create_the_application_pages_and_multiadd_links_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Check the Show attributes aces and and verify to buyerguide-TC033")
					.assignCategory("PIES MultiAdd ").pass("Aces attributes values verified");
			test = test.createNode(Scenario.class, "Multiadd Aces attributes values reflected to buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links pages");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
			loginfo.fail("Application and Multiadd page is not click");
		}

	}

	@When("^: user will check the all Vehicle and make and model and click the search$")
	public void user_will_check_the_all_Vehicle_and_make_and_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle and make and model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
		}
	}

	@When("^: user will click the checkbox and use show attributes option$")
	public void user_will_click_the_checkbox_and_use_show_attributes_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the checkbox and use show attributes option");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			// mpom1.scrolldown();
			mpom1.attributepage();
			mpom1.scrolldown();
			mpom1.attributepagebt();
			mpom1.scrolldown();
			loginfo.pass("Show attributes pages Aces check is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Show attributes pages Aces check is not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Show attributes pages Aces check is not working.");
		}
	}

	@When("^: user will select the product, description, part number$")
	public void user_will_select_the_product_description_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("**Product,desc,part...is not working**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product,desc,part...is not working..");
		}
	}

	@When("^: user will click the save options and alert popup to accept it$")
	public void user_will_click_the_save_options_and_alert_popup_to_accept_it() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the save options and alert popup to accept it");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.Acesattverify("EnterYear", "engine1");
			loginfo.pass("Product add and saves working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Product add and saves not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product add and saves not working....");
		}
	}

	@Then("^: Finally Show attributes is finished$")
	public void finally_Show_attributes_is_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Show attributes is finished");
			System.out.println("**Show Aces attributes succussfully added**");
			loginfo.pass("Show Aces attributes succussfully added..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			// extent.flush();
			loginfo.fail("Show Aces attributes succussfully not added....");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Show Aces attributes succussfully not added**");
		}
	}

	// 3rd
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Given("^: user will create the application and multiadd pages$")
	public void user_will_create_the_application_and_multiadd_pages() throws Throwable {
		try {
			 //extent = setup();
			test = extent
					.createTest(Feature.class,
							"Check the Show attributes ACES and textbox with and verify to buyerguide-TC033")
					.assignCategory("PIES MultiAdd ").pass("Aces attributes textbox values verified");
			test = test.createNode(Scenario.class, "user will create the application and multiadd pages");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links pages");

			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
			loginfo.fail("Application and Multiadd page is not click");
		}
	}

	@When("^: user will check the all Vehicle,make and model click the search$")
	public void user_will_check_the_all_Vehicle_make_and_model_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make and model click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
		}
	}

	@When("^: user will click the checkbox box$")
	public void user_will_click_the_checkbox_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will click the checkbox box");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			mpom1.attributepage();
			mpom1.scrolldown();
			mpom1.attrtxtbox("textbox");
			mpom1.scrolldown();
			loginfo.pass("Show attributes pages Aces check is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Show attributes pages Aces check is not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Show attributes pages Aces check is not working.");
		}
	}

	@When("^: user will select the product, description, part numbers$")
	public void user_will_select_the_product_description_part_numbers() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part numbers");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("**Product,desc,part...is not working**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product,desc,part...is not working..");
		}
	}

	@When("^: user will click the save options and alert popup to accept it with verify$")
	public void user_will_click_the_save_options_and_alert_popup_to_accept_it_with_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the save options and alert popup to accept it with verify");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.attrtxtverify("EnterYear", "engine1");

			loginfo.pass("Product add and saves working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Product add and saves not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product add and saves not working....");
		}
	}

	@Then("^: Finally Show attributes textbox is success$")
	public void finally_Show_attributes_textbox_is_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Show attributes textbox is success");
			System.out.println("**Show Aces attributes text box succussfully added**");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Show Aces attributes text box succussfully added..");
			 //extent.flush();
		} catch (Exception e) {
			// extent.flush();
			loginfo.fail("Show Aces attributes text box succussfully not added....");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Show Aces attributes text box succussfully not added**");
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will create the application and multiadd$")
	public void user_will_create_the_application_and_multiadd() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class,
					"Check the Show textbox and dropdown values attributes ACES with and verify to buyerguide-TC033")
					.assignCategory("PIES MultiAdd").pass("PIES MultiAdd textbox and dropdown verified");
			test = test.createNode(Scenario.class, "user will create the application and multiadd");
			loginfo = test.createNode(new GherkinKeyword("Given"), "user will create the application and multiadd");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
			loginfo.fail("Application and Multiadd page is not click");
		}
	}

	@When("^: user will check the all Vehicle,make and model click$")
	public void user_will_check_the_all_Vehicle_make_and_model_click() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make and model click");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
		}
	}

	@When("^: user will click the checkbox button$")
	public void user_will_click_the_checkbox_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will click the checkbox button");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			mpom1.attributepage();
			mpom1.attributepagebt();
			mpom1.scrolldown();
			mpom1.attrtxtbox("Region");
			mpom1.scrolldown();
			loginfo.pass("Show attributes pages Aces check is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Show attributes pages Aces check is not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Show attributes pages Aces check is not working.");
		}
	}

	@When("^: user will select the product, description, part num$")
	public void user_will_select_the_product_description_part_num() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part num");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("**Product,desc,part...is not working**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product,desc,part...is not working..");
		}
	}

	@When("^: user will click the save options and alert popup to accept it with verify both$")
	public void user_will_click_the_save_options_and_alert_popup_to_accept_it_with_verify_both() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the save options and alert popup to accept it with verify both");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.attrtxtverify("EnterYear", "engine1");
			// mpom1.Acesattverify("acesexpectedtext1", "engine1");
			loginfo.pass("Product add and saves working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Product add and saves not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product add and saves not working....");
		}
	}

	@Then("^: Finally Show attributes textbox and dropdown values is success$")
	public void finally_Show_attributes_textbox_and_dropdown_values_is_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Finally Show attributes textbox and dropdown values is success");
			System.out.println("**Show Aces attributes text box succussfully added**");
			loginfo.pass("Show Aces attributes text box succussfully added..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {

			loginfo.fail("Show Aces attributes text box succussfully not added....");
			System.out.println("**Show Aces attributes text box succussfully not added**");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}