package com.Pathway_stage.Users;

import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.Renewalflowpages;
import com.Pathway_stage.Webpages.RequestViewPage;

public class MOuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	GettingData data = new GettingData();
	Renewalflowpages renewalpage = new Renewalflowpages();
	RequestViewPage view = new RequestViewPage();
	
	public void loginwithMouser()
	{
		String email =data.getUsername(7);
		String password = data.getPassword(7);
		login.doLogin(email, password);
	}
	
	public void renewalrequestwithMOuser(String statusofapplication, int i)
	{
		
		homepage.renewalbutton();
		view.requestview(i);
		if (statusofapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithMOuser();
		}
		else {
			renewalpage.rejectrenewalwithMOuser();
		}
	}

}
