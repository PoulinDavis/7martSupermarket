package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() 
	{
																		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); // LOCATION OF,wher this report store extent-reports is folder
																										// THE HTML REP
																										// TO BE
																										// GENERATED,./-directory,extent-reports-folder
		reporter.config().setReportName("7MartSupermarket"); // config().setReportName("7RMart Project") 2 methods in
																// ExtentSparkReporter
		extentReports.attachReporter(reporter); // attaching od extend report and extendssparkrep for report generation external report
		extentReports.setSystemInfo("Organization", "Obsqura"); // org name
		extentReports.setSystemInfo("Name", "Poulin");// team membersname
		return extentReports; // createExtentReports() returns extentReports
	}


}
