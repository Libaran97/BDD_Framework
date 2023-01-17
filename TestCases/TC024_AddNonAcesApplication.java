package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ApplicationAddAces;
import pageobjectmodel.ApplicationAddNonAces;
import utility.Baseclass;

public class TC024_AddNonAcesApplication extends Baseclass {
	ApplicationAddNonAces anpom;
	ApplicationAddAces apom;
	ExtentTest loginfo = null;

	// Application_TC004_NonAces_Add_Vehicle
	@Given("^User will click on Application and Click add button$")
	public void user_will_click_on_Application_and_Click_add_button() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Application_TC004_NonAces_Add_Vehicle")
					.assignCategory("NonAces Applicarion Tag").pass("NonAces Applicarion added");
			test = test.createNode(Scenario.class, "Adding NonAces Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on Application and Click add button");
			anpom = new ApplicationAddNonAces();
			anpom.ClickApplication();
			anpom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will select dropdown and Choose Vehicle, Make & Model$")
	public void user_will_select_dropdown_and_Choose_Vehicle_Make_Model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select dropdown and Choose Vehicle, Make & Model");
			anpom.ChooseVehicle(pro.getProperty("vehicletypename"));
			anpom.ChooseMake(pro.getProperty("makename"));
			anpom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter year$")
	public void user_will_Enter_year() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter year");
			anpom.ApplicationYear(pro.getProperty("EnterYear"));
			loginfo.pass("Year Entered in Text box");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will click non Aces Engine Radio Button$")
	public void user_will_click_non_Aces_Engine_Radio_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will click non Aces Engine Radio Button");
			anpom.checkNonAces();
			loginfo.pass("Non Aces Engine Radio Button Selected successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Enter NonAces Engine Base details$")
	public void vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Enter NonAces Engine Base details");
			anpom.EngineDetails(pro.getProperty("Cylindervalue"), pro.getProperty("Ccvalue"),
					pro.getProperty("litervalue"));
			loginfo.pass("Engine Base details Entered successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will successfully add$")
	public void user_will_successfully_added_and_verify_that_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will successfully add");
			anpom.Clicksave();

			anpom.acceptAlert();
			loginfo.pass("Non Aces Application Saved successfully & shown in grid");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that NonAces record has come$")
	public void user_will_verify_that_NonAces_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that NonAces record has come");
			anpom.ClickApplication2();
			// anpom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			anpom.ChooseMakevry(pro.getProperty("makename"));
			anpom.ChooseModelvry(pro.getProperty("modelname"));
			anpom.Clicksearch();
			anpom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			anpom.SelectsearchTextbox(pro.getProperty("SearchText1"));
			anpom.Clicksearch2();
			anpom.verifytext1(pro.getProperty("SearchText1"));
			loginfo.pass("Non Aces Application added successfully & shown in grid");

			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}
