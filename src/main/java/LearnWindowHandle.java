import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		//set the path of  the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// create a object for chrome class
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL
		driver.get("http://legacy.crystalcruises.com/");
		
		// maximize the window
		driver.manage().window().maximize();
		
		// give the wait time for all find ele and find elements implicitly
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// thread sleep is to wait some more time
		Thread.sleep(3000);
		
		// select the link guestcheck in link
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		// get the title of the window
		System.out.println( driver.getTitle());
		
		// screenshot the 1st window and save it
		File src11=driver.getScreenshotAs(OutputType.FILE);
		File dec11=new File("./snapshots/img1.png");
		FileUtils.copyFile(src11, dec11);
		
		// get the reference of all opened windows in Set and using getHandles method
		Set<String> allwin = driver.getWindowHandles();
		
		// push Set to List in order to get the reference of windows
		List<String>allist=new ArrayList<String>();
		allist.addAll(allwin);
		
		// switch the control to sec window
		driver.switchTo().window(allist.get(1));
		
		//get the title of sec window
		System.out.println(driver.getTitle());
		
		// snapshot the sec window
		File src2=driver.getScreenshotAs(OutputType.FILE);
		File dec2=new File("./snapshots/img2.png");
		FileUtils.copyFile(src2, dec2);
		
		// click the view offer link
		driver.findElementByPartialLinkText("View Offer").click();
		//save again the window ref using Set
		allwin=driver.getWindowHandles();
		allist=new ArrayList<String>();
		allist.addAll(allwin);
		
		// switch the control to third window
		driver.switchTo().window(allist.get(2));
		File src3=driver.getScreenshotAs(OutputType.FILE);
		File dec3=new File("./snapshots/img3.png");
		FileUtils.copyFile(src3, dec3);
		
		// get the title of third window 
		System.out.println(driver.getTitle());
		
		

		
		
		
		
		
		
		
		
		
	

	
}
	}


