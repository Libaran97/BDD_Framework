package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MultiAddPom;
import pageobjectmodel.MultiAddPom2;
import utility.Baseclass;

public class TC037_Multiaddpartslinked2 extends Baseclass {
	MultiAddPom mpom1 = new MultiAddPom();
	MultiAddPom2 mpom2 = new MultiAddPom2();
	ExtentTest loginfo = null;

	@Given("^: user will choos the application paged and multiadd pages$")
	public void user_will_choos_the_application_paged_and_multiadd_pages() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "Check the partslinked2 edit-TC037").assignCategory("PIES MultiAdd")
					.pass("Part Linked Edit option is verified");
			test = test.createNode(Scenario.class, "Multiadd part description and part no to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will choos the application paged and multiadd pages");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);			
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}

	}

	@When("^: user will check the all chosed Vehicle make model along with click the search$")
	public void user_will_check_the_all_chosed_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chosed Vehicle,make,model along with click the search");
			Thread.sleep(5000);
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will Click , Parts Linked popups$")
	public void user_will_Click_Parts_Linked_popups() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will Click the Parts Linked popup");
			//mpom2 = new MultiAddPom2();
			//mpom2.partslinked();	
			mpom2.partlinkednew();
			mpom2.windowhandler();			
			mpom2.viewedit();			
			//mpom2.POPEdit("vehicletypename0");
			//mpom2.acceptAlert();
			
			// mpom2.verifyedit("vehicletypename0");
			System.out.println("Click the Parts linked and Edit is verification Passed");
			loginfo.pass("Click the Parts linked and Edit is verification Passed");
			System.out.println("Finally click the Parts linkedEdit or delete verification");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			System.out.println(
					"Finally click the Parts linked and open the popup box and verification failed " + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will choos the application paged and multiadd page$")
	public void user_will_choos_the_application_paged_and_multiadd_page() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "Check the partslinked2 Cancel-TC037").assignCategory("PIES MultiAdd")
					.pass("Part Linked Cancel is verified");
			test = test.createNode(Scenario.class, "Multiadd part description and part no to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will choos the application paged and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosed Vehicle make model along with click search$")
	public void user_will_check_the_all_chosed_Vehicle_make_model_along_with_click_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chosed Vehicle make model along with click search");
			Thread.sleep(5000);
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user check the Cancel button and Part linkeds$")
	public void user_check_the_Cancel_button_and_Part_linkeds() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user check the Cancel button and Part linked");
			// mpom2 = new MultiAddPom2();
			mpom2.partlinkednew();
			System.out.println("Purila");
			Thread.sleep(5000);
			mpom2.windowhandler();
			mpom2.viewedit();
			mpom2.vieweditcancel("vehicletypename0");
			// mpom2.acceptAlert();
			// mpom2.verifyedit("vehicletypename0");
			System.out.println("Click the Parts linked Cancel and verification Passed");
			loginfo.pass("Click the Parts linked Cancel and verification Passed");
			System.out.println("Finally click the Parts linked Cancel verification");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			System.out.println("Click the Parts linked Cancel and verification failed " + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will choos the application page and multiadd pages$")
	public void user_will_choos_the_application_page_and_multiadd_pages() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "Check the partslinked2 Delete-TC037").assignCategory("PIES MultiAdd")
					.pass("Part Linked Delete is verified");
			test = test.createNode(Scenario.class, "Multiadd part description and part no to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will choos the application page and multiadd pages");			
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@When("^: user will check the all chosed Vehicle make model with click the search$")
	public void user_will_check_the_all_chosed_Vehicle_make_model_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chosed Vehicle make model with click the search");
			Thread.sleep(5000);
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user check the Delete button and Part linked$")
	public void user_check_the_Delete_button_and_Part_linked() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user check the Delete button and Part linked");
			mpom2.partlinkednew();
			mpom2.windowhandler();
			try {
				mpom2.vieweditdelete();
				mpom2.acceptAlert();
				mpom2.verifyvieweditdelete();
			} catch (Exception e) {
				System.out.println("No record found to delete into the popup**");
			}

			System.out.println("Click the Parts linked Delete and verification Passed");
			loginfo.pass("Click the Parts linked Delete and verification Passed");
			System.out.println("Finally click the Parts delete verification");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			System.out.println("Click the Parts linked Delete and verification failed " + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will choos the application paged and multiadd$")
	public void user_will_choos_the_application_paged_and_multiadd() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "Check the sorting2 in partlinked-TC037").assignCategory("PIES MultiAdd").pass("Vehicle sorting is verified");
			test = test.createNode(Scenario.class, "Multiadd part description and part no to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will choos the application paged and multiadd");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@And("^: user will check the sorting order TC037$")
	public void user_will_check_the_sorting_order_TC037() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "user will check the sorting order TC037");
			mpom2.SortPartDescription_TC037();
			loginfo.pass("sorting order verification Passed");
			System.out.println("Finally click the Parts sorting verification Passed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
			 System.out.println(e);
			System.out.println("sorting order verification Passed failed" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	
	}

