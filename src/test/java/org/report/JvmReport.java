package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void report(String jsonfile) {
		File f=new File("C:\\Users\\Sekar\\eclipse-workspace\\CucumberClass2\\src\\test\\resources\\report");
		Configuration con=new Configuration(f, "Adactin Hotel");
		con.addClassifications("OS", "Windows 7 Professsional");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("version", "92");
		con.addClassifications("Sprint", "37");
		con.addClassifications("sign-off", "positive");
		List<String> l=new ArrayList<String>();
		l.add(jsonfile);
		ReportBuilder report=new ReportBuilder(l, con);
		report.generateReports();
	}

}
