package com.Pathway_stage.Stepdefinations;

import java.util.NoSuchElementException;

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

public class FullBuildoutflow extends Basepage
{
	Loginpage login = new Loginpage();
	MarketUser market = new MarketUser();
	RPMUser rpm = new RPMUser();
	NOCUser noc = new NOCUser();
	LegalUser legal = new LegalUser();
	RequestViewPage view = new RequestViewPage();
	LogoutPage logout = new LogoutPage();

	@Given("^enter url application into \"([^\"]*)\" for full BuildOutflow flow with \"([^\"]*)\"$")
	public void IntiationApplication(String browsername, String environment) {
		extentreporinit("FullBuildoutflow", "FullBuildoutflow");
		init(browsername);
		if (environment.equals("local")) {
			geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		}
		else {
			geturl(Pathwayconstants.STAGE_URL_OF_THE_APPLICATION);
		}
		
		extentpassreport("Launch Application succesfully into the browser");
		System.out.println("Launch Application succesfully into the browser");
	}

	@When("^First Market User login with valid creditinals for full BuildOutflow process with \"([^\"]*)\"$")
	public void first_Market_User_login_with_valid_creditinals_for_full_BuildOutflow_process(String environment)
	{
		if (environment.equals("local")) {
			market.loginmarketuser();
			login.ClickYesbutton();
		}
		else {
			market.loginwithMarketUser();
			market.marketuserpopuplogin();
			}
				
		System.out.println("Market user1 login succesfully");
		extentpassreport("Market user1 login succesfully");
	}

	@Then("^Rise a BuildOutflow Request with  First Market User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_First_Market_User(int i, String date) {
		market.buildoutrequest(i, date);
		extentpassreport("Rise a build out request with Market user1");
		System.out.println("Rise a build out request with Market user1");
	}

	@Then("^logout  First MarketUser after rise a full BuildOutflow process$")
	public void logout_First_MarketUser_after_rise_a_full_BuildOutflow_process() {
		try {
			
			
			closebrowser();
		} catch (NoSuchElementException e) {

		}

		System.out.println(">>>logout market user1 after rise build out request");
		extentpassreport("Logout Market user1 after succesful rise a Buildout request");
	}

	@When("^First RPM User login with valid creditinals for full BuildOutflow process$")
	public void first_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() 
	{
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		sleep();
		extentpassreport("Login with RPM USER1 for build out process");
		System.out.println("Login with RPM USER1 for build out process");

	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with First RPM User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_First_RPM_User(String statusoftheapplication, int i)
	{
		refreshthepage();
		try {
			rpm.buildoutrequestwithRPMuser(statusoftheapplication, i);
		} catch (NoSuchElementException e) {
			
		}
		
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with RPM USER1");
		System.out.println("Check the" + statusoftheapplication + "of the BUildout request with RPM USER1");

	}

	@Then("^logout First RPM User after rise a full BuildOutflow process$")
	public void logout_First_RPM_User_after_rise_a_full_BuildOutflow_process() {
	
		closebrowser();
		extentpassreport("Logout RPM user1 after check the build out request");
		System.out.println("Logout RPM user1 after check the build out request");

	}

	@When("^First NOC User login with valid creditinals for full BuildOutflow process$")
	public void first_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() throws Throwable {

		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		
		extentpassreport("Login with NOC USER1 for build out process");
		System.out.println("Login with NOC USER1 for build out process");

	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  First NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_First_NOC_User(String statusoftheapplication, int i) {
		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with NOC USER1");
		System.out.println("Check the" + statusoftheapplication + "of the BUildout request with NOC USER1");
	}

	@Then("^logout First NOC User after rise a full BuildOutflow process$")
	public void logout_First_NOC_User_after_rise_a_full_BuildOutflow_process() {
		closebrowser();
		extentpassreport("Logout NOC user1 after check the build out request");
		System.out.println("Logout NOC user1 after check the build out request");
	}

	@When("^First Legal User login with valid creditinals for full BuildOutflow process$")
	public void first_Legal_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		legal.loginwithLeaglUser();
		legal.legaluserloginwithpopup();
		sleep();
		extentpassreport("Login with Legal USER1 for build out process");
		System.out.println("Login with NOC USER1 for build out process");

	}

	@Then("^Request send to FCC of BuildOutflow Request with  First Legal User (\\d+)$")
	public void request_send_to_FCC_of_BuildOutflow_Request_with_First_Legal_User(int i)
	{
		refreshthepage();
		legal.sendtoFCCbuildrequestwithLegalsuer(i);
		extentpassreport("Buildout request send to FCC with Legal user1 ");
		System.out.println("Buildout request send to FCC with Leagal user1");

	}

	@Then("^logout First Legal User after rise a full BuildOutflow process$")
	public void logout_First_Legal_User_after_rise_a_full_BuildOutflow_process() throws Throwable {

		closebrowser();
		extentpassreport("Logout Legal user1 after check the build out request");
		System.out.println("Logout Leagal user1 after check the build out request");
	}

	@When("^Second Market User login with valid creditinals for full BuildOutflow process$")
	public void second_Market_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		System.out.println("Market user2 login succesfully");
		extentpassreport("Market user2 login succesfully");
	}

