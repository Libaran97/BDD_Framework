	package pmttestcases.stepdefinition;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;	
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.GherkinKeyword;
	import com.aventstack.extentreports.gherkin.model.Feature;
	import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import pageobjectmodel.MultiAddPom2;
	import pageobjectmodel.Singleinallpage;
//import testlink.api.java.client.TestLinkAPIResults;
import utility.Baseclass;
	
	public class TC039_SingleinallpageDescription extends Baseclass {
		Singleinallpage spom1 = new Singleinallpage();
		ExtentTest loginfo = null;
		MultiAddPom2 mpom2 = new MultiAddPom2();
	
		@Given("^: user will Click the Search button$")
		public void user_will_Click_the_Search_button() throws Throwable {
			try {
				extent = setup();
				test = extent.createTest(Feature.class, "Check the Description add in singele in all page_TN039")
						.assignCategory("PIES Single in All page ").pass("Description is add verified");
				test = test.createNode(Scenario.class, "user will Click the add button");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search button");
				spom1.Searchsingle("Partnum");
				spom1.searchbt();
				loginfo.pass("user will Click the Search box");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//Baseclass.updateTestLinkResult("01-2", null, TestLinkAPIResults.TEST_PASSED);
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				loginfo.fail("user will Click the Search box not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
				//Baseclass.updateTestLinkResult("01-2", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
			}
		}
	
		@When("^: user will add the Description add application$")
		public void user_will_add_the_Description_add_application() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will add the Description add application");
				spom1.descripitonadd();
				spom1.windowhandler();
				loginfo.pass("user will Click the descripion add work");
				System.out.println("user will Click the descripion add work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the descripion add not work" + e.getMessage());
				loginfo.fail("user will Click the descripion add not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	
		@And("^: user will verify the Add product line,Notes and description$")
		public void user_will_verify_the_Add_product_line_Notes_and_description() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"user will verify the Add product line,Notes and description");
				spom1.descriptionaddoption("descriptionNotestype","Region");
			
				//spom1.searchbt();
				spom1.Verifydescriptionadd("descriptionNotestype","Region");
				loginfo.pass("user will verify the Add product line,Notes and description");
				System.out.println("user will verify the Add product line,Notes and description added");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println(
						"user will verify the Add product line,Notes and description was not work" + e.getMessage());
				loginfo.fail("user will verify the Add product line,Notes and description was not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	
		@Then("^: Finally click the Description added success$")
		public void finally_click_the_Description_added_success() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"), "Finally click the Description added success");
				System.out.println("**Finally click the Description added success**");
				loginfo.pass("Finally click the Description added success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				 //extent.flush();
			} catch (Exception e) {
				System.out.println("**Finally click the Description added failed**");
				loginfo.fail("Finally click the Description added failed");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}
	
		//2nd program
		@Given("^: user will Click the Search box and partnum$")
		public void user_will_Click_the_Search_box_and_partnum() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "Check the Description Edit in single in all page_TN039")
						.assignCategory("PIES Single in All page ").pass("Description is edit verified");
				test = test.createNode(Scenario.class, "user will Click the Search box and partnum");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search box and partnum");
				spom1.Searchsingle("newpartno");
				spom1.searchbt();
				loginfo.pass("user will Click the Search box");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				loginfo.fail("user will Click the Search box not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will edit the Description$")
		public void user_will_edit_the_Description() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will edit the Description");
				spom1.descedit();				
				spom1.windowhandler();				
				spom1.descchange("qtydata", "notesdata");				
				loginfo.pass("user will Click the descripion Edit work");
				System.out.println("user will Click the descripion Edit work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the descripion Edit not work" + e.getMessage());
				loginfo.fail("user will Click the descripion Edit not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	
		@And("^: user will verify the edited description value$")
		public void user_will_verify_the_edited_description_value() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will verify the edited description value");
				//spom1.searchbt();
				//spom1.VerifyEditchange(pro.getProperty("notesdata"));
				loginfo.pass("user will verify the Add product line,Notes and description");
				System.out.println("user will verify the Add product line,Notes and description added");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println(
						"user will verify the Add product line,Notes and description was not work" + e.getMessage());
				loginfo.fail("user will verify the Add product line,Notes and description was not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	
		@Then("^: Finally click theDescription edit success$")
		public void finally_click_theDescription_edit_success() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"), "Finally click theDescription edit success");
				System.out.println("**Finally click the Description Edited success**");
				loginfo.pass("Finally click the Description Edited success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				System.out.println("**Finally click the Description Edited failed**");
				loginfo.fail("Finally click the Description Edited failed");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			}
		}
	
		@Given("^: user will Click the Search boxes and partnumber$")
		public void user_will_Click_the_Search_boxes_and_partnumber() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "Check the Description Delete in single in all page_TN039")
						.assignCategory("PIES Single in All page ").pass("Description is delete verified");
				test = test.createNode(Scenario.class, "user will Click the Search boxes and partnumber");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search boxes and partnumber");
				spom1.Searchsingle("newpartno");
				spom1.searchbt();
				loginfo.pass("user will Click the Search box");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				loginfo.fail("user will Click the Search box not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will click the delete options$")
		public void user_will_click_the_delete_options() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will click the delete options");
				spom1.descedit();
				spom1.delete();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);	
				Thread.sleep(5000);
				loginfo.pass("user will click the delete options work");
				System.out.println("user will click the delete options work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will click the delete options not work" + e.getMessage());
				loginfo.fail("user will click the delete options not work");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}
	
		@Then("^: Finally click the verification of delete success$")
		public void finally_click_the_verification_od_delete_success() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"), "Finally click the verification of delete success");
				System.out.println("**Finally click the Description deleted success**");
				loginfo.pass("Finally click the Description deleted success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				System.out.println("**Finally click the Description deleted failed**");
				loginfo.fail("Finally click the Description deleted failed");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}
	
	}