package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteProductCatagory;
import pageobjectmodel.Masterproductrelated_POM2;
import pageobjectmodel.DeleteProdsubmaster;
import utility.Baseclass;

public class TC032_DeleteProductCatawithall extends Baseclass {

	DeleteProductCatagory pdpom;
	DeleteProdsubmaster pdpom1;
	Masterproductrelated_POM2 mpom2 = new Masterproductrelated_POM2();

	ExtentTest loginfo = null;

	// Product category -dele
	@Given("^User will mousehover and choose the product category page$")
	public void user_will_mousehover_and_choose_the_product_category_page() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete")
					.assignCategory(" Delete ProductCatagory ").pass(" ProductCatagory Deleted ");
			test = test.createNode(Scenario.class, "Delete ProductCatagory");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the product category page");
			pdpom = new DeleteProductCatagory();
			pdpom.clickonproductcategory();
			loginfo.pass("Product category page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Product category page Not Clicked " + e.getMessage());
			loginfo.fail("Product category page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will Enter product catagory name in search box$")
	public void user_will_Enter_product_catagory_name_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter product catagory name in search box");
			pdpom.SelectsearchTextbox(pro.getProperty("categoryname"));
			pdpom.ClickDelete();
			pdpom.acceptAlert();
			pdpom.acceptAlert();
			pdpom.verifytext1(pro.getProperty("categoryname"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Product catagory name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product catagory name Not Entered in search box" + e.getMessage());
			loginfo.fail("Product catagory name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will click Delete product category and accept alert$")
	public void user_will_click_Delete_product_category_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click Delete product category and accept alert");
			pdpom.SelectsearchTextbox1(pro.getProperty("categoryname1"));
			pdpom.ClickDelete();
			pdpom.acceptAlert();
			pdpom.acceptAlert();
			loginfo.pass("Product catagory Deleted and Alert Accepted Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product catagory Not Deleted or Alert Not Accepted" + e.getMessage());
			loginfo.fail("Product catagory Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will Verify product category is deleted or not$")
	public void user_will_Verify_Sub_product_category_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify product category is deleted or not");
			// pdpom.SelectsearchTextbox(pro.getProperty("categoryname"));
			pdpom.verifytext2(pro.getProperty("categoryname1"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded product category verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Deleteded Sub product category Not verify " + e.getMessage());
			loginfo.fail("Deleteded product category Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}

	// Product group master delete scenario
	@Given("^User will mousehover and choose the product group master page$")
	public void user_will_mousehover_and_choose_the_product_group_master_page() throws Throwable {
		try {
			 //extent = setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete")
					.assignCategory("Delete ProductCatagory").pass("Product group master Deleted");
			test = test.createNode(Scenario.class, "Delete Product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the product group master page");
			pdpom1 = new DeleteProdsubmaster();
			pdpom1.clickonproductgroupmaster();
			loginfo.pass("Product category page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Productgroupmaster page Not Clicked " + e.getMessage());
			loginfo.fail("Productgroupmaster page  Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter product group master name in search box$")
	public void user_will_Enter_product_group_master_name_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter product catagory name in search box");
			pdpom1.SelectsearchTextbox(pro.getProperty("Equchose"));
			pdpom1.ClickDelete();
			pdpom1.acceptAlert();
			pdpom1.acceptAlert();
			loginfo.pass("Product catagory name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product catagory name Not Entered in search box" + e.getMessage());
			loginfo.fail("Product catagory name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify product group master is deleted or not$")
	public void user_will_Verify_product_group_master_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify product group master is deleted or not");
			pdpom1.verifyproductgroupmasterdel(pro.getProperty("Equchose"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded product group master verify Successfully");
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Deleteded product group master Not verify " + e.getMessage());
			loginfo.fail("Deleteded product group master Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Sub product line master - delete
	@Given("^User will mousehover and choose the Sub product line master page$")
	public void user_will_mousehover_and_choose_the_Sub_product_line_master_page() throws Throwable {
		try {
		// extent = setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete")
					.assignCategory("Delete Sub product line master").pass("Sub product line master Deleted ");
			test = test.createNode(Scenario.class, "Delete Sub product line master master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the Sub product line master page");
			pdpom1 = new DeleteProdsubmaster();
			pdpom1.clickonsubproductgroupmaster();
			loginfo.pass("Product category page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Sub product line page Not Clicked " + e.getMessage());
			loginfo.fail("Sub product line page  Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter Sub product line master name in search box$")
	public void user_will_Enter_Sub_product_line_master_name_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter Sub product line master name in search box");
			pdpom1.SelectsearchTextbox1(pro.getProperty("partdesc"));
			pdpom1.ClickDelete();
			pdpom1.acceptAlert();
			pdpom1.acceptAlert();
			loginfo.pass("Sub product line master name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Sub product line master Not Entered in search box" + e.getMessage());
			loginfo.fail("Sub product line master Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify Sub product line master is deleted or not$")
	public void user_will_Verify_Sub_product_line_master_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify Sub product line master is deleted or not");
			pdpom1.verifysubproductgroupmasterdel(pro.getProperty("partdesc"), pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded Sub product line master verify Successfully");
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Deleteded Sub product line master Not verify " + e.getMessage());
			loginfo.fail("Deleteded Sub product line master Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	// Component page uncheck
	@Given("^User will mousehover and choose the Component page$")
	public void user_will_mousehover_and_choose_the_Component_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT ProductRelated update")
					.assignCategory("update Component master").pass("update Component master");
			test = test.createNode(Scenario.class, "update Component master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the Component page");
			mpom2.clickonassembly33();
			loginfo.pass("update Component page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("update Component page Not Clicked " + e.getMessage());
			loginfo.fail("update Component page  Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will uncheck the Component parttype in search box$")
	public void user_will_uncheck_the_Component_parttype_in_search_box() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will uncheck the Component parttype in search box");
			mpom2.clickcomponentck33searchdel(pro.getProperty("Compnenentvalue"));
			mpom2.acceptAlert();

			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify Component parttype$")
	public void user_will_Verify_Component_parttype() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify Component parttype");
			System.out.println("Product CK33 again successfully");
			mpom2.verifyingck33del(pro.getProperty("Partype"));
			loginfo.pass("Product component search");
			System.out.println("CK33 Verified");
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

}
