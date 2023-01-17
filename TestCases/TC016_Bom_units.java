package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartCk33Add_POM;
import pageobjectmodel.PartsBom;
import pageobjectmodel.PartsPackage;
import utility.Baseclass;

public class TC016_Bom_units extends Baseclass {

	ExtentTest loginfo = null;
	PartsBom ppbom;
	
	
	@Given("^User will click on parts page and it should redirect to parts page$")
	public void user_will_click_on_parts_page_and_it_should_redirect_to_parts_page() throws Throwable {
		try {
				//extent = setup();
				test = extent.createTest(Feature.class, "created product category")
						.assignCategory("Parts Add Tag").pass("category added thanks");
				test = test.createNode(Scenario.class, "Adding part# with created product category");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will click on parts page and it will redirect to parts page");
				ppbom = new PartsBom();
				ppbom.partslandingpage();
				loginfo.pass("Parts page landed successfully");
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	 
	}
	@When("^User will click on the add buton and choose product category and sub category and part des and product line$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line_MUL() throws Throwable {


		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add buton and choose product category and sub category and part des and product line");
			ppbom.partsadd1();
			ppbom.partsadddrp21();
			ppbom.partsadddrp31();
			ppbom.partsadddrp41();
			ppbom.isunitnot();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will enter the partNo btu click save$")
	public void user_will_enter_the_partNO_and_click_save() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the partNo btu click save");
			ppbom.savenewpart1(pro.getProperty("partno12"));
			ppbom.acceptAlert();
			loginfo.pass("Parts page landed successfully");
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		}

	@Then("^User will successfully alert and verify the partNO$")
	public void user_will_successfully_alert_and_verify_the_partNO() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfull alert and verify the part# thorugh part# search");

			loginfo.pass("Parts page landed successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}


	@Given("^User will go to parts page and search for a partno bom$")
	public void user_will_go_to_parts_page_and_search_for_a_partno_bom() throws Throwable {
		try {
	      // extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom add");
			test = test.createNode(Scenario.class, "Adding Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a partno bom");
			ppbom = new PartsBom();
			ppbom.partslanding();		
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Bom$")
	public void user_will_click_on_Bom_and_select_Package_UOM_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on Bom and select Package UOM dropdown");
			ppbom.bomclick();			
			loginfo.pass("Bom click successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Bom click not successfully" + e.getMessage());
			loginfo.fail("Bom click not successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will Enter partno and Qty$")
	public void user_will_Enter_partno_and_Qty() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"), "User will Enter partno and Qty");	
			ppbom.bompartandqty(pro.getProperty("partno12"));
			ppbom.SaveAcceptAlert();
			loginfo.pass("partno and Qty Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("partno and Qty Not Entered" + e.getMessage());
			loginfo.fail("partno and Qtyh Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has shown in the bom$")
	public void user_will_verify_the_reocrd_has_shown_in_the_bom() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the bom");
			ppbom.Verify();
			loginfo.pass("Bom Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		  // extent.flush();

		} catch (Exception e) {
			System.out.println("Bom Not Verified" + e.getMessage());
			loginfo.fail("Bom Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	 //BOM edit operation
	@Given("^User will go to parts page and search for partno bom edit$")
	public void user_will_go_to_parts_page_and_search_for_partno_bom_edit() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom edit");
			test = test.createNode(Scenario.class, "editing Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno bom edit");
			ppbom = new PartsBom();
			ppbom.partslanding();
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Bom Edit Button$")
	public void user_will_click_on_Bom_Edit_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on Bom Edit Button");
			ppbom.bomclick();		
			ppbom.BOMEditbt();
			loginfo.pass("Bom edit click successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Bom edit click not successfully" + e.getMessage());
			loginfo.fail("Bom edit click not successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter partno and Qty for Edit$")
	public void user_will_Enter_partno_and_Qty_for_Edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter partno and Qty for Edit");
			ppbom.UomQty();
			ppbom.SaveAcceptAlert();
			loginfo.pass("change Qty Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("change Qty Not Entered" + e.getMessage());
			loginfo.fail("change Qty Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has shown in the bom for edit$")
	public void user_will_verify_the_reocrd_has_shown_in_the_bom_for_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the bom for edit");
			ppbom.Verifyedit();
			loginfo.pass("Bom edit Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Bom edit Not Verified" + e.getMessage());
			loginfo.fail("Bom edit Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	
	//BOM delete option
	@Given("^User will go to parts page and search for the partno bom del$")
	public void user_will_go_to_parts_page_and_search_for_the_partno_bom_del() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom del");
			test = test.createNode(Scenario.class, "del Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the partno bom del");
			ppbom = new PartsBom();
			ppbom.partslanding();
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on bom and Click Delete Button Accept Alert$")
	public void user_will_click_on_bom_and_Click_Delete_Button_Accept_Alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on bom and Click Delete Button Accept Alert");	
			ppbom.bomclick();
			ppbom.bomdelbt();
			loginfo.pass("deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("change Qty Not Entered" + e.getMessage());
			loginfo.fail("change Qty Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the record del has not shown in the below grid$")
	public void user_will_verify_the_record_del_has_not_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the record del has not shown in the below grid");
			ppbom.DeleteVerifybom();
			loginfo.pass("Bom deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	      // extent.flush();

		} catch (Exception e) {
			System.out.println("Bom deleted Not Verified" + e.getMessage());
			loginfo.fail("Bom deleted Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		     //extent.flush();
		}
	}
	
	//Units add
		@Given("^User will go to parts page and search for a partno unit$")
		public void user_will_go_to_parts_page_and_search_for_a_partno_unit() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "PMT Parts unit Add, Edit and Delete")
						.assignCategory("Parts unit").pass("unit add");
				test = test.createNode(Scenario.class, "Adding unit in  parts page");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to parts page and search for a partno unit");	
				ppbom = new PartsBom();
				//ppbom.partslanding();
				//ppbom.partsearchunit(pro.getProperty("bompart2"));
				//ppbom.parteditsave();
				ppbom.partslanding();
				ppbom.partsearch1(pro.getProperty("partno12"));
				loginfo.pass(" PartNo search succesfully ");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("PartNo not searched " + e.getMessage());
				loginfo.fail("PartNo not searched");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@When("^User will click on unit$")
		public void user_will_click_on_unit() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "User will click on unit");
				ppbom.unitclick();			
				loginfo.pass("unit click successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("unit click not successfully" + e.getMessage());
				loginfo.fail("unit click not successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@And("^User will Enter Comp qty and units parts$")
		public void user_will_Enter_Comp_qty_and_units_parts() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter Comp qty and units parts");	
				ppbom.unitpartandqty(pro.getProperty("partno1"));
				ppbom.SaveisunitAlert1();
				loginfo.pass("Comp qty and units parts Entered Succesfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("Comp qty and units parts Not Entered" + e.getMessage());
				loginfo.fail("Comp qty and units parts Not Entered");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@Then("^User will verify the reocrd has shown in the unit$")
		public void user_will_verify_the_reocrd_has_shown_in_the_unit() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will verify the reocrd has shown in the unit");
				ppbom.Verifyunit();
				loginfo.pass("Unit Verified Succesfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			    //extent.flush();

			} catch (Exception e) {
				System.out.println("Unit Not Verified" + e.getMessage());
				loginfo.fail("Unit Not Verified");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}
		
	//Unit Edit //
		
		@Given("^User will go to parts page and search for partno unit edit$")
		public void user_will_go_to_parts_page_and_search_for_partno_unit_edit() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "PMT Parts unit Add, Edit and Delete")
						.assignCategory("Parts unit").pass("unit edit");
				test = test.createNode(Scenario.class, "editing unit in  parts page");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to parts page and search for partno unit edit");
				ppbom = new PartsBom();
				ppbom.partslanding();
				ppbom.partsearch1(pro.getProperty("partno12"));
				loginfo.pass(" PartNo search succesfully ");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("PartNo not searched " + e.getMessage());
				loginfo.fail("PartNo not searched");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@When("^User will click on unit Edit Button$")
		public void user_will_click_on_unit_Edit_Button() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "User will click on unit Edit Button");
				ppbom.unitclick();
				ppbom.uniteditclick();
				loginfo.pass("unit click successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("unit click not successfully" + e.getMessage());
				loginfo.fail("unit click not successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@And("^User will Enter Comp qty and units parts for Edit$")
		public void user_will_Enter_Comp_qty_and_units_parts_for_Edit() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter Comp qty and units parts for Edit");	
				ppbom.Unitpartandqtyedit();
				ppbom.SaveAcceptAlertdel();
				ppbom.savealert();
				loginfo.pass("Comp qty and units parts edit Entered Succesfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) 
			{ 
				System.out.println("Comp qty and units edit parts Not Entered" + e.getMessage());
				loginfo.fail("Comp qty and units parts edit Not Entered");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@Then("^User will verify the reocrd has shown in the unit for edit$")
		public void user_will_verify_the_reocrd_has_shown_in_the_unit_for_edit() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will verify the reocrd has shown in the unit for edit");
				ppbom.Verifyunitedit();
				loginfo.pass("Unit edit Verified Succesfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();

			} catch (Exception e) {
				System.out.println("Unit edit Not Verified" + e.getMessage());
				loginfo.fail("Unit edit Not Verified");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}
		
		//del unit
		@Given("^User will go to parts page and search for the partno unit del$")
		public void user_will_go_to_parts_page_and_search_for_the_partno_unit_del() throws Throwable {
			try {
				//extent = setup();
				test = extent.createTest(Feature.class, "PMT Parts unit Add, Edit and Delete")
						.assignCategory("Parts unit").pass("unit del");
				test = test.createNode(Scenario.class, "delting unit in  parts page");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to parts page and search for partno unit del");
				ppbom = new PartsBom();
				ppbom.partslanding();
				ppbom.partsearch1(pro.getProperty("partno12"));
				loginfo.pass(" PartNo search succesfully ");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("PartNo not searched " + e.getMessage());
				loginfo.fail("PartNo not searched");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@When("^User will click on unit and Click Delete Button Accept Alert$")
		public void user_will_click_on_unit_and_Click_Delete_Button_Accept_Alert() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"), "User will click on unit and Click Delete Button Accept Alert");
				ppbom.unitclick();
				ppbom.unitdelclick();
				loginfo.pass("unit click successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println("unit click not successfully" + e.getMessage());
				loginfo.fail("unit click not successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		}

		@Then("^User will verify the record del unit has not shown in the below grid$")
		public void user_will_verify_the_record_del_unit_has_not_shown_in_the_below_grid() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will verify the record del unit has not shown in the below grid");
				ppbom.DeleteVerifyunit();
				loginfo.pass("Unit del Verified Succesfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();

			} catch (Exception e) {
				System.out.println("Unit del Not Verified" + e.getMessage());
				loginfo.fail("Unit del Not Verified");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				//extent.flush();
			}
		}	
	
}