	@Then("^Rise a BuildOutflow Request with secondMarket User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_secondMarket_User(int i, String date) throws Throwable {

		market.buildoutrequest(i, date);
		extentpassreport("Rise a build out request with Market user2");
		System.out.println("Rise a build out request with Market user2");
	}

	@Then("^logout Second MarketUser after rise a full BuildOutflow process$")
	public void logout_Second_MarketUser_after_rise_a_full_BuildOutflow_process() throws Throwable {

		try {
			
			closebrowser();
		} catch (NoSuchElementException e) {

		}

		System.out.println(">>>logout market user2 after rise build out request");
		extentpassreport("Logout Market user2 after succesful rise a Buildout request");
	}

	@When("^Second RPM User login with valid creditinals for full BuildOutflow process$")
	public void second_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println("RPM USER2 login succesfully");
		extentpassreport("RPM user2 login succesfully");
	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with Second RPM User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_Second_RPM_User(String statusoftheapplication, int i) {

		rpm.buildoutrequestwithRPMuser(statusoftheapplication, i);
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with RPM USER2");
		System.out.println("Check the" + statusoftheapplication + "of the BUildout request with RPM USER2");

	}

	@Then("^logout RPM Second User after rise a full BuildOutflow process$")
	public void logout_RPM_Second_User_after_rise_a_full_BuildOutflow_process() throws Throwable {

		closebrowser();
		extentpassreport("Logout RPM USER2 after check the build out request");
		System.out.println("Logout RPM USER 2 after check the build out request");

	}

