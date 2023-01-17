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

import pageobjectmodel.MyCatalogInterchangePom;
import utility.Baseclass;

public class TC043_PMTMyCatalogInterchange extends Baseclass {
	MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	
	
	@Given("^User go to the parts page and Search part#$")
	public void user_go_to_the_parts_page_and_Search_part() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "My catalog Interchange").assignCategory("Category")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Interchange in part page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User go to the parts page and Search part#");
			mpom=new MyCatalogInterchangePom();
			mpom.partslanding();
			mpom.partsearch(pro.getProperty("Partvalue"));
			
			loginfo.pass("parts landed successfully");
	}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
		}}

	@When("^User will click the interchange sub module and choose Interchange name,Enter Interchange part# and save part$")
	public void user_will_click_the_interchange_sub_module_and_choose_Interchange_name_Enter_Interchange_part_and_save_part() throws Throwable {
		try {
		
		loginfo = test.createNode(new GherkinKeyword("When"),
				"User will click the interchange sub module and choose Interchange name,Enter Interchange part#and click save");
		mpom.interchangesclick();
		mpom.interchangedrpdownnotes();
		mpom.Competitorpartno(pro.getProperty("Enterpartpart"));
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		
			
	}
	catch (Exception e) {
		TestStep("Fail", driver, loginfo, e);
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		System.out.println(e);
	}
	
	
	}

	@Then("^User will see successfull alert and verify the record$")
	public void user_will_see_successfull_alert_and_verify_the_record() throws Throwable {
	   try {
		   loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the record#");  
		    mpom.savebtn();
			mpom.acceptAlert();
		    mpom.VerifyInterchange(pro.getProperty("Enterpartpart"));
		// extent.flush();
	   }
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
	}

	@Given("^User go to the my catalog interchange and search Interchange part#$")
	public void user_go_to_the_my_catalog_interchange_and_search_Interchange_part() throws Throwable {
	    
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "My catalog Interchange").assignCategory("Category")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Search Interchange part in My catalog");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User go to the my catalog interchange and search Interchange part#");
			mpom=new MyCatalogInterchangePom();
			mpom.MyCatalogsClick();
			mpom.MyCatalogInterchangeClick();
			mpom.EnterInterchangePartNumber(pro.getProperty("Enterpartpart"));
			mpom.EqualsOption();
			mpom.ClickSearchButton();
			//extent.flush();
		}
			catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				System.out.println(e);
				//extent.flush();
			}
		
	}

	@When("^Click part number check All in one page$")
	public void click_part_number_check_All_in_one_page() throws Throwable {
	    try {
	    	loginfo = test.createNode(new GherkinKeyword("When"),
					"Click part number check All in one page#");	
	    	mpom.partclick();
	    	Thread.sleep(4000);
	    	loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	    	//extent.flush();
	    }
		
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
	
	}

	@Then("^Back to Interchnage page$")
	public void back_to_Interchnage_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Back to Interchnage page#");
			mpom.ClickBackNavigationButton();
			mpom.ClickBackNavigationButton1();
			//extent.flush();
		}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
	
	}

	@Given("^User will go to the parts page and Search part#$")
	public void user_will_go_to_the_parts_page_and_Search_part() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "My catalog Interchange").assignCategory("Category")
					.pass("category Deleted thanks");
			test = test.createNode(Scenario.class, "Deleting Interchange in part page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to the parts page and Search part#");
			mpom=new MyCatalogInterchangePom();
			mpom.partslanding();
			mpom.partsearch(pro.getProperty("Partvalue"));	
		}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
		
	}

	@When("^User will go to interchange sub module and click delete$")
	public void user_will_go_to_interchange_sub_module_and_click_delete() throws Throwable {
		try {
	    	loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to interchange sub module and click delete#");
	    	mpom.interchangesclick();
	    	mpom.deletepartinter();
	    	mpom.acceptDeleteAlert();
	    	mpom.acceptDeleteAlert();	
		}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
		
	}

	@Then("^User will handle the deleted alert and verify the record$")
	public void user_will_handle_the_deleted_alert_and_verify_the_record() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("Then"),
				"User will handle the deleted alert and verify the record#");
		mpom.VerifyDeleteIntchange(pro.getProperty("partno2"), pro.getProperty("DeleteProducttxt"));
		//extent.flush();
		}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			//extent.flush();
		}
			
		
	}

	@Given("^User will go to my catalog interchange and Interchange part#$")
	public void user_will_go_to_my_catalog_interchange_and_Interchange_part() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "My catalog Interchange").assignCategory("Category")
					.pass("category searched thanks");
			test = test.createNode(Scenario.class, "Search Deleted part search");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to my catalog interchange and Interchange part#");
			mpom=new MyCatalogInterchangePom();
			mpom.MyCatalogsClick();
			mpom.MyCatalogInterchangeClick();
			mpom.EnterInterchangePartNumber(pro.getProperty("Enterpartpart"));
			mpom.EqualsOption();
			
			
	}
		catch (Exception e) {
		TestStep("Fail", driver, loginfo, e);
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		System.out.println(e);
		
	}
	}

	@When("^user will not see the deleted part# search$")
	public void user_will_not_see_the_deleted_part_search() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"user will not see the deleted part# search#");
		mpom.ClickSearchButton();
		}
		
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			
		}
	}

	@Then("^handle the alert and print the alert text$")
	public void handle_the_alert_and_print_the_alert_text() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"handle the alert and print the alert text#");
			mpom.acceptinvalidalert();
			extent.flush();
		}
		catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
			extent.flush();
		}
		
		
	}
	
	
}