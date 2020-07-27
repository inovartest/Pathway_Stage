package com.Pathway_stage.Stepdefinations;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Pathway_satge.DriverManager.DriverManager;
import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.LogoutPage;

public class MODEL extends Basepage
{
	
	
	public static void main(String[] args)
	{
		DriverManager manage = new DriverManager();
		Loginpage login = new Loginpage();
		Basepage base = new Basepage();
		LogoutPage logout = new LogoutPage();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-insecure-localhost");
		options.addArguments("--incognito");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		caps.setCapability("acceptInsecureCerts", true);
        driver = new ChromeDriver(caps);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://mwstageapp.apps.px-prd02.cf.t-mobile.com/");
		base.sleep();
		
		
		login.stagelogin("Jaleel.Khan23@T-Mobile.com");
		login.popupemail("Jaleel.Khan23@T-Mobile.com");
		login.popuppassword("4u2Changeme!");
		
	   // ((JavascriptExecutor) driver).executeScript("window.open()");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.open()");
	            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	            driver.switchTo().window(tabs.get(0)).close();
	            driver.switchTo().window(tabs.get(1));
	        

		//logout.logoutUser();
		//driver.close();
		
	/*	ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--allow-insecure-localhost");
		options1.addArguments("--incognito");
		DesiredCapabilities caps1 = DesiredCapabilities.chrome();
		caps1.setCapability(ChromeOptions.CAPABILITY, options1);
		caps1.setCapability("acceptInsecureCerts", true);
       driver = new ChromeDriver(caps1);
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);*/
		
		/*driver.get("https://microwaveapp.azurewebsites.net/");
		base.sleep();*/
		
		driver.get("https://mwstageapp.apps.px-prd02.cf.t-mobile.com/");
		base.sleep();
		//base.clearcahce();
		base.cookies();
		/*driver.navigate().back();
		base.sleep();
		base.refreshthepage();*/
		/*base.switchwindow(1);
		driver.navigate().to("https://mwstageapp.apps.px-prd02.cf.t-mobile.com/");
		base.sleep();*/
		/*driver.findElement(By.className("tile-img")).click();
		base.sleep();*/
		
		login.stagelogin("Ramesh.Bandaru2@T-Mobile.com");
		login.popupemail("Ramesh.Bandaru2@T-Mobile.com");
		login.popuppassword("Buffalo5362?");
		base.sleep();
		
		
		
		
		
	}

}
