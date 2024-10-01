package Utilities;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentListenerClass implements ITestListener{
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
    public void configureReport()
    {
    	htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
    	reports = new ExtentReports();
    	reports.attachReporter(htmlReporter);
    	
    	reports.setSystemInfo("Machine", "testpc");
    	reports.setSystemInfo("OS", "Linux");
    	reports.setSystemInfo("browser", "chrome");
    	reports.setSystemInfo("username", "Aman");
    	
    	
    	htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
    	htmlReporter.config().setReportName(" This is My First Report");
    	htmlReporter.config().setTheme(Theme.DARK);
    	
    }

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of the test method Started"+result.getName());
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	
		System.out.println("Name of the test method success"+result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the test cases is"+result.getName(),ExtentColor.GREEN));
	}


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of the test method failed"+result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the test cases is"+result.getName(),ExtentColor.RED));
		
		
	}
	


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Name of the test method skipped"+result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of the test cases is"+result.getName(),ExtentColor.YELLOW));
	}


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	
		System.out.println("Finish");
		reports.flush();
	}


	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		configureReport();
		System.out.println("Started");
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	


	
	
}
