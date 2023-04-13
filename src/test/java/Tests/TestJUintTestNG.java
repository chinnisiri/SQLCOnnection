package Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestJUintTestNG {
	static WebDriver driver = BrowserLaunch.browserIntiate();

	
	
	@Test
	public void checkBoxTest() throws InterruptedException
	{
		driver.get("https://demoqa.com");
		WebElement Elements = driver.findElement(By.xpath("//*[text()='Elements']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",Elements );
		
		WebElement checkbox = driver.findElement(By.xpath("//span[text()=\"Check Box\"]"));
		checkbox.click();
		
		WebElement taggle = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		taggle.click();
		Thread.sleep(2000);
		
		WebElement checkboxDes = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
		checkboxDes.click();
		Thread.sleep(2000);
		
		WebElement checkboxDesCommands = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
		checkboxDesCommands.click();
		
		WebElement checkboxDoc = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
		checkboxDoc.click();
		Thread.sleep(2000);
		
		WebElement checkboxDocWorkSpaces = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
		checkboxDocWorkSpaces.click();
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		WebElement checkboxDocWorkSpacesAng = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
		checkboxDocWorkSpacesAng.click();
	
		
		WebElement checkboxDocOffice = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
		checkboxDocOffice.click();
		
		WebElement checkboxDocOfficeGen = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
		checkboxDocOfficeGen.click();
		
		
		WebElement checkboxDown = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
		checkboxDown.click();
		
		WebElement checkboxDowWordFile = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
		checkboxDowWordFile.click();
	}
	
	@Test
		public void buttonsTest() throws InterruptedException
	{
		driver.get("https://demoqa.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement Elements = driver.findElement(By.xpath("//*[text()='Elements']"));
		js.executeScript("arguments[0].click()",Elements );
		
		
		//Elements.click();
		
		WebElement Button = driver.findElement(By.xpath("//*[text()='Buttons']"));
		
		js.executeScript("arguments[0].click()",Button );
		//Button.click();
		
		//DoubleClick
		Actions act = new Actions(driver);
		WebElement DoubleClick1 = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		act.doubleClick(DoubleClick1).perform();
		Thread.sleep(2000);
		
		System.out.println( driver.findElement(By.xpath("//*[@id='doubleClickMessage']")).getText());

		
		//RightClick;
		WebElement RightClick = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		act.moveToElement(RightClick, 3, 3).build().perform();
		act.contextClick(RightClick).perform();
		System.out.println( driver.findElement(By.xpath("//*[@id='rightClickMessage']")).getText());
		//Thread.sleep(2000);
		
		//NormalCLick [LeftClick]
		WebElement ClickMe = driver.findElement(By.xpath("//*[text()='Click Me']"));
		ClickMe.click();
		System.out.println( driver.findElement(By.xpath("//*[@id='dynamicClickMessage']")).getText());
		
			
	}
	
  @AfterClass
	public  static void closeBrowser () {
	driver.close();
	}
}
