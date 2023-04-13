package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {
	
	static WebDriver driver;
	public static WebDriver browserIntiate() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		return driver;
	
		
		//driver.manage().window().maximize();

	}

}
