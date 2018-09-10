package homeWork_week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");
		driver.findElementById("createLeadForm_firstName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_lastName").sendKeys("T");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Revathi");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("T");
		driver.findElementById("ext-gen41").sendKeys("Student");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Student");
		driver.findElementById("driver.findElementById").sendKeys("testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2.6");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("2000");
		driver.findElementById("createLeadForm_sicCode").sendKeys("87");
		driver.findElementById("createLeadForm_description").sendKeys("trainee");
		driver.findElementById("createLeadForm_importantNote").sendKeys("automation Trainee");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("india");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("87");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("87");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9597666488");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("testleaf");
		driver.findElementById("ext-gen14").sendKeys("rerag19@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Revathi");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("4E,Narayanasamy st,Valasaravakam");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("4E,Narayanasamy st,Valasaravakam");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600087");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("87");
		driver.findElementById("ext-gen623").click();
		
		
		
		

	}

}
