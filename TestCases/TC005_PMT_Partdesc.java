package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Partdescription_POM;
import utility.Baseclass;

public class TC005_PMT_Partdesc extends Baseclass {

	ExtentTest loginfo = null;
	Partdescription_POM partdesc;
	
	//Part Description Add

	@Given("^User will go to parts page and search for the part#$")
	public void user_will_go_to_parts_page_and_search_for_the_part() throws Throwable {

		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT PIES Description").assignCategory("PIES Description Add")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding part description Test case");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part#");

			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));

			loginfo.pass("PIES description entered successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the part description and landed in description page$")
	public void user_will_click_on_the_part_description_and_landed_in_description_page() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the part description and landed in description page");
			partdesc.descriptionclick();
			loginfo.pass("PIES description entered successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@And("^Choose the notes type dropdown, enter the notes and click on save button$")
	public void choose_the_notes_type_dropdown_enter_the_notes_and_click_on_save_button() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Choose the notes type dropdown, enter the notes and click on save button");
			partdesc.descriptiondrpdownnotes(pro.getProperty("notestype"));
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			partdesc.savebtn();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will see successfull alert and verify the record is shown in grid$")
	public void user_will_see_successfull_alert_and_verify_the_record_is_shown_in_grid() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search");
			partdesc.acceptAlert();
			partdesc.Verifydescription(pro.getProperty("descnotes"));
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			// extent.flush();

		}
	}
	
	//Part Description Edit

	@Given("^User will go to parts page and search for the part# to edit$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_edit() throws Throwable {

		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT PIES Description ").assignCategory("PIES Description Edit")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Editing part description Test case");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part# to edit");
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on part description frame and will edit the notes & saved$")
	public void user_will_click_on_part_description_frame_and_will_edit_the_notes_saved() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on part description frame and will edit the notes & saved");
			partdesc.descriptionclick();
			partdesc.editpartdesc(pro.getProperty("editdescnotes"));
			partdesc.savebtn();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfull alert and verify the record should be edited$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_edited() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the record should be edited");
			partdesc.acceptAlert();
			partdesc.EditVerifydescription(pro.getProperty("editdescnotes"));
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			 //extent.flush();

		}
	}
	
	//Part Description Delete

	@Given("^User will go to parts page and search for the part# to delete$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_delete() throws Throwable {

		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT PIES Description ").assignCategory("PIES Description Delete")
					.pass("category added ");
			test = test.createNode(Scenario.class, "Deleting part description Test case");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part# to delete");
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on part description frame and will delete the added or available record$")
	public void user_will_click_on_part_description_frame_and_will_delete_the_added_or_available_record()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on part description frame and will delete the added or available record");
			partdesc.descriptionclick();
			partdesc.deletepartdesc(pro.getProperty("descnotes"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will see successfull alert and verify the record should be deleted$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_deleted() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search");
			partdesc.DelacceptAlert();
			partdesc.DelacceptAlert();
			partdesc.VerifyDeletedescription(pro.getProperty("editdescnotes"), pro.getProperty("Deleteverifytext"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			 //extent.flush();

		}
	}

}
