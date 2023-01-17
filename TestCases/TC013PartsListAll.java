package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Background;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageobjectmodel.PartsAdd_POM;
import pageobjectmodel.PartsBom;
import pageobjectmodel.PartsListAll;
import utility.Baseclass;

public class TC013PartsListAll extends Baseclass {

	PartsListAll eppom;
	PartsAdd_POM parts;
	ExtentTest loginfo = null;

	@Given("^User will click on parts page and it will redirect to parts page(\\d+)$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page(int arg1) throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#").assignCategory("Parts Add")
					.pass("category added thanks");
			test = test.createNode(Background.class, "Create part no for copy appparts");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and it will redirect to parts page(\\\\d+)");
			parts = new PartsAdd_POM();
			parts.partslandingpage();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}

	}

	@When("^User will click on the add buton and choose product category, sub category,part desc, product line(\\d+)$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line(
			int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add buton and choose product category, sub category,part desc, product line(\\d+)");
			parts.partsadd();
			parts.partsadddrp2();
			parts.partsadddrp3();
			parts.partsadddrp41();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@When("^User will enter the part# and click on save(\\d+)$")
	public void user_will_enter_the_part_and_click_on_save(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the part# and click on save(\\d+)");
			parts.savenewpart(pro.getProperty("partno3"));
			parts.acceptAlert();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will see successfull alert and verify the part# thorugh part# search(\\d+)$")
	public void user_will_see_successfull_alert_and_verify_the_part_thorugh_part_search(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search(\\d+)");

			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			 //extent.flush();

		}

	}

	@Given("^User will click Reports and click Dropped Part#$")
	public void user_will_click_Reports_and_click_Dropped_Part() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#")
					.assignCategory("NoApplicarion").pass("NoApplicarion");
			test = test.createNode(Scenario.class, "Dropped PartNo With NoApplicarion");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click Reports and click Dropped Part#");
			eppom = new PartsListAll();
			eppom.clickonReports();
			eppom.clickonDropedPart();
			loginfo.pass("Reports and Dropped Part# Clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Reports and Dropped Part# Not Clicked " + e.getMessage());
			loginfo.fail("Reports and Dropped Part# Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will select Description, Reason NoApplicarion and click search$")
	public void user_will_select_Description_Reason_NoApplicarion_and_click_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select Description, Reason NoApplicarion and click search");
			// eppom.SelectDescription(pro.getProperty("partdesc"));
			eppom.SelectDescription(pro.getProperty("categoryname1"));
			eppom.SelectReason(pro.getProperty("Reason1"));
			loginfo.pass("Description, Reason NoApplicarion selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Description, Reason NoApplicarion not selected" + e.getMessage());
			loginfo.fail(" Description, Reason NoApplicarion not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Verify the parts number$")
	public void user_will_Verify_the_parts_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify the parts number");
			eppom.Verify(pro.getProperty("partno3"));
			loginfo.pass("Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified" + e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}

	}

	@Given("^User will click parts page and click listall button$")
	public void user_will_click_parts_page_and_click_listall_button() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#").assignCategory("Edit Parts")
					.pass("Edit Parts List all");
			test = test.createNode(Scenario.class, "Edit Parts List all");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click parts page and click listall button");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked " + e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@When("^User will Select Category, sub category, part description, Product line and Click search$")
	public void user_will_Select_Category_sub_category_part_description_Product_line_and_Clickj_search()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Category, sub category, part description, Product line and Click search");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			// eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			// eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			// eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass(
					"Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out
					.println(" Category, sub category, part description, Product line not Entered or search not clicked"
							+ e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and click edit$")
	public void user_will_Search_for_part_number_and_click_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Search for part number and click edit");
			eppom.EnterSearchText(pro.getProperty("partno"));
			eppom.ClickEditButton();
			loginfo.pass("Part number Entered and Edit clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or Edit not clicked" + e.getMessage());
			loginfo.fail("Part number not Entered or Edit not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will Verify page redirect to Allinone page or not$")
	public void user_will_Vrify_page_redirect_to_Allinone_page_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify page redirect to Allinone page or not");
			eppom.VerifyEdit(pro.getProperty("Allinone"));
			loginfo.pass("Page redirect to Allinone Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(" Page not redirect to Allinone" + e.getMessage());
			loginfo.fail("Page not redirect to Allinone");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}

	}

	@Given("^User will click parts button and click listall button$")
	public void user_will_click_parts_button_and_click_listall_button() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#")
					.assignCategory("Delete parts").pass("Delete parts in List all page");
			test = test.createNode(Scenario.class, "Delete parts in List all page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click parts button and click listall button");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked " + e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will Select Category, sub category, part description, Product line and Click search for Delete$")
	public void user_will_Select_Category_sub_category_part_description_Product_line_and_Click_search_for_Delete()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Category, sub category, part description, Product line and Click search for Delete");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			// eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			// eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			// eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass(
					"Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out
					.println(" Category, sub category, part description, Product line not Entered or search not clicked"
							+ e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and click delete$")
	public void user_will_Search_for_part_number_and_click_delete() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Search for part number and click delete");
			eppom.EnterSearchText(pro.getProperty("partno2"));
			eppom.ClickDeleteButton();
			eppom.acceptAlert();
			loginfo.pass("Part number Entered and delete clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or delete not clicked" + e.getMessage());
			loginfo.fail("Part number not Entered or delete not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify the part is deleted or not$")
	public void user_will_Verify_the_part_is_deleted_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify the part is deleted or not");
			eppom.Verifydelete(pro.getProperty("categoryname"), pro.getProperty("subcategoryname"),
					pro.getProperty("partdesc"), pro.getProperty("linecode"), pro.getProperty("partno"),
					pro.getProperty("DeleteProducttxt"), pro.getProperty("DeleteProducttxt2"));
			loginfo.pass("Verified Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified" + e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	@Given("^User will Click parts and list all page$")
	public void user_will_Click_parts_and_list_all_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#")
					.assignCategory("Duplicate the parts").pass("Duplicate the parts in List all page");
			test = test.createNode(Scenario.class, "Duplicate the parts in List all page");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will Click parts and list all page");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked " + e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}

	}

	@When("^User will Select Dropdown Category, sub category, part description, Product line and Click search$")
	public void user_will_Select_Dropdown_Category_sub_category_part_description_Product_line_and_Click_search()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Dropdown Category, sub category, part description, Product line and Click search");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			// eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			// eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			// eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass(
					"Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out
					.println(" Category, sub category, part description, Product line not Entered or search not clicked"
							+ e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and Duplicate the part$")
	public void user_will_Search_for_part_number_and_Duplicate_the_part() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Search for part number and Duplicate the part");
			eppom.EnterSearchText(pro.getProperty("partno"));
			eppom.ClickDuplicateButton();
			eppom.EnterDpartno(pro.getProperty("partno2"));
			eppom.acceptAlert2();
			loginfo.pass("Part number Entered and Duplicatebutton clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or Duplicatebutton not clicked" + e.getMessage());
			loginfo.fail("Part number not Entered or Duplicatebutton not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^User will Verify duplicate part no is added or not$")
	public void user_will_Verify_duplicate_part_no_is_added_or_not() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify duplicate part no is added or not");
			eppom.EnterSearchText(pro.getProperty("partno2"));
			eppom.verifyDuplicate(pro.getProperty("partno2"));
			loginfo.pass("Verified Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified" + e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}

	}
	
	
	@Given("^User will click on parts page and it should redirect to parts pageListall$")
	public void user_will_click_on_parts_page_and_it_should_redirect_to_parts_pageListall() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "created product category")
					.assignCategory("Parts Add Tag").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding part# with created product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will click on parts page and it should redirect to parts pageListall");
			parts = new PartsAdd_POM();
			parts.partslandingpage();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add buton and choose product category and sub category and part des and product line Listall$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_and_sub_category_and_part_des_and_product_line_Listall() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add buton and choose product category and sub category and part des and product line Listall");
			parts.partsadd();
			parts.partsadddrp2();
			parts.partsadddrp3();
			parts.partsadddrp41();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the partNo btu click save Listall$")
	public void user_will_enter_the_partNo_btu_click_save_Listall() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the partNo btu click save Listall");
			parts.savenewpartlistall(pro.getProperty("partno08"));
			parts.acceptAlert();
			loginfo.pass("Parts page landed successfully");
			
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@And("^User will click on buyersguide frame and choose the vehicle, make, model & searchListall$")
	public void user_will_click_on_buyersguide_frame_and_choose_the_vehicle_make_model_searchListall() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on buyersguide frame and choose the vehicle, make, model & search");
			parts.buyerguideclick();
			parts.apppartsvehicldropdown(pro.getProperty("vehicletypename"));
			parts.apppartsmakedropdown(pro.getProperty("makename"));
			parts.apppartsmodeldropdown(pro.getProperty("modelname"));
			parts.appartsenginetextbox();
			parts.apppartsearch();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@And("^User will choose an enginebase and click on saveListall$")
	public void user_will_choose_an_enginebase_and_click_on_saveListall() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will choose an enginebase and click on save");
			//bguide.apppartsenginebase();
			parts.Alcheck();
			parts.btnSavebuyer();
			parts.acceptAlertlistall();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfull alert and verify the reocrd has shown in the below gridListall$")
	public void user_will_see_successfull_alert_and_verify_the_reocrd_has_shown_in_the_below_gridListall() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will see successfull alert and verify the reocrd has shown in the below grid");
			parts.bguideverification();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}




	@Given("^User will Click parts page and list all page for Copy Appparts$")
	public void user_will_Click_parts_page_and_list_all_page_for_Copy_Appparts() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#")
					.assignCategory("Duplicate the Appparts").pass("Duplicate the Appparts in List all page");
			test = test.createNode(Scenario.class, "Duplicate the Appparts in List all page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will Click parts page and list all page for Copy Appparts");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked " + e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^User will Select Dropdown Category, sub category, part description, Product line and Click search for Copy Appparts$")
	public void user_will_Select_Dropdown_Category_sub_category_part_description_Product_line_and_Click_search_for_Copy_Appparts()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Select Dropdown Category, sub category, part description, Product line and Click search for Copy Appparts");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			// eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			// eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			eppom.SelectProductLine(pro.getProperty("linecode12"));
			eppom.Clicksearch();
			loginfo.pass(
					"Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out
					.println(" Category, sub category, part description, Product line not Entered or search not clicked"
							+ e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Search for part number and Copy Appparts to other partno$")
	public void user_will_Search_for_part_number_and_Copy_Appparts_to_other_partno() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Search for part number and Copy Appparts to other partno");

			eppom.EnterSearchText(pro.getProperty("partno08"));
			eppom.DuplicateAppprtsButton();
			eppom.createAppartsDuplicate(pro.getProperty("subcategoryname"), pro.getProperty("linecode12"),
					pro.getProperty("Asearchpart"), pro.getProperty("partno1"));

			loginfo.pass("Part number Entered and Duplicate the apparts Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(" Part number not Entered or not created Duplicate the apparts" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			// loginfo.fail("Part number not Entered or not created Duplicate the apparts");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		}
	}

	

	

	@Given("^User will click Reports and click Dropped Partno$")
	public void user_will_click_Reports_and_click_Dropped_Partno() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Parts ListAll and Dropped Part#")
					.assignCategory("ACES UnMapped").pass("ACES UnMapped");
			test = test.createNode(Scenario.class, "Dropped Part# With ACES UnMapped");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will click Reports and click Dropped Partno");
			eppom = new PartsListAll();
			eppom.clickonReports();
			eppom.clickonDropedPart();
			loginfo.pass("Reports and Dropped Part# Clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Reports and Dropped Part# Not Clicked " + e.getMessage());
			loginfo.fail("Reports and Dropped Part# Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will select Description, Reason ACES Unmapped and click search$")
	public void user_will_select_Description_Reason_ACES_Unmapped_and_click_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select Description, Reason ACES Unmapped and click search");
			eppom.SelectDescription(pro.getProperty("subcategoryall"));
			eppom.SelectReason(pro.getProperty("Reason2"));
			loginfo.pass("Description, Reason ACES Unmapped selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Description, Reason ACES Unmapped not selected" + e.getMessage());
			loginfo.fail(" Description, Reason ACES Unmapped not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Verify ACES Unmapped parts number$")
	public void user_will_Verify_ACES_Unmapped_parts_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify ACES Unmapped parts number");
			eppom.Verify(pro.getProperty("partno3"));
			loginfo.pass("Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified" + e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}
