package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ApplicationAddAces;
import utility.Baseclass;

public class TC023_AddAcesApplication extends Baseclass {
	ApplicationAddAces apom;
	ExtentTest loginfo = null;

	@Given("^User will click on the Application and Click add button$")
	public void user_will_click_on_the_Application_and_Click_add_button() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Application Page").assignCategory("Aces Applicarion")
					.pass("Aces Applicarion added");
			test = test.createNode(Scenario.class, "Adding Aces Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on the Application and Click add button");

			apom = new ApplicationAddAces();
			apom.ClickApplication();
			apom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Application or Application Add is not click" + e.getMessage());
			loginfo.fail("Application or Application Add is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will select the dropdown and Choose Vehicle, Make & Model$")
	public void user_will_select_the_dropdown_and_Choose_Vehicle_Make_Model() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the dropdown and Choose Vehicle, Make & Model");
			apom.ChooseVehicle(pro.getProperty("vehicletypname0"));

			apom.ChooseMake(pro.getProperty("makename"));

			apom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected" + e.getMessage());
			loginfo.fail("Vehicle, Make & Model dropdown not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter the year$")
	public void user_will_Enter_the_year() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter the year");

			apom.ApplicationYear(pro.getProperty("EnterYear"));
			loginfo.pass("Year Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Year Not Entered" + e.getMessage());
			loginfo.fail("Year Not Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will click Aces Engine Radio Button$")
	public void user_will_click_Aces_Engine_Radio_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will click Aces Engine Radio Button");
			apom.checkAces();
			loginfo.pass("Aces Engine Radio Button Selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Aces Engine Radio Button Not checked" + e.getMessage());
			loginfo.fail("Aces Engine Radio Button Not checked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Select Engine Base in dropdown$")
	public void user_will_Select_Engine_Base_in_dropdown() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Select Engine Base in dropdown");

			//apom.ChooseEngineBase(pro.getProperty("engine1")); gogoogogogog
			loginfo.pass("Engine Base Dropdown Selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Engine Base Dropdown Not Selected" + e.getMessage());
			loginfo.fail("Engine Base Dropdown Not Selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully added$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will successfully added");

			apom.Clicksave();
			apom.acceptAlert();

			loginfo.pass("Aces Application Saved successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Aces Application Not Saved" + e.getMessage());
			loginfo.fail("Aces Application Not Saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that the record has come$")
	public void user_will_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that the record has come");
			apom.ClickApplication2();
			// apom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			apom.ChooseMakevry(pro.getProperty("makename"));
			apom.ChooseModelvry(pro.getProperty("modelname"));
			apom.Clicksearch();
			apom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			apom.SelectsearchTextbox(pro.getProperty("SearchTextAcesEngine"));
			apom.Clicksearch2();
			apom.verifytext1(pro.getProperty("SearchTextAcesEngine"));
			loginfo.pass("Aces Application added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Aces Application Not verify " + e.getMessage());
			loginfo.fail("Aces Application Not added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		}
	}

	@Given("^User will click on Application and Click add$")
	public void user_will_click_on_Application_and_Click_add() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Application Page")
					.assignCategory("Aces All engine Applicarion").pass("Aces All engine Applicarion added");
			test = test.createNode(Scenario.class, "Adding Aces All engine Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click on Application and Click add");

			apom = new ApplicationAddAces();
			apom.ClickApplication();
			apom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Application or Application Add is not click" + e.getMessage());
			loginfo.fail("Application or Application Add is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will select dropdown and Choose Vehicle, Make and Model$")
	public void user_will_select_dropdown_and_Choose_Vehicle_Make_and_Model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select dropdown and Choose Vehicle, Make and Model");
			apom.ChooseVehicle(pro.getProperty("vehicletypname0"));

			apom.ChooseMake(pro.getProperty("makename"));

			apom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected" + e.getMessage());
			loginfo.fail("Vehicle, Make & Model dropdown not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter year in text box$")
	public void user_will_Enter_year_in_text_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter year in text box");

			apom.ApplicationYear(pro.getProperty("EnterYear"));
			loginfo.pass("Year Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Year Not Entered" + e.getMessage());
			loginfo.fail("Year Not Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will select Aces Engine Radio Button$")
	public void user_will_select_Aces_Engine_Radio_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will select Aces Engine Radio Button");
			apom.checkAces();
			loginfo.pass("Aces Engine Radio Button Selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Aces Engine Radio Button Not checked" + e.getMessage());
			loginfo.fail("Aces Engine Radio Button Not checked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will successfully added the Adding Aces All engine$")
	public void user_will_successfully_added_the_Adding_Aces_All_engine() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added the Adding Aces All engine");

			apom.Clicksave();
			apom.acceptAlert();

			loginfo.pass("Aces Application Saved successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Aces Application Not Saved" + e.getMessage());
			loginfo.fail("Aces Application Not Saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that Aces All engine record has come$")
	public void user_will_verify_that_Aces_All_engine_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that the record has come");
			apom.ClickApplication2();
			// apom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			apom.ChooseMakevry(pro.getProperty("makename"));
			apom.ChooseModelvry(pro.getProperty("modelname"));
			apom.Clicksearch();
			apom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			apom.SelectsearchTextbox(pro.getProperty("SearchTextAcesallEngine"));
			apom.Clicksearch2();
			apom.verifytext1(pro.getProperty("SearchTextAcesallEngine"));
			loginfo.pass("Aces Application added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Aces Application Not verify " + e.getMessage());
			loginfo.fail("Aces Application Not added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		}

	}
}
