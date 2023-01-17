package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsAdd_POM;

import utility.Baseclass;

public class TC004_PMT_PartsAdd extends Baseclass {


	ExtentTest loginfo=null;
	PartsAdd_POM parts;
	

	@Given("^User will click on parts page and it will redirect to parts page$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page() throws Throwable {
	  
	try {
		//extent=setup();	
		test = extent.createTest(Feature.class, "PMT Add Product List").assignCategory("Parts Add").pass("category added thanks");
		test=test.createNode(Scenario.class, "Adding part# with created product category");
		loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on parts page and it will redirect to parts page");
		parts = new PartsAdd_POM();
		parts.partslandingpage();
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		
	 }   catch (Exception e) {
		 System.out.println(e);
		 TestStep("Fail",driver,loginfo,e);
}
	}

	@When("^User will click on the add buton and choose product category, sub category,part desc, product line$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line() throws Throwable {
	   
	try {
		loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add buton and choose product category, sub category,part desc, product line");
		parts.partsadd();
		parts.scrolldown();
		//parts.partsadddrp2();
		//parts.partsadddrp3();
		//parts.scrolldown();
		parts.partsadddrp41();
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	} 	catch ( Exception e) {
		System.out.println(e);
		TestStep("Fail",driver,loginfo,e);
		
	}	
	}

	@And("^User will enter the part# and click on save$")
	public void user_will_enter_the_part_and_click_on_save() throws Throwable {
	   
	try {
		loginfo=test.createNode(new GherkinKeyword("And"),"User will enter the part# and click on save");
		parts.savenewpart(pro.getProperty("partno"));
		parts.acceptAlert();
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		System.out.println(e);
		TestStep("Fail",driver,loginfo,e);
		
		
	}
		
	}

	@Then("^User will see successfull alert and verify the part# thorugh part# search$")
	public void user_will_see_successfull_alert_and_verify_the_part_thorugh_part_search() throws Throwable {
	 
	try {
		loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfull alert and verify the part# thorugh part# search");
		
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//extent.flush();
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
		System.out.println(e);
		//extent.flush();
		
	}
		
	}

	@Given("^User will click on parts page and it will redirect to parts page for part# search through dropdown$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page_for_part_search_through_dropdown() throws Throwable {
	    
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Add Product List").assignCategory("Parts Dropdown search").pass("sub category added thanks");
			test=test.createNode(Scenario.class, "Search part# by given dropdown list");
		loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on parts page and it will redirect to parts page for part# search through dropdown");
		parts = new PartsAdd_POM();
		parts.partslandingpage2();
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}	catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}
		
	}

	@When("^User will choose the category, sub category, part description, product line and part# dropdown & search$")
	public void user_will_choose_the_category_sub_category_part_description_product_line_and_part_dropdown_search() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add button and choose the category drop down list");
		parts.dropdownfiltercategory();
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//parts.dropdownfiltersubcategory();
		//parts.dropdownfilterpartdesc();
		//parts.dropdownfilterprdtln();
		//parts.dropdownfilterpartno();
		parts.filetrpartno();
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}	catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}
		
	}

	@Then("^User will see the search part#$")
	public void user_will_see_the_search_part() throws Throwable {
	   
		try {
	    	loginfo=test.createNode(new GherkinKeyword("Then"),"User will see the search part#");
		System.out.println("Search part# successfull");
		loginfo.pass("Parts page landed successfully");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		//extent.flush();
		}	catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
			//extent.flush();
		}
	}

	

	
}

