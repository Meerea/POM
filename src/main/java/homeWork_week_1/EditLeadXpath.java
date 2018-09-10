package homeWork_week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadXpath {

	public static void main(String[] args) {
	//set the driver path for chrome
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		//create a object for the chrome class
		ChromeDriver driver=new ChromeDriver();
		// load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter the username and password
		driver.findElementByXPath("(//input[@class='inputLogin'])[1]");
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]");
		//login
		driver.findElementByXPath("//input[@class='decorativeSubmit']");
		//click the CRM/SFA Link
		driver.findElementByXPath("//a[contains(text(),'CRM')]");
		//click leads
		driver.findElementByXPath("")

	}

}
