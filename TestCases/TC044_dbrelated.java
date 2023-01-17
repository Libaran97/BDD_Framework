package pmttestcases.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Masterproductrelated_POM2;
import pageobjectmodel.MyCatalogAttributesPom;
import pageobjectmodel.PartsAdd_POM;
import utility.Baseclass;

public class TC044_dbrelated extends Baseclass {
	ExtentTest loginfo = null;
	Masterproductrelated_POM2 mpom2 = new Masterproductrelated_POM2();

	@Given("^: Click the vehicle page$")
	public void click_the_vehicle_page() throws Throwable {

		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		// Class.forName(")
		String url = "jdbc:sqlserver://DT0136; databaseName=AcesValidator1";
		String usr = "sa";
		String password = "Welcome7*";

		Connection connection = DriverManager.getConnection(url, usr, password);
		System.out.println("connected successfully");
		Statement smtb = connection.createStatement();
		String Result = "select top 10 * from [dbo].[ACESTable]";
		ResultSet rs = smtb.executeQuery(Result);
		System.out.println();

		while (rs.next()) {
			String Model = rs.getString("id");
			System.out.println(Model);
		}
	}

	@When("^: check aces delete using Db$")
	public void check_aces_delete_using_Db() throws Throwable {

	}

	@Then("^: Finally Click The verify Db$")
	public void finally_Click_The_verify_Db() throws Throwable {

	}

	// Check the feebback page
	@Given("^: Click the feedback button page$")
	public void click_the_feedback_button_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Add Product List").assignCategory("Parts feed")
					.pass("feeback page thanks");
			test = test.createNode(Scenario.class, "feedback page");
			loginfo = test.createNode(new GherkinKeyword("Given"), "Click the feedback button page");
			mpom2.eFeedbackbt();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the dashboard and map all option$")
	public void click_the_dashboard_and_map_all_option() throws Throwable {

	}

	@Then("^: Finally Click The verify the logout option$")
	public void finally_Click_The_verify_the_logout_option() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"Finally Click The verify the logout option");
			//Baseclass.updateTestLinkResult("01-", null, TestLinkAPIResults.TEST_PASSED);
			mpom2.Logout();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
		catch ( Exception e)
		{
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			//Baseclass.updateTestLinkResult("01-", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
			
		}
	}

}