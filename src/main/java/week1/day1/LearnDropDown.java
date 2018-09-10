package week1.day1;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement src=driver.findElementById("createLeadForm_industryEnumId");
		Select sel=new Select(src);
		//sel.selectByVisibleText("Distribution");
		sel.selectByValue("IND_HEALTH_CARE");
		//sel.selectByIndex(6);
		List<WebElement>allvalues=sel.getOptions();
		int count =allvalues.size();
		System.out.println("the values of list"+count);
		/*for(int i=0;i<count;i++)
		{System.out.println("the choices are"+allvalues.get(i).getText());
			
		}*/
		/*File sra=driver.getScreenshotAs(OutputType.FILE); 
		File dec=new File("./snapshots/s.png");
		FileUtils.copyFile(sra,dec);*/
		for(WebElement alloptions:allvalues)
		{
			System.out.println(alloptions.getText());
		}

		
		
		
		

	}

}
