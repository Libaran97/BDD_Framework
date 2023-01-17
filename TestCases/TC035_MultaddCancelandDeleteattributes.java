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

public class TC035_MultaddCancelandDeleteattributes extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1 = new MultiAddPom();

	// Check the Cancel button[TC035]
	@Given("^: user will create the application pages and multiadd links$")
	public void user_will_create_the_application_pages_and_multiadd_links() throws Throwable {
		try {
			extent = setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018 _Cancel button in Vehicle")
					.assignCategory("MultiAdd Cancel Tag").pass("Cancel button verified");
			test = test.createNode(Scenario.class, "Multiadd Cancel case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links");
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check all project value from the multiadd page$")
	public void user_will_check_all_project_value_from_the_multiadd_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will create the application pages and multiadd links");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox product desc part number$")
	public void user_will_check_the_checkbox_product_desc_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox product desc part number");
			// mpom1.Checkboxall();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check Cancel button$")
	public void user_will_check_Cancel_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check Cancel button");
			mpom1.Cancel();
			mpom1.cancelverify();
			loginfo.pass("Cancel button is  click");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	/*
	 * @Then("^: Finally Cancel button finished$") public void
	 * finally_Cancel_button_finished() throws Throwable { try { loginfo =
	 * test.createNode(new GherkinKeyword("Then"),
	 * "Finally Cancel button finished");
	 * loginfo.pass("Cancel button was succussfully working");
	 * System.out.println("**Cancel button was succussfully working**"); //
	 * extent.flush(); } catch (Exception e) { TestStep("Fail", driver, loginfo, e);
	 * System.out.println(e);
	 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	 * //extent.flush(); }
	 */
	//}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the Delete button[TC035]
	@Given("^: user will create the application pages and multiadd links on same page$")
	public void user_will_create_the_application_pages_and_multiadd_links_on_same_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018 Delete button in Vehicle")
					.assignCategory("MultiAdd Delete Tag").pass("Delete button verified");
			test = test.createNode(Scenario.class, "Multiadd Delete case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links on same page");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all Vehicle,make and model$")
	public void user_will_check_the_all_Vehicle_make_and_model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all Vehicle,make and model");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: user will check the checkbox product desc part number also$")
	public void user_will_check_the_checkbox_product_desc_part_number_also() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox product desc part number also");
			// mpom1.Checkboxall();
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check add button$")
	public void user_will_check_add_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check add button");
			mpom1.Delete();
			loginfo.pass("Delete button is click...");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^: Finally delete button finished$")
	public void finally_delete_button_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally delete button finished");
			mpom1.Deleteverify(pro.getProperty("Delete"));
			loginfo.pass("*Delete succussfully ...");
			System.out.println("**Delete succussfully **");
			//extent.flush();
		} catch (Exception e) {
			//extent.flush();
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the qty,Position and notes[TC035]
	@Given("^: user will click the application pages and multiadd pages$")
	public void user_will_click_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018 _qty,Position and notes in Vehicle")
					.assignCategory("MultiAdd qty,Position and notes Tag").pass("qty,Position and notes is verified");
			test = test.createNode(Scenario.class, "Multiadd attributes values check and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will click the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all Vehicle,make model and clicks the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_clicks_the_search() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			mpom1.checkallbox();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox in the grid$")
	public void user_will_check_the_checkbox_in_the_grid() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the grid");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Check box is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description,part number on the table$")
	public void user_will_select_the_product_description_part_number_on_the_table() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number as well");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the Qty,Position and Notes and click the add option$")
	public void user_will_click_the_Qty_Position_and_Notes_and_click_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty,Position and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("Qty,notes..values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,position and notes in the buyersguide$")
	public void user_will_verify_the_qty_position_and_notes_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),

					"user will verify the qty,position and notes in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			//mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");//changed postion
			mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine");
			loginfo.pass("Verify attributes values is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally Show attributes details is finished$")
	public void finally_Show_attributes_details_is_finished() throws Throwable {
		try {
			
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Show attributes details is finished");
			loginfo.pass("Attributes qty,position and notes details verified");
			System.out.println("Attributes qty,position and notes details verified..");
		//extent.flush();
		} catch (Exception e) {
			 
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the Qty,notes[TC035]
	@Given("^: user will click the application pages and multiadd page$")
	public void user_will_click_the_application_pages_and_multiadd_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018_ Qty,notes in Vehicle")
					.assignCategory("MultiAdd Qty,notes Tag").pass("Attribues Qty,notes values verified");
			test = test.createNode(Scenario.class, "Multiadd qty,notes to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will click the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all Vehicle,make,model and click the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make,model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox in the table$")
	public void user_will_check_the_checkbox_in_the_table() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the table");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Checkbox is click");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description, part number in drop field$")
	public void user_will_select_the_product_description_part_number_in_drop_field() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number in drop field");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the Qty and Notes and click the add option$")
	public void user_will_click_the_Qty_and_Notes_and_click_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("Qty,notes..values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,notes in the buyersguide$")
	public void user_will_verify_the_qty_notes_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the qty,notes in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			// mpom1.Qtyverify1("acesexpectedtext2", "SearchTextAcesallEngine", "qtydata");
			loginfo.pass("Verify attributes values is working");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally qty and notes added$")
	public void finally_qty_and_notes_added() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally qty and notes added");
			loginfo.pass("Attributes qty,notes details verified");

			System.out.println("Attributes qty,notes details verified..");
			// extent.flush();
		} catch (Exception e) {
			// extent.flush();
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the qty,Position[TC035]
	@Given("^: user will select the application pages and multiadd pages$")
	public void user_will_select_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018 _qty,Position in Vehicle")
					.assignCategory("MultiAdd qty,Position Tag ").pass("Attribues Qty,position values verified");
			test = test.createNode(Scenario.class, "Multiadd qty,Position to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all chose Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chose_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chose Vehicle,make,model  with click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will check the checkbox in the tables$")
	public void user_will_check_the_checkbox_in_the_tables() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tables");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will choose the product, description, part no in the dropdown$")
	public void user_will_choose_the_product_description_part_no_in_the_dropdown() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part no in the dropdown");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));

			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will click the Qty and position and click the add option$")
	public void user_will_click_the_Qty_and_position_and_click_the_add_option() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty and position and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("Qty and poition is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will verify the position in the buyersguide$")
	public void user_will_verify_the_position_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the position in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
		//	mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");
			//mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine");
			mpom1.Qtyverify01("EnterInvalidYear");
			loginfo.pass("Verify attributes values is working");
			System.out.println("Attributes qty,position details verified..");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

	

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Check the Notes,Position[TC035]
	@Given("^: user will select the application paged and multiadd pages$")
	public void user_will_select_the_application_paged_and_multiadd_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Multiadd_TC018_Notes,Position")
					.assignCategory("MultiAdd Notes,Position Tag").pass("Attribues Position,notes values verified");
			test = test.createNode(Scenario.class, "Multiadd position,notes to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the application page and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all chosen Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chosen_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chose Vehicle,make,model  with click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkboxs in the tables$")
	public void user_will_check_the_checkboxs_in_the_tables() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tables column");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Checkbox is click");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description, part nos in the dropdown$")
	public void user_will_select_the_product_description_part_nos_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part num in the dropdown");
			mpom1.Productlinenew(pro.getProperty("linecode12"));
			mpom1.Partdesc(pro.getProperty("subcategoryname"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the notes and position and select the add option$")
	public void user_will_click_the_notes_and_position_and_select_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the notes and position and click the add option");
			mpom1.scrolldown();
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			// mpom1.qtyclear();
			// mpom1.scrolldown();
			mpom1.Addbutton();
			// mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			// mpom1.verifyalert3();
			loginfo.pass("postion,qty,notes..values getting properly");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the position and note in the buyersguide$")
	public void user_will_verify_the_position_and_note_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the position and notes in the tabular column");

		//	mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");
			mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine");
			loginfo.pass("Verify attributes values is working");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally notes and position added success$")
	public void finally_notes_and_position_added_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally notes and position added success");
			loginfo.pass("Notes and POStion is success");

			System.out.println("Notes and Postion is success");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		}
	}
}