/////Adding Vehicle page//////TC019 pmt multi page ////////////
	@Given("^User will click on vehicle page and Click add button$")
	public void user_will_click_on_vehicle_page_and_Click_add_button() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Application_TC004_NonAces_Add_Vehicle")
					.assignCategory("NonAces Applicarion Tag").pass("NonAces Applicarion added");
			test = test.createNode(Scenario.class, "Adding NonAces Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on Application and Click add button");
			anpom = new ApplicationAddNonAces();
			anpom.ClickApplication();
			anpom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
 
	}

	@When("^User will select dropdown and Choose Vehicle, Make & Model vehicle page$")
	public void user_will_select_dropdown_and_Choose_Vehicle_Make_Model_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select dropdown and Choose Vehicle, Make & Model");
			anpom.ChooseVehicle01(pro.getProperty("vehicletypename0"));
			anpom.ChooseMake01(pro.getProperty("makename0"));
			anpom.ChooseModel01(pro.getProperty("modelname0"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Enter year vehicle page$")
	public void user_will_Enter_year_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter year");
			anpom.ApplicationYear01(pro.getProperty("EnterYear"));
			loginfo.pass("Year Entered in Text box");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will click non Aces Engine Radio Button vehicle page$")
	public void user_will_click_non_Aces_Engine_Radio_Button_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will click non Aces Engine Radio Button");
			anpom.checkNonAces();
			loginfo.pass("Non Aces Engine Radio Button Selected successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Enter NonAces Engine Base details vehicle page$")
	public void user_will_Enter_NonAces_Engine_Base_details_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Enter NonAces Engine Base details");
			anpom.EngineDetails(pro.getProperty("Cylindervalue"), pro.getProperty("Ccvalue"),
					pro.getProperty("litervalue"));
			loginfo.pass("Engine Base details Entered successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully add vehicle page$")
	public void user_will_successfully_add_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will successfully add");
			anpom.Clicksave();

			anpom.acceptAlert();
			loginfo.pass("Non Aces Application Saved successfully & shown in grid");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that NonAces record has come vehicle page$")
	public void user_will_verify_that_NonAces_record_has_come_vehicle_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that NonAces record has come");
			anpom.ClickApplication2();
			// anpom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			anpom.ChooseMakevry01(pro.getProperty("makename0"));
			anpom.ChooseModelvry01(pro.getProperty("modelname0"));
			anpom.Clicksearch();
			anpom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			anpom.SelectsearchTextbox(pro.getProperty("SearchText1"));
			anpom.Clicksearch2();
			anpom.verifytext1(pro.getProperty("SearchText1"));
			loginfo.pass("Non Aces Application added successfully & shown in grid");

			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	// Application_TC004_NonAces_Add_Vehicle with all engine OK 
	@Given("^User will click on Application and Click add Application$")
	public void user_will_click_on_Application_and_Click_add_Application() throws Throwable {
		try {
		//extent = setup();
			test = extent.createTest(Feature.class, "Application_TC004_NonAces_Add_Vehicle_All engine")
					.assignCategory("NonAces All year Application Tag").pass("NonAces All year Application added");
			test = test.createNode(Scenario.class, "Adding NonAces All year Application");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on Application and Click add Application");
			apom = new ApplicationAddAces();
			apom.ClickApplication();
			apom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will select dropdown & Choose Vehicle, Make and Model$")
	public void user_will_select_dropdown_Choose_Vehicle_Make_and_Model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select dropdown & Choose Vehicle, Make and Model");
			apom.ChooseVehicle(pro.getProperty("vehicletypename"));
			apom.ChooseMake(pro.getProperty("makename"));
			apom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter year in textbox$")
	public void user_will_Enter_year_in_textbox() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter year in text box");
			apom.ApplicationYear(pro.getProperty("EnterallYear"));
			loginfo.pass("Year Entered in Text box");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will select AcesEngine Radio Button$")
	public void user_will_select_AcesEngine_Radio_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will select AcesEngine Radio Button");
			apom.checkAces();
			loginfo.pass("Aces Engine Radio Button Selected successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully add the Adding NonAces All year$")
	public void user_will_successfully_add_the_Adding_NonAces_All_year() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully add the Adding NonAces All year");

			apom.Clicksave();
			apom.acceptAlert();

			loginfo.pass("NonAces Application Saved successfully & shown in grid");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that NonAces All year record has come$")
	public void user_will_verify_that_NonAces_All_year_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that the record has come");
			apom.ClickApplication2();
			// apom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			apom.ChooseMakevry(pro.getProperty("makename"));
			apom.ChooseModelvry(pro.getProperty("modelname"));
			apom.Clicksearch();
			apom.SelectFiterdropdown(pro.getProperty("SelectFilterNameyr"));
			apom.SelectsearchTextbox(pro.getProperty("EnterallYear"));
			apom.Clicksearch2();
			apom.verifytext1(pro.getProperty("SearchTextAcesallEngine"));
			apom.verifyyear(pro.getProperty("EnterallYear"));
			loginfo.pass("NonAces Application added successfully & shown in grid");

			//extent.flush();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		}

	}

	@Given("^User will click on Application and add Application$")
	public void user_will_click_on_Application_and_add_Application() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "Application_TC004_NonAces_Add_Vehicle Invalid year")
					.assignCategory("NonAces Invalid year Application Tag").pass("NonAces Invalid year Application added");
			test = test.createNode(Scenario.class, "Adding NonAces Invalid year Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on Application and add Application");
			apom = new ApplicationAddAces();
			apom.ClickApplication();
			apom.ClickAddApplication();
			loginfo.pass("Application and Application Add is clicked successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Choose Vehicle, Make and Model in dropdown$")
	public void user_will_Choose_Vehicle_Make_and_Model_in_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Choose Vehicle, Make and Model in dropdown");
			apom.ChooseVehicle(pro.getProperty("vehicletypename"));
			apom.ChooseMake(pro.getProperty("makename"));
			apom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter invalid year in textbox$")
	public void user_will_Enter_invalid_year_in_textbox() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter invalid year in textbox");

			apom.ApplicationYear(pro.getProperty("EnterInvalidYear"));
			loginfo.pass("Year Entered in Text box");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will select Acesengine Radio Button$")
	public void user_will_select_Acesengine_Radio_Button() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will select Acesengine Radio Button");
			apom.checkAces();
			loginfo.pass("Aces Engine Radio Button Selected successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will successfully add the Adding NonAces invalid year$")
	public void user_will_successfully_add_the_Adding_NonAces_invalid_year() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully add the Adding NonAces All year");
			apom.Clicksave();
			apom.acceptAlert();

			loginfo.pass("NonAces Application Saved successfully & shown in grid");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify that NonAces invalid year record has come$")
	public void user_will_verify_that_NonAces_invalid_year_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify that the record has come");
			apom.ClickApplication2();
			// apom.ChooseVehiclevry(pro.getProperty("vehicletypename0"));
			apom.ChooseMakevry(pro.getProperty("makename"));
			apom.ChooseModelvry(pro.getProperty("modelname"));
			apom.Clicksearch();
			apom.SelectFiterdropdown(pro.getProperty("SelectFilterNameyr"));
			apom.SelectsearchTextbox(pro.getProperty("EnterInvalidYear"));
			apom.Clicksearch2();
			apom.verifytext1(pro.getProperty("SearchTextAcesallEngine"));
			apom.verifyyear(pro.getProperty("EnterInvalidYear"));
			loginfo.pass("NonAces Application added successfully & shown in grid");
			//extent.flush();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//extent.flush();

		}
	}

}
