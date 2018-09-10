package wdMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Throwables;

public class SeMethods extends Report implements WdMethods{
        public int i=1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		
			try {
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				reportSteps("The Browser"+browser+"Launched Successfully" ,"Pass");
			} catch (WebDriverException e) {
			 reportSteps("The Browser"+browser+"not Launched Successfully" ,"Fail");
				}
		finally {
			takeSnap();
		}
	}

	
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id"	 	: return driver.findElementById(locValue);
			case "class" 	: return driver.findElementByClassName(locValue);
			case "xpath" 	: return driver.findElementByXPath(locValue);
			case "name"	 	: return driver.findElementByTagName(locValue);
			case "linktext"	: return driver.findElementByLinkText(locValue);
			case "partial"	: return driver.findElementByPartialLinkText(locValue);
			}
			reportSteps("the Element is located successfully", "");
	}catch(NoSuchElementException e) {
		reportSteps("Element not found","");
		throw new RuntimeException();
	}
	catch(WebDriverException e) {
		reportSteps("Exception in driver","");
		throw new RuntimeException();
	}
		return null;
	}
	
	public WebElement locateElement(String locValue) {
		
		
		
		
		return null;
		
		
		
	}

	
	public void type(WebElement ele, String data) {
		
			try {
				ele.sendKeys(data);
				reportSteps("The data "+data+" is Entered Successfully","");
			}catch(WebDriverException e) {
				reportSteps("Element is not located","");
			throw new RuntimeException();
			}
		
	}
		
	

	
	public void clickWithNoSnap(WebElement ele) {
		
			ele.click();
			reportSteps("The Element "+ele+" Clicked Successfully","");
		
	}
	
	

	public void click(WebElement ele) {
		
			ele.click();
			reportSteps("The Element "+ele+" Clicked Successfully","");
		
	}

	@Override
	public String getText(WebElement ele) {
		String text=ele.getText();
		reportSteps("the text is"," "+text);
		
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {


	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		reportSteps("the expected title is"," "+expectedTitle);
	  
		return false;
	}

	
	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		String str=ele.getText();
		if(expectedText==str)
		{
			System.out.println("the string is"+ expectedText);
		}
		else {
			System.out.println("the value is not equal");
			
		}

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}
	

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		

	}

	@Override
	public void switchToFrame(WebElement ele) {
		

	}

	@Override
	public void acceptAlert() {
	

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
			reportSteps("snapshot is taken successfully","");
			} catch (IOException e) {
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}
	
	public void clear(WebElement ele)
	{
		ele.clear();
		
	}
	
	

}
