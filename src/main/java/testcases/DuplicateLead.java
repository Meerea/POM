
package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead {
	@Test(enabled=false)

	public  void main() throws Exception{
		//set path for driver doc ,create object for Chrome class and get the URL 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter the Username and password 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		// select the CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		// select the leads 
	    driver.findElementByLinkText("Leads").click();
	    // select the find leads
	    driver.findElementByLinkText("Find Leads").click();
	    // select the email link
	    driver.findElementByLinkText("Email").click();
	    // enter the  mail id    
	    driver.findElementByName("emailAddress").sendKeys("rerag19@gmail.com");
	    // wait for some time
	    Thread.sleep(3000);
	    // click the find leads button
	    driver.findElementByXPath("(//button[text()='Find Leads'])").click();
	    System.out.println("clicked");
	    Thread.sleep(3000);
        // save the first name  list
	    String name1=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
	    System.out.println(name1);
	    Thread.sleep(3000);
	    // click the first lead
	    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
	    // click the duplicate link
	    driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	    // get the title of the page or window
	   System.out.println(driver.getTitle());
	   // click create lead
	   driver.findElementByClassName("smallSubmit").click();
	   // compare the duplicate lead with saved lead
	   String name2 = driver.findElementById("viewLead_firstName_sp").getText();
	   System.out.println(name2);
	   name2.equals(name1);
	   System.out.println("names are same");
	   driver.close();
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
