package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Applicationrelated_vehicle_make_model;
import pageobjectmodel.DeleteIntchgName;
import pageobjectmodel.DeleteIntchgPartno;
import pageobjectmodel.DeletedAll_POM;
import utility.Baseclass;

public class TC045_PMT_Delete_All extends Baseclass{
	DeletedAll_POM  Del = new DeletedAll_POM();
	ExtentTest loginfo = null;
	
	@Given("^User will mousehouse and click the partspage-Engine oil test$")
	public void user_will_mousehouse_and_click_the_partspage_Engine_oil_test() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del partno")
					.assignCategory("Master-deleted Related part-1").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related partno Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click the partspage-Engine oil test");
			Del = new DeletedAll_POM();
			 Del.partclk();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Engine oil test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		}
	}

	@When("^User will select the category and partnumber and search button then Delete part category-Engine oil test$")
	public void user_will_select_the_category_and_partnumber_and_search_button_then_Delete_part_category_Engine_oil_test() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category and partnumber and search button then Delete part category-Engine oil test");
			
			 Del.seldropdowncategory(pro.getProperty("categoryname1"));
			 Del.seldropdownpartno(pro.getProperty("newpartno"));
			 Del.commandmethod();
			 Del.seldropdowncategory(pro.getProperty("categoryname1"));
			 Del.seldropdownpartno1(pro.getProperty("partno12"));
			 Del.commandmethod();
			 Del.seldropdowncategory(pro.getProperty("categoryname1"));
			 Del.seldropdownpartno2(pro.getProperty("partno"));
			 Del.commandmethod();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("model deleted successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}


	@Given("^User will mousehouse and click the partspage-Steering test$")
	public void user_will_mousehouse_and_click_the_partspage_Steering_test() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del partno")
					.assignCategory("Master-deleted Related part-1").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related partno Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click the partspage-Steering test");
			Del = new DeletedAll_POM();
			 Del.partclk();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Steering test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		}
	}

	@When("^User will select the category and partnumber and search button then Delete part category-Steering test$")
	public void user_will_select_the_category_and_partnumber_and_search_button_then_Delete_part_category_Steering_test() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category and partnumber and search button then Delete part category-Steering test");
			
			 Del.seldropdowncategoryST(pro.getProperty("categoryname"));
			 Del.seldropdownPartNoST(pro.getProperty("partno08"));
			 Del.commandmethod();
			 Del.seldropdowncategoryST(pro.getProperty("categoryname"));
			 Del.seldropdownpartnoST01(pro.getProperty("partno"));
			 Del.commandmethod();
			 Del.seldropdowncategoryST(pro.getProperty("categoryname"));
			 Del.seldropdownpartnoST02(pro.getProperty("partno1"));
			 Del.commandmethod();
			 Del.seldropdowncategoryST(pro.getProperty("categoryname"));
			 Del.seldropdownpartnoST03(pro.getProperty("partno2"));
			 Del.commandmethod();
			 Del.seldropdowncategoryST(pro.getProperty("categoryname"));
			 Del.seldropdownpartnoST04(pro.getProperty("partno3"));
			 Del.commandmethod();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Steering test deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}
