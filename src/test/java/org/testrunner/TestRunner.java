package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Sekar\\eclipse-workspace\\Cucumberclass2\\src\\test\\resources\\feature\\searchHotel.feature", glue= {"org.stepdefinition"},
plugin= {"pretty","json:C:\\\\Users\\\\Sekar\\\\eclipse-workspace\\\\CucumberClass2\\\\src\\\\test\\\\resources\\\\report1\\\\report.json"},monochrome=true)
public class TestRunner {
@AfterClass
public static void aftercalss() {
	JvmReport.report("C:\\Users\\Sekar\\eclipse-workspace\\CucumberClass2\\src\\test\\resources\\report1\\report.json");
}
}
