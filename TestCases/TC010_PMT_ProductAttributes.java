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
import pageobjectmodel.Productattribute_POM;
import utility.Baseclass;

public class TC010_PMT_ProductAttributes extends Baseclass {

	ExtentTest loginfo = null;
	Partdescription_POM partdesc= new Partdescription_POM();
	Productattribute_POM attr= new Productattribute_POM();

	/*
	 * partattr check and delete
	 */
	@Given("^User will go to parts page and search for partno to add product attribute$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_add_product_attribute() throws Throwable {
		try {
			//extent=setup();
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

	@When("^User will go to product attribute page and check the attibute data for that partno and save$")
	public void user_will_go_to_product_attribute_page_and_check_the_attibute_data_for_that_partno_and_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to product attribute page and check the attibute data for that partno and save");
			attr.attrbut();
			attr.saveattr();
			attr.acceptAlert1();
			loginfo.pass("Size Added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will check the product attribute is checked and verify$")
	public void user_will_check_the_product_attribute_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the product attribute is checked and verify");
			attr.verify1();
			loginfo.pass("product attr Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}
	//edit the attribute
	@Given("^User will go to parts page and search for partno to edit product attribute$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_edit_product_attribute() throws Throwable {
		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT product attribute").assignCategory("product attribute")
					.pass("Part attribute edited");
			test = test.createNode(Scenario.class, "Checking on the product attribute");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to edit product attribute");			
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));			
			attr.partattrlanding();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will go to product attribute page and check the attibute data for edit that partno and save$")
	public void user_will_go_to_product_attribute_page_and_check_the_attibute_data_for_edit_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to product attribute page and check the attibute data for edit that partno and save");
			attr.attrbutedit();
			attr.saveattr();
			attr.acceptAlert1();
			loginfo.pass("Size Added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will check the product attribute edit is checked and verify$")
	public void user_will_check_the_product_attribute_edit_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will check the product attribute edit is checked and verify");
			attr.verify1();
			loginfo.pass("product attr edit Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			 //extent.flush();
		}
	}

	@Given("^User will go to parts page and search for partno to unchecking the product attribute$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_unchecking_the_product_attribute()
			throws Throwable {
		try {
		//extent = setup();
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

	@When("^User will goto product attribute page and delete the product attribute data for that part and save$")
	public void user_will_goto_product_attribute_page_and_delete_the_product_attribute_data_for_that_part_and_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will goto product attribute page and delete the product attribute data for that part and save");
			//attr.delcheckbox();
			attr.delattr();			
			attr.acceptAlert1();
			loginfo.pass("product attribute deleted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the changes done in product attribute$")
	public void user_will_verify_the_changes_done_in_product_attribute() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will verify the changes done in product attribute");
			attr.verify1();
			loginfo.pass("product attribute deleted verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		//extent.flush();

		}
	}

}
