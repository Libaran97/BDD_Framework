package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartCk33Add_POM;
import utility.Baseclass;

public class TC002_PMT_productrelated111 extends Baseclass {
	
	ExtentTest loginfo = null;
	PartCk33Add_POM parts;
	
	// Component Ck33
		@Given("^User will mouse hover master then choose the component CK(\\d+) page$")
		public void user_will_mouse_hover_master_then_choose_the_component_CK_page(int arg1) throws Throwable {


				try {
					//extent=setup();
					test = extent.createTest(Feature.class, "PMT Product group Related-component ck33 master")
							.assignCategory("master").pass("master component thanks");
					test = test.createNode(Scenario.class, "editing cK33 component");
					loginfo = test.createNode(new GherkinKeyword("Given"),
							"User will mouse hover and choose the Component (CK33) page");
					PartCk33Add_POM parts =new PartCk33Add_POM();
					parts.ck33click();
					parts.systemck31();
					parts.VerifyingCk33();
					loginfo.pass("product assembly ck33 landed successfully");
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				} catch (Exception e) {
					TestStep("Fail", driver, loginfo, e);
					System.out.println(e);
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
			}

		@When("^User will choose compound ck(\\d+) name and description$")
		public void user_will_choose_compound_ck_name_and_description(int arg1) throws Throwable {

				try {
					test = extent.createTest(Feature.class, "PMT Newcomponent ck33 master")
							.assignCategory("Component").pass("componentCk33 thanks");
					test = test.createNode(Scenario.class, "editing cK33 component");
	
					loginfo = test.createNode(new GherkinKeyword("When"),
							"User will choose compound ck(\\\\d+) name and description");
				// parts.systemck31();
					loginfo.pass("Value Entered Successfully");
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				} catch (Exception e) {
					System.out.println(e);
					TestStep("Fail", driver, loginfo, e);
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				}
			}

		@Then("^User will successfully verified the Component CK(\\d+)$")
		public void user_will_successfully_verified_the_Component_CK(int arg1) throws Throwable {
				try {
					loginfo = test.createNode(new GherkinKeyword("Then"),
							"User will successfully verified component CK(\\d+)$");
					System.out.println("Product CK33 again successfully");
					//parts.VerifyingCk33(pro.getProperty("Partypesearch"));
					loginfo.pass("Product component search");
					System.out.println("CK33 Verified");
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
					//extent.flush();
				} catch (Exception e) {
					System.out.println(e);
					TestStep("Fail", driver, loginfo, e);
					loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
					//extent.flush();
				}
			}



}
