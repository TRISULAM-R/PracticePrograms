package utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void connectDB()
	{
		System.out.println("======connected to Data base==============");
	}
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("========= Browser open===============");
	}
	
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("========= Browser close===============");
	}
	
	
	
	
	
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("======Disconnected to Data base==============");
	}
	
	
	
}
