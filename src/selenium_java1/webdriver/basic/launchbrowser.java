package selenium_java1.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	
	public static WebDriver  driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Users/JacZh/desktop/resources/selenium_java/selenium_java1/drivers
		System.setProperty("webdreiver.chrome.driver","../drivers/chromerdriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		//open browser
		driver.navigate().to("https://amazon.com");
		
	}

}
