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
import pageobjectmodel.Masterproductrelated_POM;

import utility.Baseclass;

public class TC002_PMT_productrelated extends Baseclass {

	ExtentTest loginfo = null;
	Masterproductrelated_POM mpom;

	@Given("^User will mouse hover and choose the product category page$")
	public void user_will_mouse_hover_and_choose_the_product_category_page() throws Throwable {

		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
			mpom = new Masterproductrelated_POM();
			mpom.clickonproductcategory();
			loginfo.pass("product category landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
		}
	}

	@When("^User will click on the add button and add a new category$")
	public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category");
			mpom.addcategory();
			loginfo.pass("Value Entered Successfully");

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@And("^User will enter the category name and choose the equivalent PIES category$")
	public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the category name and choose the equivalent PIES category");
			mpom.entrycategory(pro.getProperty("Categoryprevious"));
			mpom.savebtn2();
			loginfo.pass("Product category Saved Successfully");

		} catch (Exception e) {

			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			mpom.acceptAlert();
			System.out.println("category successfully added");
			mpom.ClickonBackButton();
			mpom.verifyingtext(pro.getProperty("Categoryprevious"));
			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			 extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

	// 2nd product category edit
	@Given("^User will mouse hover and choose the product category again page$")
	public void user_will_mouse_hover_and_choose_the_product_category_again_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Edit Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
			mpom = new Masterproductrelated_POM();
			mpom.clickonproductcategory();
			loginfo.pass("product category landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the Edit button with already added of product category$")
	public void user_will_click_on_the_Edit_button_with_already_added_of_product_category() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category");
			mpom.Edirtaddcategory("Categoryprevious");
			loginfo.pass("Value Entered Successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will doesnot change the category name and change the equivalent PIES category$")
	public void user_will_doesnot_change_the_category_name_and_change_the_equivalent_PIES_category() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will enter the category name and choose the equivalent PIES category");

			mpom.editequalcase(pro.getProperty("categoryname"));
			mpom.savebtnedit();
			loginfo.pass("Product category Saved Successfully");
		} catch (Exception e) {

			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^User will successfully edited and verify that the record has come$")
	public void user_will_successfully_edited_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			mpom.acceptAlert();
			System.out.println("category successfully added");
			mpom.verifyingtextedit(pro.getProperty("categoryname"));

			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			// extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// 3rd program sub category
	@Given("^User will go to master and choose product sub category$")
	public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add SubCategory")
					.assignCategory("Sub Category").pass("sub category added thanks");
			test = test.createNode(Scenario.class, "Adding product sub category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose product sub category");
			mpom = new Masterproductrelated_POM();

			mpom.clicksubcategory();
			loginfo.pass("Product sub category add landing page success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add button and choose the category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category drop down list");
			mpom.addcategory();
			mpom.addsubcategory();
			loginfo.pass("Product sub category create landing page success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the sub category name and choose the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the sub category name  and choose the equivalent and save button is clicked");
			mpom.entrysubcategory(pro.getProperty("subcategorynameprevious"));
			mpom.savingcategoryadd();
			loginfo.pass("Product sub category entered success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully added and verify the record has come in the sub category grid$")
	public void user_will_successfully_added_and_verify_the_record_has_come_in_the_sub_category_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the record has come in the sub category grid");
			mpom.acceptAlert();
			System.out.println("sub category successfully added");
			mpom.ClickonBackButton();
			mpom.verifysubcategory(pro.getProperty("subcategorynameprevious"));

			loginfo.pass("Product sub category verified");
			// extent.flush();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String text = js.executeScript("return document.getElementById('MainContent_lblError').innerHTML")
					.toString();
			System.out.println(text);
			WebElement element = driver.findElement(By.xpath("//*[@id='MainContent_Image1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
			System.out.println("Failed to insert");
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Edit the product sub category
	@Given("^User will go to master and choose product sub category again page$")
	public void user_will_go_to_master_and_choose_product_sub_category_again_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Edit SubCategory")
					.assignCategory("Sub Category").pass("sub category added thanks");
			test = test.createNode(Scenario.class, "Editing product sub category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose product sub category");
			mpom = new Masterproductrelated_POM();

			mpom.clicksubcategory();
			loginfo.pass("Product sub category add landing page success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the Edit button and choose the category drop down list$")
	public void user_will_click_on_the_Edit_button_and_choose_the_category_drop_down_list() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the Edit button and choose the category drop down list");
			mpom.addsubcategoryedit();
			loginfo.pass("Product sub category create landing page success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the sub category name and change the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_change_the_equivalent_and_save_button_is_clicked()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will enter the sub category name  and choose the equivalent and save button is clicked");
			mpom.entrysubcategoryedit(pro.getProperty("subcategoryname"));
			mpom.savingcategoryEdit();
			loginfo.pass("Product sub category entered success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully edited and verify the record has come in the sub category grid$")
	public void user_will_successfully_edited_and_verify_the_record_has_come_in_the_sub_category_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the record has come in the sub category grid");
			mpom.acceptAlert();
			System.out.println("sub category successfully added");
			mpom.ClickonBackButton();
			mpom.verifysubcategoryedit(pro.getProperty("subcategoryname"));
			loginfo.pass("Product sub category verified");
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Failed to insert");
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

/////////////////New Parts descriptions////////////////

	@Given("^User will go to masterand choose parts descriptionone$")
	public void user_will_go_to_masterand_choose_parts_descriptionone() throws Throwable {
		try {
		//extent = setup();
			test = extent.createTest(Feature.class, "Master_TC002_Adding Part description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "Adding New parts description");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to masterand choose parts descriptionone");
			mpom = new Masterproductrelated_POM();
			mpom.partdescnew();
			loginfo.pass("Product parts descriptionone landed");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add button and choose the category and sub category part descriptionone$")
	public void user_will_click_on_the_add_button_and_choose_the_category_and_sub_category_part_descriptionone()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category and sub category part descriptionone");
			mpom.addcategorynew();
			mpom.categoryselectnew();
			mpom.entrypartdescnew(pro.getProperty("subcategoryname"));
			mpom.AddingPartdescription(pro.getProperty("partdescription"));
			mpom.equivalentpartdescnew();
			loginfo.pass("Product parts descriptionone choosing the given data");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will select equivalent aces name and save button is clicks$")
	public void user_will_select_equivalent_aces_name_and_save_button_is_clicks() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will select equivalent aces name and save button is clicks");
			mpom.savingpartdescnewadd();
			mpom.alertpart1();
			mpom.ClickonBackButton();
			loginfo.pass("Product parts description submit button clicked success");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will see successfully added and verify the record has come descriptionone grid$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come_descriptionone_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully added and verify the record has come in the description grid");
			mpom.verifycategory2();
			System.out.println("Parts Description Added in the grid");
			loginfo.pass("Product parts description submit button clicked & saved in the grid successfully");
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	//////////////////////////// part descriptionone edit
	//////////////////////////// /////////////////////////////////////////

	@Given("^User will go to master and choose part descriptionone again$")
	public void user_will_go_to_master_and_choose_part_descriptionone_again() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-edit Description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "editing part descriptionone");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose part descriptionone again");
			mpom = new Masterproductrelated_POM();
			mpom.partdescnew();
			loginfo.pass("Product part descriptionone landed");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the edit button and choose the category & sub category drop down lists$")
	public void user_will_click_on_the_edit_button_and_choose_the_category_sub_category_drop_down_lists()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the edit button and choose the category & sub category drop down lists");
			mpom.PrtdescriptionPrtCatgory(pro.getProperty("procategory"));
			//mpom.editcategory1(pro.getProperty("procategory"));
			mpom.edit(pro.getProperty("Editequivalentaces"));
			loginfo.pass("Product part description choosing the given data");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will change the part descriptionone name,equivalent aces and save button is clicked$")
	public void user_will_change_the_part_descriptionone_name_equivalent_aces_and_save_button_is_clicked()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will change the part descriptionone name,equivalent aces and save button is clicked");
			mpom.savingpartdescnew();
			mpom.alertpart1();
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

	/*
	 * @Then("^User will see successfully edited and verify the record has come in the descriptionone grid$"
	 * ) public void
	 * user_will_see_successfully_edited_and_verify_the_record_has_come_in_the_descriptionone_grid
	 * () throws Throwable { try { loginfo = test.createNode(new
	 * GherkinKeyword("Then"),
	 * "User will see successfully edited and verify the record has come in the descriptionone grid"
	 * ); //mpom.verifypartdescedit1(pro.getProperty("subcategoryname"));
	 * mpom.verifycategory2();
	 * System.out.println("Part Descriptionone Added in the grid");
	 * 
	 * loginfo.
	 * pass("Product part descriptionone submit button clicked & saved in the grid successfully"
	 * ); // extent.flush(); } catch (Exception e) { TestStep("Fail", driver,
	 * loginfo, e); loginfo.addScreenCaptureFromPath(Screenshotcapture(driver)); //
	 * extent.flush(); }
	 * 
	 * }
	 */

//////////////////new part descrpition engine oil ////////////////

	// 5th program part description
	@Given("^User will go to master and choose part description$")
	public void user_will_go_to_master_and_choose_part_description() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "Adding part description");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose part description");
			mpom = new Masterproductrelated_POM();

			mpom.partdesc1();
			loginfo.pass("Product part description landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the add button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category & sub category drop down list");
			mpom.addcategory2();
			mpom.categoryselect();
			mpom.entrypartdesc(pro.getProperty("partdesc"));
			mpom.equivalentpartdesc();
			loginfo.pass("Product part description choosing the given data");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@And("^User will enter the part description name and save button is clicked$")
	public void user_will_enter_the_part_description_name_and_save_button_is_clicked() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the part description name  and save button is clicked");
			mpom.savingpartdesc();
			mpom.acceptAlertline();
			loginfo.pass("Product part description submit button clicked success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully added and verify the record has come in the description grid$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come_in_the_description_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully added and verify the record has come");
			mpom.verifypartdesc(pro.getProperty("partdesc"));
			System.out.println("Part Description Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// 6th part description edit
	@Given("^User will go to master and choose part description again$")
	public void user_will_go_to_master_and_choose_part_description_again() throws Throwable {
		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-edit Description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "editing part description");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose part description again");
			mpom = new Masterproductrelated_POM();
			mpom.partdesc1();
			loginfo.pass("Product part description landed");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the edit button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_edit_button_and_choose_the_category_sub_category_drop_down_list()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the edit button and choose the category & sub category drop down list");
			mpom.editcategory(pro.getProperty("Editequivalent"));
			loginfo.pass("Product part description choosing the given data");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will change the part description name,equivalent aces and save button is clicked$")
	public void user_will_change_the_part_description_name_equivalent_aces_and_save_button_is_clicked()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will change the part description name,equivalent aces and save button is clicked");
			mpom.entrypartdescedit(pro.getProperty("subcategoryname"));
			mpom.equivalentpartdescedit();
			mpom.savingpartdesc();
			mpom.acceptAlertline();

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will see successfully edited and verify the record has come in the description grid$")
	public void user_will_see_successfully_edited_and_verify_the_record_has_come_in_the_description_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully edited and verify the record has come in the description grid");
			mpom.verifypartdescedit(pro.getProperty("subcategoryname"));
			System.out.println("Part Description Added in the grid");

			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

	// Productline 7th prgram

	@Given("^User will go to master and choose product line$")
	public void user_will_go_to_master_and_choose_product_line() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add prodLine")
					.assignCategory("Product Line Tag");
			test = test.createNode(Scenario.class, "Adding product Line");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line");
			mpom = new Masterproductrelated_POM();

			mpom.clickonproductlinecode();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on add button and enter the line code and line name$")
	public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the line code and line name");
			mpom.addcategory();
			mpom.addproductline(pro.getProperty("linecode"), pro.getProperty("textbox"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savebtn();
			mpom.acceptAlert();
			mpom.ClickonBackButton();
			loginfo.pass("Product line trying to add & entering the value");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully alert and verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully alert and verify the record has come in the grid");
			mpom.verifyproductline(pro.getProperty("linename2"));
			System.out.println("Product Line  Added in the grid");
			loginfo.pass("Product line added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// 8th program product line edit

	@Given("^User will go to master and choose product line again$")
	public void user_will_go_to_master_and_choose_product_line_again() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Edit prodLine")
					.assignCategory("Product Line Tag");
			test = test.createNode(Scenario.class, "Editing product Line");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line");
			mpom = new Masterproductrelated_POM();

			mpom.clickonproductlinecode();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on edit button and enter the line code and line name$")
	public void user_will_click_on_edit_button_and_enter_the_line_code_and_line_name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the line code and line name");
			mpom.editproduct(pro.getProperty("linecode"), pro.getProperty("linename"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.acceptAlert();
			loginfo.pass("Product line trying to add & entering the value");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully alert and edit verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_edit_verify_the_record_has_come_in_the_grid() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully alert and verify the record has come in the grid");
			mpom.verifyproductlineedit(pro.getProperty("linename"));
			System.out.println("Product Line  Added in the grid");
			loginfo.pass("Product line added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

////////add attribute master//////////////

	@Given("^User will go to master and choose attribute master$")
	public void user_will_go_to_master_and_choose_attribute_master() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
			mpom = new Masterproductrelated_POM();
			mpom.clickonAttributemaster();
			loginfo.pass("product category landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
		}
	}

	@When("^User will click on add button and enter the attribute name and select the unit and datatype$")
	public void user_will_click_on_add_button_and_enter_the_attribute_name_and_select_the_unit_and_datatype()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the attribute name and select the unit and datatype");
			mpom.addmaster(pro.getProperty("Attributemasname"));
			mpom.selattr();
			mpom.ClickonBackButton();
			mpom.verifyattribute();
			loginfo.pass("User will click on add button and enter the attribute name and select the unit and datatype");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

/////edit attribute master/////

	@Given("^User will go to master and choose attribute master Edit$")
	public void user_will_go_to_master_and_choose_attribute_master_Edit() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
			mpom = new Masterproductrelated_POM();
			mpom.clickonAttributemaster();
			loginfo.pass("product category landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println(e);
		}
	}

	@When("^User will click on add button and enter the attribute name and select the unit and datatype Edit$")
	public void user_will_click_on_add_button_and_enter_the_attribute_name_and_select_the_unit_and_datatype_Edit()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the attribute name and select the unit and datatype");
			mpom.verifyedit();
			mpom.verifyattributeedit();
			loginfo.pass("User will click on add button and enter the attribute name and select the unit and datatype");
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

	@Then("^user will go to the sql and delete the attribute master$")
	public void user_will_go_to_the_sql_and_delete_the_attribute_master() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the attribute name and select the unit and datatype");
			// mpom.deleteattributemaster();
			loginfo.pass("User will click on add button and enter the attribute name and select the unit and datatype");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// check the custom attribute

	@Given("^User will goto master and choose Custom Attributes$")
	public void user_will_goto_master_and_choose_Custom_Attributes() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Attribute").assignCategory("Cateory")
					.pass("Custom Attributes added");
			test = test.createNode(Scenario.class, "Adding Custom Attributes");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will goto master and choose Custom Attributes");
			mpom = new Masterproductrelated_POM();

			mpom.clickonCustomAttributes();
			loginfo.pass("Custom Attributes landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
		}
	}

	@When("^User will click on add and enter Custom Attribute Name$")
	public void user_will_click_on_add_and_enter_Custom_Attribute_Name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add and enter Custom Attribute Name");
			mpom.AddbtnEnterCustomAtbName(pro.getProperty("AttributeName"));
			loginfo.pass("Attribute Name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select Data Type, enter Min & MaxLength and select Parts Description$")
	public void user_will_select_Data_Type_enter_Min_MaxLength_and_select_Parts_Description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select Data Type, enter Min & MaxLength and select Parts Description");
			mpom.AttributeDetails();
			mpom.SelectPartDescription();
			loginfo.pass("Attribute Value Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will Click save Accept Alert and Verify the record has come in the grid$")
	public void user_will_Click_save_Accept_Alert_and_Verify_the_record_has_come_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Click save Accept Alert and Verify the record has come in the grid");
			mpom.savebtn();
			mpom.acceptAlert1();
			mpom.VerufyAttribute(pro.getProperty("AttributeName"));
			loginfo.pass("Product line added successfully & shown in grid");
			System.out.println("Product Line  Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// check the edit custom attribute

	@Given("^User will goto master and choose Custom Attributes agin$")
	public void user_will_goto_master_and_choose_Custom_Attributes_agin() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-edited Attribute").assignCategory("Cateory")
					.pass("Custom Attributes edited");
			test = test.createNode(Scenario.class, "editing Custom Attributes");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will goto master and choose Custom Attributes agin");
			mpom = new Masterproductrelated_POM();

			mpom.clickonCustomAttributes();
			loginfo.pass("Custom Attributes landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
		}
	}

	@When("^User will click on edit and enter Custom Attribute Name$")
	public void user_will_click_on_edit_and_enter_Custom_Attribute_Name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on edit and enter Custom Attribute Name");
			mpom.editcustom(pro.getProperty("AttributeName"), pro.getProperty("editattrvalue"));
			loginfo.pass("Attribute Name changed Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will change Data Type, enter Min & MaxLength and Parts Description$")
	public void user_will_change_Data_Type_enter_Min_MaxLength_and_Parts_Description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will change Data Type, enter Min & MaxLength and Parts Description");
			mpom.editdataandpartdesc();
			loginfo.pass("datatype and partdesc Name changes Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will check edit save Accept Alert and Verify the record has come in the grid$")
	public void user_will_check_edit_save_Accept_Alert_and_Verify_the_record_has_come_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check edit save Accept Alert and Verify the record has come in the grid");
			mpom.acceptAlert1();
			mpom.VerifycusteditAttribute(pro.getProperty("editattrvalue"));
			loginfo.pass("custom edited successfully & shown in grid");
			System.out.println("custom edited Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

}
