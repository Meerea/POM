package homeWork_week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.indeed.co.in/Fresher-jobs");
	//WebElement tab1=driver.findElementByLinkText("Junior Software developer");
	WebElement tab1=driver.findElementByXPath("(//a[@data-tn-element='jobTitle'])[1]");
	//tab1.sendKeys(Keys.TAB);
	Actions builder=new Actions(driver);
	//for (WebElement each : tab1) {
	builder.sendKeys(tab1, Keys.CONTROL).click(tab1).perform();
	Set<String> windows= driver.getWindowHandles();
	List<String> winlist= new ArrayList<String>();
	winlist.addAll(windows);
	driver.switchTo().window(winlist.get(1));
			
	}
	

	}



