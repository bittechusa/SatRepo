import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void m1()
	{
		
		dr.get("http://www.eshopper24.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After
	public void m2()
	{
		dr.quit();
	}

}
