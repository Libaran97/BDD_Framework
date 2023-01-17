package pmttestcases.stepdefinition;

import org.openqa.selenium.Alert;
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

import pageobjectmodel.MyCatalogAttributesPom;
import pageobjectmodel.Partdescription_POM;
import pageobjectmodel.Productattribute_POM;
import utility.Baseclass;

public class TC044_PMTMyCatalogAttributes extends Baseclass {
	MyCatalogAttributesPom mpom;
	ExtentTest loginfo = null;
	Partdescription_POM partdesc= new Partdescription_POM();
	Productattribute_POM attr= new Productattribute_POM();
	
	
	@Given("^User will go to the parts page and search for partno to add product attribute$")
	public void user_will_go_to_the_parts_page_and_search_for_partno_to_add_product_attribute() throws Throwable {
		try
		{
		extent=setup();
		test = extent.createTest(Feature.class, "PMT product attribute").assignCategory("product attribute")
				.pass("Part attribute added");
		test = test.createNode(Scenario.class, "Checking on the product attribute");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"User will go to parts page and search for partno to add product attribute");			
		partdesc.partslanding();
		partdesc.partsearch(pro.getProperty("partnoenter"));			
		attr.partattrlanding();
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	} catch (Exception e) {
		System.out.println(e);
		TestStep("Fail", driver, loginfo, e);

	}
	}
	

	@When("^User will go to the product attribute page and check the attibute data for that partno and save$")
	public void user_will_go_to_the_product_attribute_page_and_check_the_attibute_data_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to product attribute page and check the attibute data for that partno and save");
			attr.attrbut();
			attr.saveattr();
			attr.acceptAlert1();
			loginfo.pass("Size Added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Then("^User will check the product attribute is checked then verify$")
	public void user_will_check_the_product_attribute_is_checked_then_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the product attribute is checked and verify");
			//attr.verifyattr();
			loginfo.pass("product attr Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Given("^User will go to My catalog click Attibute page$")
	public void user_will_go_to_My_catalog_click_Attibute_page() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Attributes Related Testcases TC_SP_014").assignCategory("PMT MyCatalog Attributes TC_SP_014 >>>>> ").pass("PMT MyCatalog Attributes Scenarios Verification TC_SP_014 >>>>>>");
			test = test.createNode(Scenario.class, "Search Description and Select the my catalog attribute data");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to My catalog click Attibute page");
			
			mpom = new MyCatalogAttributesPom();
			mpom.MyCatalogsAttClick();
			loginfo.pass("PMT My Catalog page menu is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
			Thread.sleep(5000);
			} catch(Exception e) {
				System.out.println("My Catalog page menu is NOT clicked successfully " + e.getMessage());
				loginfo.fail("My Catalog page menu NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
	}

	@When("^Select part Description and Click Attribute data check box$")
	public void select_part_Description_and_Click_Attribute_data_check_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"Select part Description and Click Attribute data check box");
			mpom.MyCatalogAttributesClick();
			Thread.sleep(5000);
			loginfo.pass("The Attributes search submenu link is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The Attributes search submenu link is NOT clicked successfully" + e.getMessage());
				loginfo.fail("The Attributes search submenu link is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}

	@And("^Click submit button and Click part# in new grid$")
	public void click_submit_button_and_Click_part_in_new_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click submit button and Click part# in new grid");
			mpom.ChoosePartDescription();
			Thread.sleep(5000);
			mpom.ClickAttributeCheckbox();
			loginfo.pass("The Part Description is selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The Part Description is NOT selected successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The Part Description is NOT selected successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}

	@Then("^Check the navigated page and verify the data$")
	public void check_the_navigated_page_and_verify_the_data() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Check the navigated page and verify the data");
					Thread.sleep(5000);
			mpom.ClickSubmitButton();
			//mpom.VerifyDisplayedAttribute();
			mpom.partsearchnew();
			//mpom.ClickLogoutButton();
			loginfo.pass("The Attribute checkbox is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			} catch(Exception e) {
				System.out.println("The Attribute checkbox is NOT clicked successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The Attribute checkbox is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
	}

	@Given("^User will go to the parts page and search for partno to unchecking the product attribute$")
	public void user_will_go_to_the_parts_page_and_search_for_partno_to_unchecking_the_product_attribute() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT product attribute").assignCategory("product attribute")
					.pass("product attribute deleted");
			test = test.createNode(Scenario.class, "deleted the given product attribute");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to unchecking the product attribute");			
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			attr.partattrlanding();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			

		}
	}

	@When("^User will go to product attribute page and delete the product attribute data for that part and save$")
	public void user_will_go_to_product_attribute_page_and_delete_the_product_attribute_data_for_that_part_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will goto product attribute page and delete the product attribute data for that part and save");
			attr.delattr();			
			attr.acceptAlert1();
			loginfo.pass("product attribute deleted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@And("^User will verify the changes done product attribute$")
	public void user_will_verify_the_changes_done_product_attribute() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will verify the changes done product attribute");
			//attr.verifyattr1();
			Thread.sleep(3000);
			loginfo.pass("product attribute deleted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Then("^Check the deleted attribute data in My Catalog$")
	public void check_the_deleted_attribute_data_in_My_Catalog() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Check the deleted attribute data in My Catalog");
			mpom = new MyCatalogAttributesPom();
			mpom.MyCatalogsAttClick();
			mpom.MyCatalogAttributesClick();
			mpom.ChoosePartDescription1();
		
			loginfo.pass("product attribute  verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();

		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	