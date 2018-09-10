
package week_4clswork;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	public String filename,author,category,testName,desc ;
	@BeforeSuite
	public void startReport(){
	startResult();	
		}
	@BeforeClass/*({"CreateLead","creating leads"})*/
	
	public void beforeClass() {
		startTestCase(testName,desc);
	}
	
	@Parameters({"url","uname","pwd"})
    @BeforeMethod()
	public void login(String URL,String username,String password) {
		beforeMethod(author,category);
		startApp("chrome",URL );
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
     }
	
 @AfterMethod()
 public void close()
 {
	 closeAllBrowsers();
 } 
 @DataProvider(name="fetchData")	
 public String[][] getExcelData() throws IOException{
 ReadExcel excel= new  ReadExcel();
 String[][] exdata = excel.getData(filename);
 return exdata;
 }
 @AfterSuite
 public void endResult()
 {
	 extent.flush();
 }
}

 
 
 
 
 
