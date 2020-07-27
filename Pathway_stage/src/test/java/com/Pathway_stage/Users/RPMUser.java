package com.Pathway_stage.Users;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Buildoutflowpages;
import com.Pathway_stage.Webpages.Cancelationflowpages;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.Renewalflowpages;
import com.Pathway_stage.Webpages.RequestViewPage;

public class RPMUser extends Basepage
{

	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	GettingData data = new GettingData();
	Renewalflowpages renewalpage = new Renewalflowpages();
	Buildoutflowpages buildout = new Buildoutflowpages();
	RequestViewPage view = new RequestViewPage();
	public void loginwithRPMUser()
	{
		
		login.stagelogin(data.getUsername(2));
	}
	
	public void Rpmuserloginwithpopup()
	{
		try {
			login.popupemail(data.getUsername(2));
			login.popuppassword(data.getPassword(2));
			sleep();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void CancelationrequestwithRPMuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestview(i);
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithRPMuser();
		}
		else {
			cancel.rejectcancelationwithRPMuser();
		}
	}
	
	public void fullcancelationwithRPMuser(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.fullcancelationwithRPM(Txid, Rxid);
	}
	public void partialcancelationwithRPMuser(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.partialcancelationwithRPM(Txid, Rxid);
	}
	public void renewalrequestwithRPMuser(int i)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.renewalbutton();
		renewalpage.createnewrenewalrequestwithRPMuser(txid, rxid);
	}
	
	public void RenewalrequetwithRPMuser(String statsuoftheapplication, int i)
	{
		homepage.renewalbutton();
		view.requestview(i);
		if (statsuoftheapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithRPMuser();
		}
		else {
			renewalpage.rejectrenewalwithRPMuser();
		}
	}
	
	public void buildoutrequestwithRPMuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforpm(i);
		if (statusoftheapplication.equals("Approved"))
		{
			buildout.buildoutrequestapprovewithRPMuser();
		}
		else {
			buildout.buildoutrequestrejectwithRPMuser();
		}
	}
	public void createbuildoutrequestwithrpm(int i, String date)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		buildout.createnewbuildoutrequestwithRPMuser(txid, rxid, date);
	}

}
