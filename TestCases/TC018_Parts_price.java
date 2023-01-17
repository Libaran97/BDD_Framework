package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Parts_KitInfo;
import pageobjectmodel.Parts_Price;
import utility.Baseclass;

public class TC018_Parts_price extends Baseclass{
	
	ExtentTest loginfo = null;
	Parts_Price pkprice;
	
	
	//price Add//
	
	
	@Given("^User will click parts page and search part#$")
	public void user_will_click_parts_page_and_search_part() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts Price Add, Edit and Delete").assignCategory("Parts Price").pass("Price add");
			test=test.createNode(Scenario.class, "Adding Parts Price");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click parts page and search part#");
			pkprice = new 	Parts_Price();
			pkprice.partslanding();
			pkprice.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println("PartNo not searched " + e.getMessage());
			 loginfo.fail("PartNo not searched");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}

	@When("^User will click on Price page and select price type$")
	public void user_will_click_on_Price_page_and_select_price_type() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on Price page and select price type");
			pkprice.ClickPricepage();
			pkprice.Selectpricetype();
			loginfo.pass("Price page clicked and price type Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch(Exception e) {
			System.out.println("Price page Not clicked or price type Not Entered" + e.getMessage());
			loginfo.fail("Price page Not clicked or price type Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^User will select Price UOM, Enter price and price sheet number$")
	public void user_will_select_Price_UOM_Enter_price_and_price_sheet_number() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will select Price UOM, Enter price and price sheet number");
			pkprice.PriceDetails();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Price UOM Selected and price & price sheet number Entered Succesfully");
		} catch(Exception e) {
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail",driver,loginfo,e);
		}
	}

	@Then("^User will save, Accept alert and verify$")
	public void user_will_save_Accept_alert_and_verify() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will save data and Accept the alert");
			pkprice.saveAcceptAlert();
			pkprice.Verifyprice();
			loginfo.pass("save data and Accept the alert Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			
		} catch(Exception e) {
			System.out.println("Data Not saved or Not Accept the alert " + e.getMessage());
			loginfo.fail("Data Not saved or Not Accept the alert ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			}
	}
	
	
	//Price edit//
	
	
	@Given("^User will click parts and search partno$")
	public void user_will_click_parts_and_search_partno() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts Price Add, Edit and Delete").assignCategory("Parts Price").pass("Price Edit");
			test=test.createNode(Scenario.class, "Editing Parts Price");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click parts and search partno");
			pkprice = new 	Parts_Price();
			pkprice.partslanding();
			pkprice.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println("PartNo not searched " + e.getMessage());
			 loginfo.fail("PartNo not searched");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}

	@When("^User will click on Price page and Click Edit$")
	public void user_will_click_on_Price_page_and_Click_Edit() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on Price page and Click Edit");
			pkprice.ClickPricepage();
			pkprice.ClickEdit();
			loginfo.pass("Price page clicked and price type Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch(Exception e) {
			System.out.println("Price page Not clicked or Edit Button Not clicked" + e.getMessage());
			loginfo.fail("Price page Not clicked or Edit Button Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Edit Price value$")
	public void user_will_Edit_Price_value() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Edit Price value");
			//pkprice.Selectpricetype();
			pkprice.Editprice();
			//pkprice.PriceDetailsedit();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Price Edited Succesfully");
		} catch(Exception e) {
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail",driver,loginfo,e);
		} 
	}

	@Then("^User will save, Accept alert and Edit verify$")
	public void user_will_save_Accept_alert_and_Edit_verify() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will save, Accept alert and Edit verify");
			pkprice.saveAcceptAlert();
			pkprice.EditVerifyprice();
			loginfo.pass("save data and Accept the alert Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			
		} catch(Exception e) {
			System.out.println("Data Not saved or Not Accept the alert " + e.getMessage());
			loginfo.fail("Data Not saved or Not Accept the alert ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			}
	}
	
	
	//Price Delete//

	@Given("^User will click on parts and search part#$")
	public void user_will_click_on_parts_and_search_part() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts Price Add, Edit and Delete").assignCategory("Parts Price").pass("Price Delete");
			test=test.createNode(Scenario.class, "Delete Parts Price");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on parts and search part#");
			pkprice = new 	Parts_Price();
			pkprice.partslanding();
			pkprice.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
		
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}   catch (Exception e) {
			 System.out.println("PartNo not searched " + e.getMessage());
			 loginfo.fail("PartNo not searched");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	}

	@When("^User will click on Pricepage and Click Delete Button$")
	public void user_will_click_on_Pricepage_and_Click_Delete_Button() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on Pricepage and Click Delete Button");
			pkprice.ClickPricepage();
			pkprice.ClickDelete();
			loginfo.pass("Price page clicked and Delete Button clicked Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch(Exception e) {
			System.out.println("Price page Not clicked or Delete Button Not clicked" + e.getMessage());
			loginfo.fail("Price page Not clicked or Delete Button Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Accept alert and verify Delete Price$")
	public void user_will_Accept_alert_and_verify_Delete_Price() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Accept alert and verify Delete Price");
			pkprice.acceptAlert1();
			pkprice.acceptAlert1();
			pkprice.VryDelete();
			loginfo.pass("Accept the alert and Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			extent.flush();
			
		} catch(Exception e) {
			System.out.println("Not Accept the alert or Not verified " + e.getMessage());
			loginfo.fail("Not Accept the alert or Not verified ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
			}
	}

}
