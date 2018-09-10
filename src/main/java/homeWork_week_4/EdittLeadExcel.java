package homeWork_week_4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import week_4clswork.ProjectMethods;

public class EdittLeadExcel extends ProjectMethods {
	@BeforeClass()
		public void setData() {
		filename="Editlead";
	}

	@Test(dataProvider="fetchData")
		public void editlead(String fname, String cname) throws InterruptedException {
			
			// after logging in click CRM/SA link using methods from class SeMethods
			WebElement crmLink= locateElement("linktext", "CRM/SFA");
			click(crmLink);
			WebElement leadlink=locateElement("linktext", "Leads");
			click(leadlink);
			WebElement element1 = locateElement("linktext", "Find Leads");
			click(element1);
			//WebElement element2 = locateElement("xpath", "(//input[@name='firstName'])[3]");
			type( locateElement("xpath", "(//input[@name='firstName'])[3]"),fname);
			WebElement element3 = locateElement("xpath", "(//button[text()='Find Leads'])");
			click(element3);
			Thread.sleep(3000);
			WebElement element4 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
	        click(element4);
	        String text= driver.getTitle();
	        System.out.println("the title is"+" "+text);
	        WebElement element5 = locateElement("linktext", "Edit");
	        click(element5);
	        WebElement element6 = locateElement("id", "updateLeadForm_companyName");
	        getText(element6);
	        Thread.sleep(5000);
	        clear(element6);
	        type( locateElement("id", "updateLeadForm_companyName") ,cname);
	        WebElement element7 = locateElement("class", "smallSubmit");
	        click(element7);
	        WebElement element8 = locateElement("id", "viewLead_companyName_sp");
	        getText(element8);
	        System.out.println(element8);
	}

}