	@When("^Third Market User login with valid creditinals for full BuildOutflow process$")
	public void third_Market_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		System.out.println("Market user3 login succesfully");
		extentpassreport("Market user3 login succesfully");

	}

	@Then("^Rise a BuildOutflow Request with  Third Market User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_Third_Market_User(int i, String date) {
		market.buildoutrequest(i, date);
		extentpassreport("Rise a build out request with Market user3");
		System.out.println("Rise a build out request with Market user3");
	}

	@Then("^logout  Third MarketUser after rise a full BuildOutflow process$")
	public void logout_Third_MarketUser_after_rise_a_full_BuildOutflow_process() throws Throwable {

		try {
			
			closebrowser();
		} catch (NoSuchElementException e) {

		}

		System.out.println(">>>logout market user3 after rise build out request");
		extentpassreport("Logout Market user3 after succesful rise a Buildout request");
	}

	@When("^Third RPM User login with valid creditinals for full BuildOutflow process$")
	public void third_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {

		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println("RPM USER3 login succesfully");
		extentpassreport("RPM user3 login succesfully");
	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with Third RPM User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_Third_RPM_User(String statusoftheapplication, int i) {

		rpm.buildoutrequestwithRPMuser(statusoftheapplication, i);
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with RPM USER3");
		System.out.println("Check the" + statusoftheapplication + "of the BUildout request with RPM USER3");
	}

	@Then("^logout Third RPM User after rise a full BuildOutflow process$")
	public void logout_Third_RPM_User_after_rise_a_full_BuildOutflow_process() {

		closebrowser();
		extentpassreport("Logout RPM USER3 after check the build out request");
		System.out.println("Logout RPM USER 3 after check the build out request");
	}

	@When("^Third NOC User login with valid creditinals for full BuildOutflow process$")
	public void third_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {

		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		System.out.println("NOC USER3 login succesfully");
		extentpassreport("NOC user3 login succesfully");
	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  Third NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_Third_NOC_User(String statusoftheapplication, int i)
			throws Throwable {

		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with NOC USER3");
		System.out.println("Check the" + statusoftheapplication + "of the BUildout request with NOC USER3");
	}

	@Then("^logout  Third NOC User after rise a full BuildOutflow process$")
	public void logout_Third_NOC_User_after_rise_a_full_BuildOutflow_process() throws Throwable {
		closebrowser();
		extentpassreport("Logout NOC USER3 after check the build out request");
		System.out.println("Logout NOC USER 3 after check the build out request");

	}

	@When("^fourth Market User login with valid creditinals for full BuildOutflow process$")
	public void fourth_Market_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
		extentpassreport("Login succesfully Market user4 for buildout request");
		System.out.println("Login succesfully Market user4 for buildout request");

	}

	@Then("^Rise a BuildOutflow Request with  fourth Market User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_fourth_Market_User_with(int i, String date)
	{
		refreshthepage();
		market.buildoutrequest(i, date);
		extentpassreport("Rise a build out request with Market user4");
		System.out.println("Rise a build out request with Market user4");
	}

	@Then("^logout  fourth MarketUser after rise a full BuildOutflow process$")
	public void logout_fourth_MarketUser_after_rise_a_full_BuildOutflow_process() {

		try {
			
			closebrowser();
		} catch (NoSuchElementException e) {

		}

		System.out.println(">>>logout market user4 after rise build out request");
		extentpassreport("Logout Market user4 after succesful rise a Buildout request");

	}

	@When("^fourth RPM User login with valid creditinals for full BuildOutflow process$")
	public void fourth_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {

		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		System.out.println("RPM USER4 login succesfully");
		extentpassreport("RPM user4 login succesfully");
	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with fourth RPM User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_fourth_RPM_User(String statusoftheapplication, int i) {
		rpm.buildoutrequestwithRPMuser(statusoftheapplication, i);
		extentpassreport("Check the" + statusoftheapplication + "of the BUildout request with RPM USER4");
		System.out.println("Check the\" + statusoftheapplication + \"of the BUildout request with RPM USER4");

	}

	@Then("^logout fourth RPM User after rise a full BuildOutflow process$")
	public void logout_fourth_RPM_User_after_rise_a_full_BuildOutflow_process() {
		closebrowser();
		extentpassreport("Logout Market user4 after build out process");
	}

	@When("^fourth NOC User login with valid creditinals for full BuildOutflow process$")
	public void fourth_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		extentpassreport("Login with NOC USER 4 FOR BUILD OUT PROCESS");
		System.out.println("Login with NOC USER 4 FOR BUILD OUT PROCESS");
	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  fourth NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_fourth_NOC_User(String statusoftheapplication, int i) {
		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("check the" + statusoftheapplication + "OF BUILDout request with NOC User4");
		System.out.println("check the" + statusoftheapplication + "OF BUILDout request with NOC User4");

	}

	@Then("^logout  fourth NOC User after rise a full BuildOutflow process$")
	public void logout_fourth_NOC_User_after_rise_a_full_BuildOutflow_process() {
		closebrowser();
		extentpassreport("noc user 4 logout after buildout request");
		System.out.println("noc user 4 logout after buildout request");

	}
	@When("^fourth Legal User login with valid creditinals for full BuildOutflow process$")
	public void fourth_Legal_User_login_with_valid_creditinals_for_full_BuildOutflow_process() 
	{
		login.InitApplication();
		legal.loginwithLeaglUser();
		legal.legaluserloginwithpopup();
		extentpassreport("Login with fourth  legal account for build out process");
		System.out.println("Login with fourth  legal account for build out process");
	}

	@Then("^BuildOutflow Request reject with  fourth Legal User (\\d+)$")
	public void buildoutflow_Request_reject_with_fourth_Legal_User(int i) 
	{
	    legal.rejectbuildoutapplicationwithlegaluser(i);
	    extentpassreport("reject buildout request with fourth legaluser");
	    System.out.println("reject buildout request with fourth legaluser");
	}

	@Then("^logout fourth Legal User after rise a full BuildOutflow process$")
	public void logout_fourth_Legal_User_after_rise_a_full_BuildOutflow_process() {
	
		closebrowser();
		extentpassreport("legal user 4 logout after buildout request");
		System.out.println("legal user 4 logout after buildout request");
	}

	@When("^fifth RPM User login with valid creditinals for full BuildOutflow process$")
	public void fifth_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		extentpassreport("RPM user login with valid credtinals for Rise a build out request");
		System.out.println("RPM user login with valid credtinals for Rise a build out request");

	}

	@Then("^Rise a BuildOutflow Request with  fifth RPM User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_fifth_RPM_User_with(int i, String date) {
		rpm.createbuildoutrequestwithrpm(i, date);
		extentpassreport("Rise a request with RPM user for build out request");
		System.out.println("Rise a request with RPM user for build out request");

	}

	@Then("^logout  fifth RPM User after rise a full BuildOutflow process$")
	public void logout_fifth_RPM_User_after_rise_a_full_BuildOutflow_process() {
		try {
		closebrowser();
		} catch (NoSuchElementException e) {

		}
		extentpassreport("logout RPM user5 after creating Buildout reqesut");
		System.out.println("logout RPM user5 after creating Buildout reqesut");

	}

	@When("^fifth NOC User login with valid creditinals for full BuildOutflow process$")
	public void fifth_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		extentpassreport("NOC user 5 login with valid credtinals for Build Out request");
		System.out.println("NOC user 5 login with valid credtinals for Build Out request");

	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  fifth NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_fifth_NOC_User(String statusoftheapplication, int i) {
		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("NOC user5  check the" + statusoftheapplication + "for build out request");
		System.out.println("NOC user5  check the" + statusoftheapplication + "for build out request");

	}

	@Then("^logout  fifth NOC User after rise a full BuildOutflow process$")
	public void logout_fifth_NOC_User_after_rise_a_full_BuildOutflow_process() {
		closebrowser();
		extentpassreport("Logout NOC USER5 after succesful build out request");
		System.out.println("Logout NOC USER5 after succesful build out request");

	}

	@When("^fifth Legal User login with valid creditinals for full BuildOutflow process$")
	public void fifth_Legal_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		legal.loginwithLeaglUser();
		legal.legaluserloginwithpopup();
		extentpassreport("Login with fifth  legal account for build out process");
		System.out.println("Login with fifth  legal account for build out process");

	}

	@Then("^Request send to FCC of BuildOutflow Request with  fifth Legal User (\\d+)$")
	public void request_send_to_FCC_of_BuildOutflow_Request_with_fifth_Legal_User(int i) {
		legal.sendtoFCCbuildrequestwithLegalsuer(i);
		extentpassreport("Legal user 5 send to FCC with buildout request");
		System.out.println("Legal user 5 send to FCC with buildout request");

	}

	@Then("^logout fifth Legal User after rise a full BuildOutflow process$")
	public void logout_fifth_Legal_User_after_rise_a_full_BuildOutflow_process() {
        closebrowser();
		extentpassreport("Logout Legal USER5 after succesful build out request");
		System.out.println("Logout Legal USER5 after succesful build out request");

	}

	@When("^sixth RPM User login with valid creditinals for full BuildOutflow process$")
	public void sixth_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		extentpassreport("RPM user6 login with valid credtinals for Rise a build out request");
		System.out.println("RPM user6 login with valid credtinals for Rise a build out request");

	}

	@Then("^Rise a BuildOutflow Request with  sixth RPM User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_sixth_RPM_User_with(int i, String date) throws Throwable {
		rpm.createbuildoutrequestwithrpm(i, date);
		extentpassreport("Rise a request with RPM user6 for build out request");
		System.out.println("Rise a request with RPM user6 for build out request");

	}

	@Then("^logout  sixth RPM User after rise a full BuildOutflow process$")
	public void logout_sixth_RPM_User_after_rise_a_full_BuildOutflow_process() {
		try {
			closebrowser();
			
		} catch (NoSuchElementException e) {

		}
		extentpassreport("logout RPM user6 after creating Buildout reqesut");
		System.out.println("logout RPM user6 after creating Buildout reqesut");
	}

	@When("^sixth NOC User login with valid creditinals for full BuildOutflow process$")
	public void sixth_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {

		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		extentpassreport("NOC user 6 login with valid credtinals for Build Out request");
		System.out.println("NOC user 6 login with valid credtinals for Build Out request");

	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  sixth NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_sixth_NOC_User(String statusoftheapplication, int i) {
		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("NOC user6  check the" + statusoftheapplication + "for build out request");
		System.out.println("NOC user6  check the" + statusoftheapplication + "for build out request");

	}

	@Then("^logout  sixth NOC User after rise a full BuildOutflow process$")
	public void logout_sixth_NOC_User_after_rise_a_full_BuildOutflow_process() {
        closebrowser();
		extentpassreport("Logout NOC USER6 after succesful build out request");
		System.out.println("Logout NOC USER6 after succesful build out request");
	}

	@When("^seventh RPM User login with valid creditinals for full BuildOutflow process$")
	public void seventh_RPM_User_login_with_valid_creditinals_for_full_BuildOutflow_process()
	{
		
		login.InitApplication();
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
		extentpassreport("RPM user7 login with valid credtinals for Rise a build out request");
		System.out.println("RPM user7 login with valid credtinals for Rise a build out request");

	}

	@Then("^Rise a BuildOutflow Request with  Seventh RPM User (\\d+) with \"([^\"]*)\"$")
	public void rise_a_BuildOutflow_Request_with_Seventh_RPM_User_with(int i, String date) throws Throwable
	{
		refreshthepage();
		sleep();
		rpm.createbuildoutrequestwithrpm(i, date);
		extentpassreport("Rise a request with RPM user7 for build out request");
		System.out.println("Rise a request with RPM user7 for build out request");

	}

	@Then("^logout  seventh RPM User after rise a full BuildOutflow process$")
	public void logout_seventh_RPM_User_after_rise_a_full_BuildOutflow_process() {
		try {
			
		closebrowser();
		} catch (NoSuchElementException e) {

		}
		extentpassreport("logout RPM user7 after creating Buildout reqesut");
		System.out.println("logout RPM user7 after creating Buildout reqesut");
	}

	@When("^seventh NOC User login with valid creditinals for full BuildOutflow process$")
	public void seventh_NOC_User_login_with_valid_creditinals_for_full_BuildOutflow_process() {
		login.InitApplication();
		noc.loginwithNOCUser();
		noc.nocuserpopuplogin();
		extentpassreport("NOC user 7 login with valid credtinals for Build Out request");
		System.out.println("NOC user 7 login with valid credtinals for Build Out request");

	}

	@Then("^check the \"([^\"]*)\" status a BuildOutflow Request with  seventh NOC User (\\d+)$")
	public void check_the_status_a_BuildOutflow_Request_with_seventh_NOC_User(String statusoftheapplication, int i) {
		noc.buildourequestwithNOCuser(statusoftheapplication, i);
		extentpassreport("NOC user7  check the" + statusoftheapplication + "for build out request");
		System.out.println("NOC user7  check the" + statusoftheapplication + "for build out request");

	}

	@Then("^logout  seventh NOC User after rise a full BuildOutflow process$")
	public void logout_seventh_NOC_User_after_rise_a_full_BuildOutflow_process() throws Throwable {

		closebrowser();
		extentpassreport("Logout NOC USER7 after succesful build out request");
		System.out.println("Logout NOC USER7 after succesful build out request");
		extentreportssave();
	}

}
