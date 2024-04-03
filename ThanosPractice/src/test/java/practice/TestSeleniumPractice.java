package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.BaseClass;

public class TestSeleniumPractice extends BaseClass {

	@Test
	public void tets() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("[title=\"Search\"]")).sendKeys("cars");
		List<WebElement> suggestions = driver.findElements(By.cssSelector("[data-attrid=\"AutocompletePrediction\"]"));
		boolean sugst = false;
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
			if(suggestion.getText().equalsIgnoreCase("cars for sale"))
			{
				sugst = true;
				suggestion.click();
				break;
			}
		}
		if(!sugst)
		{
			System.out.println("suggestion not displayed");
		}
		Thread.sleep(10000);
		driver.close();
	}

}
