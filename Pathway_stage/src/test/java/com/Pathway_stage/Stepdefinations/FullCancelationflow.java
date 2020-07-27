package com.Pathway_stage.Stepdefinations;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;
import com.Pathway_stage.Users.LegalUser;
import com.Pathway_stage.Users.MarketUser;
import com.Pathway_stage.Users.NOCUser;
import com.Pathway_stage.Users.RPMUser;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.LogoutPage;
import com.Pathway_stage.Webpages.RequestViewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FullCancelationflow extends Basepage {
	Loginpage login = new Loginpage();
	MarketUser market = new MarketUser();
	RPMUser rpm = new RPMUser();
	NOCUser noc = new NOCUser();
	LegalUser legal = new LegalUser();
	RequestViewPage view = new RequestViewPage();
	LogoutPage logout = new LogoutPage();

	@Given("^enter url application into \"([^\"]*)\" for full cancelation flow with \"([^\"])\" $")
	public void enter_url_application_into_for_full_cancelation_flow(String browsername, String environment) {
		extentreporinit("FullCancelation", "FullCancleation flow report");
		init(browsername);
		if (environment.equals("local")) 
		{
			geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		}
		else {
			geturl(Pathwayconstants.STAGE_URL_OF_THE_APPLICATION);
		}
	
		System.out.println(">>>Launch application succesfully ");
		extentpassreport("Application launch succesfully");
	}

	@When("^first Market User login with valid creditinals for full cancelation process with \"([^\"])\"$")
	public void first_Market_User_login_with_valid_creditinals_for_full_cancelation_process(String environment) {
		if (environment.equals("local")) {
			market.loginwithMarketUser();
			login.ClickYesbutton();
		}
		else {
			market.loginwithMarketUser();
			market.marketuserpopuplogin();
		}
		
		System.out.println("Market user1 login succesfully");
		extentpassreport("Market user1 login succesfully");

	}

	@Then("^Rise a full Cancelation Request with first Market User (\\d+)$")
	public void rise_a_full_Cancelation_Request_with_first_Market_User(int i) {
		market.cancelationRequest(i);
		System.out.println(">>>Market user rise a request succesfully");
		System.out.println(">>> check the status of the cancelation request");
		extentpassreport("Market user rise a cancelation request succesfully");
	}

	@Then("^logout first MarketUser after rise a full cancelation process$")
	public void logout_first_MarketUser_after_rise_a_full_cancelation_process()
	{
		
		closebrowser();
		System.out.println(">>>Logout first market user after rise a full cancelation request");
		extentpassreport("Logout first market user after rise a full cancelation request");
	}

	@When("^first RPM User login with valid creditinals for full cancelation process$")
	public void first_RPM_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>First RPM user login with valid credtinals");
		extentpassreport("Fisrt RPM user login with valid credtinals succesfully");
	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with first RPM User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_first_RPM_User(String statusoftheapplication, int i) {
		rpm.CancelationrequestwithRPMuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with First RPM user");
		extentpassreport("Fisrt RPM user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout First RPM User after rise a full cancelation process$")
	public void logout_First_RPM_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		extentpassreport("Logout First RPM user");
		System.out.println(">>>Logout first RPM user after checking the status of the  full cancelation request");
	}

	@When("^first NOC User login with valid creditinals for full cancelation process$")
	public void first_NOC_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>>First NOC user login with valid credtinals");
		extentpassreport("Fisrt NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with first NOC User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_first_NOC_User(String statusoftheapplication, int i) {
		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with First NOC user");
		extentpassreport("Fisrt NOC user check the " + statusoftheapplication + "of the application");

	}

	@Then("^logout First NOC User after rise a full cancelation process$")
	public void logout_First_NOC_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		extentpassreport("Logout First NOC user");
		System.out.println(">>>Logout first NOC user after checking the status of the  full cancelation request");

	}

	@When("^First Legal User login with valid creditinals for full cancelation process$")
	public void first_Legal_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		legal.loginwithLeaglUser();
		legal.legaluserloginwithpopup();
		System.out.println(">>>First Legal user login with valid credtinals");
		extentpassreport("Fisrt Legal user login with valid credtinals succesfully");

	}

	@Then("^Request send to FCC of full cancelation process with  First Legal User (\\d+)$")
	public void request_send_to_FCC_of_full_cancelation_process_with_First_Legal_User(int i) {
		legal.CancelationrequestwithLeagluser(i);
		extentpassreport("full cancelation request send to FCC with Legal user1 ");
		System.out.println("full cancelation  request send to FCC with Leagal user1");

	}

	@Then("^logout First Legal User after rise a full cancelation process$")
	public void logout_First_Legal_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		extentpassreport("Logout First Legal user");
		System.out.println(">>>Logout first Legal user after checking the status of the  full cancelation request");
	}

	@When("^second Market User login with valid creditinals for full cancelation process$")
	public void second_Market_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		System.out.println("Market user2 login succesfully");
		extentpassreport("Market user2 login succesfully");
	}

	@Then("^Rise a Cancelation Request with second Market User (\\d+)$")
	public void rise_a_Cancelation_Request_with_second_Market_User(int i) {
		market.cancelationRequest(i);
		System.out.println(">>>second Market user rise a request succesfully");
		extentpassreport(" second Market user rise a cancelation request succesfully");

	}

	@Then("^logout second MarketUser after rise a full cancelation process$")
	public void logout_second_MarketUser_after_rise_a_full_cancelation_process() 
	{
		
		closebrowser();
		System.out.println(">>>Logout second market user after rise a full cancelation request");
		extentpassreport("Logout second market user after rise a full cancelation request");

	}

	@When("^second RPM User login with valid creditinals for full cancelation process$")
	public void second_RPM_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>second RPM user login with valid credtinals");
		extentpassreport("second RPM user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with second RPM User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_second_RPM_User(String statusoftheapplication, int i) {
		rpm.CancelationrequestwithRPMuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with second RPM user");
		extentpassreport("second RPM user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout second RPM User after rise a full cancelation process$")
	public void logout_second_RPM_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout second RPM user");
		extentpassreport(">>>Logout second RPM user");
	}

	@When("^Third Market User login with valid creditinals for full cancelation process$")
	public void third_Market_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		System.out.println("Market user3 login succesfully");
		extentpassreport("Market user3 login succesfully");

	}

	@Then("^Rise a Cancelation Request with Third Market User (\\d+)$")
	public void rise_a_Cancelation_Request_with_Third_Market_User(int i) {
		market.cancelationRequest(i);
		System.out.println(">>>third Market user rise a request succesfully");
		extentpassreport(" third Market user rise a cancelation request succesfully");
	}

	@Then("^logout Third MarketUser after rise a full cancelation process$")
	public void logout_Third_MarketUser_after_rise_a_full_cancelation_process()
	{
		
		closebrowser();
		System.out.println(">>>Logout Third market user after rise a full cancelation request");
		extentpassreport("Logout Third market user after rise a full cancelation request");

	}

	@When("^Third RPM User login with valid creditinals for full cancelation process$")
	public void third_RPM_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>Third RPM user login with valid credtinals");
		extentpassreport("Third RPM user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with Third RPM User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_Third_RPM_User(String statusoftheapplication, int i) {
		rpm.CancelationrequestwithRPMuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with third RPM user");
		extentpassreport("third RPM user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout Third RPM User after rise a full cancelation process$")
	public void logout_Third_RPM_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout Third RPM user");
		extentpassreport(">>>Logout Third RPM user");
	}

	@When("^Third NOC User login with valid creditinals for full cancelation process$")
	public void third_NOC_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>>Third NOC user login with valid credtinals");
		extentpassreport("Third NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with Third NOC User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_Third_NOC_User(String statusoftheapplication, int i) {
		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with Third NOC user");
		extentpassreport("Third NOC user check the " + statusoftheapplication + "of the application");

	}

	@Then("^logout Third NOC User after rise a full cancelation process$")
	public void logout_Third_NOC_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		extentpassreport("Logout Third NOC user");
		System.out.println(">>>Logout Third NOC user after checking the status of the  full cancelation request");

	}

	@When("^fourth Market User login with valid creditinals for full cancelation process$")
	public void fourth_Market_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		System.out.println("Market user4 login succesfully");
		extentpassreport("Market user4 login succesfully");

	}

	@Then("^Rise a Cancelation Request with fourth Market User (\\d+)$")
	public void rise_a_Cancelation_Request_with_fourth_Market_User(int i) {

		market.cancelationRequest(i);
		System.out.println(">>>fourth Market user rise a request succesfully");
		extentpassreport(" fourth Market user rise a cancelation request succesfully");
	}

	@Then("^logout fourth MarketUser after rise a full cancelation process$")
	public void logout_fourth_MarketUser_after_rise_a_full_cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout fourth market user after rise a full cancelation request");
		extentpassreport("Logout fourth market user after rise a full cancelation request");

	}

	@When("^fourth RPM User login with valid creditinals for full cancelation process$")
	public void fourth_RPM_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>fourth RPM user login with valid credtinals");
		extentpassreport("fourth RPM user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with fourth RPM User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_fourth_RPM_User(String statusoftheapplication, int i) {
		rpm.CancelationrequestwithRPMuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with fourth RPM user");
		extentpassreport("fourth RPM user check the " + statusoftheapplication + "of the application");

	}

	@Then("^logout fourth RPM User after rise a full cancelation process$")
	public void logout_fourth_RPM_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout fourth RPM user");
		extentpassreport(">>>Logout fourth RPM user");

	}

	@When("^fourth NOC User login with valid creditinals for full cancelation process$")
	public void fourth_NOC_User_login_with_valid_creditinals_for_full_cancelation_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>>fourth NOC user login with valid credtinals");
		extentpassreport("fourth NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a Cancelation Request with fourth NOC User (\\d+)$")
	public void check_the_status_a_Cancelation_Request_with_fourth_NOC_User(String statusoftheapplication, int i) {

		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with fourth NOC user");
		extentpassreport("fourth NOC user check the " + statusoftheapplication + "of the application");

	}

	@Then("^logout fourth NOC User after rise a full cancelation process$")
	public void logout_fourth_NOC_User_after_rise_a_full_cancelation_process() {
		closebrowser();
		extentpassreport("Logout fourth NOC user");
		System.out.println(">>>Logout fourth NOC user after checking the status of the  full cancelation request");

	}

	@When("^fifth RPM User login with valid creditinals for full Cancelation process$")
	public void fifth_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>fifth RPM user login with valid credtinals");
		extentpassreport("fifth RPM user login with valid credtinals succesfully");

	}

	@Then("^Rise a full Cancelation Request with  fifth RPM User (\\d+)$")
	public void rise_a_full_Cancelation_Request_with_fifth_RPM_User(int i) {
		rpm.fullcancelationwithRPMuser(i);
		System.out.println(">>>fifth RPM user rise a request succesfully");
		extentpassreport(" fifth RPM user rise a cancelation request succesfully");

	}

	@Then("^logout  fifth RPM User after rise a full Cancelation process$")
	public void logout_fifth_RPM_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout fifth RPM user");
		extentpassreport(">>>Logout fifth RPM user");

	}

	@When("^fifth NOC User login with valid creditinals for full Cancelation process$")
	public void fifth_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>>fourth NOC user login with valid credtinals");
		extentpassreport("fourth NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a full Cancelation Request with  fifth NOC User (\\d+)$")
	public void check_the_status_a_full_Cancelation_Request_with_fifth_NOC_User(String statusoftheapplication, int i) {
		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with fifth NOC user");
		extentpassreport("fifth NOC user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout  fifth NOC User after rise a full Cancelation process$")
	public void logout_fifth_NOC_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		extentpassreport("Logout fifth NOC user");
		System.out.println(">>>Logout fifth NOC user after checking the status of the  full cancelation request");
	}

	@When("^fifth Legal User login with valid creditinals for full Cancelation process$")
	public void fifth_Legal_User_login_with_valid_creditinals_for_full_Cancelation_process() {
		login.InitApplication();
		legal.loginwithLeaglUser();
		legal.legaluserloginwithpopup();
		extentpassreport("Login with Fifth Legal user");
		System.out.println("Login with Fifth Legal user");

	}

	@Then("^Request send to FCC of full Cancelation Request with  fifth Legal User (\\d+)$")
	public void request_send_to_FCC_of_full_Cancelation_Request_with_fifth_Legal_User(int i) {
		legal.CancelationrequestwithLeagluser(i);
		extentpassreport("fifth legal user  full cancelation application send to fcc");
		System.out.println("fifth legal user  full cancelation application send to fcc");

	}

	@Then("^logout fifth Legal User after rise a full Cancelation process$")
	public void logout_fifth_Legal_User_after_rise_a_full_Cancelation_process() {

		closebrowser();
		extentpassreport("Logout fifth Legal user");
		System.out.println(">>>Logout fifth Legal user after checking the status of the  full cancelation request");

	}

	@When("^sixth RPM User login with valid creditinals for full Cancelation process$")
	public void sixth_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process() {

		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>sixth RPM user login with valid credtinals");
		extentpassreport("sixth RPM user login with valid credtinals succesfully");
	}

	@Then("^Rise a full Cancelation Request with  sixth RPM User (\\d+)$")
	public void rise_a_full_Cancelation_Request_with_sixth_RPM_User(int i) {

		rpm.fullcancelationwithRPMuser(i);
		System.out.println(">>>sixth RPM user rise a request succesfully");
		extentpassreport(" sixth RPM user rise a cancelation request succesfully");
	}

	@Then("^logout  sixth RPM User after rise a full Cancelation process$")
	public void logout_sixth_RPM_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout sixth RPM user");
		extentpassreport(">>>Logout sixth RPM user");

	}

	@When("^sixth NOC User login with valid creditinals for full Cancelation process$")
	public void sixth_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process() throws Throwable {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>>sixth NOC user login with valid credtinals");
		extentpassreport("sixth NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a full Cancelation Request with  sixth NOC User (\\d+)$")
	public void check_the_status_a_full_Cancelation_Request_with_sixth_NOC_User(String statusoftheapplication, int i) {
		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with sixth NOC user");
		extentpassreport("sixth NOC user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout  sixth NOC User after rise a full Cancelation process$")
	public void logout_sixth_NOC_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		extentpassreport("Logout sixth NOC user");
		System.out.println(">>>Logout sixth NOC user after checking the status of the  full cancelation request");
	}

	@When("^seventh RPM User login with valid creditinals for full Cancelation process$")
	public void seventh_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process() {

		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println(">>>seventh RPM user login with valid credtinals");
		extentpassreport("seventh RPM user login with valid credtinals succesfully");
	}

	@Then("^Rise a full Cancelation Request with  Seventh RPM User (\\d+)$")
	public void rise_a_full_Cancelation_Request_with_Seventh_RPM_User(int i) {

		refreshthepage();
		sleep();
		rpm.fullcancelationwithRPMuser(i);
		System.out.println(">>>seventh RPM user rise a request succesfully");
		extentpassreport(" seventh RPM user rise a cancelation request succesfully");

	}

	@Then("^logout  seventh RPM User after rise a full Cancelation process$")
	public void logout_seventh_RPM_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		System.out.println(">>>Logout seventh RPM user");
		extentpassreport(">>>Logout seventh RPM user");

	}

	@When("^seventh NOC User login with valid creditinals for full Cancelation process$")
	public void seventh_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process() throws Throwable {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println(">>> seventh NOC user login with valid credtinals");
		extentpassreport("seventh NOC user login with valid credtinals succesfully");

	}

	@Then("^check the \"([^\"]*)\" status a full Cancelation Request with  seventh NOC User (\\d+)$")
	public void check_the_status_a_full_Cancelation_Request_with_seventh_NOC_User(String statusoftheapplication, int i) {
		noc.CancelationrequestwithNOCuser(statusoftheapplication, i);
		System.out.println(">>>Check the status of the cancelation request with seventh NOC user");
		extentpassreport("seventh NOC user check the " + statusoftheapplication + "of the application");
	}

	@Then("^logout  seventh NOC User after rise a full Cancelation process$")
	public void logout_seventh_NOC_User_after_rise_a_full_Cancelation_process() {
		closebrowser();
		extentpassreport("Logout seventh NOC user");
		extentreportssave();
		System.out.println(">>>Logout seventh NOC user after checking the status of the  full cancelation request");
	}

}
