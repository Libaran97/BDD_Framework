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
import utility.Baseclass;

public class TC016_Packageold extends Baseclass {

	ExtentTest loginfo = null;
	PartsPackage ppckg;
	
	//Package Add//

	@Given("^User will go to parts page and search for a partno$")
	public void user_will_go_to_parts_page_and_search_for_a_partno() throws Throwable {

		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Package Add, Edit and Delete")
					.assignCategory("Parts Package").pass("Package add");
			test = test.createNode(Scenario.class, "Adding Package in old parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a partno");
			ppckg = new PartsPackage();
			ppckg.partslanding();
			ppckg.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Package and select Package UOM dropdown$")
	public void user_wll_click_on_Package_and_select_Package_UOM_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on Package and select Package UOM dropdown");
			ppckg.Packageclick();
			ppckg.SelectPackageUom();
			loginfo.pass("Package page clicked and Package Uom Selected Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Package page Not clicked or Package Uom Not Selected" + e.getMessage());
			loginfo.fail("Package page Not clicked or Package Uom Not Selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@And("^User will Enter Quantity, height, width and Length$")
	public void user_will_Enter_Quantity_height_width_and_Length() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter Quantity, height, width and Length");
			ppckg.EnterUomQty();
			// ppckg.EnterHeightWidthLength();
			loginfo.pass("Quantity, height, width and Length Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Quantity, height, width or Length Not Entered" + e.getMessage());
			loginfo.fail("Quantity, height, width or Length Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will click save and Accept the alert$")
	public void user_will_click_save_and_Accept_the_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will click save and Accept the alert");
			ppckg.SaveAcceptAlert();
			loginfo.pass("Package Saved Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Package Not Saved" + e.getMessage());
			loginfo.fail("Package Not Saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@Then("^User will verify the reocrd has shown in the below grid$")
	public void user_will_verify_the_reocrd_has_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the below grid");
			ppckg.Verify();
			loginfo.pass("Package Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Package Not Verified" + e.getMessage());
			loginfo.fail("Package Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	//Package Edit//
	
	@Given("^User will go to parts page and search for partno in Search box$")
	public void user_will_go_to_parts_page_and_search_for_partno() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts Package Add, Edit and Delete")
					.assignCategory("Parts Package").pass("Package Edit");
			test = test.createNode(Scenario.class, "Editing Package in old parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno in Search box");
			ppckg = new PartsPackage();
			ppckg.partslanding();
			ppckg.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Package and Click Edit Button$")
	public void user_will_click_on_Package_and_Click_Edit_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on Package and Click Edit Button");
			ppckg.Packageclick();
			ppckg.ClickEditButton();
			loginfo.pass("Package page clicked and Package Uom Qty Edited Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Package page Not clicked or Package Uom Qty Not Edited" + e.getMessage());
			loginfo.fail("Package page Not clicked or Package Uom Qty Not Edited");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Edit Quantity and save accept alert$")
	public void user_will_Edit_Quantity_and_save_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Edit Quantity and save accept alert");
			ppckg.EditUomQty();
			ppckg.SaveAcceptAlert();
			loginfo.pass("Package Edited Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Package Not Edited" + e.getMessage());
			loginfo.fail("Package Not Edited");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will verify the Edit reocrd has shown in the below grid$")
	public void user_will_verify_the_Edit_has_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the below grid");
			ppckg.Verifyedit();
			loginfo.pass("Edited Package Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();

		} catch (Exception e) {
			System.out.println("Edited Package Not Verified" + e.getMessage());
			loginfo.fail("Edited Package Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}

	//Package Delete//
	
	@Given("^User will go to parts page and search for the partno$")
	public void user_will_go_to_parts_page_and_search_for_the_partno() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts Package Add, Edit and Delete")
					.assignCategory("Parts Package").pass("Package Delete");
			test = test.createNode(Scenario.class, "Deleting  Package in old parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the partno");
			ppckg = new PartsPackage();
			ppckg.partslanding();
			ppckg.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Package and Click Delete Button Accept Alert$")
	public void user_will_click_on_Package_and_Click_Delete_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on Package and Click Delete Button Accept Alert");
			ppckg.Packageclick();
			ppckg.ClickDeleteButton();
			loginfo.pass("Package page clicked and Package Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Package page Not clicked or Package Not Deleted" + e.getMessage());
			loginfo.fail("Package page Not clicked or Package Not Deleted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has not shown in the below grid$")
	public void user_will_verify_the_reocrd_has_not_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has not shown in the below grid");
			ppckg.DeleteVerify("DeleteProducttxt", "DeleteProducttxt2");
			loginfo.pass("Delete Package Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Delete Package Not Verified" + e.getMessage());
			loginfo.fail("Delete Package Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//extent.flush();
		}
	}

}
