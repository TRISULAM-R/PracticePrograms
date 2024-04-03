package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksImagesAndTags2 {

	public static void main(String[] args) throws InterruptedException{

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> mobileText =  driver.findElements(By.cssSelector("[data-cy='title-recipe']"));
		/*
		 * for (WebElement webElement : mobileText) {
		 * if(webElement.getText().contains("Apple iPhone")) { webElement.click(); }
		 * 
		 * }
		 */
		for (int i = 0; i < 4; i++) {
			mobileText.get(i).click();
		}
	}

}

