package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckWhetherTheDropDownIsInSameOrder {

	public static void main(String[] args) {
		List<String> sampleList = new ArrayList<>();
		List<String> sampleList2 = new ArrayList<>();
		sampleList2.add("Australia");
		sampleList2.add("Bangladesh");
		sampleList2.add("Denmark");
		sampleList2.add("Hong Kong");
		sampleList2.add("India");
		sampleList2.add("Japan");
		sampleList2.add("Netherlands");
		sampleList2.add("New Zealand");
		sampleList2.add("South Africa");
		sampleList2.add("United States of America");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select fruitDropDown = new Select(driver.findElement(By.id("country")));
		List<WebElement> allOptions = fruitDropDown.getOptions();
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
			sampleList.add(option.getText());
		}
		
		for(int i=0; i<sampleList.size(); i++)
		{
			if(sampleList.get(i).equals(allOptions.get(i).getText()))
				{
					Assert.assertTrue(true, "Pass");
				}
			else {
				Assert.assertFalse(false, "Fail");
			}
		}	
		

	}
	
	
	public void checkWhetherElementsArePresentInSameorder()
	{
		
//		html
//		<!DOCTYPE html>
//		<html lang="en">
//		<head>
//		    <meta charset="UTF-8">
//		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
//		    <title>Dropdown with 5 Options</title>
//		</head>
//		<body>
//		    <h2>Select a fruit:</h2>
//		    <select id="fruit-dropdown">
//		        <option value="apple">Apple</option>
//		        <option value="banana">Banana</option>
//		        <option value="orange">Orange</option>
//		        <option value="grape">Grape</option>
//		        <option value="watermelon">Watermelon</option>
//		    </select>
//		</body>
//		</html>
		
		
		
		List<String> sampleList = new ArrayList<>();
		List<String> sampleList2 = new ArrayList<>();
		sampleList2.add("Apple");
		sampleList2.add("Banana");
		sampleList2.add("Orange");
		sampleList2.add("Grape");
		sampleList2.add("Watermelon");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.xyz.in/");
		Select fruitDropDown = new Select(driver.findElement(By.id("fruit-dropdown")));
		List<WebElement> allOptions = fruitDropDown.getOptions();
		for(WebElement option : allOptions)
		{
			sampleList.add(option.getText());
		}
		
		for(int i=0; i<sampleList.size(); i++)
		{
			sampleList.get(i).equals(allOptions.get(i).getText());
		}	
	}
}

