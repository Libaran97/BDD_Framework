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
	import utility.Baseclass;
	
	public class TC038_SingleinallpageVehilcleapplication extends Baseclass {
		Singleinallpage spom1 = new Singleinallpage();
		ExtentTest loginfo = null;
		MultiAddPom2 mpom2 = new MultiAddPom2();
	
		@Given("^: user will Click the Search box$")
		public void user_will_Click_the_Search_box() throws Throwable {
			try {
				extent = setup();
				test = extent.createTest(Feature.class, "Check the Vehcile aces add in all one page-TC038")
						.assignCategory("PIES Single in All page").pass("Vehicle aces Application is verified");
				test = test.createNode(Scenario.class, "User will click the add partnumber");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search box");
				spom1.searchsingles("newpartnos");
				spom1.searchbt();
				spom1.partadd( "newpartno","subcategoryname1", "linecode13", "adduom");
				loginfo.pass("user will Click the Search box success ");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//Baseclass.updateTestLinkResult("01-33", null, TestLinkAPIResults.TEST_PASSED);
	
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work " + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
				//Baseclass.updateTestLinkResult("01-33", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
			}
		}
	
		@When("^: user will add the vehicle application$")
		public void user_will_add_the_vehicle_application() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will add the vehicle application");
				spom1.vehicleadd();
				spom1.windowhandler();
				//spom1.zoomin();
				spom1.vehiclepop("vehicletypenameaces", "makenameaces", "modelnameaces");
				spom1. searchbox();
				//spom1.aceschkbox();
				spom1.checkaces();
				spom1.save();
				spom1.acceptAlert();
	
				// driver.navigate().refresh();
				spom1.searchbt1();
				loginfo.pass("user will fill the vehicle info");
				System.out.println("**user will fill the vehicle info**");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//Baseclass.updateTestLinkResult("01-33", null, TestLinkAPIResults.TEST_PASSED);
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				//Baseclass.updateTestLinkResult("01-33", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
			}
		}
	
		@And("^: user will verify the vehicle application$")
		public void user_will_verify_the_vehicle_application() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will verify the vehicle application");
				spom1.verifydata("EnterYearaces");
				loginfo.pass("Verification is pass");
				System.out.println("Verification is pass");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//Baseclass.updateTestLinkResult("01-33", null, TestLinkAPIResults.TEST_PASSED);
				//extent.flush();
			} catch (Exception e) {
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				System.out.println("Verification is fail");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//Baseclass.updateTestLinkResult("01-33", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
				//extent.flush();
			}
		}
	
	
		
		//2nd program
		@Given("^: user will Click the Search boxs$")
		public void user_will_Click_the_Search_boxs() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "Check the Vehcile aces Edit in all one page-TC038")
						.assignCategory("PIES Single in All page ").pass("Vehicle Application edit is verified");
				test = test.createNode(Scenario.class, "user will Click the Search box check add or not");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search boxs");
				spom1.Searchsingles01("newpartno");
				spom1.searchbt();
	           // spom1.partdetails();
				loginfo.pass("user will Click the Search box success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will edit the vehicle application$")
		public void user_will_edit_the_vehicle_application() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will edit the vehicle application");
				spom1.EdIT();
				spom1.windowhandler();
				spom1.Notes("textbox", "qtydata");
				spom1.acceptAlert();
				spom1.verifyNOTesandqty01();
				loginfo.pass("user will edit the vehicle application");
				System.out.println("**user will edit the vehicle application**");
				System.out.println("**Finally working Vehicle added success**");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				System.out.println("user will edit the vehicle application not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
				System.out.println("**Finally not working Vehicle added**");
				//extent.flush();
			}
		}
	
	
	
	
		//3rd program
		@Given("^: user will Click the Search boxes$")
		public void user_will_Click_the_Search_boxes() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "Check the Vehcile Nonaces add in single one page-TC038")
						.assignCategory("PIES Single in All page ").pass("Vehicle Application Non aces is verified");
				test = test.createNode(Scenario.class, "user will Click the Search box check add or not");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search box");
				spom1.Searchsingle("newpartno");
				spom1.searchbt();
				//spom1.alertclk();
				loginfo.pass("user will Click the Search box success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will add the vehicle applications$")
		public void user_will_add_the_vehicle_applications() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will add the vehicle application");
				spom1.vehicleadd();
				spom1.windowhandler();
				spom1.vehiclepop("vehicletypename", "makename", "modelname");
				spom1.appartsenginetextbox();
				spom1.searchbox();
				spom1.Alcheck();
				//spom1.Nonaceschkbox();
				spom1.save();
				spom1.acceptAlert();
				spom1.searchbt1();
				loginfo.pass("user will fill the vehicle info");
				System.out.println("**user will fill the vehicle info**");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will verify non aces the vehicle application$")
		public void user_will_verify_non_aces_the_vehicle_application() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will verify the vehicle application");
				spom1.verifydata("EnterYearaces");
				loginfo.pass("Nonaces Verification is pass");
				System.out.println("Nonaces Verification is pass");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				System.out.println("Nonaces Verification is fail" + e.getMessage());
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}
	
		/*
		 * @Then("^: Finally click the verification nonaces success$") public void
		 * finally_click_the_verification_nonaces_success() throws Throwable { try {
		 * loginfo = test.createNode(new GherkinKeyword("Then"),
		 * "Finally click the verification nonaces success");
		 * System.out.println("**Finally working Non aces Vehicle added success**");
		 * loginfo.pass("user will fill the non aces vehicle info passed");
		 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver)); extent.flush();
		 * } catch (Exception e) {
		 * System.out.println("**Finally not working Non aces Vehicle added**");
		 * TestStep("Fail",driver,loginfo,e); System.out.println(e);
		 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver)); extent.flush();
		 * } }
		 */
	
		@Given("^: user will Click the Search box for sorting$")
		public void user_will_Click_the_Search_box_for_sorting() throws Throwable {
			try {
				 //extent = setup();
				test = extent.createTest(Feature.class, "Check the sorting orderin dropdown in single in all page-TC038")
						.assignCategory("PIES Single in All page ").pass("Vehicle sorting is verified");
				test = test.createNode(Scenario.class, "user will Click the Search box for sorting or not");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Search box for sorting");
				spom1.Searchsingle("newpartno");
				spom1.searchbt();
				loginfo.pass("user will Click the Search box for sorting");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box for sorting not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^: user will Click the vehicle applications and verification$")
		public void user_will_Click_the_vehicle_applications_and_verification() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "user will add the vehicle application");
				// spom1.vehicleadd();
				// spom1.windowhandler();
				// mpom2.SortPartDescription_TC037();
				spom1.SortPartDescription_TC037();
				loginfo.pass("user will fill the vehicle info");
				System.out.println("**user will fill the vehicle info**");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@Then("^: Finally click the sorting success$")
		public void finally_click_the_sorting_success() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"), "Finally click the sorting success ");
				System.out.println("**Finally click the sorting success**");
				loginfo.pass("**Finally click the sorting success**");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			} catch (Exception e) {
				System.out.println("**Finally click the sorting not work**");
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			}
		}
	
		@Given("^: user will Click the Part Search box$")
		public void user_will_Click_the_Part_Search_box() throws Throwable {
			try {
			//extent = setup();
				test = extent.createTest(Feature.class, "Check the Delete the vehicle application in single in all page-TC038")
						.assignCategory("PIES Single in All page").pass("Vehicle delete function is verified");
				test = test.createNode(Scenario.class, "user will Click the delete function or not");
				loginfo = test.createNode(new GherkinKeyword("Given"), "user will Click the Part Search box");
				spom1.Searchsingle("newpartno");
				spom1.searchbt();
				//spom1.partdetails();
				loginfo.pass("user will Click the Search box for DELETE");
				System.out.println("user will Click the Search box for Delete");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("user will Click the Search box for Delete not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
			}
		}

		@When("^: user will Click the delete option with verification$")
		public void user_will_Click_the_delete_option_with_verification() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"user will Click the delete option with verification");
	
				spom1.VerifyDeletefunc();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	
				Thread.sleep(5000);
				
				System.out.println("**Deleted two entries**");
				loginfo.pass("Verification delete work");
				
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			} catch (Exception e) {
				spom1.Verifydatadel();
				System.out.println("Verification delete not work" + e.getMessage());
				TestStep("Fail",driver,loginfo,e);
				 System.out.println(e);		
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				TestStep("Fail", driver, loginfo, e);
				
				System.out.println("**Finally click the delete vehicle application not work**");
				
				//extent.flush();
			}
		}
				
				
		/*
		 * @When("^: user will Click the delete option with verification$") public void
		 * user_will_Click_the_delete_option_with_verification() throws Throwable { try
		 * { loginfo = test.createNode(new GherkinKeyword("When"),
		 * "user will Click the delete option with verification");
		 * 
		 * spom1.VerifyDeletefunc();
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement element =
		 * driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		 * 
		 * Thread.sleep(5000); spom1.searchbt1();
		 * 
		 * spom1.VerifyDeletefunc();
		 * 
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver; WebElement element1 =
		 * driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()",
		 * element1);
		 * 
		 * System.out.println("**Deleted two entries**");
		 * loginfo.pass("Verification delete work");
		 * 
		 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		 * 
		 * System.out.println("user will Click the Search box for Deletework");
		 * System.out.println("**Finally click the delete vehicle application success**"
		 * );
		 * 
		 * 
		 * extent.flush();
		 * 
		 * 
		 * } catch (Exception e) { spom1.Verifydatadel();
		 * System.out.println("Verification delete not work" + e.getMessage());
		 * TestStep("Fail",driver,loginfo,e); System.out.println(e);
		 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver)); TestStep("Fail",
		 * driver, loginfo, e);
		 * 
		 * System.out.
		 * println("**Finally click the delete vehicle application not work**");
		 * 
		 * extent.flush(); } }
		 */
	
		
		}
	
	
