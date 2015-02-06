import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogInPage 
{

	private FirefoxDriver dr;
	LogInPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	BillingPage clickCheckOutasGuest() throws InterruptedException
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div[2]/div[1]/div/div[3]/input[1]")).click();
		return new BillingPage(dr);
	}

}
