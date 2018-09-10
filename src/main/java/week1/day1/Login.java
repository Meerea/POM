package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String text=driver.findElementById("form").getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("text is matched");
		}
		else {
		System.out.println("the text is not Matched");	
		}
		}
		
		
		
	

	}


