package com.Pathway_stage.Stepdefinations;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;
import com.Pathway_stage.Users.LegalUser;
import com.Pathway_stage.Users.MarketUser;
import com.Pathway_stage.Users.NOCUser;
import com.Pathway_stage.Users.RPMUser;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.LogoutPage;
import com.Pathway_stage.Webpages.RequestViewPage;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buildoutflow  extends Basepage
{

	MarketUser markertuser = new MarketUser();
	Homepage home = new Homepage();
	RPMUser rpmuser = new RPMUser();
	NOCUser nocuser = new NOCUser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
	RequestViewPage view = new RequestViewPage();
	@Given("^Enter Url of application into the \"([^\"]*)\" browser for BUildOutrequest$")
	public void enter_Url_of_application_into_the_browser_for_BUildOutrequest(String browsername) throws Throwable 
	{
	
	    init(browsername);
	    extentreporinit("Buildoutflow", "Buildoutflow");
	   // loggger.debug("Browser intiation succesfully");
	    geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
	    System.out.println(">>>Launch application succesfully ");
	    extentpassreport("Application launch succesfully");
	}

	
	//String stepname = "buildoutflow";
	String descrption ="Test the buildoutflowof pathwaytool";
@When("^Market user loginwith valid credtinals for BUildOutrequest process$")
public void market_user_loginwith_valid_credtinals_for_BUildOutrequest_process() throws Throwable 
{
    markertuser.loginwithMarketUser();
   login.ClickYesbutton();
   System.out.println("Market user login with Vlaid credtinals for Build out process");
   extentpassreport("Market user login succesfully with Valid credtinals");

   
}

@Then("^Rise a BUildOut request with Marketuser (\\d+) with date \"([^\"]*)\"$")
public void rise_a_BUildOut_request_with_Marketuser(int i , String date) throws Throwable {
  markertuser.buildoutrequest(i, date);
   System.out.println(">>>Rise a BUild out request with market user");
 // view.buildoutchecking(i);
   extentpassreport("Rise a Buildout request with Market User");
   
}

@Then("^Logout MarketUser after rise a request for  BUildOut$")
public void logout_MarketUser_after_rise_a_request_for_BUildOut() throws Throwable 
{
	try {
		refreshthepage();
		sleep();
		logout.logoutUser();
	} catch (NoSuchElementException e) {
		
	}
   
   System.out.println(">>>logout market user after rise build out request");
extentpassreport("Logout Market user after succesful rise a Buildout request");
   
}

@When("^RPM user login with valid credtinals for BUildOut process$")
public void rpm_user_login_with_valid_credtinals_for_BUildOut_process() throws Throwable 
{
    login.loginwithsecondaccount();
    rpmuser.loginwithRPMUser();
    System.out.println(">>>succesfully login RPM user with valid credtinals for Build out process");
    extentpassreport("RPM user login with Valid credtinals");
}

@Then("^RPM user \"([^\"]*)\" BUildOut request signal with (\\d+)$")
public void rpm_user_BUildOut_request_signal(String statusoftheapplication, int i) throws Throwable {
    rpmuser.buildoutrequestwithRPMuser(statusoftheapplication, i);
    extentpassreport("check the "+statusoftheapplication+"with RPM user");
    System.out.println(">>>check the "+statusoftheapplication+"with RPM user");
}

@Then("^Logout RPM user after check the status of BUildOut request$")
public void logout_RPM_user_after_check_the_status_of_BUildOut_request() throws Throwable {
  logout.logoutUser();
  System.out.println(">>>Logout RPM user");
  extentpassreport("Logout RPM user");
}

@When("^NOC user login with valid credtinals for BUildOutrequest process$")
public void noc_user_login_with_valid_credtinals_for_BUildOutrequest_process() throws Throwable {
   login.loginwithThirdaccount();
   nocuser.loginwithNOCUser();
   System.out.println(">>>Login NOC user with Valid credtinals for Build out process");
   extentpassreport("Login with NOC  with valid credtinals for Buildoutrequest");
}

@Then("^^NOC user \"([^\"]*)\" BUildOutrequest Signal with (\\d+)$")
public void noc_user_BUildOutrequest_Signal(String statusoftheapplication, int i) throws Throwable {
    nocuser.buildourequestwithNOCuser(statusoftheapplication, i);
    extentpassreport("check the"+statusoftheapplication+"with NOC user");
    System.out.println(">>>check the"+statusoftheapplication+"with NOC user");
    
}

@Then("^Logout NOC user after check the status of BUildOutrequest$")
public void logout_NOC_user_after_check_the_status_of_BUildOutrequest() throws Throwable {
    logout.logoutUser();
    extentpassreport("Logout NOC user");
    System.out.println(">>>Logout NOC user");
}

@When("^LEGAL user login with valid credtinals for BUildOutrequest$")
public void legal_user_login_with_valid_credtinals_for_BUildOutrequest() throws Throwable {
login.loginwithFourthaccount();
legaluser.loginwithLeaglUser();
extentpassreport("Login Leagal user with Valid credtinals for Build out request");
System.out.println(">>>Login with Legal user with Valid credtinals for Build out process");
}

@Then("^Request send to FCC with Legal user FOR BUildOutrequest with (\\d+)$")
public void request_send_to_FCC_with_Legal_user_FOR_BUildOutrequest(int i) throws Throwable {
   legaluser.sendtoFCCbuildrequestwithLegalsuer(i);
   extentpassreport("Build out request sent to FCC with Legal user");
   System.out.println(">>>Build out request sent to FCC with Legal user");
}

@Then("^Logout LEGAL user after succesful BUildOutrequest Send to FCC$")
public void logout_LEGAL_user_after_succesful_BUildOutrequest_Send_to_FCC() throws Throwable {
    logout.logoutUser();
    extentpassreport("Logout Legal user");
    extentreportssave();
    System.out.println(">>>Logout legal customer after build out process");
    
   
    
}
}
