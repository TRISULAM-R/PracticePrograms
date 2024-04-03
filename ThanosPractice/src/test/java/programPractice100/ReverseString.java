package programPractice100;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ReverseString {
    public static void main(String[] args) {
    	
    	String s="i am mona"; // o/p= a mo mmai
    	
    	char[] ch =s.toCharArray();
    	
    	List<Integer> list =new ArrayList();
    	for(int i=0; i<ch.length; i++)
    	{
    		if(ch[i]==' ')
    		{
    			list.add(i);
    		}
    	}
    	
    	WebDriver driver = new ChromeDriver();
    	WebElement element =driver.findElement(By.xpath(""));
    	Actions act = new Actions(driver);
    	act.click(element);
    	
    	JavascriptExecutor jsExecutor =(JavascriptExecutor)driver;   
    	jsExecutor.executeScript("", args);
    	
    }
}
