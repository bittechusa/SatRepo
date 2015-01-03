import java.io.FileNotFoundException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;


public class Demo 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Test
	public void m1()
	{
		dr.get("http://www.facebook.com");
		try
		{
			
		}catch(ElementNotVisibleException e1)
		{
			System.out.println("element not found");
		}
		catch(NoSuchElementException e2)
		{
			System.out.println("unable to login");
		}
		finally{
			System.out.println("final");
		}
	}
	@Test
	public void m2()
	{
		
	}
	

}