/////////////////////////////////////vehicle start ///////////////////////
	
	@Given("^User will mousehouse and click the partspage-Test Chevrolet$")
	public void user_will_mousehouse_and_click_the_partspage_Test_Chevrolet() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del Vehicle")
					.assignCategory("Master-deleted Related Vehcile").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related Vehicle Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click the partspage-Test Chevrolet");
			Del = new DeletedAll_POM();
			Del.vehicle();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Steering test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		}

	}

	@When("^User will select the category and partnumber and search button then Delete part category-Test Chevrolet$")
	public void user_will_select_the_category_and_partnumber_and_search_button_then_Delete_part_category_Test_Chevrolet() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category and partnumber and search button then Delete part category-Test Chevrolet");
		
			Del.selvehcile(pro.getProperty("makename"));
			Del.selvehmodel(pro.getProperty("modelname"));
			Del.clksh();
			Del.cldel();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Steering test deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}
	
	@Given("^User will mousehouse and click partspage Test Chevrolet$")
	public void user_will_mousehouse_and_click_partspage_Test_Chevrolet() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del Vehicle")
					.assignCategory("Master-deleted Related Vehcile").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related Vehicle Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click  partspage-Test Chevrolet-");
			Del = new DeletedAll_POM();
			Del.vehicle();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Steering test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		}
	}

	@When("^User will select the category partnumber and search button then Delete part category-Test Chevrolet-$")
	public void user_will_select_the_category_partnumber_and_search_button_then_Delete_part_category_Test_Chevrolet() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category partnumber and search button then Delete part category-Test Chevrolet-");
		
			Del.selvehcile(pro.getProperty("makename"));
			Del.selvehmodel(pro.getProperty("modelname"));
			Del.clksh();
			Del.cldel();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Steering test deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	@Given("^User will mousehouse click the partspage-Test Chevrolet$")
	public void user_will_mousehouse_click_the_partspage_Test_Chevrolet() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del Vehicle")
					.assignCategory("Master-deleted Related Vehcile").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related Vehicle Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click the partspage-Test Chevrolet");
			Del = new DeletedAll_POM();
			Del.vehicle();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Steering test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		} 
	}

	@When("^User will select the category and partnumber search button then Delete part category-Test Chevrolet$")
	public void user_will_select_the_category_and_partnumber_search_button_then_Delete_part_category_Test_Chevrolet() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category and partnumber and search button then Delete part category-Test Chevrolet");
		
			Del.selvehcile(pro.getProperty("makename"));
			Del.selvehmodel(pro.getProperty("modelname"));
			Del.clksh();
			Del.cldel();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Steering test deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}


	@Given("^User will mousehouse and click the partspage-Test Chevrolettwo$")
	public void user_will_mousehouse_and_click_the_partspage_Test_Chevrolettwo() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del Vehicle")
					.assignCategory("Master-deleted Related Vehcile").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related Vehicle Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehouse and click the partspage-Test Chevrolettwo");
			Del = new DeletedAll_POM();
			 Del.vehicle();
			
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("-Steering test type page Deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			
		}
	}

	@When("^User will select the category and partnumber and search button then Delete part category-Test Chevrolettwo$")
	public void user_will_select_the_category_and_partnumber_and_search_button_then_Delete_part_category_Test_Chevrolettwo() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select the category and partnumber and search button then Delete part category-Test Chevrolettwo");
			
			Del.selvehcile(pro.getProperty("makename0"));
			Del.selvehmodel(pro.getProperty("modelname0"));
			Del.clksh();
			Del.cldel();
			 
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Steering test deleted successfully");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		} 
	}
