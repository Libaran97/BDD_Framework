package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteIntchgName;
import utility.Baseclass;

public class TC028_DeleteIntchgName extends Baseclass {

	DeleteIntchgName indpom;
	ExtentTest loginfo=null;
	
	
	
	@Given("^User will mouse over emaster and click Interchange Name$")
	public void user_will_mouse_over_emaster_and_click_Interchange_Name() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Interchange Related").assignCategory("Delete InterchangeName").pass("InterchangeName Deleted");
			test=test.createNode(Scenario.class, "Deleting InterchangeName");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mouse over emaster and click Interchange Name");
			indpom = new DeleteIntchgName();
			indpom.clickonInterchangeName();
			loginfo.pass(" Interchange Name Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Name Button Not Clicked "+e.getMessage());
			loginfo.fail(" Interchange Name Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User search InterchangeName in searchBox$")
	public void user_search_InterchangeName_in_searchBox() throws Throwable {
		
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User search InterchangeName in searchBox");
			indpom.SearchIntchgNameValue(pro.getProperty("InterchangeNameValue"));
			loginfo.pass(" Interchange Name selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected "+e.getMessage());
			loginfo.fail(" Interchange Name Not selected ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@When("^User will click delete and accept alert$")
	public void user_will_click_delete_and_accept_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click delete and accept alert");
			indpom.ClickDelete();
			indpom.acceptAlert();
			indpom.acceptAlert();
			loginfo.pass(" Interchange Name Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Name Not Deleted Succesfully"+e.getMessage());
			loginfo.fail(" Interchange Name Not Deleted Succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}
	@Then("^User will verify InterchangeName is deleted or not$")
	public void user_will_verify_InterchangeName_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will verify InterchangeName is deleted or not");
			indpom.verifytext1(pro.getProperty("InterchangeNameValue"), pro.getProperty("DeleteProducttxt"));
			
			loginfo.pass("Deleted InterchangeName verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted InterchangeName Not verify "+e.getMessage());
			loginfo.fail("Deleted InterchangeName Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}


}
