package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksImagesAndTags {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> ele = driver.findElements(By.xpath("//*"));

		int links = 1, images = 1, tags = 1;
		for (WebElement webElement : ele) {
	
			if(webElement.getTagName().contains("a"))
			{
				links++;
			} else if(webElement.getTagName().contains("img"))
			{
				images++;
			} else if(webElement.getTagName().contains("input")){
				tags++;
			}
		}
		System.out.println("Links Tags : "+ links);
		System.out.println("Images Tags : "+ images);
		System.out.println("Input Tags : "+ tags);
		driver.close();
	}

}
