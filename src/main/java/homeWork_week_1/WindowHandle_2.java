package homeWork_week_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//set path of the driver 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// create a object for chrome class
		ChromeDriver driver= new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// load the URL 
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the details
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		// click login
		driver.findElementByClassName("decorativeSubmit").click();
		// select CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		// select leads
		driver.findElementByLinkText("Leads").click();
		// select merge leads
		driver.findElementByLinkText("Merge Leads").click();
		// select the first img in near the fst text box
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		//Thread.sleep(3000);
		// get the ref of all opened tabs using Set
		Set<String> winref = driver.getWindowHandles();
		// Move the Set val to List
		/* create a object for Arraylist class of List and using that object
		 * add all the val to List using addAll() method */
		List<String> listref=new ArrayList<String>();
		listref.addAll(winref);
		// get the desired window using switchTo() and get() method
		driver.switchTo().window(listref.get(1));
		//enter the fst name 
		driver.findElementByName("firstName").sendKeys("Revathi");
		// click find leads
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(3000);
		// Select fst leads ID
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//save the value of fst ID in a variable
		String idval= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(idval);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		// Now switch to previous window
		driver.switchTo().window(listref.get(0));
		/*winref = driver.getWindowHandles();
       listref=new ArrayList<String>();
	   listref.addAll(winref);
	   driver.switchTo().window(listref.get(0));*/
		// Click the sec img near the sec text box
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		winref = driver.getWindowHandles();
		listref=new ArrayList<String>();
		listref.addAll(winref);
		driver.switchTo().window(listref.get(1));
		driver.findElementByName("firstName").sendKeys("Revathi");
        driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
        Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		// now switch again back to window no 0
		driver.switchTo().window(listref.get(0));
		// click merge 
		
		driver.findElementByLinkText("Merge").click();
		// Handle the alert
		driver.switchTo().alert().accept();
		/* click the findleads to verify the leads get merged or not
		driver.findElementByLinkText("Find Leads").click();
		// enter the starting lead id value(idval) in leadId box
		driver.findElementByName("id").sendKeys(idval);
		// click find leads link
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		// display the message
		System.out.println(driver.findElementByXPath("//div[text()='No records to display']"));*/
		File src4=driver.getScreenshotAs(OutputType.FILE);
		File dec4=new File("./snapshots/img4.png");
		FileUtils.copyFile(src4, dec4);













	}

}
