import org.junit.Test;



public class SmokeTest 
{
	WebDriver dr=new FirefoxDriver();
	
	@Test
	public void m1()
	{
		//FirefoxDriver dr=new FirefoxDriver();
		
		dr.get("ff");
		dr.findElement("hdgfjh");
		dr.quit();
		
	}
	@Test
	public void m2()
	{
		WebDriver dr1=new ChromeDriver();
		dr1.get("ch");
		WebDriver dr2=new InternetExplorer();
		dr2.get("ie");
		
	}

}
