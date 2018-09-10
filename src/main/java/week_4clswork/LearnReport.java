package week_4clswork;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class LearnReport {

			
			
		public static void main(String[] args) throws IOException {
			// create a blank HTML file using the below class and give its path inside the brackets
			ExtentHtmlReporter html = new  ExtentHtmlReporter("./reports/resut.html");
			// this Method is used to get the history or log of the files tested 
			html.setAppendExisting(true);
			// this class is used to  configure the report
			ExtentReports extent = new ExtentReports();
			// using a method attach both the files
			extent.attachReporter(html);
			// create a object for ExtentTest class. to create a testcase report pass the ref to that object 

			ExtentTest test = extent.createTest("TC001_Login", "Login to leaftaps");
			// create a another object to mention the for which testcase the reports steps need to br created
    		// this  method is used to create a searate link like for each testcase .one of the easy way to segreggate each testcase report
			ExtentTest testData= test.createNode("login");
			testData.assignAuthor("Revathi");
			testData.assignCategory("common");
			// Media... is a method to attach the screenshots in report
			testData.pass("company name is entered succesfully"
					,MediaEntityBuilder.createScreenCaptureFromPath("./../snapshots/img1.png").build());
			test.pass("first name is entered succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snapshots/img2.png").build());
			test.pass("last name is entered succesfully");
			// it is a method to give the real viewable report ie without this we can't create a report
			extent.flush();
			
			
			
		}	
			


	}
		
		

	


