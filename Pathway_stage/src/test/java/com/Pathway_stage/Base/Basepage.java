package com.Pathway_stage.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pathway_satge.DriverManager.DriverManager;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class Basepage {

	public static  WebDriver driver;
	final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Basepage.class);
	public static ExtentTest test;
    public static ExtentReports reports;
    
	

	public void geturl(String url)
	{
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	public void cookies()
	{
		driver.manage().deleteAllCookies();
	}
	public void clearcahce()
	{
		driver.get("chrome://settings/clearBrowserData");
	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	}
	public void switchwindow(int i)
	{
		((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(i));
	    
	
	}
	
	public void getscreenshot(String stepname, String path)
	{
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//String des = path+stepname+".png";
			File des = new File("./"+path+"/" + stepname + ".png");
			FileUtils.copyFile(src, des);
			sleep();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void refreshthepage()
	{
		driver.navigate().refresh();
		
	}
	public void extentreporinit(String descrption, String flowname)
	{
		String workingdir = System.getProperty("user.dir");
		  reports = new ExtentReports(workingdir+"\\"+flowname+"\\extentreport.html",false, DisplayOrder.NEWEST_FIRST, NetworkMode.ONLINE);
		  test = reports.startTest("Pathwaytest",descrption );
	}
	public void extentreportssave()
	{
		reports.endTest(test);
		reports.flush();
	}
	
	public void extentpassreport(String stepname)
	{
		test.log(LogStatus.PASS, stepname+"success");
	}
	public void extentfailreport(String stepname)
	{
		test.log(LogStatus.FAIL, stepname+"failed");
	}

	

	public void click(By locator) {
		WebElement element = driver.findElement(locator);
		 WebDriverWait wait = new WebDriverWait(driver, 20);
         wait.until(ExpectedConditions.presenceOfElementLocated(locator));
          JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", element);		
	}
	public void jstext(By locator, String text)
	{
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].value="+ text, element);
	}
	
	public void cleartext(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.clear();
	}
	public void mouseoverelement( By locator)
	{
		WebElement element = driver.findElement(locator);
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		
	}
	
	
	
	public void enterbuttonclick(By locator)
	{
		WebElement element = driver.findElement(locator);
		Actions a = new Actions(driver);
		a.sendKeys(element, Keys.ENTER).perform();
	}
	public void enter()
	{
	Actions a = new Actions(driver);
	a.sendKeys(Keys.ENTER);
	}
	public void enterText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	public void elementscrollintoviewwithjs(By locator)
	{
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void validatingpage(By locator, String stepname)
	{
		WebElement element = driver.findElement( locator);
		
		if (element.isDisplayed()) 
		{
			System.out.println(stepname+"Test Case passed");
			test.log(LogStatus.PASS, stepname+"Testacase running succesfully");
		}
		else {
			
			System.out.println(stepname+"Test casefailed");
			test.log(LogStatus.FAIL,stepname+"Testcase running is unsuccesfully");
		}
	}
	
	

	public WebElement explicitWait(By locator) {
		return new WebDriverWait(driver, 70).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void explicitWaitClickable(By locator)
	{
		
		new WebDriverWait(driver, 70).until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public void elementclickbywait(By locator)
	{
		WebElement element = driver.findElement(locator);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void explicitWaitVisibility(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	}
	
	public void explicitWaitForHiddenElements(By locator) {
		new WebDriverWait(driver, 70).until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public Timeouts implicitWait() {
		return driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public Timeouts implicitWait(int sec) {
		return driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public void scrollDownBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}
	
	public void scrollUpBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500, 0);");
	}
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void scrollintoelement(By locator)
	{
		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void entertextbyusingjavascript(By locator, String text)
	{
		
		WebElement webl = driver.findElement(locator);
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		js.executeScript("arguments[0].value=’Avinash Mishra’;", webl);
	}
	public void sleep() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
	}
	
	
	public void select(String Value, By locator)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByValue(Value);
		sleep();
		
	}
	
	public void select(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	public void selectOnWait(By locator, String VisibleText)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		explicitWaitVisibility(locator);
		element.click();	
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	
	public void selectExecutor(By locator, String VisibleText)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('taxons-list').click();");
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByVisibleText(VisibleText);
		sleep();
	}
	
	public void select(By locator, int Index)
	{
		WebElement element= driver.findElement(locator);
		Select s= new Select(element);
		element.click();
		s.selectByIndex(Index);
	}

	public void datepicker(By locator1, By locator2) {
		WebElement element= driver.findElement(locator1);
		element.click();
		List <WebElement> allDates = driver.findElements(locator2);
		for(WebElement wb : allDates) {
			String date= wb.getText();
			if(date.equalsIgnoreCase(date)) {
				wb.click();
				break;
			}
		}
	}
	public void elementclickbyjs(By locator)
	{
		WebElement element = driver.findElement(locator);
		sleep();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public void switchwindow1()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(0)).close();
         driver.switchTo().window(tabs.get(1));
	}
	
	
	
	public void init(String browsername)
	{
		if (browsername.equals("chrome")) 
		{
			driver = DriverManager.getChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = DriverManager.getFirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("IE")) 
		{
			driver = DriverManager.getIEDriver();
		}
		else if (browsername.equalsIgnoreCase("EDGE"))
		{
			driver = DriverManager.getedgedriver();
		}
		
		else if (browsername.equals("headlesschrome")) {
			driver = DriverManager.getHeadlessChromeDriver();
		}
		
		else {
			driver = DriverManager.getHeadlessFirefoxDriver();
		}
	}
	
	public boolean exists(By locator)
	{
		try { 
			return driver.findElement(locator).isDisplayed();
			
		}catch(Exception e) {
			logger.error("Locator not found "+e.getMessage());
		}
		
		return false;
	}
	public void closebrowser()
	{
		driver.close();
	}

}
