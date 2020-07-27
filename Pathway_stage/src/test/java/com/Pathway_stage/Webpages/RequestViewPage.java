package com.Pathway_stage.Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Testdata.GettingData;




public class RequestViewPage extends Basepage
{

//	private By Checkboxforlist = By.xpath("//div[@class='slick-cell l0 r0 selected true active']");
	private By viewoption = By.xpath("(.//*[@class='btn-grid approve'])[1]");
	private By exportbutton = By.xpath("//button[@class='btn-grid']");
	private By Approvedlist = By.xpath("//a[@id='nav-approved-tab']");
	private By Rejectedlist = By.xpath("//a[@id='nav-rejected-tab']");
	private By Inprogresslist = By.xpath("//a[@id='nav-submitted-tab']");
	private By checkboxforlist = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[19]");
	//private By clickViewbutton =By.xpath(".//*[@name='viewDetailsButtonForCancellationApproved:19']");
	private By cancelationrequestdashboard = By.xpath("(.//*[@class='dashboard-list-cards-header'])[1]");
	private By Renewalrequestdashboard =By.xpath("(.//*[@class='dashboard-list-cards-header'])[3]");
	private By inprogressbox = By.xpath("//a[contains(text(),'IN PROGRESS')]");
	private By viewbutton = By.xpath("//div[@class='name']");
	private By footernextbutton = By.xpath("//a[@class='page-link icon-seek-end fa fa-lg fa-angle-double-right']");
	private By txidlbl = By.xpath("//span[contains(text(),'TX Site ID')]");
	private By txidsearchbar = By.xpath("(.//*[@placeholder='🔍'])[4]");
	private By checkbox = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
	private By viebutton = By.xpath("//button[@name='viewDetailsButtonForCancellationApproved:0']");
	private By searchfornr =By.xpath(".//*[@class='form-control search-filter filter-site']");
	private By Buildoutdashboard = By.xpath("(.//*[@class='dashboard-list-cards-header'])[2]");
	private By buildoutprotractive = By.xpath(".//*[@id='nav-approved-tab']");
	private By buildouttxlbl =By.xpath("(.//*[@class='slick-column-name'])[4]");
	GettingData data = new GettingData();
	Homepage home = new Homepage();
	private By searchbarr= By.xpath("//input[@id='filter-site']");
	public void cancelationchecking(int i)
	{
		//home.dashboardbutton();
		String txid =data.getColumn_1(i);
		explicitWaitClickable(cancelationrequestdashboard);
		explicitWaitClickable(inprogressbox);
		explicitWaitClickable(txidlbl);
		enterText(txidsearchbar, txid);
		enter();
		sleep();
		explicitWaitClickable(checkbox);
		explicitWaitClickable(viebutton);
			}
	public void renewalchecking(int i)
	{
		home.dashboardbutton();
		String txid =data.getColumn_1(i);
		explicitWaitClickable(Renewalrequestdashboard);
		explicitWaitClickable(inprogressbox);
		explicitWaitClickable(txidlbl);
		enterText(txidsearchbar, txid);
		enter();
		sleep();
		explicitWaitClickable(checkbox);
		explicitWaitClickable(viebutton);
		
	}
	public void buildoutchecking(int i)
	{
		//home.dashboardbutton();
		String txid =data.getColumn_1(i);
		explicitWaitClickable(Buildoutdashboard);
		//explicitWaitClickable(buildoutprotractive);
		explicitWaitClickable(buildouttxlbl);
		enterText(txidsearchbar, txid);
		enter();
		sleep();
		explicitWaitClickable(checkbox);
		explicitWaitClickable(viebutton);
		
	}
	public void requestview(int i)
	{
		
		WebElement txbtn =  driver.findElement(By.xpath("//span[contains(text(),'TX Site ID')]" ));
    
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", txbtn);
        sleep();
       
       
        WebElement element = driver.findElement(By.xpath("(.//*[@placeholder='🔍'])[2]"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@placeholder='🔍'])[2]")));
        element.sendKeys(data.getColumn_1(i));
		
	}
	
