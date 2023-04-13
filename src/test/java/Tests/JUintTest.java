package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JUintTest {

	@Test
	public void menuSelect() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();


		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement widgets = driver.findElement(By.xpath("//*[text()='Widgets']"));
		js.executeScript("arguments[0].click()",widgets );
		
		
		Actions act = new Actions(driver);
		//SLider.click();
		act.scrollByAmount(0, 500).build().perform();
		WebElement menuClick = driver.findElement(By.xpath("//*[text()='Menu']"));
		menuClick.click();
		
		WebElement menuClick1 = driver.findElement(By.xpath("//*[text()='Main Item 1']"));
		act.moveToElement(menuClick1).build().perform();
		
		//*[text()='Main Item 2']
		WebElement menuClick2 = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		act.moveToElement(menuClick2).build().perform();
		
		WebElement menuClick2subMenu = driver.findElement(By.xpath("//*[@class='nav-menu-container']//ul//li[2]//a//following-sibling::*//li[2]//a"));
		act.moveToElement(menuClick2subMenu).build().perform();
		
		WebElement subsubList = driver.findElement(By.xpath("//*[text()='SUB SUB LIST »']"));
		act.moveToElement(subsubList).build().perform();
		
		
		WebElement subsubItem2 = driver.findElement(By.xpath("//*[text()='Sub Sub Item 2']"));
		act.moveToElement(subsubItem2).build().perform();
	}
}
