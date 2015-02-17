import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest 
{
	
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	 
    @BeforeMethod
    public void start() throws MalformedURLException 
    {
 
        threadDriver = new ThreadLocal<RemoteWebDriver>();
        DesiredCapabilities dc = new DesiredCapabilities();
        FirefoxProfile fp = new FirefoxProfile();
       
        dc.setCapability(FirefoxDriver.PROFILE, fp);
        dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4448/wd/hub"), dc));
    }
 
    public WebDriver getDriver() {
        return threadDriver.get();
    }
 
    @AfterMethod
    public void end() 
    {
        getDriver().quit();
 
    }

}
