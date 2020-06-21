package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"@target\\failed.txt"},glue="org.stepdefinition",
					dryRun =true,plugin = {"pretty",
					"html:src\\test\\resources\\Reports\\HtmlReport",
					"xml:src\\test\\resources\\Reports\\XMLReport\\xmlreport.xml",
					"json:src\\test\\resources\\Reports\\JSonReport\\jsonreport.json"})
public class ReRunner {

}
