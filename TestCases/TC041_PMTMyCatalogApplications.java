package pmttestcases.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Buyersguide_POM;
/*import pageobjectmodel.MyCatalogBuyersGuidePom;
import pmt.pageobjectmodel.MultiAddPom;*/
import pageobjectmodel.MyCatalogApplicationsPom;
import pageobjectmodel.PartsBom;
import utility.Baseclass;

public class TC041_PMTMyCatalogApplications extends Baseclass {
	MyCatalogApplicationsPom mpom2;
	ExtentTest loginfo = null;

	@Given("^User will click on parts page and it should redirect to parts page(\\d+)$")
	public void user_will_click_on_parts_page_and_it_should_redirect_to_parts_page(int arg1) throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "created product category").assignCategory("Parts Add Tag")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding part# with created product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and it will redirect to parts page208");
			mpom2 = new MyCatalogApplicationsPom();
			mpom2.partslandingpage();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add buton and choose product category and sub category and part des and product line(\\d+)$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_and_sub_category_and_part_des_and_product_line(
			int arg1) throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add buton and choose product category and sub category and part des and product line08");
			mpom2.partsadd1();
			mpom2.partsadddrp21();
			mpom2.partsadddrp31();
			mpom2.partsadddrp41();
			mpom2.isunitnot();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the partNo btu click save(\\d+)$")
	public void user_will_enter_the_partNo_btu_click_save(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the partNo btu click save08");
			mpom2.savenewpart08(pro.getProperty("partno08"));
			mpom2.acceptAlert();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully alert and verify the partNO(\\d+)$")
	public void user_will_successfully_alert_and_verify_the_partNO(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search");

			loginfo.pass("Parts page landed successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	@Given("^User will go to parts page then search for a part# and will tie-up the application$")
	public void user_will_go_to_parts_page_then_search_for_a_part_and_will_tie_up_the_application() throws Throwable {
		try {
			 //extent = setup();
			test = extent.createTest(Feature.class, "PMT parts buyers guide").assignCategory("Parts Buyersguide")
					.pass("Buyers guide add");
			test = test.createNode(Scenario.class, "Adding application through buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a part# and will tie-up the application");
			mpom2 = new MyCatalogApplicationsPom();
			mpom2.partslanding();
			mpom2.partsearch(pro.getProperty("partnoenter"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on buyersguide and choose the vehicle, make, model & click search$")
	public void user_will_click_on_buyersguide_and_choose_the_vehicle_make_model_click_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on buyersguide frame and choose the vehicle, make, model & search");
			mpom2.buyerguideclick();
			mpom2.apppartsvehicldropdown(pro.getProperty("vehicletypename"));
			mpom2.apppartsmakedropdown(pro.getProperty("makename"));
			mpom2.apppartsmodeldropdown(pro.getProperty("modelname"));
			mpom2.appartsenginetextbox();
			mpom2.apppartsearch();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}

	}

	@And("^User will choose an enginebase , click on save$")
	public void user_will_choose_an_enginebase_click_on_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will choose an enginebase and click on save");
			mpom2.Alcheck();
			mpom2.savebtn();
			mpom2.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfull alert and verify the record has shown in the below grid$")
	public void user_will_see_successfull_alert_and_verify_the_record_has_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the reocrd has shown in the below grid");
			mpom2.bguideverification();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			 //extent.flush();
		}
	}

	@Given("^: Click the My Catalog menu link SP$")
	public void click_the_My_Catalog_menulink_SP() throws Throwable {

		try {
			extent = setup();
			test = extent.createTest(Feature.class, "My Catalog- Application_TC025 Related Application")
					.assignCategory("MyCatalog Application Tag ")
					.pass("My Catalog- Application_TC025 Related Application verification");
			test = test.createNode(Scenario.class, "Check the [My Catalogs - Applications] Functionality [TC_SP_008]");
			loginfo = test.createNode(new GherkinKeyword("Given"), "Click the My Catalog menu link SP");
			mpom2 = new MyCatalogApplicationsPom();
			mpom2.MyCatalogsClick();
			loginfo.pass("My Catalog page menu link is clicked successfully >>>>>>>>");
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog page menu link is NOT clicked successfully" + e.getMessage());
			// loginfo.fail("My Catalog page menu link is NOT clicked successfully
			// >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	
	@When("^: Click the Application submenu link SP$")
	public void click_the_application_submenu_link_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Click the Application submenu link SP");
			mpom2.MyCatalogApplicationsClick();
			Thread.sleep(10000);
			loginfo.pass("The Application submenu link is clicked successfully >>>>>>>>");
		} catch (Exception e) {
			System.out.println("Application submenu link is not clicked properly" + e.getMessage());
			loginfo.fail("The Application submenu link is NOT clicked successfully >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Select the Make Model Year Status from the dropdown SP$")
	public void select_the_make_model_year_status_from_the_dropdown_SP() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select the Make Model Year Status from the dropdown SP");
			mpom2.SelectMakeModelYearStatus();
			Thread.sleep(5000);
			loginfo.pass("The Make Model Year Status values from the dropdown are selected successfully >>>>>>>>");

		} catch (Exception e) {
			System.out.println("The Make Model Year Status values from the dropdown are NOT selected successfully"
					+ e.getMessage());
			loginfo.fail("The Make Model Year Status values from the dropdown are NOT selected successfully >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the Search button SP$")
	public void click_the_search_button_SP() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Click the Search button SP");
			mpom2.ClickSearchButton();
			Thread.sleep(5000);
			loginfo.pass("The Search button is clicked successfully >>>>>>>>");
		} catch (Exception e) {
			System.out.println("The Search button is NOT clicked properly" + e.getMessage());
			loginfo.fail("The Search button is NOT clicked successfully >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	
	@And("^: Verify the Part Data Details screen SP$")
	public void verify_the_part_data_details_screen_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Click the View Application Data button SP");
			mpom2.ClickViewApplicationDataButton();
			Thread.sleep(5000);
			loginfo.pass("The View Application Data button is clicked successfully >>>>>>>>");
		} catch (Exception e) {
			System.out.println("The View Application Data button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The View Application Data button is NOT clicked successfully >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Verify the Highlighted record SP$")
	public void verify_the_highlighted_record_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Verify the Highlighted record SP");
			mpom2.VerifyHighlightedRecord();
			Thread.sleep(5000);
			loginfo.pass("The Highlighted Record is verified successfully >>>>>>>>");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("The Highlighted record is NOT verified successfully" + e.getMessage());
			loginfo.fail("The Highlighted Record is NOT verified successfully >>>>>>>>");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the View Part Data button SP$")
	public void click_the_view_part_data_button_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Click the View Part Data button SP");
			mpom2.ClickViewPartDataButton();
			Thread.sleep(5000);
			loginfo.pass("The View Parts Data button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("The View Parts Data button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The View Parts Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the Back navigation button SP$")
	public void click_the_back_navigation_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "Click the Back navigation button SP");
			mpom2.ClickBackNavigationButton();
			Thread.sleep(5000);
			loginfo.pass("The Back Navigation button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("The Back Navigation button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The Back Navigation button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally Click The Logout button SP$")
	public void finally_click_the_logout_button_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Click The Logout button SP");
			mpom2.ClickLogoutButton();
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
	
	///delete
	@Given("^User will mousehover, choose the partno page$")
	public void user_will_mousehover_choose_the_partno_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del partno")
					.assignCategory("Master-deleted Related part-1").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related partno Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehover and choose the partno page");
			mpom2 = new MyCatalogApplicationsPom();
			mpom2.partslandingpage();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipment model type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will search partno in search box and delete with accept alert$")
	public void user_will_search_partno_in_search_box_and_delete_with_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will search the partno in search box and delete with accept alert");
			mpom2.partsearch(pro.getProperty("partnoenter"));
			mpom2.acceptAlertbrowser();
			mpom2.acceptAlertbrowser();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("model deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		} 
	}

	@Then("^User will Verify partnu is deleted$")
	public void user_will_Verify_partnu_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify partno is deleted");
			mpom2.Verifypartdel();
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}


}
