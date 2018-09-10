package week3_clswork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElements {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/search?source=hp&ei=dD16W-u8CI699QPalo_QDQ&q=Revathi&oq=Revathi&gs_l=psy-ab.3..0i131k1j0l9.2416.12017.0.13358.7.7.0.0.0.0.804.3154.5-4j1.5.0....0...1.1.64.psy-ab..2.5.3152...0i10k1.0.C6a8f8nwS54)");
	List<WebElement>allinks =driver.findElementsByPartialLinkText("Revathi ");
	System.out.println(allinks.size());
	allinks.get(0).click();
	System.out.println(allinks.get(0));
	
	
	
	}

}
