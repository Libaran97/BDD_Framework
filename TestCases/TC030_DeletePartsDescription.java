package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeletePartsDescription;
import utility.Baseclass;

public class TC030_DeletePartsDescription extends Baseclass {

	DeletePartsDescription dpdpom;
	ExtentTest loginfo = null;

	@Given("^User will mousehover and choose the Parts Description page$")
	public void user_will_mousehover_and_choose_the_Parts_Description_page() throws Throwable {
		try {
		//extent=setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete")
					.assignCategory("Delete PartsDescription").pass("PartsDescription Deleted");
			test = test.createNode(Scenario.class, "Deleting PartsDescription");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the Parts Description page");
			dpdpom = new DeletePartsDescription();
			dpdpom.clickonPartsDescription();
			loginfo.pass("PartsDescription page clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" PartsDescription page Not Clicked " + e.getMessage());
			loginfo.fail("PartsDescription page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will select Category and Sub Category in dropdown$")
	public void user_will_select_Category_and_Sub_Category_in_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select Category and Sub Category in dropdown");
			dpdpom.SelectCategory(pro.getProperty("categoryname"));
			dpdpom.SelectSubCategory(pro.getProperty("subcategoryname"));
			loginfo.pass("Category and Sub Category Selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category and Sub Category Not Selected in dropdown " + e.getMessage());
			loginfo.fail("Category and Sub Category Not Selected in dropdown");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter Parts Description name in search box$")
	public void user_will_Enter_Parts_Description_name_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter Parts Description name in search box");
			dpdpom.SelectsearchTextbox(pro.getProperty("subcategoryname"));
			dpdpom.ClickDelete();
			dpdpom.acceptAlert();
			dpdpom.verifytext1(pro.getProperty("categoryname"),pro.getProperty("DeleteProducttxt"));
			/*
			 * , pro.getProperty("subcategoryname"), pro.getProperty("partdesc"),
			 * pro.getProperty("DeleteProducttxt"));
			 */
			loginfo.pass("PartsDescription name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" PartsDescription name Not Entered in search box" + e.getMessage());
			loginfo.fail("PartsDescription name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will click Delete Parts Description and accept alert$")
	public void user_will_click_Delete_Parts_Description_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click Delete Parts Description and accept alert");
			dpdpom.SelectCategory(pro.getProperty("categoryname1"));
			//dpdpom.SelectSubCategory(pro.getProperty("subcategoryname1"));
			dpdpom.SelectsearchTextbox01(pro.getProperty("subcategoryname1"));
			dpdpom.ClickDelete();
			dpdpom.acceptAlert();
			loginfo.pass("PartsDescription Deleted Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" PartsDescription Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("PartsDescription Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will Verify Parts Description is deleted or not$")
	public void user_will_Verify_Parts_Description_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify Parts Description is deleted or not");
			dpdpom.verifytext2(pro.getProperty("categoryname1"), pro.getProperty("subcategoryname1"),
					pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded Parts Description verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Deleteded Parts Description Not verify " + e.getMessage());
			loginfo.fail("Deleteded Parts Description Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}
