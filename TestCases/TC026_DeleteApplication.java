package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteApplication;
import utility.Baseclass;

public class TC026_DeleteApplication extends Baseclass {

	DeleteApplication dapom;

	ExtentTest loginfo = null;

	@Given("^User will click on ApplicationPage$")
	public void user_will_click_on_ApplicationPage() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Application Page").assignCategory("Delete NonAces Applicarion")
					.pass("NonAces Applicarion Deleted");
			test = test.createNode(Scenario.class, "Deleting Applicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click on ApplicationPage");
			dapom = new DeleteApplication();
			dapom.ClickApplication();
			loginfo.pass("Application page clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Application page is not click" + e.getMessage());
			loginfo.fail("Application page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Choose Vehicle, Make & Model in dropdown and Click search$")
	public void user_will_Choose_Vehicle_Make_Model_in_dropdown_and_Click_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Choose Vehicle, Make & Model in dropdown and Click search");
			dapom.ChooseVehicle(pro.getProperty("vehicletypename"));

			dapom.ChooseMake(pro.getProperty("makename"));

			dapom.ChooseModel(pro.getProperty("modelname"));

			dapom.Clicksearch();
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected" + e.getMessage());
			loginfo.fail("Vehicle, Make & Model dropdown not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will selectfilter Engine Base and enter search value and search Button$")
	public void user_will_selectfilter_Engine_Base_and_enter_search_value_and_search_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will selectfilter Engine Base and enter search value and search Button");
			dapom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));

			dapom.SelectsearchTextbox(pro.getProperty("SearchText2"));
			dapom.Clicksearch2();
			loginfo.pass("Choose Engine Base, search value entered and search button clicked successfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Engine Base or search value not passed" + e.getMessage());
			loginfo.fail("Engine Base or search value not passed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will Click Delete and Accept alert$")
	public void user_will_Click_Delete_and_Accept_Alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Click Delete and Accept alert");
			dapom.ClickDelete();

			dapom.acceptAlert();

			loginfo.pass("Application Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Application Not Deleted Succesfully" + e.getMessage());
			loginfo.fail("Application Not Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify that NonAces record has Deleted or Not$")
	public void user_will_verify_that_NonAces_record_has_Deleted_or_Not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify that NonAces record has Deleted or Not");
			dapom.dClickApplication();
			dapom.dChooseVehicle(pro.getProperty("vehicletypename"));

			dapom.dChooseMake(pro.getProperty("makename"));

			dapom.dChooseModel(pro.getProperty("modelname"));

			dapom.dClicksearch();
			dapom.dSelectFiterdropdown(pro.getProperty("SelectFilterName"));

			dapom.dSelectsearchTextbox(pro.getProperty("SearchText2"));
			dapom.dClicksearch2();
			dapom.verifytext1(pro.getProperty("AlertVrytext"));
			loginfo.pass("Deleted Application verifyed Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted Application Not verify " + e.getMessage());
			loginfo.fail("Deleted Application Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}

	}

}
