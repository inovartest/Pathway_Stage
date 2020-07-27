package com.Pathway_stage.TestRunner;
 
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"F:\\stage\\Pathway_stage\\src\\test\\java\\com\\Pathway_stage\\Base\\Featurefiles\\FullBuildOutflow.feature"},glue= "com.Pathway_stage.Stepdefinations",
monochrome = true,dryRun = false,strict = true,
format = {
        "pretty",
        "html:test-output",
       "json:target/Pathwayreports/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/stageonebuildreport.html",
         "junit:junit_xml/cucumber.xml"})
public class TestRunnerclass  extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/extentreport.xml");
        
        
    }
  
     
	
	
}





















