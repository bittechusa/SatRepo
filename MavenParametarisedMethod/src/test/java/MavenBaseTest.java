import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MavenBaseTest 
{
	DesiredCapabilities cap=new DesiredCapabilities();
	FirefoxDriver dr;
	@Before
	public void start() throws MalformedURLException
	{
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		new RemoteWebDriver(new URL("http://25.148.16.65:4444/wd/hub"), cap.firefox());
		dr.get("http://www.bluefly.com");
	}
@After
public void end() throws Throwable
{
    Thread.sleep(3000);
	dr.quit();
	}
}
