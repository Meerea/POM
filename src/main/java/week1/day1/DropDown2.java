package week1.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch the URL
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		//select the link
		driver.findElementByLinkText("Drop down").click();
		//selecting one of the dropdown
		//select one dropdown & inspect and store the value in a variable
		WebElement drop1= driver.findElementById("dropdown1");
		//now add the variable name in Select class constructor
		Select src1=new Select(drop1);
		//select the option using  visibletext method
		//src1.selectByVisibleText("Appium");
		//select the option by attributes
		src1.selectByValue("2");
		WebElement drop2=driver.findElementByName("dropdown2");
		Select src2=new Select(drop2);
		src2.selectByIndex(3);
		
		
		
		
		
		

	}

}