//////////////////////interchange PartNo deleted started ///////////////////////////////
	@Given("^User will mouse over master and click Interchange Partno-ALL$")
	public void user_will_mouse_over_master_and_click_Interchange_Partno() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Interchange Related")
					.assignCategory("Delete Interchange Partno").pass("Interchange Partno Deleted");
			test = test.createNode(Scenario.class, "Deleting Interchange Partno");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse over master and click Interchange Partno-ALL");
			Del = new DeletedAll_POM();
			
			  Del.clickonInterchangePart();
			  
			
			loginfo.pass(" Interchange Partno Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Partno Button Not Clicked " + e.getMessage());
			loginfo.fail(" Interchange Partno Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Select Interchange Name and search Interchange Partno-ALL$")
	public void user_will_Select_Interchange_Name_and_search_Interchange_Partno() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Interchange Name and search Interchange Partno-ALL");

			
			Del.SelectIntName(pro.getProperty("InterchangeNameValue"));
			Del.SearchIntchgpartValue(pro.getProperty("interchangepartno"));
			
			
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected or Interchange Part# Not Entered " + e.getMessage());
			loginfo.fail(" Interchange Name Not selected or Interchange Part# Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click delete and accept the alert-ALL$")
	public void user_will_click_delete_and_accept_the_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click delete and accept the alert-ALL");
			
			
			Del.ClickDeletePart1();
			  
			Del.acceptAlertPart1();
			  
			Del.acceptAlertPart1();
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

			loginfo.pass(" Interchange Part# Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Deleted " + e.getMessage());
			loginfo.fail(" Interchange Part# Not Deleted  ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify Interchange Partno is deleted or not-ALL$")
	public void user_will_verify_Interchange_Partno_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify Interchange Partno is deleted or not-ALL");
			
			Del.verifytext1(pro.getProperty("InterchangeNameValue"), pro.getProperty("interchangepartno"),
					pro.getProperty("DeleteProducttxt"));

			loginfo.pass("Deleted IntchgPartno verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		 //extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted IntchgPartno Not verify " + e.getMessage());
			loginfo.fail("Deleted IntchgPartno Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}

	}
	@Given("^User will mouse over master and click Interchange Partno-ALL-Testpart-Two$")
	public void user_will_mouse_over_master_and_click_Interchange_Partno_ALL_Testpart_Two() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Interchange Related")
					.assignCategory("Delete Interchange Partno").pass("Interchange Partno Deleted");
			test = test.createNode(Scenario.class, "Deleting Interchange Partno-02");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse over master and click Interchange Partno-ALL-Testpart-Two");
			
			Del = new DeletedAll_POM();
			
			Del.clickonInterchangePart();
			 
			loginfo.pass(" Interchange Partno Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Partno Button Not Clicked " + e.getMessage());
			loginfo.fail(" Interchange Partno Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Select Interchange Name and search Interchange Partno-ALL-Testpart-Two$")
	public void user_will_Select_Interchange_Name_and_search_Interchange_Partno_ALL_Testpart_Two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Interchange Name and search Interchange Partno-ALL-Testpart-Two");

			
			Del.SelectIntName(pro.getProperty("InterchangeNameValue"));
			Del.SearchIntchgpartValue(pro.getProperty("partno2"));
			
			
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected or Interchange Part# Not Entered " + e.getMessage());
			loginfo.fail(" Interchange Name Not selected or Interchange Part# Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click delete and accept the alert-ALL-Testpart-Two$")
	public void user_will_click_delete_and_accept_the_alert_ALL_Testpart_Two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click delete and accept the alert-ALL-Testpart-Two");
			
			
			Del.ClickDeletePart1();
			  
			Del.acceptAlertPart1();
			  
			Del.acceptAlertPart1();
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

			loginfo.pass(" Interchange Part# Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Deleted " + e.getMessage());
			loginfo.fail(" Interchange Part# Not Deleted  ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify Interchange Partno is deleted or not-ALL-Testpart-Two$")
	public void user_will_verify_Interchange_Partno_is_deleted_or_not_ALL_Testpart_Two() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify Interchange Partno is deleted or not-ALL-Testpart-Two");
			
			Del.verifytext1(pro.getProperty("InterchangeNameValue"), pro.getProperty("partno2"),
					pro.getProperty("DeleteProducttxt"));

			loginfo.pass("Deleted IntchgPartno verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted IntchgPartno Not verify " + e.getMessage());
			loginfo.fail("Deleted IntchgPartno Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	@Given("^User will mouse over master and click Interchange Partno-ALL-Testpart-Three$")
	public void user_will_mouse_over_master_and_click_Interchange_Partno_ALL_Testpart_Three() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Interchange Related")
					.assignCategory("Delete Interchange Partno").pass("Interchange Partno Deleted");
			test = test.createNode(Scenario.class, "Deleting Interchange Partno-03");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse over master and click Interchange Partno-ALL-Testpart-Three");
			Del = new DeletedAll_POM();
			
			Del.clickonInterchangePart();
			 
			loginfo.pass(" Interchange Partno Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Partno Button Not Clicked " + e.getMessage());
			loginfo.fail(" Interchange Partno Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Select Interchange Name and search Interchange Partno-ALL-Testpart-Three$")
	public void user_will_Select_Interchange_Name_and_search_Interchange_Partno_ALL_Testpart_Three() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Interchange Name and search Interchange Partno-ALL-Testpart-Three");

			
			Del.SelectIntName(pro.getProperty("InterchangeNameValue"));
			Del.SearchIntchgpartValue(pro.getProperty("partno3"));
			
			
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected or Interchange Part# Not Entered " + e.getMessage());
			loginfo.fail(" Interchange Name Not selected or Interchange Part# Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click delete and accept the alert-ALL-Testpart-Three$")
	public void user_will_click_delete_and_accept_the_alert_ALL_Testpart_Three() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click delete and accept the alert-ALL-Testpart-Three");
			
			
			Del.ClickDeletePart1();
			  
			Del.acceptAlertPart1();
			  
			Del.acceptAlertPart1();
			
			loginfo.pass(" Interchange Name selected & Interchange Part# Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

			loginfo.pass(" Interchange Part# Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Deleted " + e.getMessage());
			loginfo.fail(" Interchange Part# Not Deleted  ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will verify Interchange Partno is deleted or not-ALL-Testpart-Three$")
	public void user_will_verify_Interchange_Partno_is_deleted_or_not_ALL_Testpart_Three() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify Interchange Partno is deleted or not-ALL-Testpart-Three");
			
			Del.verifytext1(pro.getProperty("InterchangeNameValue"), pro.getProperty("partno3"),
					pro.getProperty("DeleteProducttxt"));

			loginfo.pass("Deleted IntchgPartno verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		// extent.flush();
		} catch (Exception e) {
			System.out.println("Deleted IntchgPartno Not verify " + e.getMessage());
			loginfo.fail("Deleted IntchgPartno Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}


//////////////////////interchange PartNo deleted ended///////////////////////////////
	
	//////////////////////interchange name deleted started ///////////////////////////////

	@Given("^User will mouse over emaster and click Interchange Name-all$")
	public void user_will_mouse_over_emaster_and_click_Interchange_Name() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Interchange Related").assignCategory("Delete InterchangeName").pass("InterchangeName Deleted");
			test=test.createNode(Scenario.class, "Deleting InterchangeName");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mouse over emaster and click Interchange Name-all");
			Del = new DeletedAll_POM();
			Del.clickonInterchangeName();
			loginfo.pass(" Interchange Name Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Name Button Not Clicked "+e.getMessage());
			loginfo.fail(" Interchange Name Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User search InterchangeName in clk searchBox$")
	public void user_search_InterchangeName_in_searchBox() throws Throwable {
		
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User search InterchangeName in clk searchBox");
			Del.SearchIntchgNameValue(pro.getProperty("InterchangeNameValue"));
			loginfo.pass(" Interchange Name selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Interchange Name Not selected "+e.getMessage());
			loginfo.fail(" Interchange Name Not selected ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@When("^User will click delete and accept alert-all$")
	public void user_will_click_delete_and_accept_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click delete and accept alert-all");
			Del.ClickDeleteName();
			Del.acceptAlertName();
			Del.acceptAlertName();
			loginfo.pass(" Interchange Name Deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Name Not Deleted Succesfully"+e.getMessage());
			loginfo.fail(" Interchange Name Not Deleted Succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}
	@Then("^User will verify InterchangeName is deleted or not-all$")
	public void user_will_verify_InterchangeName_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will verify InterchangeName is deleted or not-all");
			Del.verifytextName(pro.getProperty("InterchangeNameValue"), pro.getProperty("DeleteProducttxt"));
			
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