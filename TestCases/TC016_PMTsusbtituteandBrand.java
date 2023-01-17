package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsPackage;
import pageobjectmodel.PartsSubstitute;
import utility.Baseclass;

public class TC016_PMTsusbtituteandBrand extends Baseclass {

	ExtentTest loginfo = null;
	PartsSubstitute ppsubbrand;

	@Given("^User will go to parts page and search for partno to add subs$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_add_subs() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts subs Add, Delete").assignCategory("Parts Package")
					.pass("Package add");
			test = test.createNode(Scenario.class, "Checking on the substitue add");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to add subs");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to substitute page and check the subs for that partno and save$")
	public void user_will_go_to_substitute_page_and_check_the_size_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to substitute page and check the subs for that partno and save");
			ppsubbrand.Substituteclick();
			ppsubbrand.Substituteclickentry(pro.getProperty("partno1"), pro.getProperty("textbox"));
			ppsubbrand.subsaving();
			ppsubbrand.acceptalertsub();
			ppsubbrand.acceptalertsub();
			loginfo.pass("Susbtitute page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Susbtitute page Not clicked Selected" + e.getMessage());
			loginfo.fail("Susbtitute page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the subs is checked and verify$")
	public void user_will_check_the_subs_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the subs is checked and verify");
			ppsubbrand.verifysub(pro.getProperty("partno1"));
			loginfo.pass("Susbtitute Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Susbtitute Not Verified" + e.getMessage());
			loginfo.fail("Susbtitute Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Subs delete option

	@Given("^User will go to parts page and search for partno to del subs$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_del_subs() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts subs Add, Delete").assignCategory("Parts Subs")
					.pass("subs del");
			test = test.createNode(Scenario.class, "deleting subs in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to del subs");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to substitute page and check the subsdel for that partno and save$")
	public void user_will_go_to_substitute_page_and_check_the_subsdel_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to substitute page and check the subs for that partno and save");
			ppsubbrand.Substituteclick();
			ppsubbrand.subdel();
			ppsubbrand.AcceptAlert();
			ppsubbrand.AcceptAlert();
			loginfo.pass("Susbtitute page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Susbtitute page Not clicked Selected" + e.getMessage());
			loginfo.fail("Susbtitute page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the subsdel is checked and verify$")
	public void user_will_check_the_subsdel_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the subsdel is checked and verify");
			ppsubbrand.verifydel("DeleteProducttxt2");
			loginfo.pass("Susbtitute deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Susbtitute Not Verified" + e.getMessage());
			loginfo.fail("Susbtitute Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Adding the Brand value

	@Given("^User will go to parts page and search for partno to add brand$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_add_brand() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts brand Add,edit Delete").assignCategory("Parts brand")
					.pass("subs add");
			test = test.createNode(Scenario.class, "adding brand in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to add brand");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to brand page and check the brand for that partno and save$")
	public void user_will_go_to_brand_page_and_check_the_brand_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to brand page and check the brand for that partno and save");
			ppsubbrand.brandclick();
			ppsubbrand.brandsearch("brandsearch");
			ppsubbrand.save();
			ppsubbrand.AcceptAlert();
			loginfo.pass("brand page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("brand page Not clicked Selected" + e.getMessage());
			loginfo.fail("brand page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the brand is checked and verify$")
	public void user_will_check_the_brand_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the brand is checked and verify");
			ppsubbrand.verifybrand();
			loginfo.pass("brand added Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("brand Not Verified" + e.getMessage());
			loginfo.fail("brand Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Brand deleted code

	@Given("^User will go to parts page and search for partno to del brand$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_del_brand() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts brand Add,edit Delete").assignCategory("Parts brand")
					.pass("Brand del");
			test = test.createNode(Scenario.class, "deleting brand in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to del brand");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to brand page and check the branddel for that partno and save$")
	public void notdel() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to brand page and check the branddel for that partno and save");
			ppsubbrand.brandclick();
			ppsubbrand.branddel();
			ppsubbrand.AcceptAlert();
			ppsubbrand.AcceptAlert();
			loginfo.pass("brand page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("brand page Not clicked Selected" + e.getMessage());
			loginfo.fail("brand page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the branddel is checked and verify$")
	public void user_will_check_the_branddel_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the branddel is checked and verify");
			ppsubbrand.verifybranddel();
			loginfo.pass("brand deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("brand del Not Verified" + e.getMessage());
			loginfo.fail("brand del Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Not del brand

	@Given("^User will go to parts page and search for partno to notdel brand$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_notdel_brand() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts brand Add,edit Delete")
					.assignCategory("Parts brand notdel").pass("Brand notdel");
			test = test.createNode(Scenario.class, "Not deleting brand in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to notdel brand");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to brand page and check the brandnotdelfor that partno and save$")
	public void user_will_go_to_brand_page_and_check_the_brandnotdelfor_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to brand page and check the brandnotdelfor that partno and save");
			ppsubbrand.brandclick();
			ppsubbrand.subdel();
			loginfo.pass("brand page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("brand page Not clicked Selected" + e.getMessage());
			loginfo.fail("brand page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the brandnotdel is checked and verify$")
	public void user_will_check_the_brandnotdel_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check the brandnotdel is checked and verify");
			ppsubbrand.AcceptAlertnotdel();
			loginfo.pass("brand not deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("brand del not correct Verified" + e.getMessage());
			loginfo.fail("brand del not correct Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Hazardous Maternial adding only

	@Given("^User will go to parts page and search for partno to Hazardous Material$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_Hazardous_Material() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Hazardous Material Add")
					.assignCategory("Parts Hazardous Material").pass("Hazardous Material");
			test = test.createNode(Scenario.class, "Hazardous Material add in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to Hazardous Material");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to Hazardous Material page and check the Hazardous Material that partno and save$")
	public void user_will_go_to_Hazardous_Material_page_and_check_the_Hazardous_Material_that_partno_and_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to Hazardous Material page and check the Hazardous Material that partno and save");
			ppsubbrand.Hazprodousclick();
			ppsubbrand.Hazprodousdetails();
			loginfo.pass("Hazardous Material page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Hazardous Material page Not clicked Selected" + e.getMessage());
			loginfo.fail("Hazardous Material page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the Hazardous Material is checked and verify$")
	public void user_will_check_the_Hazardous_Material_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check the Hazardous Material is checked and verify");
			ppsubbrand.AcceptAlert();
			System.out.println("Hazrodous finsihed");
			loginfo.pass("Hazardous Material added Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();

		} catch (Exception e) {
			System.out.println("Hazardous Material not correct Verified" + e.getMessage());
			loginfo.fail("Hazardous Material not correct Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
}
