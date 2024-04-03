package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Perform_Contol_Plus_A_Using_Selenium {

	
	@Test
	public void performControlPlusAUsingSelenium()
	{
		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--start-maximized", "--disable-popup-blocking", "--headless");
//		opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//		opt.setExperimentalOption("useAutomationExtension", false);
//		
		WebDriver driver =new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.google.co.in/");

	        // Locate the element you want to perform "Control + A" on
	        driver.findElement(By.cssSelector("textarea[title=\"Search\"]")).sendKeys("dsfa" + Keys.CONTROL + "a");

//	        // Create Actions object
//	        Actions actions = new Actions(driver);
//
//	        // Perform "Control + A" on the element
//	        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//
//	        // Alternatively, you can perform "Control + A" using the built-in select all shortcut
//	        // element.sendKeys(Keys.CONTROL + "a");
//
//	        // Close the browser
//	        driver.quit();
		
		
	}
}
