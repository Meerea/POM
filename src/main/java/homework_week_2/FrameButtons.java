package homework_week_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameButtons {

	public static void main(String[] args) {
		//set path of driver and create a object for chrome class
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// maximize the screen	
		driver.manage().window().maximize();
		// load the URL
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		//enter in to the 1st frame
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame("childIframe");
		//driver.switchTo().frame("ui-layout-west ui-layout-pane ui-layout-pane-west");
		driver.findElementByXPath("(//body[@class='ui-layout-container']/div)[1]");
		// inspect the close button
		driver.findElementByXPath("((//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']/p)/button)[1]").click();
		//close the east iframe(outside frame)
		driver.findElementByXPath("(//body[@class='ui-layout-container']/div)[2]");
		//inspect the close button
		driver.findElementByXPath("((//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p)/button)[1]").click();
		driver.switchTo().frame("childIframe");
		//driver.findElementByXPath("(//body[@class='ui-layout-container']/div)[2]");
		driver.findElementByLinkText("Close Me").click();

	}
	}
