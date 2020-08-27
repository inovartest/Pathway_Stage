package com.Pathway_satge.DriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
private static WebDriver driver;
	
	/**
	 * @return 
	 * @return WebDriver
	 * 
	 *         This method return ChromeDriver object
	 */
	public static  WebDriver getChromeDriver() 
	{
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
				options.addArguments("--allow-insecure-localhost");
				//options.addArguments("--incognito");
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				caps.setCapability(ChromeOptions.CAPABILITY, options);
				caps.setCapability("acceptInsecureCerts", true);
				
		driver = new ChromeDriver(caps);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		VerifyBrowserOS();
		return driver;
	}

	/**
	 * @return WebDriver
	 * 
	 *         This method return IEDriver object
	 */
	public static WebDriver getedgedriver()
	{
		//WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		VerifyBrowserOS();
		return driver;
	
	}
	public static WebDriver getIEDriver() {
		WebDriverManager.iedriver().setup();
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		// this line of code is to resolve protected mode issue
		// capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		// true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		driver = new InternetExplorerDriver();
		VerifyBrowserOS();
		return driver;
	}

	/**
	 * @return WebDriver
	 * 
	 *         This method return FirefoxDriver object
	 */
	public static WebDriver getFirefoxDriver() {
		//WebDriverManager.firefoxdriver().setup();
DesiredCapabilities cap = DesiredCapabilities.firefox();
cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver(cap);
		VerifyBrowserOS();
		return driver;
	}
	
	public static WebDriver getHeadlessChromeDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
		options.addArguments("disable-infobars"); 
		options.addArguments("--disable-extensions"); 
		options.addArguments("--disable-gpu");
		driver = new ChromeDriver(options);
		VerifyBrowserOS();
		return driver;
	}
	
	public static WebDriver getHeadlessFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("--window-size=1200x600");
		driver = new FirefoxDriver(options);
		VerifyBrowserOS();
		return driver;
	}

	
	/**
	 * This method provides browser name, browser version and OS
	 */
	public static void VerifyBrowserOS() {
		  org.openqa.selenium.Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		  String browserName = ((org.openqa.selenium.Capabilities) caps).getBrowserName();
		  String browserVersion = caps.getVersion();	  
		  String os = System.getProperty("os.name").toLowerCase();
		  System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion);
	}
}
