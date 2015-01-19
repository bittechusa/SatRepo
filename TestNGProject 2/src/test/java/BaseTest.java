import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseTest 
{
	FirefoxDriver dr;
	/*@BeforeTest
	public void start()
	{
		System.out.println("beforetest");
	}*/
	@BeforeTest
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://facebook.com");
		dr.manage().window().maximize();
	}
	/*@BeforeMethod
	public void start()
	{
		System.out.println("beforetest");
	}*/
	@AfterTest
	public void end()
	{
		dr.quit();
	}
	
//	@AfterTest
//	public void end()
//	{
//		System.out.println("aftertest");
//	}
	//@AfterMethod
	/*public void end()
	{
		System.out.println("aftertest");
	}*/
}
