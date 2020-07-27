package com.Pathway_stage.Users;

import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Cancelationflowpages;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.RequestViewPage;

public class RRMUSER 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	GettingData data = new GettingData();
	RequestViewPage view = new RequestViewPage();
	
	public void loginwithRRMUser()
	{
		String email = data.getUsername(3);
		String password = data.getPassword(3);
		login.doLogin(email, password);
	}
	
	public void CancelationrequestwithRRMuser(String statusoftheapplication,int i)
	{
		homepage.cancelationbutton();
		try {
			view.requestview(i);
		} catch (Exception e) {
			
		}

	
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithRRMuser();
		}
		else {
			cancel.rejectcancelationwithRRMuser();
		}
	}

}
