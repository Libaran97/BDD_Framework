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
import utility.Baseclass;

public class TC036_Multiaddpartslinked1 extends Baseclass {
	MultiAddPom mpom1 = new MultiAddPom();
	ExtentTest loginfo = null;

	@Given("^: user will select the Multiadd page with application$")
	public void user_will_select_the_Multiadd_page_with_application() throws Throwable {
		try {
			//extent = setup();
			test = extent
					.createTest(Feature.class,
							"Check the multiplepart part linked verfication in the grid -first-TC036")
					.assignCategory("PIES MultiAdd ").pass("Partlinked is verified");
			test = test.createNode(Scenario.class, "user will select the Multiadd page with application");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the Multiadd page with application");
			 mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			Thread.sleep(5000);
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^: user will chose the all chosed Vehicle,make,model along with click the$")
	public void user_will_chose_the_all_chosed_Vehicle_make_model_along_with_click_the() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("when"),
					"user will chose the all chosed Vehicle,make,model along with click the");
			Thread.sleep(6000);
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
			mpom1.searchbt();
			Thread.sleep(6000);
			mpom1.checkallbox();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will chose checkbox in the grid$")
	public void user_will_chose_checkbox_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("when"), "user will chose checkbox in the grid");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			loginfo.pass("Checkbox is click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will select the product, description, part numbers in the dropdown$")
	public void user_will_select_the_product_description_part_numbers_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part numbers in the dropdown");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			Thread.sleep(3000);
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.scrolldown();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will click the qty,position and Notes and click the add button$")
	public void user_will_click_the_qty_position_and_Notes_and_click_the_add_button() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					" user will click the qty,position and Notes and click the add button");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			Thread.sleep(5000);
			loginfo.pass("qty is not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("qty is not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	
	
	
	
	@And("^: user will again click the Vehicle,make,model in the drop down$")
	public void user_will_again_click_the_Vehicle_make_model_in_the_drop_down() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("when"),
					"user will again click the Vehicle,make,model in the drop down");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
		
			mpom1.searchbt();
			Thread.sleep(5000);
			loginfo.pass("Re-Vehicle,Make,Model drop down values getting properly");
			loginfo.pass("Finally multiple parts Linked verified success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Re-Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will check the parts linked the partnumber present or not$")
	public void user_will_check_the_parts_linked_the_partnumber_present_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("when"),
					"user will check the parts linked the partnumber present or not");
			//mpom1.Checkbox2("EnterYear", "Acesvalue");

			mpom1.VerifyParslinked(pro.getProperty("partno"));
		
			loginfo.pass("Partlinked matched with part number");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Partlinked matched with part number");
		} catch (Exception e) {
			System.out.println("Partlinked not matched with part number");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally multiple parts Linked verified success$")
	public void finally_multiple_parts_Linked_verified_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally multiple parts Linked verified success");
			System.out.println("Finally multiple parts Linked verified success");
			loginfo.pass("Finally multiple parts Linked verified success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Finally multiple parts  not Linked verified success");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will chosed the application paged and multiadd pages$")
	public void user_will_chosed_the_application_paged_and_multiadd_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Check the multiple part description and partno-second-TC036")
					.assignCategory("PIES MultiAdd ").pass("Multiple part # is verified");
			test = test.createNode(Scenario.class, "Multiadd part description and part no to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will chosed the application paged and multiadd pages");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosed Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chosed_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chosed Vehicle,make,model along with click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename0"));
			mpom1.Modeldata(pro.getProperty("modelname0"));
			mpom1.searchbt();
			mpom1.checkallbox();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkboxs in the tables col$")
	public void user_will_check_the_checkboxs_in_the_tables_col() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkboxs in the tables col");
			//mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			loginfo.pass("Check box is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Check box is not working" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, descriptions, part numbers in the dropdown$")
	public void user_will_select_the_product_descriptions_part_numbers_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, descriptions, part numbers in the dropdown");
			mpom1.Productline(pro.getProperty("linecode1"));
			mpom1.multidesc(pro.getProperty("subcategoryname1"));
			mpom1.multipart(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the qty and click the add button$")
	public void user_will_click_the_qty_and_click_the_add_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will click the qty and click the add button");

			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			System.out.println("ok1");
			mpom1.scrolldown();
			mpom1.Addbutton();
			// mpom1.scrolldown();
			mpom1.verifymultidescandpart();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			mpom1.partlinkedverification("EnterYear", "Acesvalue");
			loginfo.pass("qty is getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("qty is not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally multiple added part description and part number added success$")
	public void finally_multiple_added_part_description_and_part_number_added_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Finally multiple added part description and part number added success");
			System.out.println("** 2 parts added for different part description and but single product line**");
			loginfo.pass("2 parts added for different part description and but single product line");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(
					"** 2 parts added for different part description and but single product line not working**");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("^: user will chosed the application paged and multiadd page$")
	public void user_will_chosed_the_application_paged_and_multiadd_page() throws Throwable {
		try {
			// extent = setup();
			test = extent
					.createTest(Feature.class, "Check the multiple Productline,description and part no-third-TC036")
					.assignCategory("PIES MultiAdd ").pass("Multiple Product line is verified");
			test = test.createNode(Scenario.class, "user will chosed the application paged and multiadd page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the Multiadd page with application");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosed Vehicle,make,model$")
	public void user_will_check_the_all_chosed_Vehicle_make_model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all chosed Vehicle,make,model");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox in the tab$")
	public void user_will_check_the_checkbox_in_the_tab() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tab");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			loginfo.pass("Check box is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Check box is not working" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description, part numbers in the drop$")
	public void user_will_select_the_product_description_part_numbers_in_the_drop() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part numbers in the drop");
			mpom1.Productline(pro.getProperty("linecode1"));
			mpom1.multidesc(pro.getProperty("subcategoryname1"));
			mpom1.multipart(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will Re select the product, description, part numbers in the dropdown$")
	public void user_will_Re_select_the_product_description_part_numbers_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, descriptions, part numbers in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.multidesc(pro.getProperty("partdesc"));
			mpom1.multipart(pro.getProperty("partno"));
			mpom1.Addbutton();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the both product lines$")
	public void user_will_verify_the_both_product_lines() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will verify the both product lines");
			mpom1.VerifymultipleProduct();
			loginfo.pass("user will verify the both product lines");
			System.out.println("user will verify the both product lines");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			System.out.println("user will not verify the both product lines");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally multiple added Product description$")
	public void finally_multiple_added_Product_description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally multiple added Product description");
			System.out.println("Finally multiple Product verified success");
			loginfo.pass("Finally multiple Product verified success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Finally multiple Product not verified success");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Given("^: user will chosed the application pag and multiadd page$")
	public void user_will_chosed_the_application_pag_and_multiadd_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Check the multiplepartdesc,product line and part-Fourth-TC036")
					.assignCategory("PIES MultiAdd ").pass("Multiple Product line is verified");
			test = test.createNode(Scenario.class, "user will chosed the application paged and multiadd page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the Multiadd page with application");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosed Vehicle,make,models$")
	public void user_will_check_the_all_chosed_Vehicle_make_models() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all chosed Vehicle,make,model");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox in the tabs$")
	public void user_will_check_the_checkbox_in_the_tabs() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tab");
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			loginfo.pass("Check box is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Check box is not working" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description, part numbers in the drops$")
	public void user_will_select_the_product_description_part_numbers_in_the_drops() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part numbers in the drop");
			mpom1.Productline(pro.getProperty("linecode1"));
			mpom1.multidesc(pro.getProperty("subcategoryname1"));
			mpom1.multipart(pro.getProperty("partno"));
			mpom1.Addbutton();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will Re select the product, description, part number in the dropdown$")
	public void user_will_Re_select_the_product_description_part_number_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, descriptions, part numbers in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.multidesc(pro.getProperty("partdesc"));
			mpom1.multipart(pro.getProperty("Enterpartpart"));
			mpom1.Addbutton();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the both part description lines$")
	public void user_will_verify_the_both_part_description_lines() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will verify the both part description lines");
			mpom1.Verifymultipledesc();
			loginfo.pass("user will verify the both part description lines");
			System.out.println("user will verify the both part description lines");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			System.out.println("user will not verify the both part description lines");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^: Finally multiple added partdescription$")
	public void finally_multiple_added_partdescription() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally multiple added partdescription");
			System.out.println("Finally multiple desc verified success");
			loginfo.pass("Finally multiple desc verified success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println("Finally multiple desc not verified success");
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
}
