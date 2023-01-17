package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageobjectmodel.Parts_KitInfo;
import utility.Baseclass;

public class TC017_Parts_KitInfo extends Baseclass {

	ExtentTest loginfo = null;

	Parts_KitInfo pkinfo;

	@Given("^User will go to parts page and search partno$")
	public void user_will_go_to_parts_page_and_search_partno() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT parts kit info add, edit and delete")
					.assignCategory("Parts KitInfo").pass("KitInfo add");
			test = test.createNode(Scenario.class, "Adding Parts Kit Info");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to parts page and search partno");
			pkinfo = new Parts_KitInfo();
			pkinfo.partslanding();
			pkinfo.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on KitInfo and Enter partno$")
	public void user_will_click_on_Package_and_Enter_partno() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on Package and select Package UOM dropdown");
			pkinfo.Kitinfoclick();
			pkinfo.ComponentPart();
			loginfo.pass("Kitinfo page clicked and Partno Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Kitinfo page Not clicked or Partno Not Entered" + e.getMessage());
			loginfo.fail("Kitinfo page Not clicked or Partno Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@And("^User will select des code & Language and Enter maintanence type & Qty$")
	public void user_will_select_des_code_Language_and_Enter_maintanence_type_Qty() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will select des code & Language and Enter maintanence type & Qty");
			pkinfo.FillKitDetails();
			loginfo.pass("Des code & Language selected and maintanence type & Qty Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Des code & Language Not selected or maintanence type & Qty Not Entered" + e.getMessage());
			loginfo.fail("Des code & Language Not selected or maintanence type & Qty Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^Use will Select Sold Separately & Qty Uom and Enter Description$")
	public void use_will_Select_Sold_Separately_Qty_Uom_and_Enter_Description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Use will Select Sold Separately & Qty Uom and Enter Description");
			pkinfo.FillKitDetails2();
			loginfo.pass("Sold Separately & Qty Uom selected and Description Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Sold Separately & Qty Uom Not selected or Description Not Entered" + e.getMessage());
			loginfo.fail("Sold Separately & Qty Uom Not selected or Description Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will save data and Accept the alert$")
	public void user_will_save_data_and_Accept_the_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will save data and Accept the alert");
			pkinfo.saveAcceptAlert2();
			loginfo.pass("save data and Accept the alert Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Data Not saved or Not Accept the alert " + e.getMessage());
			loginfo.fail("Data Not saved or Not Accept the alert ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify reocrd has shown in the below grid$")
	public void user_will_verify_reocrd_has_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify reocrd has shown in the below grid");
			pkinfo.Verifykit();
			loginfo.pass("Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Not Verified " + e.getMessage());
			loginfo.fail("Not Verified ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	/// kit info edit

	@Given("^User will click parts page and search partno$")
	public void user_will_click_parts_page_and_search_partno() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT parts kit info add, edit and delete")
					.assignCategory("Parts KitInfo").pass("KitInfo Edit");
			test = test.createNode(Scenario.class, "Editing Parts Kit Info");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click parts page and search partno");
			pkinfo = new Parts_KitInfo();
			pkinfo.partslanding();
			pkinfo.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on KitInfo and click edit$")
	public void user_will_click_on_KitInfo_and_click_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on Package and select Package UOM dropdown");
			pkinfo.Kitinfoclick();
			pkinfo.FillKitDetails();
			pkinfo.FillKitDetails2();
			pkinfo.ClickEdit();
			loginfo.pass("Kitinfo page and Edit Button clicked Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Kitinfo page or Edit Button Not clicked" + e.getMessage());
			loginfo.fail("Kitinfo page or Edit Button Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Change the Qty$")
	public void user_will_Change_the_Qty() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Change the Qty");
			pkinfo.EditQtyinkit();

			loginfo.pass("Qtyinkit Edited Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Qtyinkit Not Edited" + e.getMessage());
			loginfo.fail("Qtyinkit Not Edited");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will save data and Accept alert$")
	public void user_will_save_data_and_Accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will save data and Accept alert");
			pkinfo.editalert();
			loginfo.pass("save data and Accept the alert Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Data Not saved or Not Accept the alert " + e.getMessage());
			loginfo.fail("Data Not saved or Not Accept the alert ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify Changes shown in the below grid$")
	public void user_will_verify_Changes_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify Changes shown in the below grid");
			pkinfo.VryEdit();
			loginfo.pass("Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Not Verified " + e.getMessage());
			loginfo.fail("Not Verified ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Kit Info Delete//

	@Given("^User will click parts page and search for partno$")
	public void user_will_click_parts_page_and_search_for_partno() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT parts kit info add, edit and delete")
					.assignCategory("Parts KitInfo").pass("KitInfo Delete");
			test = test.createNode(Scenario.class, "Delete Parts Kit Info");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click parts page and search for partno");
			pkinfo = new Parts_KitInfo();
			pkinfo.partslanding();
			pkinfo.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on KitInfo and click Delete & Accept the alert$")
	public void user_will_click_on_KitInfo_and_click_Delete() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on KitInfo and click Delete & Accept the alert");
			pkinfo.Kitinfoclick();
			pkinfo.ClickDelete();
			pkinfo.acceptAlert1();
			pkinfo.acceptAlert2();
			loginfo.pass("Kitinfo page and Delete Button clicked Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Kitinfo page or Delete Button Not clicked" + e.getMessage());
			loginfo.fail("Kitinfo page or Delete Button Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@And("^User will Verify that record not shown in the below grid$")
	public void user_will_Accept_the_alert_and_Verify_that_record_not_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will Verify that record not shown in the below grid");
			pkinfo.VryDelete();
			loginfo.pass("Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();

		} catch (Exception e) {
			System.out.println("Not Verified " + e.getMessage());
			loginfo.fail("Not Verified ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

}
