package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MyCatalogBuyersGuidePom;
import pageobjectmodel.MultiAddPom;
import utility.Baseclass;

public class TC042_PMTMyCatalogBuyersGuide extends Baseclass {
	MyCatalogBuyersGuidePom mpom1;
	ExtentTest loginfo = null;

	@Given("^: Click the MyCatalog menu link SP BG$")
	public void click_the_mycatalog_menu_link_SP_BG() throws Throwable {
		try {
			
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC_SP_007").assignCategory("PMT MyCatalog Buyers Guide TC_SP_007 >>>>> ").pass("PMT MyCatalog Buyers Guide Test Scenarios Verification TC_SP_007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC_SP_007");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the MyCatalog menu link SP BG");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.MyCatalogsClick();
			loginfo.pass("My Catalog page menu link is clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog page menu link is NOT clicked successfully " + e.getMessage());
			loginfo.fail("My Catalog page menu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Click the Buyers Guide submenu link SP BG$")
	public void click_the_buyers_guide_submenu_link_SP_BG() throws Throwable {
		try {
			
			/*test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC_SP_007").assignCategory("PMT MyCatalog Buyers Guide TC_SP_007 >>>>> ").pass("PMT MyCatalog Buyers Guide Scenarios Verification TC_SP_007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC_SP_007");*/
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the Buyers Guide submenu link SP BG");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.BuyersGuideClick();
			loginfo.pass("My Catalog buyers guide submenu clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog buyers guide submenu cannot be clicked successfully " + e.getMessage());
			loginfo.fail("PMT My Catalog page buyers guide submenu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Click the Application Details Link SP BG$")
	public void click_the_application_details_link_SP_BG() throws Throwable {
		try {
			
			/*test = extent.createTest(Feature.class, "My Catalog Buyers Guide Related Testcases TC_SP_007").assignCategory("MyCatalog Buyers Guide TC_SP_007 >>>>> ").pass("MyCatalog Buyers Guide Scenarios Verification TC_SP_007 >>>>>>");
			test = test.createNode(Scenario.class, "My Catalog Buyers Guide Related Testscenarios TC_SP_007");*/
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the Application Details Link SP BG");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.ApplicationsLinkClick();
			loginfo.pass("Application Details Link clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Application Details Link cannot be clicked successfully " + e.getMessage());
			loginfo.fail("Application Details Link NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Fetch the Part Number SP BG$")
	public void fetch_the_part_number_SP_BG() throws Throwable {
		try {
			
			/*test = extent.createTest(Feature.class, "My Catalog Buyers Guide Related Testcases TC_SP_007").assignCategory("MyCatalog Buyers Guide TC_SP_007 >>>>> ").pass("MyCatalog Buyers Guide Scenarios Verification TC_SP_007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC_SP_007");*/
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Fetch the Part Number SP BG");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.FetchPartNumber();
			loginfo.pass("The Part Number is fetched successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("The Part Number cannot be fetched successfully " + e.getMessage());
			loginfo.fail("The Part Number cannot be fetched successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}

	@When("^: Trim and enter the Part Number SP BG$")
	public void trim_and_enter_the_part_number_SP_BG() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"Trim and enter the Part Number SP BG");
			mpom1.TrimEnterPartNumber();
			Thread.sleep(5000);
			loginfo.pass("The part number is trimmed and entered successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("The part number is NOT trimmed and entered successfully" + e.getMessage());
			loginfo.fail("The part number is NOT trimmed and entered successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the Search Button SP BG$")
	public void click_the_search_button_SP_BG() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Search Button SP BG");
			mpom1.ClickSearchButton();
			Thread.sleep(5000);
			loginfo.pass("The Search Button is clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Search button cannot be clicked" + e.getMessage());
			loginfo.fail("The Search Button is NOT clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Application Data Button SP BG$")
	public void click_the_view_application_data_button_SP_BG() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Application Data Button SP BG");
			mpom1.ClickViewApplicationDataButton();
			Thread.sleep(5000);
			loginfo.pass("The View Application Data Button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("View application data button cannot be clicked successfully" + e.getMessage());
			loginfo.fail("The View Application Data Button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Highlighted Record SP BG$")
	public void verify_the_highlighted_record_SP_BG() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Highlighted Record SP BG");
		mpom1.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The Highlighted record is verified successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("Highlighted record cannot be verified successfully" + e.getMessage());
			loginfo.fail("The Highlighted record is NOT verified successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	      }
	}
	
	@And("^: Click the Back Button SP BG$")
	public void click_the_back_button_SP_BG() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Back Button SP BG");
		mpom1.ClickBackButton();
		// driver.navigate().refresh();
		Thread.sleep(5000);
		loginfo.pass("The Back button is clicked successfully >>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back button cannot be clicked successfully" + e.getMessage());
			loginfo.fail("The Back button is NOT clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Part Data Button SP BG$")
	public void click_the_view_part_data_button_SP_BG() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Part Data Button SP BG");
		mpom1.ClickViewPartDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Part Data button is clicked successfully >>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Parts Data button cannot be clicked successfully" + e.getMessage());
			loginfo.fail("The View Parts Data button is NOT clicked successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Display the Header Text SP BG$")
	public void display_the_header_text_SP_BG() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Display the Header Text SP BG");
		mpom1.DisplayHeaderDetails();	
		Thread.sleep(5000);
		loginfo.pass("The Header text is verified successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Header text cannot be verified successfully" + e.getMessage());
			loginfo.fail("The Header text is NOT verified successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back Navigation Button SP BG$")
	public void click_the_back_navigation_button_SP_BG() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back Navigation Button SP BG");
		mpom1.ClickBackNavigationButton();
		Thread.sleep(5000);
		loginfo.pass("The Back navigation button is clicked successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back navigation button cannot be clicked successfully" + e.getMessage());
			loginfo.fail("The Back navigation button is NOT clicked successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Generate and download the excel$")
	public void generate_and_download_excel() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Generate and download the excel");
		mpom1.GenerateExcelReport();
		Thread.sleep(5000);
		loginfo.pass("The excel report is generated and downloaded successfully >>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The excel report cannot be generated and downloaded successfully" + e.getMessage());
			loginfo.fail("The excel report is NOT generated and downloaded successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@Then("^: Finally Click The Logout button SP BG$")
	public void finally_click_the_logout_button_SP_BG() throws Throwable {
		mpom1.ClickLogoutButton();
		//extent.flush();
	}
	
	
}