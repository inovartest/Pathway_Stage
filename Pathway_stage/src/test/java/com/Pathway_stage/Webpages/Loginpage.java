package com.Pathway_stage.Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

import com.Pathway_satge.DriverManager.DriverManager;
import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;


public class Loginpage extends Basepage
{

	DriverManager manager = new DriverManager();

	private By Emailfieldbox = By.id("i0116");
	private By Nextbuttonforsignin = By.id("idSIButton9");
	private By Passwordfiledbox = By.id("i0118");
	private By signinbutton = By.id("idSIButton9");
	private By Yesbutton = By.id("idSIButton9");
	private By loginsecondaccount = By.xpath("(.//*[@data-bind='imgSrc'])[3]");
	private By loginwiththirdaccount = By.xpath("(.//*[@data-bind='imgSrc'])[5]");
	private By loginwithfourthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[7]");
	private By loginwithfifthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[9]");
	private By loginwithsixthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[11]");
	
	public void doLogin( String email, String password)
	{
		try {
			enterText(Emailfieldbox, email);
			sleep();
			click(Nextbuttonforsignin);
			sleep();
			
			enterText(Passwordfiledbox, password);
			sleep();
			//element.sendKeys(password);
		} catch (StaleElementReferenceException e) {
			enterText(Passwordfiledbox, password);
			sleep();
		}
	/*	WebElement element1 = driver.findElement(signinbutton);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(Passwordfiledbox));
		element1.click();*/
		
		
		explicitWaitClickable(signinbutton);
		//sleep();
	}
	public void InitApplication()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-insecure-localhost");
		/*options.addArguments("--incognito");*/
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		caps.setCapability("acceptInsecureCerts", true);
driver = new ChromeDriver(caps);
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://mwstageapp.apps.px-prd02.cf.t-mobile.com/");
		sleep();	
		}
	
	public void stagelogin(String email)
	{
		sleep();
		enterText(Emailfieldbox, email);
		sleep();
		click(Nextbuttonforsignin);
		sleep();
	}
	
	public void popupemail(String emailforpopup)
	{
		try {
			Thread.sleep(5000);
			Screen screen = new Screen();
			screen.type("E:\\WORKSPACE\\Pathway_stage1\\Pathway_Stage\\Pathway_stage\\Screenshot (364).png", emailforpopup);
			Thread.sleep(4000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			
		} catch (Exception e) {
			
		}
		
	}
	public void popuppassword(String passwordforpopup)
	{
		try {
			Thread.sleep(2000);
			Screen screen1 = new Screen();
			screen1.type("E:\\WORKSPACE\\Pathway_stage1\\Pathway_Stage\\Pathway_stage\\Screenshot (364).png", passwordforpopup);

			Thread.sleep(3000);

			Screen screen2 = new Screen();
			Thread.sleep(3000);
			screen2.click("E:\\WORKSPACE\\Pathway_stage1\\Pathway_Stage\\Pathway_stage\\Screenshot (366).png");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void nocuserpassword()
	{
try {
    
	Robot r = new Robot();
	            /*
	             * r.keyPress(KeyEvent.VK_CAPS_LOCK); Thread.sleep(2000);
	             * r.keyPress(KeyEvent.VK_CAPS_LOCK); Thread.sleep(2000);
	             */
	            /*
	             * r.keyPress(KeyEvent.VK_CONTROL); sleep();
	             */
	            Thread.sleep(5000);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_Q);
	            Thread.sleep(2000);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_U);
	            r.keyPress(KeyEvent.VK_A);
	            r.keyPress(KeyEvent.VK_I);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_L);
	            r.keyPress(KeyEvent.VK_1);
	            r.keyPress(KeyEvent.VK_6);
	            r.keyPress(KeyEvent.VK_7);
	            r.keyPress(KeyEvent.VK_3);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_BACK_SLASH);
	            Thread.sleep(2000);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_TAB);
	            Screen screen2 = new Screen();
				Thread.sleep(3000);
				screen2.click("F:\\stage\\Pathway_stage\\Screenshot (242).png");
	  



} catch (Exception e) {
	// TODO: handle exception
}

	}
	public void ClickYesbutton()
	{
		
		Actions actions = new Actions(driver);
	    WebElement yes = driver.findElement(By.xpath("//input[@type='submit']"));
	    yes.isDisplayed();
	    yes.isEnabled();
	    
	    actions.moveToElement(yes).click().perform();
	   
	}
	
	public void loginwithsecondaccount()
	{
		elementclickbyjs(loginsecondaccount);
		sleep();
	}
	public void loginwithThirdaccount()
	{
		explicitWaitClickable(loginwiththirdaccount);
		sleep();
	}
	public void loginwithFourthaccount()
	{
		explicitWaitClickable(loginwithfourthaccount);
		sleep();
	}
	
	public void loginwithfifthaccount()
	{
		explicitWaitClickable(loginwithfifthaccount);
		sleep();
	}
	public void loginwitsixthaccount()
	{
		explicitWaitClickable(loginwithsixthaccount);
		sleep();
	}
}
