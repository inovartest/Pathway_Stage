package com.Pathway_stage.Webpages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import com.Pathway_stage.Base.Basepage;

public class LogoutPage extends Basepage
{
	
	private By accounticon = By.xpath("//img[@id='profile-img']");
	private By logoutbutton = By.xpath("//a[contains(text(),'Logout')]");
	
	public void logoutUser()
	{
		refreshthepage();
		sleep();
		try {
			
			mouseoverelement(accounticon);
			sleep();
			explicitWaitClickable(logoutbutton);
			sleep();
		} catch (NoSuchElementException e) {
			
		}
		
}

}
