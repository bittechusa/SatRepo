import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class AppleTest {
	//FirefoxDriver driver= new FirefoxDriver();
	WebDriver driver;
	
	@Before 
	public void run()
	{
		//driver=new FirefoxDriver();
		//driver.get("http://www.teachwise.com");
		//String x=System.getProperty("moga");
		String x=System.getProperty("Browser");

		
		if(x.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("http://www.teachwise.com");
			}
			else if(x.equals("Chrome"))
			{
				driver= new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\jar file\\chromedriver.exe");
				//variable=webdriver.chrome.driver
				//location=webdriver.chrome.driver
				driver.get("http://www.teachwise.com");
			}
			else if(x.equals("IE"))
			{
				driver=new InternetExplorerDriver();
				System.setProperty("webdriver.ie.driver", "C:\\jar file\\IEDriverServer.exe");
				driver.get("http://www.teachwise.com");

			}
			else
			{
				driver=new FirefoxDriver();
			}
		
		//System.setProperty("webdriver.chrome.driver", "C:\\jar file\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\jar file\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver();
		//driver=new ChromeDriver();
		//driver.get("http://www.pixafy.com");
		//driver.get("http://www.teachwise.com");
		driver.manage().window().maximize();
	}
	@After
	public void close() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
