package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\resources\\Features",glue="org.stepdefinition",
					dryRun =false,plugin = {"pretty",
					"html:src\\test\\resources\\Reports\\HtmlReport",
					"junit:src\\test\\resources\\Reports\\XMLReport\\xmlreport.xml",
					"json:src\\test\\resources\\Reports\\JSonReport\\jsonreport.json",
					"rerun:target\\failed.txt"})
public class Runner {
	static String s="Chrome";
	@AfterClass
	public static void reporting() {
		JVMReport.JVMReporting("src\\test\\resources\\Reports\\JSonReport\\jsonreport.json");

	}
	@BeforeClass
	public static void launch() {
		if(s.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
		}

	}

}
