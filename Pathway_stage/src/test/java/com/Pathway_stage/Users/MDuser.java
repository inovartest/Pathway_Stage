package com.Pathway_stage.Users;

import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.Renewalflowpages;
import com.Pathway_stage.Webpages.RequestViewPage;

public class MDuser 
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Renewalflowpages renewalpage = new Renewalflowpages();
	GettingData data = new GettingData();
	RequestViewPage view = new RequestViewPage();
	
	public void loginwithMDuser()
	{
		String email =data.getUsername(6);
		String password = data.getPassword(6);
		login.doLogin(email, password);
	}

	public void renewlrequetwithMDuser(int i)
	{
		homepage.renewalbutton();
		view.requestview(i);
		renewalpage.renewlapprovewithMDuser();
		
	}
}
