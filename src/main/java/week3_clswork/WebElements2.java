package week3_clswork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/search?source=hp&ei=e0Z6W-DdIIj1vASxv42QBg&q=cricket&oq=cricket&gs_l=psy-ab.3..0i131k1l3j0j0i131k1j0j0i131k1j0l2j0i131k1.964.3009.0.5979.7.7.0.0.0.0.325.1640.0j2j4j1.7.0....0...1.1.64.psy-ab..0.7.1637....0.mKQ1BkTpUA8");
		List<WebElement> allwords=driver.findElementsByLinkText("cricket".toUpperCase());
		allwords.size();
		Thread.sleep(3000);
		List<WebElement> allwords1=driver.findElementsByLinkText("cricket".toLowerCase());
		Thread.sleep(3000);
		allwords1.size();
		//int tot=allwords.size()+allwords1.size();
		//System.out.println("the total no of words"+""+tot);
		
		
		
		
	}

}
