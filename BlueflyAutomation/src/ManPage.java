import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ManPage 
{
	private FirefoxDriver dr;
	public ManPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public Women clickWomen() throws InterruptedException
	{
		dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();
		Thread.sleep(3000);
		return new Women(dr);
	}
	

}
