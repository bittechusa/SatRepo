import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {
	
	FirefoxDriver dr=new FirefoxDriver();
	
	@Test
	public void m1()
	{
		dr.navigate().to("http://www.facebook.com");  //navigate().to is same as .get()
		
		if (dr.getTitle().contains("shahidul")){
			dr.get("http://www.yahoo.com");
		}
		
		else if(dr.getTitle().contains("Facebook")){
			dr.get("http://www.google.com");
		}
		else
		{
			dr.get("http://www.blufly.com");
		}
		
	}

}
