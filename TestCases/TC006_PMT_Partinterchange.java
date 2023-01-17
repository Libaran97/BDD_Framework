package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Interchange_POM;
import utility.Baseclass;


public class TC006_PMT_Partinterchange extends Baseclass {

	ExtentTest loginfo=null;
	Interchange_POM inter;
	

	
	@Given("^User will go to parts page and search for a part#$")
	public void user_will_go_to_parts_page_and_search_for_a_part() throws Throwable {
	    
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT PIES Interchange").assignCategory("PIES Interchange Add").pass("Interchange added ");
			test=test.createNode(Scenario.class, "Adding Inetrchange for a part#");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to parts page and search for a part#");
		inter = new Interchange_POM();
		inter.partslanding();
		inter.partsearch(pro.getProperty("partnoenter"));
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println(e);
			 TestStep("Fail",driver,loginfo,e);
	}
		
	}

	@When("^User will click on the interchange frame, choose interchange name dropdown, enter interchange part# and click save$")
	public void user_will_click_on_the_interchange_frame_choose_interchange_name_dropdown_enter_interchange_part_and_click_save() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the interchange frame, choose interchange name dropdown, enter interchange part# and click save");
		inter.interchangesclick();
		inter.interchangedrpdownnotes();
		inter.Competitorpartno(pro.getProperty("Enterpartpart"));
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		inter.savebtn();
		//inter.acceptAlert();
		} 	catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}
	}

	@Then("^User will see successfull alert and verify the record to be shown in the grid below$")
	public void user_will_see_successfull_alert_and_verify_the_record_to_be_shown_in_the_grid_below() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfull alert and verify the record to be shown in the grid below");
			inter.acceptAlert();
			inter.VerifyInterchange(pro.getProperty("Enterpartpart"));
			//extent.flush();
		} 	catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			//extent.flush();
		}
	}

	@Given("^User will go to parts page and search for the part# to edit data$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_edit_data() throws Throwable {
	    
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT PIES Interchange").assignCategory("PIES Interchange Edit").pass("category added thanks");
			test=test.createNode(Scenario.class, "Editing inetrchange Test case");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to parts page and search for the part# to edit data");
		inter = new Interchange_POM();
		inter.partslanding();
		inter.partsearch(pro.getProperty("partnoenter"));
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);	
		}
	}

	@When("^User will click on interchange frame and will edit the notes & saved$")
	public void user_will_click_on_interchange_frame_and_will_edit_the_notes_saved() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on interchange frame and will edit the notes & saved");
		inter.interchangesclick();
		inter.editinterchange(pro.getProperty("partno3"));
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		inter.savebtn();
		//inter.acceptAlert();
		}catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);	
		}
		
	}

	@Then("^User will see successfull alert and verify the record should be edited successfully$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_edited_successfully() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfull alert and verify the record should be edited successfully");
		inter.acceptAlert();
			inter.VerifyInterchange(pro.getProperty("partno3"));
			extent.flush();
		} 	catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			//extent.flush();
		}
	}

	@Given("^User will go to parts page and search for a part# to delete that data$")
	public void user_will_go_to_parts_page_and_search_for_a_part_to_delete_that_data() throws Throwable {
	    
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT PIES Interchange").assignCategory("PIES Interchange Delete").pass("category delete");
			test=test.createNode(Scenario.class, "Deleting Interchange for a part#");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to parts page and search for a part# to delete that data");
			inter = new Interchange_POM();
			inter.partslanding();
			inter.partsearch(pro.getProperty("partnoenter"));
		} 	catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}
	}

	@When("^User will click on interchange frame and will delete the added or available record$")
	public void user_will_click_on_interchange_frame_and_will_delete_the_added_or_available_record() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on interchange frame and will delete the added or available record");
			inter.interchangesclick();
			inter.deletepartinter();
			inter.acceptDeleteAlert();
			inter.acceptDeleteAlert();
		} 	catch (Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}
	}

	@Then("^User will see successfull alert and verify the record has been deleted or not$")
	public void user_will_see_successfull_alert_and_verify_the_record_has_been_deleted_or_not() throws Throwable {
	 
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfull alert and verify the record has been deleted or not");
		
		inter.VerifyDeleteIntchange(pro.getProperty("partno3"), pro.getProperty("DeleteProducttxt"));
		//extent.flush();
	} 	catch (Exception e) {
		System.out.println(e);
		TestStep("Fail",driver,loginfo,e);
		//extent.flush();
		
	}
	}

	
	

}

