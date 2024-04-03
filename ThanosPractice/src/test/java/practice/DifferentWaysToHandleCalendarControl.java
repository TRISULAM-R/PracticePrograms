package practice;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentWaysToHandleCalendarControl {
	
	@Test
	public void makeMyTripCalender() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		WebElement departure = driver.findElement(By.xpath("//input[@id='departure']/parent::label/span"));
		wait.until(ExpectedConditions.elementToBeClickable(departure));
		departure.click();
		System.out.println("Clicked on departure");

		while(true)
		{
			try {
				String date = "21", month ="May", year ="2024";
				driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and .='"+month+" "+year+"']/parent::div/descendant::p[text()='"+date+"']")).click();
				System.out.println("Choosen the date");	
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
	
	@Test
	public void makeMyTripCalenderUsingJs() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		WebElement departure = driver.findElement(By.xpath("//input[@id='departure']/parent::label/span"));
		wait.until(ExpectedConditions.elementToBeClickable(departure));
		departure.click();
		System.out.println("Clicked on departure");

		
	}
	
	
	@Test
	public void demoGuru99()
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		
		
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('body > form > input[type=datetime-local]:nth-child(3)').value='2023-12-20T15:12';");
		System.out.println("Clicked on departure");
	}

}
