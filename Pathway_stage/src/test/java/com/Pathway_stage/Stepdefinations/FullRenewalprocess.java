package com.Pathway_stage.Stepdefinations;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;
import com.Pathway_stage.Users.LegalUser;
import com.Pathway_stage.Users.NOCUser;
import com.Pathway_stage.Users.RPMUser;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.LogoutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FullRenewalprocess extends Basepage
{
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
	RPMUser rpm = new RPMUser();
	NOCUser noc = new NOCUser();
	LegalUser legal = new LegalUser();
	
	@Given("^enter url application into \"([^\"]*)\" for Renewal flow with \"([^\"]*)\"$")
	public void enter_url_application_into_for_Partial_cancelation_flow(String browsername, String environment) {
		extentreporinit("Renewal flow", "renewal flow report");
		init(browsername);
		if (environment.equals("local")) {
			geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		}
		else {
			geturl(Pathwayconstants.STAGE_URL_OF_THE_APPLICATION);
		}
	
		System.out.println(">>>Launch application succesfully ");
		extentpassreport("Application launch succesfully");

	}

@When("^first RPM User login with valid creditinals for Renewal process with \"([^\"]*)\"$")
public void first_RPM_User_login_with_valid_creditinals_for_Renewal_process(String environment) 
{
	if (environment.equals("local")) {
		rpm.loginwithRPMUser();
	    login.ClickYesbutton();
	}
	else {
		rpm.loginwithRPMUser();
		rpm.Rpmuserloginwithpopup();
	}
    
    extentpassreport("RPM user1 login with succesfully valid credtinals");
    System.out.println("RPM user1 login with succesfully valid credtinals");
}

@Then("^Rise a Renewal Request with  first RPM User (\\d+)$")
public void rise_a_Renewal_Request_with_first_RPM_User(int i) 
{
	rpm.renewalrequestwithRPMuser(i);
	extentpassreport("Renewal request rise succesfully with rpm user1");
	System.out.println("Renewal request rise succesfully with rpm user1");
   
}

@Then("^logout  fifth RPM User after rise a Renewal process$")
public void logout_fifth_RPM_User_after_rise_a_Renewal_process() 
{
   closebrowser();
   extentpassreport("logout RPM user 1  after rise a renewal request");
   System.out.println("logout RPM user 1  after rise a renewal request");
}

@When("^first NOC User login with valid creditinals for renewal process$")
public void first_NOC_User_login_with_valid_creditinals_for_renewal_process() 
{
	login.InitApplication();
	noc.loginwithNOCUser();
	noc.nocuserpopuplogin();
	extentpassreport("NOC user1 login with succesfully valid credtinals");
    System.out.println("NOC user1 login with succesfully valid credtinals");
   
}

@Then("^check the \"([^\"]*)\" status a Renewal Request with  first NOC User (\\d+)$")
public void check_the_status_a_Renewal_Request_with_first_NOC_User(String statusoftheapplication, int i) 
{
	noc.renewalrequestwithNOCuser(statusoftheapplication, i);
	System.out.println(">>>Check the status of the renewal request with First NOC user");
	extentpassreport("Fisrt NOC user check the " + statusoftheapplication + "of the application");
   
}

@Then("^logout  first NOC User after rise a Renewal process$")
public void logout_first_NOC_User_after_rise_a_Renewal_process() 
{
     closebrowser();
    extentpassreport("logout NOC user 1  after check a renewal request");
    System.out.println("logout NOC user 1  after check a renewal request");
}

@When("^first Legal User login with valid creditinals for Renewal process$")
public void first_Legal_User_login_with_valid_creditinals_for_Renewal_process() 
{
  login.InitApplication();
  legal.loginwithLeaglUser();
  legal.legaluserloginwithpopup();
  extentpassreport("Legal user1 login with succesfully valid credtinals");
  System.out.println("Legal user1 login with succesfully valid credtinals");
}

@Then("^Request send to FCC of Renewal Request with  first Legal User (\\d+)$")
public void request_send_to_FCC_of_Renewal_Request_with_first_Legal_User(int i) 
{
	legal.renewalrequestsendtoFCCwithLegalsuer(i);
	extentpassreport("first legal user  renewal application send to fcc");
	System.out.println("first legal user  renewal cancelation application send to fcc");
   
}

@Then("^logout first Legal User after rise a Renewal process$")
public void logout_first_Legal_User_after_rise_a_Renewal_process() 
{
    closebrowser();
    extentpassreport("logout legal user 1  after check a renewal request");
    System.out.println("logout legal user 1  after check a renewal request");
}

@When("^second RPM User login with valid creditinals for Renewal process$")
public void second_RPM_User_login_with_valid_creditinals_for_Renewal_process() 
{
	login.InitApplication();
	 rpm.loginwithRPMUser();
	 rpm.Rpmuserloginwithpopup();
	    extentpassreport("RPM user2 login with succesfully valid credtinals");
	    System.out.println("RPM user2 login with succesfully valid credtinals");
  
}

@Then("^Rise a Renewal Request with  second RPM User (\\d+)$")
public void rise_a_Renewal_Request_with_second_RPM_User(int i) 
{
	
	rpm.renewalrequestwithRPMuser(i);
	extentpassreport("Renewal request rise succesfully with rpm user2");
	System.out.println("Renewal request rise succesfully with rpm user2");
}

@Then("^logout  second RPM User after rise a Renewal process$")
public void logout_second_RPM_User_after_rise_a_Renewal_process() 
{
	closebrowser();
	   extentpassreport("logout RPM user 1  after rise a renewal request");
	   System.out.println("logout RPM user 1  after rise a renewal request");
    
}

@When("^second NOC User login with valid creditinals for renewal process$")
public void second_NOC_User_login_with_valid_creditinals_for_renewal_process() 
{
	login.InitApplication();
   noc.loginwithNOCUser();
   noc.nocuserpopuplogin();
	extentpassreport("NOC user2 login with succesfully valid credtinals");
   System.out.println("NOC user2 login with succesfully valid credtinals");
  
   
}

@Then("^check the \"([^\"]*)\" status a Renewal Request with  second NOC User (\\d+)$")
public void check_the_status_a_Renewal_Request_with_second_NOC_User(String statusoftheapplication, int i) 
{
	refreshthepage();
	sleep();
	noc.renewalrequestwithNOCuser(statusoftheapplication, i);
	System.out.println(">>>Check the status of the renewal request with second NOC user");
	extentpassreport("second NOC user check the " + statusoftheapplication + "of the application");
  
}

@Then("^logout  second NOC User after rise a Renewal process$")
public void logout_second_NOC_User_after_rise_a_Renewal_process() 
{
	
	 closebrowser();
	    extentpassreport("logout NOC user 2  after check a renewal request");
	    System.out.println("logout NOC user 2  after check a renewal request");
}

@When("^third RPM User login with valid creditinals for Renewal process$")
public void third_RPM_User_login_with_valid_creditinals_for_Renewal_process() 
{
	login.InitApplication();
	 rpm.loginwithRPMUser();
	 rpm.Rpmuserloginwithpopup();
	    extentpassreport("RPM user3 login with succesfully valid credtinals");
	    System.out.println("RPM user3 login with succesfully valid credtinals");

}

@Then("^Rise a Renewal Request with  third RPM User (\\d+)$")
public void rise_a_Renewal_Request_with_third_RPM_User(int i) throws Throwable {
	rpm.renewalrequestwithRPMuser(i);
	extentpassreport("Renewal request rise succesfully with rpm user3");
	System.out.println("Renewal request rise succesfully with rpm user3");
}

@Then("^logout  third RPM User after rise a Renewal process$")
public void logout_third_RPM_User_after_rise_a_Renewal_process() 

{
	closebrowser();
	   extentpassreport("logout RPM user 3  after rise a renewal request");
	   System.out.println("logout RPM user 3  after rise a renewal request");
}

@When("^third NOC User login with valid creditinals for renewal process$")
public void third_NOC_User_login_with_valid_creditinals_for_renewal_process() 
{
	login.InitApplication();
	noc.loginwithNOCUser();
	noc.nocuserpopuplogin();
	extentpassreport("NOC user3 login with succesfully valid credtinals");
   System.out.println("NOC user3 login with succesfully valid credtinals");
	
  
}

@Then("^check the \"([^\"]*)\" status a Renewal Request with  third NOC User (\\d+)$")
public void check_the_status_a_Renewal_Request_with_third_NOC_User(String statusoftheapplication, int i) 
{
	refreshthepage();
	sleep();
	noc.renewalrequestwithNOCuser(statusoftheapplication, i);
	System.out.println(">>>Check the status of the renewal request with third NOC user");
	extentpassreport("third NOC user check the " + statusoftheapplication + "of the application");
  
}

@Then("^logout  third NOC User after rise a Renewal process$")
public void logout_third_NOC_User_after_rise_a_Renewal_process() 
{
	refreshthepage();
	sleep();
	closebrowser();
	   extentpassreport("logout RPM user 3  after rise a renewal request");
	   System.out.println("logout RPM user 3  after rise a renewal request");
	   extentreportssave();
}

}
