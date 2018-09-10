package wdMethods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	public static ExtentReports extent;
	public static ExtentTest test,testData;

	//@BeforeSuite
	public void startResult() {
		ExtentHtmlReporter html = new  ExtentHtmlReporter("./reports/resut.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	public void reportSteps(String stepDesc,String status){
		if(status.equalsIgnoreCase("Pass")){
			testData.pass(stepDesc);

		}else if(status.equalsIgnoreCase("Fail")) {
			testData.fail(stepDesc);
		}
	}
	//@BeforeClass
	public void startTestCase(String testName,String desc) {
		test = extent.createTest(testName, desc);
	}	
	//@BeforeMethod
	public void beforeMethod(String author,String category) {
		testData=test.createNode("Leads");
		test.pass(author);
		test.pass(category);
	}

	//@AfterSuite
	public void endResult() {
		extent.flush();
	}

}

