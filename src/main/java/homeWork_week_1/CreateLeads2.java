package homeWork_week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CreateLeads2 {
	@Test()

	public void main() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Mindtree");
		driver.findElementById("createLeadForm_firstName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_lastName").sendKeys("T");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Revathi");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("T");
		//driver.findElementById("createLeadForm_personalTitle").sendKeys("Student");
		//driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Student");
		driver.findElementById("createLeadForm_departmentName").sendKeys("testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2.6");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("2000");
		driver.findElementById("createLeadForm_sicCode").sendKeys("87");
		driver.findElementById("createLeadForm_description").sendKeys("trainee");
		driver.findElementById("createLeadForm_importantNote").sendKeys("automation Trainee");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("India");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("87");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("87");
		//driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9597666488");
		//driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("testleaf");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("rerag19@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Revathi");
		//driver.findElementById("createLeadForm_generalAddress1").sendKeys("4E,Narayanasamy st,Valasaravakam");
		//driver.findElementById("createLeadForm_generalAddress2").sendKeys("4E,Narayanasamy st,Valasaravakam");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600087");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("87");
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		driver.findElementByClassName("smallSubmit").click();

	}

}
