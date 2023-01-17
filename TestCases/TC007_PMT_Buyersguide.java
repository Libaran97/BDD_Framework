package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Buyersguide_POM;
import utility.Baseclass;

public class TC007_PMT_Buyersguide extends Baseclass {

	ExtentTest loginfo = null;
	Buyersguide_POM bguide;

	@Given("^User will go to parts page and search for a part# and will tie-up the application$")
	public void user_will_go_to_parts_page_and_search_for_a_part_and_will_tie_up_the_application() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT parts buyers guide").assignCategory("Parts Buyersguide")
					.pass("Buyers guide add");
			test = test.createNode(Scenario.class, "Adding application through buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a part# and will tie-up the application");
			bguide = new Buyersguide_POM();
			bguide.partslanding();
			bguide.partsearch(pro.getProperty("partnoenter"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on buyersguide frame and choose the vehicle, make, model & search$")
	public void user_will_click_on_buyersguide_frame_and_choose_the_vehicle_make_model_search() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on buyersguide frame and choose the vehicle, make, model & search");
			bguide.buyerguideclick();
			bguide.apppartsvehicldropdown(pro.getProperty("vehicletypename"));
			bguide.apppartsmakedropdown(pro.getProperty("makename"));
			System.out.println("Print-Navigation");
			bguide.apppartsmodeldropdown(pro.getProperty("modelname"));
			bguide.appartsenginetextbox();
			bguide.apppartsearch();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@And("^User will choose an enginebase and click on save$")
	public void user_will_choose_an_enginebase_and_click_on_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will choose an enginebase and click on save");
			//bguide.apppartsenginebase();
			bguide.Alcheck();
			bguide.savebtn();
			bguide.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfull alert and verify the reocrd has shown in the below grid$")
	public void user_will_see_successfull_alert_and_verify_the_reocrd_has_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will see successfull alert and verify the reocrd has shown in the below grid");
			bguide.bguideverification();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	
	
	
	@Given("^User will go to parts page and search for a part# will edit notes$")
	public void user_will_go_to_parts_page_and_search_for_a_part_will_edit_notes() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT parts buyers guide").assignCategory("Parts Buyersguide Edit")
					.pass("Buyersguide edit");
			test = test.createNode(Scenario.class, "Edit Application through buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a part# will edit notes");
			bguide = new Buyersguide_POM();
			bguide.partslanding();
			bguide.partsearch(pro.getProperty("partnoenter"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on buyers guide frame, show grid will be seen along with application & edit an application$")
	public void user_will_click_on_buyers_guide_frame_show_grid_will_be_seen_along_with_application_edit_an_application()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on buyers guide frame, show grid will be seen along with application & edit an application");
			bguide.buyerguideclick();
			bguide.editappparts();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@And("^User will enter notes in notes textbox and click on save$")
	public void user_will_enter_notes_in_notes_textbox_and_click_on_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter notes in notes textbox and click on save");
			bguide.apppartsnote(pro.getProperty("apppartnotes"));
			bguide.updatebtn();
			bguide.acceptAlert();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will see succesfull alert and verify the notes added$")
	public void user_will_see_succesfull_alert_and_verify_the_notes_added() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see succesfull alert and verify the notes added");
			bguide.bguideverification();
		
			// bguide.acceptAlert();
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Given("^User will go to parts page and search for a part# to delete the application$")
	public void user_will_go_to_parts_page_and_search_for_a_part_to_delete_the_application() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT parts buyers guide").assignCategory("Parts Buyersguide Delete")
					.pass("Buyersguide Application delete");
			test = test.createNode(Scenario.class, "Delete Application through buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a part# to delete the application");
			bguide = new Buyersguide_POM();
			bguide.partslanding();
			bguide.partsearch(pro.getProperty("partvalue1"));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on buyers guide frame, choose the application and click on delete$")
	public void user_will_click_on_buyers_guide_frame_choose_the_application_and_click_on_delete() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on buyers guide frame, choose the application and click on delete");
			bguide.buyerguideclick();
			bguide.deletebuyerappln();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will see succesfull alert and verify the application is deleted from the show grid$")
	public void user_will_see_succesfull_alert_and_verify_the_application_is_deleted_from_the_show_grid()throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see succesfull alert and verify the application is deleted from the show grid");
			bguide.acceptAlert1();
			bguide.deleteAlert();
			bguide.bguideverificationdel();
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

}