	public void requestviewforpm(int i)
	{
		WebElement txbtn =  driver.findElement(By.xpath("(.//*[@class='slick-column-name'])[4]" ));
	    
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", txbtn);
        sleep();
       
        WebElement element = driver.findElement(By.xpath("(.//*[@placeholder='🔍'])[2]"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@placeholder='🔍'])[2]")));
        element.sendKeys(data.getColumn_1(i));
	}
	public void requestvieww(int i)
	{
		String txid = data.getColumn_1(i);
		explicitWaitClickable(txidlbl);
		try {
			enterText(searchbarr, txid);
			enter();
		} catch (StaleElementReferenceException e) {
			enterText(searchbarr, txid);
			enter();	
		}
		
	}
	public void checkapprovedlist()
	{
click(Approvedlist);
sleep();
explicitWaitClickable(checkboxforlist);
sleep();
mouseoverelement(viewbutton);
implicitWait(5);
click(viewbutton);
sleep();
	}

public void checkrejetedlist()
{
	click(Rejectedlist);
	sleep();
	explicitWaitClickable(checkboxforlist);
	sleep();
	mouseoverelement(viewbutton);
	implicitWait(5);
	explicitWaitClickable(viewbutton);
	sleep();
}
public void getthetxid(int i)
{
	
	String txid =data.getColumn_1(i);
	System.out.println(txid);
	
	for (int j = 2; j <=20; j++) 
	{
		
		
		String expected =driver.findElement(By.xpath("//div[@class='slick-cell l2 r2 true'])["+j+"]")).getText();
		//System.out.println(expected);
		
		if (txid.equalsIgnoreCase(expected)) {
			click(viewbutton);
			System.out.println(expected);
		}
		else {
			System.out.println("NOT matched");
		}
		
	}
}
public void request()
{
	explicitWaitClickable(cancelationrequestdashboard);
	explicitWaitClickable(inprogressbox);
	 org.openqa.selenium.support.ui.WebDriverWait wait1 = new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Last']")));
     if(driver.findElement(By.xpath("//a[@aria-label='Last']")).isEnabled())
    		 {
    	 explicitWaitClickable(footernextbutton);
    	 checkRequest();
    	 }
     else {
		checkRequest();
	}
	
}
public void req()
{
	explicitWaitClickable(cancelationrequestdashboard);
	explicitWaitClickable(inprogressbox);
	 org.openqa.selenium.support.ui.WebDriverWait wait1 = new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Last']")));
     if (driver.findElement(By.xpath("//a[@aria-label='Last']")).isDisplayed())
     {
		checkRequest();
	}
     else if (driver.findElement(By.xpath("//a[@aria-label='Last']")).isEnabled()) 
     {
		explicitWaitClickable(footernextbutton);
		if (driver.findElement(By.xpath("(.//*[@class='page-item disabled'])[2]")).isDisplayed()) {
			checkRequest();
		}
		
	}
     else {
		System.out.println("TXID is not matched");
	}
     
}
public void requ()
{
	explicitWaitClickable(cancelationrequestdashboard);
	explicitWaitClickable(inprogressbox);
	org.openqa.selenium.support.ui.WebDriverWait wait1 = new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Last']")));
    String txID = "IE94346A";
    System.out.println(txID);
    
    
    
    for(int j=1;j<=20;j++) {
        
        String expected= driver.findElement(By.xpath("(//div[@class='slick-cell l2 r2 true'])["+j+"]")).getText();
        //System.out.println(expected);
        
        //div[@class='slick-cell l2 r2 true'])[2]
        
    if (txID.equalsIgnoreCase(expected))
    {
        
   	 driver.findElement(By.xpath("(//div[@class='name'])["+j+"]")).click();
        System.out.println(expected);
        break;
    }
    else{
        System.out.println("Not mathced");
        
    }}
}
public void checkRequest()
{
	 //WebElement nextbutton = driver.findElement(By.xpath("//a[@class='page-link icon-seek-end fa fa-lg fa-angle-double-right']"));
	//home.dashboardbutton();
	explicitWaitClickable(cancelationrequestdashboard);
	explicitWaitClickable(inprogressbox);
	 org.openqa.selenium.support.ui.WebDriverWait wait1 = new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Last']")));
     
    /* if(driver.findElement(By.xpath("//a[@aria-label='Last']")).isDisplayed()) {*/
         
     String txID = "AR01053B";
     System.out.println(txID);
     
     
     
     for(int j=1;j<=20;j++) {
         
         String expected= driver.findElement(By.xpath("(//div[@class='slick-cell l2 r2 true'])["+j+"]")).getText();
         //System.out.println(expected);
         
         //div[@class='slick-cell l2 r2 true'])[2]
         
     if (txID.equalsIgnoreCase(expected))
     {
         
    	 driver.findElement(By.xpath("(//div[@class='name'])["+j+"]")).click();
         System.out.println(expected);
         break;
     }
   /*  else{
    	 explicitWaitClickable(footernextbutton);
    	 for (int k = 0; k <=15; k++) {
    		 String expected1= driver.findElement(By.xpath("(//div[@class='slick-cell l2 r2 true'])["+k+"]")).getText();
    		 if (txID.equalsIgnoreCase(expected1)) 
    		 {
    			 driver.findElement(By.xpath("(//div[@class='name'])["+j+"]")).click();
    	         System.out.println(expected);
    	         break;
			}*/
		}
         System.out.println("Not mathced");
         
     }
     


public void check()
{
	explicitWaitClickable(cancelationrequestdashboard);
	explicitWaitClickable(inprogressbox);
	 org.openqa.selenium.support.ui.WebDriverWait wait1 = new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Last']")));
	String txid ="VA30452B";
	System.out.println(txid);
	if (driver.findElement(By.xpath("//a[@aria-label='Last']")).isEnabled()) 
	{
		explicitWaitClickable(footernextbutton);
		List<WebElement>gridsize = driver.findElements(By.xpath("(.//*[@class='slick-cell l0 r0 true'])"));
		System.out.println(gridsize.size());
		
		for (int j = 1; j <= gridsize.size(); j++) {
			 String expected= driver.findElement(By.xpath("(//div[@class='slick-cell l2 r2 true'])["+j+"]")).getText();
	         //System.out.println(expected);
	         
	         //div[@class='slick-cell l2 r2 true'])[2]
	         
	     if (txid.equalsIgnoreCase(expected))
	     {
	         
	    	 driver.findElement(By.xpath("(//div[@class='name'])["+j+"]")).click();
	         System.out.println(expected);
	         break;
	     }
	     else {
			System.out.println("TXid is not matched");
		}
		}
		
		
	}
	
	
}
     
}

