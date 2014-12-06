import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
/*//
@Beforeclass thakle sab @test annotation run korar por @Afterclass run korbe and tader method static banate 

hobe*/

public class BaseTest {
	static FirefoxDriver dr=new FirefoxDriver();

	@BeforeClass
	public static void start(){
		dr.get("http://www.facebook.com");
	}
	
	@AfterClass
	
		public static void end() throws InterruptedException{
		Thread.sleep(5000);
			dr.quit();
		}
	}


