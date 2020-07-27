package com.Pathway_stage.Stepdefinations;

import org.apache.log4j.Logger;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;
import com.Pathway_stage.Users.LegalUser;
import com.Pathway_stage.Users.MarketUser;
import com.Pathway_stage.Users.NOCUser;
import com.Pathway_stage.Users.RPMUser;
import com.Pathway_stage.Users.RRMUSER;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.LogoutPage;
import com.Pathway_stage.Webpages.RequestViewPage;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cancleationflow extends Basepage
{
	MarketUser markertuser = new MarketUser();
	RPMUser rpmuser = new RPMUser();
	Homepage home = new Homepage();
	RRMUSER rrmuser = new RRMUSER();
	NOCUser nocuser = new NOCUser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	RequestViewPage view = new RequestViewPage();
	LogoutPage logout = new LogoutPage();
	String path ="E:\\repositeryforgit\\Pathway_Automation\\Pathway\\Screenshots";
	
	Logger logger = Logger.getLogger(Cancleationflow.class);
	@Given("^Enter Url of application into the \"([^\"]*)\" browser$")
	public void enter_Url_of_application_into_the_browser(String browsername)
	{
		extentreporinit("Cancelationflowreport", "Cancelationreport");
		init(browsername);
		geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		getscreenshot("Launchbrowser", path);
		System.out.println(">>>Launch application is succesfully");
		extentpassreport("Url is opened succesfully");
	}

	@When("^Market user loginwith valid credtinals for Cancelation process$")
	public void market_user_loginwith_valid_credtinals_for_Cancelation_process()  
	{
	    markertuser.loginwithMarketUser();
	    System.out.println(">>>Market user login with valid credtinals");
	    login.ClickYesbutton();
	   // home.cancelationbutton();
	   // view.checkrejetedlist();
	    extentpassreport("Market user login with valid credtinals");
	    
	}

	@Then("^Rise a Cancelation request with Marketuser (\\d+)$")
	public void rise_a_Cancelation_request_with_Marketuser(int i)  {
	    markertuser.cancelationRequest(i);
	    System.out.println(">>>Market user rise a request succesfully");
		view.cancelationchecking(i);
	    System.out.println(">>> check the status of the cancelation request");
	    extentpassreport("Market user rise a cancelation request succesfully");
	    
	   
	}

	@Then("^Logout MarketUser after rise a request for  Cancelation$")
	public void logout_MarketUser_after_rise_a_request_for_Cancelation()  {
	    logout.logoutUser();
	    System.out.println(">>>Logout market user after rise a cancelation request");
	    extentpassreport("Logout Market user");
	    
	}

	@When("^RPM user login with valid credtinals for Cancelation process$")
	public void rpm_user_login_with_valid_credtinals_for_Cancelation_process()
	{
		login.loginwithsecondaccount();
	    rpmuser.loginwithRPMUser();
	    System.out.println(">>>RPM user login with valid credtinals");
	    extentpassreport("RPM user login with valid credtinals succesfully");
		
	}

	@Then("^RPM user \"([^\"]*)\" Cancelation signal with (\\d+)$")
	public void rpm_user_Cancelation_signal(String statusoftheapplication, int i)  
	{
		
	 rpmuser.CancelationrequestwithRPMuser(statusoftheapplication, i);
	 System.out.println(">>>Check the status of the cancelation request with RPM user");
	 extentpassreport("RPM user check the "+statusoftheapplication+"of the application");
	}

	@Then("^Logout RPM user after check the status of cancelation request$")
	public void logout_RPM_user_after_check_the_status_of_cancelation_request()  {
		logout.logoutUser();
		extentpassreport("Logout RPM user");
		System.out.println(">>>Logout RPM user after checking the status of the cancelation request");
		
	}

	@When("^RRM user login with valid credtinals for Cancelation process$")
	public void rrm_user_login_with_valid_credtinals_for_Cancelation_process()  {
	 login.loginwithThirdaccount();
	    rrmuser.loginwithRRMUser();
	    extentpassreport("RRM user login with valid credtinals");
	    System.out.println(">>>RRM user login with valid credtinals");
	}

	@Then("^RRM user \"([^\"]*)\" Cancelation Signal with (\\d+)$")
	public void rrm_user_Cancelation_Signal(String statusoftheapplication, int i) {
	  rrmuser.CancelationrequestwithRRMuser(statusoftheapplication, i);
	  extentpassreport("Check the" +statusoftheapplication+ "of the application with with RRM user");
	  System.out.println(">>Check the" +statusoftheapplication+ "of the application with with RRM user");
	}

	@Then("^Logout RRM user after check the status of cancelation request$")
	public void logout_RRM_user_after_check_the_status_of_cancelation_request() {
	  logout.logoutUser();
	  extentpassreport("Logout RRM user");
	   System.out.println(">>>logout RRM user after check the status of cancelation request");
	}

	@When("^NOC user login with Vlaid credtinals for Cancletaion process$")
	public void noc_user_login_with_Vlaid_credtinals_for_Cancletaion_process() throws Throwable {
	   login.loginwithFourthaccount();
	   nocuser.loginwithNOCUser();
	   extentpassreport("NOC user login with valid credtinals");
	   System.out.println(">>>login with NOC user for cancelation request with valid credtinals");
	}

	@Then("^NOC user \"([^\"]*)\" Cancelation signal with (\\d+)$")
	public void noc_user_Cancelation_signal(String statusoftheapplication , int i)  {
	    nocuser.CancelationrequestwithNOCuser(statusoftheapplication, i);
	    extentpassreport("Check the" +statusoftheapplication+ "of the application with NOC user");
	    System.out.println(">>>Check the" +statusoftheapplication+ "of the application with NOC user");
	}

	@Then("^Logout NOC user after suucesful check the status of Cancelation Process$")
	public void logout_NOC_user_after_suucesful_check_the_status_of_Cancelation_Process()  {
	    logout.logoutUser();
	    extentpassreport("Logout NOC user");
	    System.out.println(">>>log out NOC user");
	}

	@When("^LEGAL user login with valid credtinals for Cancelation Process$")
	public void legal_user_login_with_valid_credtinals_for_Cancelation_Process()  {
	    login.loginwithfifthaccount();
	    legaluser.loginwithLeaglUser();
	    extentpassreport("Legal user login iwth valid credtinals");
	    System.out.println(">>>Login with Legaluser with valid credtinals for cancelation request");
	}

	@Then("^Request send to FCC with Legal user with (\\d+)$")
	public void request_send_to_FCC_with_Legal_user(int i) throws Throwable {
	    legaluser.CancelationrequestwithLeagluser(i);
	    extentpassreport("Send Cancelation request to FCC with Legal user");
	    System.out.println("Check the status of the application with Legal user");
	}

	@Then("^Logout LEGAL user after succesful Cancelation Request Send to FCC$")
	public void logout_LEGAL_user_after_succesful_Cancelation_Request_Send_to_FCC() throws Throwable {
	   logout.logoutUser();
	   extentpassreport("Logout Legal user");
	   System.out.println("Log out legal user");
	   extentreportssave();
	}

}
