
package com.Pathway_stage.Users;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Buildoutflowpages;
import com.Pathway_stage.Webpages.Cancelationflowpages;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.Renewalflowpages;

public class MarketUser extends Basepage
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	Renewalflowpages renewalpage = new Renewalflowpages();
	GettingData exceldata = new GettingData();
	Buildoutflowpages buildout = new Buildoutflowpages();
	
	public void loginmarketuser()
	{
		login.doLogin(exceldata.getUsername(1), exceldata.getUsername(1));
	}
	public void loginwithMarketUser()
	{
		login.stagelogin(exceldata.getUsername(1));
	}
	
	public void marketuserpopuplogin()
	{
		try {
			login.popupemail(exceldata.getUsername(1));
			login.popuppassword(exceldata.getPassword(1));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void cancelationRequest(int i)
	{
		
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.riseCancelationRequestWithMUuser(exceldata.getColumn_1(i), exceldata.getColumn_2(i));
	}
	 
	public void partialcancelation(int i)
	{

		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.partialcancelationrequestmitMUuser(exceldata.getColumn_1(i), exceldata.getColumn_2(i));
	}
	

	public void renewalrequest(int i)
	{
		
		refreshthepage();
		sleep();
		homepage.renewalbutton();
		renewalpage.renewalrequestwithmarketuser(exceldata.getColumn_1(i), exceldata.getColumn_2(i));
	}
	public void buildoutrequest(int i, String date)
	{
		
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		buildout.createnewbuildoutrequestwithMarketuser(exceldata.getColumn_1(i), exceldata.getColumn_2(i), date);
	}
}
