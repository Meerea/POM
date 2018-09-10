package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadTest extends SeMethods{
@Test(successPercentage=60)
	public void createLead() {
	startApp("chrome","http://leaftaps.com/opentaps/control/main");
	WebElement eleUsername= locateElement("id","username");
	type(eleUsername,"DemoSalesManager");
	WebElement elePass= locateElement("id","password");
	type(elePass,"crmsfa");
	WebElement loginButton=locateElement("class","decorativeSubmit");
	click(loginButton);
		
	//public void createLead() throws InterruptedException {
    //Thread.sleep(3000);
	WebElement crmLink= locateElement("linktext", "CRM/SFA");
	click(crmLink);
	WebElement leadlink=locateElement("linktext", "Leads");
	click(leadlink);
	WebElement crelealink = locateElement("linktext", "Create Lead");
	click(crelealink);
	WebElement element1 = locateElement("id", "createLeadForm_companyName");
	type(element1, "Mindtree");
	WebElement element2 = locateElement("id", "createLeadForm_firstName");
	type(element2, "Revathi");
	WebElement element3 = locateElement("id", "createLeadForm_lastName");
	type(element3, "T");
	WebElement element4 = locateElement("id", "createLeadForm_departmentName");
	type(element4, "testing");
	WebElement element5 = locateElement("id", "createLeadForm_primaryEmail11");
	type(element5, "rerag19@gmail.com");
	WebElement elementF = locateElement("class", "smallSubmit");
	click(elementF);
		
	}
	
	}


