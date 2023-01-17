package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Digitalasset_POM;
import pageobjectmodel.Partdescription_POM;

import utility.Baseclass;

public class TC008_PMT_Partdigitalasset extends Baseclass {

	Digitalasset_POM dat;
	ExtentTest loginfo = null;
	Partdescription_POM partdesc;

	// Digital asset add
	@Given("^User will click on parts page and enter the part# and click on the digital asset tab$")
	public void user_will_click_on_parts_page_and_enter_the_part_and_click_on_the_digital_asset_tab() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Digital Asset").assignCategory("Digital Asset")
					.pass("Image Asset added");
			test = test.createNode(Scenario.class, "Adding Image");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and enter the part# and click on the digital asset tab");
			dat = new Digitalasset_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			dat.clickasset();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// Baseclass.updateTestLinkResult("01-", null, TestLinkAPIResults.TEST_PASSED);
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// Baseclass.updateTestLinkResult("01-", e.getMessage(),
			// TestLinkAPIResults.TEST_FAILED);

		}
	}

	@When("^User will add the image enter the sort by value and save$")
	public void user_will_add_the_image_enter_the_sort_by_value_and_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will add the image enter the sort by value and save");
			dat.imagesselect();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			dat.savebutton();
			dat.assetAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// Baseclass.updateTestLinkResult("01-", null, TestLinkAPIResults.TEST_PASSED);
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// Baseclass.updateTestLinkResult("01-", e.getMessage(),
			// TestLinkAPIResults.TEST_FAILED);

		}
	}

	@Then("^User will add succesfully and verify$")
	public void user_will_add_succesfully_and_verify() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will add succesfully and verify");
			// Baseclass.updateTestLinkResult("01-", null, TestLinkAPIResults.TEST_PASSED);
			dat.verifyImageadd(pro.getProperty("Imagefilename"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// Baseclass.updateTestLinkResult("01-", e.getMessage(),
			// TestLinkAPIResults.TEST_FAILED);
			// extent.flush();
		}
	}

	// Digital asset edit

	@Given("^User will click on parts page and enter the part# and click on the digital asset Segment$")
	public void user_will_click_on_parts_page_and_enter_the_part_and_click_on_the_digital_asset_Segment()
			throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Digital Asset").assignCategory("Digital Asset")
					.pass("Image Asset added");
			test = test.createNode(Scenario.class, "Adding Image");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and enter the part# and click on the digital asset Segment");
			dat = new Digitalasset_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			dat.clickasset();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@When("^User will click the edit and add orientation view and click save button$")
	public void user_will_click_the_edit_and_add_orientation_view_and_click_save_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click the edit and add orientation view and click save button");
			dat.editclick();
			dat.assetAlert();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will add succesfully and verify the updated Asset$")
	public void user_will_add_succesfully_and_verify_the_updated_Asset() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will add succesfully and verify the updated Asset");

			dat.editverify(pro.getProperty("datas", "editverifytext"), null);
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);

			// extent.flush();
		}

	}

//Digital asset delete
	@Given("^User will go to parts page and choose digital asset tab to delete an image$")
	public void user_will_go_to_parts_page_and_choose_digital_asset_tab_to_delete_an_image() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Digital Asset").assignCategory("Digital Asset")
					.pass("Image Asset added");
			test = test.createNode(Scenario.class, "Deleting Image");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and choose digital asset tab to delete an image");
			dat = new Digitalasset_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			dat.clickasset();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@When("^User will click on delete icon$")
	public void user_will_click_on_delete_icon() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on delete icon");
			dat.deleteimg();
			dat.assetAlertdelete();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will delete successfully and verify$")
	public void user_will_delete_successfully_and_verify() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will delete successfully and verify");
			dat.assetAlertdelete();
			dat.verifyDelete(pro.getProperty("Imagefilename", "Deleteverifytext"), null);
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}

	}

}
