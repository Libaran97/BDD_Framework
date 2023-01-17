package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Catalogbuyerguide;
import utility.Baseclass;

public class TC007_PMT_Buyersguidepart extends Baseclass {
	ExtentTest loginfo = null;
	Catalogbuyerguide bg;

	@Given("^After login Click My catalog and select Buyer guide sub menu$")
	public void after_login_Click_My_catalog_and_select_Buyer_guide_sub_menu() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "My Catalog Buyerguide").assignCategory("Buyerguide")
					.pass("Page landed thanks");
			test = test.createNode(Scenario.class, "Searching part#");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the Buyer Guide page");
			bg = new Catalogbuyerguide();
			bg.MyCatalogclick();
			loginfo.pass("MyCatalogs BuyersGuide landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("My Catalog buyers guide submenu cannot be clicked successfully " + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);

		}
	}

	@And("^Enter partnumber and select part number within Autocomplete$")
	public void enter_partnumber_and_select_part_number_within_Autocomplete() throws Throwable {

		try {

			loginfo = test.createNode(new GherkinKeyword("And"),
					"Enter partnumber and select part number within Autocomplete");
			bg = new Catalogbuyerguide();
			bg.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass("My Catalog buyers guide part# entered successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Part not Not entered " + e.getMessage());
			loginfo.fail("Part not Selected successfully in MyCatalogs >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^Click search$")
	public void click_search() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "click search");
			bg.search();
			loginfo.pass("My Catalog buyers guide part# Searched  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Part not Not Searched " + e.getMessage());
			loginfo.fail("Part not Searched successfully in MyCatalogs >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	/*
	 * @Then("^Click parts data$") public void click_parts_data() throws Throwable {
	 * try {
	 * 
	 * loginfo = test.createNode(new GherkinKeyword("Then"), "click parts data");
	 * bg.partsdata(); loginfo.pass("Successfully redirected to ALL in one page");
	 * 
	 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	 * //extent.flush(); } catch (Exception e) {
	 * System.out.println("Not Redirected " + e.getMessage());
	 * loginfo.fail("Part not redirected successfully in MyCatalogs >>>>>>>>");
	 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver)); TestStep("Fail",
	 * driver, loginfo, e); ///extent.flush();
	 * 
	 * }
	 * 
	 * }
	 */
}