import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class SeleniumHistory 
{

	public static void main(String[] args) throws Exception 
	{
		//WebDriver way to open browser
		//FirefoxDriver driver = new FirefoxDriver();
	
		//Selenium Remote Control way (RC)
		
		DefaultSelenium driver = new 
				DefaultSelenium("localhost", 4444, "*firefox", "http://www.bittechusa.com");
		driver.start();
		driver.open("/reg.html");
		driver.type("name", "asad");
		driver.click("//input[@type='submit']");
		
		
		FirefoxDriver webDriver = new FirefoxDriver();
		WebDriverBackedSelenium rc = new WebDriverBackedSelenium(webDriver, "http://www.bittechusa.com");
		webDriver.get("http://www.bittechusa.com/site1.html");
		rc.type("name", "Asad");
		rc.type("email","abc@gmail.com");
		//webDriver.findElement(By.name("email")).sendKeys("abc@gmail.com");
       
	}

}
