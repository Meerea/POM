package homeWork_week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
	@Test()

	public  void main() throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		
		//set path for driver doc ,create object for Chrome class and get the URL 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Revathi");
		//Thread.sleep(3000);
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		System.out.println("clicked");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByLinkText("Edit").click();
		String tex=driver.findElementById("updateLeadForm_companyName").getText();
		System.out.println(tex);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("indtree");
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("update clicked" );
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		text.equals(tex);
		System.out.println(text);
		driver.close();
		
		
		
		
			
		
	}

}
