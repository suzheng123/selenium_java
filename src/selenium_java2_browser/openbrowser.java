package selenium_java2_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "/Users/JacZh/desktop/resources/selenium_java/selenium_java2/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		String baseUrl="https://www.amazon.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		String title = driver.getTitle();
		
		System.out.println(title);
	}

}