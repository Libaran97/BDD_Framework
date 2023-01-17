package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Applicationrelated_vehicle_make_model;
import utility.Baseclass;

public class TC003_PMT_Master_Applicationrelated extends Baseclass {

	// Pageobjectclass pom;
	Applicationrelated_vehicle_make_model master;
	ExtentTest loginfo = null;

	@Given("^User will mouse hover on Master and choose the vehicle type page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_vehicle_type_page() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Vehicle")
					.assignCategory("Master-Application Related vehicle").pass("vehicle create");
			test = test.createNode(Scenario.class, "Adding Application Related vehicle type, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the vehicle type page");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletype();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_vehicle_type_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save");
			master.vehicletypename(pro.getProperty("vehicletypename0"));
			master.acceptAlert();
			master.Clickonbackbtn();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in vehicle grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_vehicle_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the added record should be shown in vehicle grid");
			master.VerifyVehicle(pro.getProperty("vehicletypename0"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}

	}

	///////////////// Tc019_Pmt_mutiladd////////Adding Application Related vehicle
	///////////////// group///////////

	@Given("^User will mouse hover Master and choose vehicle type group pages$")
	public void user_will_mouse_hover_Master_and_choose_vehicle_type_group_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Vehicle Type Group")
					.assignCategory("Master-Application Related Vehicle Type Group")
					.pass("Vehicle Type Group added thanks");
			test = test.createNode(Scenario.class,
					"Adding Application Related vehicle type group, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the vehicle type group page");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save$")
	public void user_will_click_the_add_button_and_will_enter_the_new_vehicle_type_group_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save");
			master.vehicletypegroups01(pro.getProperty("vehicletypename0"), pro.getProperty("Equchose"));
			master.acceptAlert();
			master.accepalert1model();
			master.Clickonbackbtn1();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in vehicle type group in the grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_vehicle_type_group_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in vehicle type group in the grid");
			master.VerifyVehicletypegroup01(pro.getProperty("vehicletypename0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group verify successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}
	/////////// tc019 pmt milti make ////

	@Given("^User will mouse hover on master and choose the make multiaddmake$")
	public void user_will_mouse_hover_on_master_and_choose_the_make_multiaddmake() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Make")
					.assignCategory("Master-Application Related Make").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the make");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Make selected successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save multiaddmake$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save_multiaddmake()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakename01();
			master.newmakename01(pro.getProperty("makename0"));
			master.acceptAlertformake();
			master.Clickonbackbtn2();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in make grid multiaddmake$")
	public void user_will_verify_the_added_record_should_be_shown_in_make_grid_multiaddmake() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the added record should be shown in make grid");

			master.VerifyMake01(pro.getProperty("makename0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}
	/////Tco19////mutiladd //////

	@Given("^User will mouse hover on master , choose the model$")
	public void user_will_mouse_hover_on_master_choose_the_model() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Model")
					.assignCategory("Master-Application Related Model").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part#");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmodel();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_vehicle_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelname01();
			master.addmodeldrp01();
			master.modelnameadd01(pro.getProperty("modelname0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will successfully added , verify that the record has come\\.$")
	public void user_will_successfully_added_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			master.acceptAlert();
			master.Clickonbackbtn2();
			master.VerifyModel01(pro.getProperty("modelname0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			// extent.flush();

		}
	}

	// Edit vehicle
	@Given("^User will mouse over on Master and choose the vehicle type page$")
	public void user_will_mouse_over_on_Master_and_choose_the_vehicle_type_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Edit Vehicle")
					.assignCategory("Master-Application Related vehicle").pass("Vehicle Edited thanks");
			test = test.createNode(Scenario.class, "Editing Application Related vehicle type");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on Master and choose the vehicle type page$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletype();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will Select vehicle type, Click edit and will Edit vehicle type and save$")
	public void user_will_Select_vehicle_type_Click_edit_and_will_Edit_vehicle_type_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will Select vehicle type, Click edit and will Edit vehicle type and save$");
			master.SelectVehicle(pro.getProperty("vehicletypename0"));
			master.Editvehicletypename(pro.getProperty("vehicletypename"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type Edited successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the Edited record should be shown in vehicle grid$")
	public void user_will_verify_the_Edited_record_should_be_shown_in_vehicle_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the Edited record should be shown in vehicle grid$");
			master.VerifyVehicle(pro.getProperty("vehicletypename"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Add vehicle type group

	@Given("^User will mouse hover on Master and choose the vehicle type group page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_vehicle_type_group_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Vehicle Type Group")
					.assignCategory("Master-Application Related Vehicle Type Group")
					.pass("Vehicle Type Group added thanks");
			test = test.createNode(Scenario.class,
					"Adding Application Related vehicle type group, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the vehicle type group page");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_vehicle_type_group_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save");
			master.vehicletypegroups(pro.getProperty("vehicletypename0"), pro.getProperty("Equchose"));
			master.acceptAlert();
			//master.Clickonbackbtn();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in vehicle type group grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_vehicle_type_group_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in vehicle type group grid");
			master.VerifyVehicletypegroup(pro.getProperty("vehicletypename0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group verify successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Add make

	@Given("^User will mouse hover on master and choose the make$")
	public void user_will_mouse_hover_on_master_and_choose_the_make() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Make")
					.assignCategory("Master-Application Related Make").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the make");
			master = new Applicationrelated_vehicle_make_model();

			master.clickonmake();

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Make selected successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakename();
			master.newmakename(pro.getProperty("makename0"));
			master.acceptAlertformake();
			master.accpalertmake();
			master.Clickonbackbtn2();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will verify the added record should be shown in make grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_make_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the added record should be shown in make grid");
			master.VerifyMake(pro.getProperty("makename0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	// Add Model

	@Given("^User will mouse hover on master and choose the model$")
	public void user_will_mouse_hover_on_master_and_choose_the_model() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Add Model")
					.assignCategory("Master-Application Related Model").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part#");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmodel();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_click_on_the_add_button_and_will_choose_the_added_vehicle_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelname();
			master.addmodeldrp2();
			master.modelnameadd(pro.getProperty("modelname0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will successfully added and verify that the record has come\\.$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			master.acceptAlert();
			master.accpalert1();
			master.VerifyModel(pro.getProperty("modelname0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			//extent.flush();

		}

	}

	// Edit Vehical related

	@Given("^User Will Mouse over on master and choose model$")
	public void user_Will_Mouse_over_on_master_and_choose_Vehicle() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Edit Model")
					.assignCategory("Master-Application Related Edit Model").pass("category Edited thanks");
			test = test.createNode(Scenario.class, "Editing Application Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"), "^User Will Mouse over on master and choose model$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmodel3();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@When("^User will search Model and click edit$")
	public void user_will_search_Model_and_click_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will search Model and click edit");
			master.SeletModel(pro.getProperty("modelname"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will edit model name and click save and accept alert$")
	public void user_will_edit_model_name_and_click_save_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will edit model name and click save and accept alert$");
			master.Editmodelname(pro.getProperty("modelname0"));
			master.acceptAlertformodel();
			master.accepalert1model();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will Verify the Model is edited$")
	public void user_will_Verify_the_Model_is_edited() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "^User will Verify the Model is edited$");
			master.VerifyModel(pro.getProperty("modelname0"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Given("^User will mouse over on master and choose the make$")
	public void user_will_mouse_over_on_master_and_choose_the_make() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Edit Make")
					.assignCategory("Master-Application Related Make").pass("category Edited thanks");
			test = test.createNode(Scenario.class, "Editing Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on master and choose the make$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Make selected successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select make, Edit make name & save$")
	public void user_will_select_make_Edit_make_name_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "^User will select make, Edit make name & save$");
			master.SearchMake(pro.getProperty("makename0"));
			master.Editmakename(pro.getProperty("makename"));
			master.acceptAlertformake();
			master.acceptAlert1make();
			master.Clickonbackbtn2();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the Edited record should be shown in make grid$")
	public void user_will_verify_the_Edited_record_should_be_shown_in_make_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the Edited record should be shown in make grid$");

			master.VerifyMake(pro.getProperty("makename"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Vehicle type group edit//

	@Given("^User will mouse over on Master and choose the vehicle type group page$")
	public void user_will_mouse_over_on_Master_and_choose_the_vehicle_type_group_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Edit Vehicle Group")
					.assignCategory("Master-Application Related vehicle").pass("category Edited thanks");
			test = test.createNode(Scenario.class, "Editing Application Related vehicle type group");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on Master and choose the vehicle type group page$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select vehicle group, click edit and will edit vehicle type group name & save$")
	public void user_will_select_vehicle_group_click_edit_and_will_edit_vehicle_type_group_name_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will select vehicle group, click edit and will edit vehicle type group name & save$");
			master.SelectVehicletypegroup(pro.getProperty("vehicletypename0"));

			master.Editvehicletypegroups(pro.getProperty("vehicletypename"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Edited successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the Edited record should be shown in vehicle type group grid$")
	public void user_will_verify_the_Edited_record_should_be_shown_in_vehicle_type_group_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the Edited record should be shown in vehicle type group grid$");
			master.VerifyVehicletypegroup(pro.getProperty("vehicletypename"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group verify successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse over on master and choose the make for delete$")
	public void user_will_mouse_over_on_master_and_choose_the_make_for_delete() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Delete Make")
					.assignCategory("Master-Application Related Make").pass("category Deleted thanks");
			test = test.createNode(Scenario.class, "Delete Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on master and choose the make for delete$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Make selected successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select make, delete make name & save$")
	public void user_will_select_make_delete_make_name_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "^User will select make, delete make name & save$");
			master.SearchMake(pro.getProperty("makename"));
			master.Deletemakename();
			master.acceptAlertformake();
			master.acceptAlertformake();

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the make is deleted or not$")
	public void user_will_verify_the_make_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "^User will verify the make is deleted or not$");

			master.VerifyDeleteMake(pro.getProperty("makename"), pro.getProperty("DeleteProducttxt"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse over on master and choose the make for delete-Car Test-two$")
	public void user_will_mouse_over_on_master_and_choose_the_make_for_delete_Car_Test_two() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Delete Make")
					.assignCategory("Master-Application Related Make").pass("category Deleted thanks");
			test = test.createNode(Scenario.class, "Delete car test two Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on master and choose the make for delete-Car Test-two$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Make selected successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select make, delete make name & save-Car Test-two$")
	public void user_will_select_make_delete_make_name_save_Car_Test_two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will select make, delete make name & save-Car Test-two$");
			master.SearchMake02(pro.getProperty("makename0"));
			master.Deletemakename();
			master.acceptAlertformake();
			master.acceptAlertformake();

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the make is deleted or not-Car Test-two$")
	public void user_will_verify_the_make_is_deleted_or_not_Car_Test_two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the make is deleted or not-Car Test-two$");

			master.VerifyDeleteMake02(pro.getProperty("makename0"), pro.getProperty("DeleteProducttxt"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse over on Master and choose the vehicle type group for delete$")
	public void user_will_mouse_over_on_Master_and_choose_the_vehicle_type_group_for_delete() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Delete Vehicle Group")
					.assignCategory("Master-Application Related vehicle").pass("Vehicle Group Deleted thanks");
			test = test.createNode(Scenario.class, "Delete Application Related vehicle type group");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on Master and choose the vehicle type group for delete$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select vehicle group, click Delete and accept alert$")
	public void user_will_select_vehicle_group_click_Delete_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will select vehicle group, click Delete and accept alert$");
			master.SelectVehicletypegroup(pro.getProperty("vehicletypename"));
			master.DeleteVehicleTypegroup();
			master.acceptAlert();
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Edited successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the vehicle type group deleted or not$")
	public void user_will_verify_the_vehicle_type_group_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the Edited record should be shown in vehicle type group grid$");
			master.VerifyDeleteVehicletypegroup(pro.getProperty("vehicletypename"),
					pro.getProperty("DeleteProducttxt"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group delete verify successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse over on Master and choose the vehicle type group for delete-car test two$")
	public void user_will_mouse_over_on_Master_and_choose_the_vehicle_type_group_for_delete_car_test_two()
			throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT MasterApplication related List-Delete Vehicle Group")
					.assignCategory("Master-Application Related vehicle").pass("Vehicle Group Deleted thanks");
			test = test.createNode(Scenario.class, "Delete Application Related vehicle type group");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"^User will mouse over on Master and choose the vehicle type group for delete$");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select vehicle group, click Delete and accept alert-car test two$")
	public void user_will_select_vehicle_group_click_Delete_and_accept_alert_car_test_two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"^User will select vehicle group, click Delete and accept alert$");
			master.SelectVehicletypegrouptest02(pro.getProperty("vehicletypename0"));
			master.DeleteVehicleTypegroup();
			master.acceptAlert();
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Edited successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the vehicle type group deleted or not-car test two$")
	public void user_will_verify_the_vehicle_type_group_deleted_or_not_car_test_two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"^User will verify the Edited record should be shown in vehicle type group grid$");
			master.VerifyDeleteVehicletypegroup(pro.getProperty("vehicletypename0"),
					pro.getProperty("DeleteProducttxt"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group delete verify successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

}
