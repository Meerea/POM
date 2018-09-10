package week_4clswork;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create extends ProjectMethods {
	@BeforeTest()
	public void setData() {
		filename ="createleas";
		author="Revathi";
		category="common";
		testName="CreateLead";
		desc="creating leads";
		
	}
	@Test(dataProvider="fetchData")

	public void createLead (String cname,String fname,String lname,String email,String dept) {
		WebElement crmLink= locateElement("linktext", "CRM/SFA");
		click(crmLink);
		WebElement leadlink=locateElement("linktext", "Leads");
		click(leadlink);
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),cname);
		type(locateElement("id", "createLeadForm_firstName"),fname);
		type(locateElement("id", "createLeadForm_lastName"),lname);
		type(locateElement("id", "createLeadForm_primaryEmail"),email);
		type(locateElement("id", "createLeadForm_departmentName"),dept);
		click(locateElement("class", "smallSubmit"));
	}
	/*@DataProvider(name="fetchData")	
		 public String[][] getExcelData() throws IOException{
		 ReadExcel excel= new  ReadExcel();
		 String[][] exdata = excel.getData(filename);
		 return exdata;*/
	//return excel.getData(filename)--> this is another  way of giving return statment
		
		
		
		
		
		
		/*String[][] data=new String[1][5];
        data[0][0]="Mindtree";
        data[0][1]="Revathi";
        data[0][2]="T";
        data[0][3]="rerag19@gmail.com";
        data[0][4]="testing";
		return data;*/
	}


