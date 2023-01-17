package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageobjectmodel.PartCk33Add_POM;

import utility.Baseclass;

public class TC002_PMT_productrelated11 extends Baseclass {
	
	
	ExtentTest loginfo = null;
	//Masterproductrelated_POM mpom;
	PartCk33Add_POM parts;
	
	@Given("^User will click on parts page and it should redirect to parts page_MUL$")
	public void user_will_click_on_parts_page_and_it_should_redirect_to_parts_page() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Part_TC002_PMT_PartAdding part no with created product category_Mul")
					.assignCategory("Parts Add Tag").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding part# with created product category_Mul");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and it will redirect to parts page_MUL");
			parts = new PartCk33Add_POM();
			parts.partslandingpage();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add buton and choose VMRS Code product category, sub category,part desc, product line_MUL$")
	public void user_will_click_on_the_add_buton_and_choose_VMRS_Code_product_category_sub_category_part_desc_product_line_MUL() throws Throwable {


		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add buton and choose VMRS Code product category, sub category,part desc, product line_MUL");
			parts.vrmscodeadd(pro.getProperty("partvrmscode"));
			parts.partsadd1();
			parts.partsadddrp21();
			parts.partsadddrp31();
			parts.partsadddrp41();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the partNo and click save$")
	public void user_will_enter_the_partNO_and_click_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the part# and click on save_MUL");
			parts.savenewpart1(pro.getProperty("partno1"));
			parts.acceptAlert();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@Then("^User will successfully alert and verify the partNO thorugh partNO search_MUL$")
	public void user_will_successfully_alert_and_verify_the_partNO_thorugh_partNO_search_MUL() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search_MUL");

			loginfo.pass("Parts page landed successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	////partsearch//////
	@Given("^User will the part page$")
	public void user_will_the_part_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Part_TC002_PartAdding")
					.assignCategory("Parts search button").pass("parts search thanks");
			test = test.createNode(Scenario.class, "parts verfity");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will part page");
		parts = new PartCk33Add_POM();
			parts.partslandingpage1();
			loginfo.pass("Parts search successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@When("^User will Enter the partsnumber$")
	public void user_will_Enter_the_partsnumber() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Part_TC002_PartAdding")
					.assignCategory("Parts search button").pass("parts search thanks");
			test = test.createNode(Scenario.class, "parts verfity");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will Enter the partsnumbe");
			parts.partsearch(pro.getProperty("partvalue11"));
			loginfo.pass("Parts search successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@When("^User will click the search button$")
	public void user_will_click_the_search_button() throws Throwable {
		try {
		// extent = setup();
					test = extent.createTest(Feature.class, "Part_TC002_PartAdding")
							.assignCategory("Parts search button").pass("parts search thanks");
					test = test.createNode(Scenario.class, "parts verfity");
					loginfo = test.createNode(new GherkinKeyword("Given"),
							"User will click the search button");
					parts.partsearchbut();
					loginfo.pass("Parts search successfully");
				}catch (Exception e) {
					TestStep("Fail", driver, loginfo, e);
					System.out.println(e);
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
	}
	 
	@Then("^User will verify the part#$")
	public void user_will_verify_the_part() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the part#");
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
	    
	}
}
}