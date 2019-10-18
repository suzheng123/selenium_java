package selenium_java2_browser;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "/Users/JacZh/downloads/webdrivers/geckodriver");
		driver = new FirefoxDriver();
		
		
		String baseUrl="https://www.amazon.com";
		driver.get(baseUrl);
		
		driver.close();
	}

}