package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.AcesInvalid;

import utility.Baseclass;

public class TC015_AcesInvalid extends Baseclass {

	ExtentTest loginfo=null;
	AcesInvalid AcesInd;
	
	@Given("^User will go to parts page and search for a partno and will tie-up the application$")
	public void user_will_go_to_parts_page_and_search_for_a_partno_and_will_tie_up_the_application() throws Throwable {
		
		try {
			extent=setup();	
			test = extent.createTest(Feature.class, "PMT Reports Aces Invalid check").assignCategory("Parts Buyersguide").pass("Buyers guide add");
			test=test.createNode(Scenario.class, "Adding AcesInvalid application through buyers guide");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to parts page and search for a partno and will tie-up the application");
			AcesInd = new AcesInvalid();
			AcesInd.partslanding();
			AcesInd.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println("PartNo not searched " + e.getMessage());
			 loginfo.fail("PartNo not searched");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}

	@When("^User will click on buyersguide and choose the vehicle, make, model & search$")
	public void user_will_click_on_buyersguide_and_choose_the_vehicle_make_model_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on buyersguide and choose the vehicle, make, model & search");
			AcesInd.buyerguideclick();
			AcesInd.apppartsvehicldropdown();
			AcesInd.apppartsmakedropdown();
			AcesInd.apppartsmodeldropdown();
			AcesInd.appartsenginetextbox();
			AcesInd.apppartsearch();
			loginfo.pass(" Application search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			System.out.println("Application not searched " + e.getMessage());
			 loginfo.fail("Application not searched ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@And("^User will choose an enginebase, Select Attributes Invalid data and click on save$")
	public void user_will_choose_an_enginebase_Select_Attributes_Invalid_data_and_click_on_save() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will choose an enginebase, Select Attributes Invalid data and click on save");
			//AcesInd.apppartsenginebase();
			AcesInd.Alcheck();
			//AcesInd.SelectAttributes();
			AcesInd.savebtn();
			AcesInd.acceptAlert();
			loginfo.pass(" Application Added succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			System.out.println("Application not Added " + e.getMessage());
			 loginfo.fail("Application not Added ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has shown in the below grid is Invalid$")
	public void user_will_see_successfull_alert_and_verify_the_reocrd_has_shown_in_the_below_grid_is_Invalid() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will verify the reocrd has shown in the below grid is Invalid");
			AcesInd.bguideverification();
			//AcesInd.validate();
			loginfo.pass(" Aces Invalid Application Validated succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}   catch (Exception e) {
			System.out.println("Application not Validated " + e.getMessage());
			 loginfo.fail("Application not Added ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	   
	}
	
	
	@Given("^User will click Reports and select Aces Invalid$")
	public void user_will_click_Reports_and_select_Aces_Invalid() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Reports Aces Invalid check").assignCategory("Reports AcesInvalid").pass("Search AcesInvalid change to Valid");
			test=test.createNode(Scenario.class, "Check AcesInvalid and Change to Valid");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click Reports and select Aces Invalid");
			AcesInd = new AcesInvalid();
			AcesInd.Reports();
			
			loginfo.pass(" Reports and Aces Invalid Clicked succesfully ");
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println("Reports or Aces Invalid Not Clicked " + e.getMessage());
			 loginfo.fail("Reports or Aces Invalid Not Clicked");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}

	@When("^User will choose version date, vehicle, make, model & search$")
	public void user_will_choose_version_date_vehicle_make_model_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will choose version date, vehicle, make, model & search");
			AcesInd.Versiondd();
			AcesInd.apppartsvehicldropdown1();
			AcesInd.apppartsmakedropdown();
			AcesInd.apppartsmodeldropdown();
			AcesInd.Invalidappsearch();
			loginfo.pass(" Application search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			System.out.println("Application not searched " + e.getMessage());
			 loginfo.fail("Application not searched ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@And("^User will click Get Aces Value and capture the Value$")
	public void user_will_click_Get_Aces_Value_and_capture_the_Value() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will click Get Aces Value and capture the Value");
			
			AcesInd.AcesValue();
			loginfo.pass(" Aces Value Checked succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			System.out.println("Aces Value Not Checked " + e.getMessage());
			 loginfo.fail("Aces Value Not Checked ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Edit Application and change to Valid Application$")
	public void user_will_Edit_Application_and_change_to_Valid_Application() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Edit Application and change to Valid Application");
			AcesInd.Edit();
			loginfo.pass(" Edited and change to valid succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			System.out.println("Edited or not change to valid " + e.getMessage());
			 loginfo.fail("Edited or not change to valid ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will goto parts page and validate application to verify application is changed to valid$")
	public void user_will_goto_parts_page_and_validate_application_to_verify_application_is_changed_to_valid() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will goto parts page and validate application to verify application is changed to valid");
			AcesInd.partslanding();
			AcesInd.partsearch(pro.getProperty("partnoenter"));
			AcesInd.buyerguideclick();
			AcesInd.validate2();
			loginfo.pass(" Aces Invalid Application Validated succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}   catch (Exception e) {
			System.out.println("Application not Validated " + e.getMessage());
			 loginfo.fail("Application not Added ");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

}
