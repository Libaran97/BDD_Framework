package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteIntchgPartno;
import utility.Baseclass;

public class TC027_DeleteIntchgPartno extends Baseclass {

	DeleteIntchgPartno idpom;
	ExtentTest loginfo = null;

	@Given("^User will mouse over master and click Interchange Partno$")
	public void user_will_mouse_over_master_and_click_Interchange_Partno() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Interchange Related")
					.assignCategory("Delete Interchange Partno").pass("Interchange Partno Deleted");
			test = test.createNode(Scenario.class, "Deleting Interchange Partno");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse over master and click Interchange Partno");
			idpom = new DeleteIntchgPartno();
			idpom.clickonInterchangePart();
			loginfo.pass(" Interchange Partno Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Partno Button Not Clicked " + e.getMessage());
			loginfo.fail(" Interchange Partno Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Select Interchange Name and search Interchange Partno$")
	public void user_will_Select_Interchange_Name_and_search_Interchange_Partno() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Interchange Name and search Interchange Partno");
			idpom.SelectIntName(pro.getProperty("InterchangeNameValue"));

			idpom.SearchIntchgpartValue(pro.getProperty("interchangepartno"));
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected or Interchange Part# Not Entered " + e.getMessage());
			loginfo.fail(" Interchange Name Not selected or Interchange Part# Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click delete and accept the alert$")
	public void user_will_click_delete_and_accept_the_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click delete and accept the alert");
			idpom.ClickDelete();

			idpom.acceptAlert();

			idpom.acceptAlert();
			loginfo.pass(" Interchange Part# Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Deleted " + e.getMessage());
			loginfo.fail(" Interchange Part# Not Deleted  ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify Interchange Partno is deleted or not$")
	public void user_will_verify_Interchange_Partno_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify Interchange Partno is deleted or not");
			idpom.verifytext1(pro.getProperty("InterchangeNameValue"), pro.getProperty("interchangepartno"),
					pro.getProperty("DeleteProducttxt"));

			loginfo.pass("Deleted IntchgPartno verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted IntchgPartno Not verify " + e.getMessage());
			loginfo.fail("Deleted IntchgPartno Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}

	}
}
