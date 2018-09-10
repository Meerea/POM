package week2_clswork;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) throws InterruptedException {
		// set the path of chrome driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//create object for chrome
		ChromeDriver driver =new ChromeDriver();
		// 
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//enter in to the frame
		driver.switchTo().frame("iframeResult");
		//inspect the try it button
		driver.findElementByXPath("//button[text()='Try it']").click();
		Thread.sleep(3000);
		// handle the alert
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Revathi");
		driver.switchTo().alert().accept();
		

	}

}
