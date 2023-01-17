package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteProductLine;
import utility.Baseclass;

public class TC029_DeleteProductLine extends Baseclass {

	DeleteProductLine dplpom;
	ExtentTest loginfo = null;
	
	
	
	@Given("^User will mousehover and choose the WebCategory pages$")
	public void user_will_mousehover_and_choose_the_WebCategory_pages() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete").assignCategory("Delete ProductLine")
					.pass("WebCategory Deleted");
			test = test.createNode(Scenario.class, "Deleting ProductLine");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the WebCategory pages");
			
			dplpom = new DeleteProductLine();
			dplpom.clickonwebcategory();
			
			loginfo.pass("WebCategory clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product Line page Not Clicked " + e.getMessage());
			loginfo.fail("Product Line page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter webcategory and deleted and alert message$")
	public void user_will_Enter_webcategory_and_deleted_and_alert_message() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter webcategory and deleted and alert message");
			dplpom.SelectWebCategoryTextbox(pro.getProperty("Equchose"));
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			dplpom.SelectWebCategoryTextbox(pro.getProperty("Equchose"));
			dplpom.verifytext1(pro.getProperty("DeleteProducttxt"));
			loginfo.pass("WebCategory Deleted Successfully");
			
			loginfo.pass("WebCategory name Entered in search box Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Product Line name Not Entered in search box" + e.getMessage());
			loginfo.fail("Product Line name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}


	
	
	
	///////////////////////////product line //////////////////////////////////
	
	@Given("^User will mousehover and choose the product Line page$")
	public void user_will_mousehover_and_choose_the_product_Line_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete").assignCategory("Delete ProductLine")
					.pass("ProductLine Deleted");
			test = test.createNode(Scenario.class, "Deleting ProductLine");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the product Line pag");
			dplpom = new DeleteProductLine();
			dplpom.clickonproductLine();
			loginfo.pass("ProductLine clicked successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product Line page Not Clicked " + e.getMessage());
			loginfo.fail("Product Line page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter product Line name in search box$")
	public void user_will_Enter_product_Line_name_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter product Line name in search box");
			dplpom.SelectsearchTextbox(pro.getProperty("linecode"));
			
			loginfo.pass("Product Line name Entered in search box Successfully");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println("Product Line name Not Entered in search box" + e.getMessage());
			loginfo.fail("Product Line name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}

	}

	@And("^User will click Delete product Line and accept alert$")
	public void user_will_click_Delete_product_Line_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click Delete product Line and accept alert");
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			dplpom.SelectsearchTextbox(pro.getProperty("linecode"));
			dplpom.verifytext1(pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Product Line Deleted Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Product Line Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("Product Line Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@And("^User will another delet product line and accept alert$")
	public void user_will_another_delet_product_line_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will another delet product line and accept alert");
			dplpom.SelectsearchTextbox1(pro.getProperty("linecode1"));
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			dplpom.SelectsearchTextbox1(pro.getProperty("linecode1"));
			dplpom.verifytext1(pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Product Line Deleted Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(" Product Line Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("Product Line Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify product Line is deleted or not$")
	public void user_will_Verify_product_Line_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify product Line is deleted or not");
			
			dplpom.verifytext1(pro.getProperty("DeleteProducttxt"));
			
			loginfo.pass("Deleteded product Line verify Successfully");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Deleteded product Line Not verify " + e.getMessage());
			loginfo.fail("Deleteded product Line Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}

	// custom attribute name delete case
	@Given("^User will mousehover and choose the custome attribute page$")
	public void user_will_mousehover_and_choose_the_custome_attribute_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete")
					.assignCategory("Delete custome attribute").pass("custom attribute Deleted");
			test = test.createNode(Scenario.class, "Deleting custome attribute");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the custome attribute page");
			dplpom = new DeleteProductLine();
			dplpom.clickoncustomattribute();
			loginfo.pass("custome attribute clicked successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("custom attribute page Not Clicked " + e.getMessage());
			loginfo.fail("custom attribute page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter cust attribute name in search box and delete the attibute with part desc$")
	public void user_will_Enter_cust_attribute_name_in_search_box_and_delete_the_attibute_with_part_desc()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter cust attribute name in search box and delete the attibute with part desc");
			dplpom.SelectsearchTextboxcus2(pro.getProperty("editattrvalue"));
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			dplpom.verifytextcusdel(pro.getProperty("editattrvalue"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Product Line Deleted Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("cust attribute Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("cust attribute Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click accept alert in custom attribute page twice$")
	public void user_will_click_accept_alert_in_custom_attribute_page_twice() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter cust attribute name in search box and delete the attibute with part desc");
			dplpom.SelectsearchTextboxcus3(pro.getProperty("AttributeName1"));
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			loginfo.pass("cust attribute Deleted Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("cust attribute Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("cust attribute Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify custom attribute is deleted$")
	public void user_will_Verify_custom_attribute_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify custom attribute is deleted");
			dplpom.verifytextcusdelanother(pro.getProperty("AttributeName1"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded custom attribute verify Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Deleteded custom attribute Not verify " + e.getMessage());
			loginfo.fail("Deleteded custom attribute Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}
