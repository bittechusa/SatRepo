import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MavenBaseTest {
	FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void start()
	{
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://www.bluefly.com");
	}
@After
public void end() throws Throwable
{
    Thread.sleep(3000);
	dr.quit();
	}
}
