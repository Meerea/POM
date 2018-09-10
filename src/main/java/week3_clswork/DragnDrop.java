package week3_clswork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//switch to frame
		driver.switchTo().frame(0);
		WebElement drag =driver.findElementById("draggable");
		//Actions builder
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 30, 60).perform();*/
		
		
		
		//selectable example
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement it1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement it2=driver.findElementByXPath("//li[text()='Item 3']");
		WebElement it3=driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder=new Actions(driver);
		//builder.sendKeys(Keys.CONTROL).click(it1).click(it2).click(it3).perform();
		builder.sendKeys(it1, Keys.CONTROL).click(it2).click(it3).perform();*/
		
		
		// sortable Example
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement it1=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
		WebElement it4=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[4]");
		int y=it4.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(it1, 0, y).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
