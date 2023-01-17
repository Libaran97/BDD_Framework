package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Digitalasset_POM;
import pageobjectmodel.Extendedinfo_POM;
import pageobjectmodel.Partdescription_POM;
import utility.Baseclass;

public class TC009_PMT_Partextendedinfo extends Baseclass {

	Extendedinfo_POM ext;
	ExtentTest loginfo=null;
	Partdescription_POM partdesc;
	
	/*
	 * 
	 * extendedinfoadd
	 */
	
	@Given("^User will go to parts page and search for partno$")
	public void user_will_go_to_parts_page_and_search_for_partno() throws Throwable {
	   
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Extended Info").assignCategory("Extended Info").pass("Extended Info added");
			test=test.createNode(Scenario.class, "Adding Extended information");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to parts page and search for partno");
			ext = new Extendedinfo_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			ext.extendframe();
			loginfo.pass("Extended info landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}	catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);	
		}
	}

	@When("^User will go to extended info and add a record$")
	public void user_will_go_to_extended_info_and_add_a_record() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will go to extended info and add a record");
			ext.selectextenddrop();
			ext.entertextextend();
			ext.selectlanguage();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			ext.btsave1();
			ext.acceptAlert1();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}
	}
	
	@Then("^User will added successfully the info and verify$")
	public void user_will_added_successfully_the_info_and_verify() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will added successfully the info and verify");
			ext.extverification();
			//extent.flush();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			//extent.flush();
		}
	}
//extendedinfodelete//
	
	@Given("^User will go to part page and search for partno to delete extended info record$")
	public void user_will_go_to_part_page_and_search_for_partno_to_delete_extended_info_record() throws Throwable {
	   
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Extended Info").assignCategory("Extended Info").pass("Extended Info added");
			test=test.createNode(Scenario.class, "Deleting eended information");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to part page and search for partno to delete extended info record");
			ext = new Extendedinfo_POM();
			partdesc = new Partdescription_POM();
			partdesc.partslanding();
			partdesc.partsearch(pro.getProperty("partnoenter"));
			ext.extendframe();
			loginfo.pass("Extended info landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}	catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);	
		}
	}

	@When("^User will landed in extended info page and will delete a record$")
	public void user_will_landed_in_extended_info_page_and_will_delete_a_record() throws Throwable {
	 
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will landed in extended info page and will delete a record");
			ext.deleteinfo();
			ext.acceptAlert1();
			ext.acceptAlert1();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}
	}

	@Then("^User will delete successfully and verify whether the record is deleted$")
	public void user_will_delete_successfully_and_verify_whether_the_record_is_deleted() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will delete successfully and verify whether the record is deleted");
			ext.extverificationdel();
			//extent.flush();
		}catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			//extent.flush();
		}
	}

	
}
