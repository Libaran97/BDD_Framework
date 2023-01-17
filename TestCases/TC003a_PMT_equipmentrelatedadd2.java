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
import pageobjectmodel.Equipmentrelated_vehicle_make_model2;
import utility.Baseclass;

public class TC003a_PMT_equipmentrelatedadd2 extends Baseclass {

	// Pageobjectclass pom;
	Equipmentrelated_vehicle_make_model2 master;
	ExtentTest loginfo = null;

	// Master_TC003a_Adding Equipment Related vehicle type

	@Given("^User will mouse hover on Master and choose the Equipment vehicle type page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_Equipment_vehicle_type_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Adding Equipment Related vehicle type")
					.assignCategory("Equipment Related vehicle Tag").pass("Vehicle Type added thanks");
			test = test.createNode(Scenario.class, "Adding Equipment Related vehicle type");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the Equipment vehicle type page");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonvehicletype();
			loginfo.pass("Equipment type page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add button and will enter the new Equipment vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_Equipment_vehicle_type_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new Equipment vehicle type and choose the equivalent ACES & save");
			master.vehicletypename(pro.getProperty("vehicletypenameeq"));
			master.acceptAlert();
			master.ClickonBackButton();
			loginfo.pass("vehicle type Added successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the added record should be shown in Equipment vehicle grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_Equipment_vehicle_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in Equipment vehicle grid");
			master.VerifyEquipment(pro.getProperty("vehicletypenameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Master_TC003a_Editing Equipment Related vehicle type

	@Given("^User will mouse hover on Master page and edit the Equipment vehicle type page$")
	public void user_will_mouse_hover_on_Master_page_and_edit_the_Equipment_vehicle_type_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Editing Equipment Related vehicle type ")
					.assignCategory("Equipment Related vehicle Tag").pass("Vehicle type edited thanks");
			test = test.createNode(Scenario.class, "Editing Equipment Related vehicle type Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master page and edit the Equipment vehicle type page");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonvehicletypeedit();

			loginfo.pass("Equipment type page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the Edit button and will enter the new Equipment vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_Edit_button_and_will_enter_the_new_Equipment_vehicle_type_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the Edit button and will enter the new Equipment vehicle type and choose the equivalent ACES & save");
			master.vehcileediticon(pro.getProperty("vehicletypenameeq"), pro.getProperty("vehicletypenameeqedit"));
			master.acceptAlert();
			master.ClickonBackButton();
			loginfo.pass("vehicle type Added successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the edited record should be shown in Equipment vehicle grid$")
	public void user_will_verify_the_edited_record_should_be_shown_in_Equipment_vehicle_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the edited record should be shown in Equipment vehicle grid");
			master.VerifyEquipmentedit(pro.getProperty("vehicletypenameeqedit"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
	// Master_TC003a_Adding Equipment Related vehicle type group

	@Given("^User will mouse hover on Master and choose the Equipment vehicle type group page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_Equipment_vehicle_type_group_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Adding Equipment Related vehicle type group")
					.assignCategory("Equipment Related vehicle Type Group Tag").pass("Vehicle Type group added thanks");
			test = test.createNode(Scenario.class, "Adding Equipment Related vehicle type group Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the Equipment vehicle type group page");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonvehicletypgroup();

			loginfo.pass("Equipement type group page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will click on the add button and will enter the Equipment vehicle type group and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_Equipment_vehicle_type_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the Equipment vehicle type group and choose the equivalent ACES & save");
			master.vehicletypegroups(pro.getProperty("vehicletypenameeqedit"));
			master.acceptAlert();
			master.ClickonBackButton2();
			loginfo.pass("Equipement type group Added successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will verify the added record should be shown in Equipment vehicle type group grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_Equipment_vehicle_type_group_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in Equipment vehicle type group grid");
			master.VerifyequVehicletypegroup(pro.getProperty("vehicletypenameeqedit"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Master_TC003a_Editing Equipment Related vehicle type group

	@Given("^User will mouse hover on Master and edit the Equipment vehicle type group page$")
	public void user_will_mouse_hover_on_Master_and_edit_the_Equipment_vehicle_type_group_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Editing Equipment Related vehicle type group ")
					.assignCategory("Equipment Related vehicle type group edit Tag")
					.pass("Vehicle type group edited thanks");
			test = test.createNode(Scenario.class, "Editing Equipment Related vehicle type group edit Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and edit the Equipment vehicle type group page");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonvehicletypgroupedit();
			loginfo.pass("Equipement type group page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the edit button and will enter the Equipment vehicle type group and choose the equivalent ACES & save$")
	public void user_will_click_on_the_edit_button_and_will_enter_the_Equipment_vehicle_type_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the edit button and will enter the Equipment vehicle type group and choose the equivalent ACES & save");
			master.vehicletypegroupsedit(pro.getProperty("vehicletypenameeqedit"),
					pro.getProperty("vehicletypenameeq"));
			master.acceptAlert();
			master.ClickonBackButton2();
			loginfo.pass("Equipement type group Added successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will verify the edited record should be shown in Equipment vehicle type group grid$")
	public void user_will_verify_the_edited_record_should_be_shown_in_Equipment_vehicle_type_group_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the edited record should be shown in Equipment vehicle type group grid");
			master.VerifyequVehicletypegroupedit(pro.getProperty("vehicletypenameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Master_TC003a_Adding Equipment Related add make

	@Given("^User will mouse hover on master and choose the make for equipment$")
	public void user_will_mouse_hover_on_master_and_choose_the_make_for_equipment() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Adding Equipment Related add Make")
					.assignCategory("Equipment Related Make Tag").pass("Make added thanks");
			test = test.createNode(Scenario.class, "Adding Equipment Related add Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the make for equipment");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonmake();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will click on the add button and will choose the added Equipment vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_Equipment_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will choose the added Equipment vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakename();
			master.newmakename(pro.getProperty("makenameeq"));
			master.acceptAlert();
			master.ClickonBackButton1();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the added Equipment record should be shown in make grid$")
	public void user_will_verify_the_added_Equipment_record_should_be_shown_in_make_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added Equipment record should be shown in make grid");
			master.VerifyMake(pro.getProperty("makenameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Master_TC003a_Editing Equipment Related Make

	@Given("^User will mouse hover on master and edit the make for equipment$")
	public void user_will_mouse_hover_on_master_and_edit_the_make_for_equipment() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Editing Equipment Related Make")
					.assignCategory("Equipment Related Make Tag").pass("Equipment make edited thanks");
			test = test.createNode(Scenario.class, "editing equipment Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and edit the make for equipment");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonmakeedit();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will click on the edit button and will enter Equipment vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_edit_button_and_will_enter_Equipment_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the edit button and will enter Equipment vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakenameedit(pro.getProperty("makenameeqedit"));
			master.acceptAlert();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will verify the edited Equipment record should be shown in make grid$")
	public void user_will_verify_the_edited_Equipment_record_should_be_shown_in_make_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the edited Equipment record should be shown in make grid");
			master.VerifyMake(pro.getProperty("makenameeqedit"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Master_TC003a_Adding Equipment Related Model

	@Given("^User will mouse hover on master and choose the model for equipment$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_for_equipment() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Adding Equipment Related Model")
					.assignCategory("Equipment Related Model Tag").pass("Equipment Model added thanks");
			test = test.createNode(Scenario.class, "Adding Equipment Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the model for equipment");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonmodel();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will mouse hover on master and choose the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_click_on_the_add_button_and_will_choose_the_added_for_equipment_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelname();
			master.addmodeldrp2(pro.getProperty("makenameeq"));
			master.modelnameadd(pro.getProperty("modelnameeq"));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will successfully Equipment added and verify that the record has come$")
	public void user_will_successfully_Equipment_added_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully Equipment added and verify that the record has come");
			master.acceptAlert();
			master.acceptAlert();
			master.ClickonBackButton1();
			master.Verifymodeleq(pro.getProperty("modelnameeq"),pro.getProperty("makenameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		}
	}
	// Master_TC003a_Editing Equipment Related Model

	@Given("^User will mouse hover on master and edit the model for equipment$")
	public void user_will_mouse_hover_on_master_and_edit_the_model_for_equipment() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Master_TC003a_Editing Equipment Related Model")
					.assignCategory("Equpment Related Model Tag").pass("Equipment Model edited thanks");
			test = test.createNode(Scenario.class, "Editing Equipment Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and edit the model for equipment");
			master = new Equipmentrelated_vehicle_make_model2();
			master.clickonmodeledit();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will mouse hover on master and edit the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_edit_the_model_click_on_the_add_button_and_will_choose_the_added_for_equipment_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and edit the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelnameedit(pro.getProperty("modelnameeqedit"),pro.getProperty("makenameeq"));
			master.acceptAlert();
			master.acceptAlert();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will successfully Equipment edited and verify that the record has come$")
	public void user_will_successfully_Equipment_edited_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully Equipment edited and verify that the record has come");
			master.Verifymodeleq(pro.getProperty("modelnameeq"),pro.getProperty("makenameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		}
	}

}
