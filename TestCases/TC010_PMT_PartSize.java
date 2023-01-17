package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartSize_POM;
import pageobjectmodel.Partdescription_POM;
import utility.Baseclass;

public class TC010_PMT_PartSize extends Baseclass {

	ExtentTest loginfo = null;
	Partdescription_POM partdesc;
	PartSize_POM size;

	/*
	 * partsize check and uncheck
	 */

	@Given("^User will go to parts page and search for partno to add partsize$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_add_partsize() throws Throwable {

		try {
			extent=setup();
			test = extent.createTest(Feature.class, "PMT Part Size").assignCategory("Part Sizes")
					.pass("Part Size added");
			test = test.createNode(Scenario.class, "Checking on the part size");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to add partsize");
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			size = new PartSize_POM();
			size.partsizelanding();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will go to partsize page and check the size for that partno and save$")
	public void user_will_go_to_partsize_page_and_check_the_size_for_that_partno_and_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to partsize page and check the size for that partno and save");
			size.addsize();
			size.savesize();
			size.acceptAlert1();
			loginfo.pass("Size Added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will check the size is checked and verify$")
	public void user_will_check_the_size_is_checked_and_verify() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the size is checked and verify");
			size.verifysize();
			loginfo.pass("Size Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Given("^User will go to parts page and search for partno to unchecking the partsize$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_unchecking_the_partsize() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Part Size").assignCategory("Part Sizes")
					.pass("Part Size added");
			test = test.createNode(Scenario.class, "Unchecking the given part size");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to unchecking the partsize");
			size = new PartSize_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			size.partsizelanding();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will goto partsize page and unceck the size for that part and save$")
	public void user_will_goto_partsize_page_and_unceck_the_size_for_that_part_and_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will goto partsize page and unceck the size for that part and save");
			size.unchecksize();
			size.savesize();
			size.acceptAlert1();
			loginfo.pass("Size Removed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the changes done in partsize$")
	public void user_will_verify_the_changes_done_in_partsize() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify the changes done in partsize");
			size.verifysize();
			loginfo.pass("Size Removed verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();

		}
	}

}
