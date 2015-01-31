import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BillingPage 
{

	private FirefoxDriver dr;
	BillingPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	void sendBillingInformation() throws InterruptedException
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='NewAddress_FirstName']")).sendKeys("shahidul");
		dr.findElement(By.xpath(".//*[@id='NewAddress_LastName']")).sendKeys("islam");
		int random=(int) ((Math.random()*100)+1);
		String email="shahid"+random+"@gmail.com";
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='NewAddress_Email']")).sendKeys(email);
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='NewAddress_Address1']")).sendKeys("2468 Frisby Aveneu");
		dr.findElement(By.xpath(".//*[@id='NewAddress_ZipPostalCode']")).sendKeys("10461");
		dr.findElement(By.xpath(".//*[@id='NewAddress_PhoneNumber']")).sendKeys("7185189669");
		dr.findElement(By.xpath(".//*[@id='NewAddress_City']")).sendKeys("Bronx");
		new Select(dr.findElement(By.xpath(".//*[@id='NewAddress_CountryId']"))).selectByVisibleText("United States");
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/form/figure/div/div[3]/label")).click();
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/form/figure/div/div[4]/input")).click();
		
	
	}
	
}
