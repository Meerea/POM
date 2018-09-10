package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001_Login extends SeMethods{
	@BeforeMethod()
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}

}








