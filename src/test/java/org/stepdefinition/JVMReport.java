package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void JVMReporting(String json) {
		File f=new File("src\\test\\resources\\Reports\\JVMReport");
		Configuration con= new Configuration(f, "Applying log and check with end to end flow");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Chrome_Version", "Version 83.0.4103.106");
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder report=new ReportBuilder(li, con);
		report.generateReports();
	}

}
