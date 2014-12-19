import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest 
{
	
	WebDriver driver;
	
	@Before
	public void openBrowser()
	{
		String x = System.getProperty("moga");
		if (x.equals("F"))
		{
			driver = new FirefoxDriver();
			driver.get("http:/www.bluefly.com");
		}
		
		else if (x.equals("C"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http:/www.bluefly.com");			
		}
		
		else if (x.equals("D"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http:/www.bluefly.com");
		}
		
		else
		{
			driver = new FirefoxDriver();
			driver.get("http:/www.bluefly.com");
		}
		
		
		//driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		//driver = new ChromeDriver();
		//driver.get("http:/www.bluefly.com");
	}
	
	
	@After
	public void closeBrowser()
	{
		
		
	}
	
	
	
	
	
	
	
	

}
