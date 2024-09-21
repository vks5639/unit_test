package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue = {"com.stepDef"}, monochrome = true, plugin = {"pretty", "html:Reports\\cucumber.html", 
			"json:Reports\\JsonReports\\cucumber.json", "junit:Reports\\xmlReports\\cucumber.xml"}, dryRun = false)
public class Runner {
	
}

