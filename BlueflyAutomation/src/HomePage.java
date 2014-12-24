import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class HomePage extends LoadableComponent<HomePage> 
{
	private FirefoxDriver dr;
	@FindBy(how=How.XPATH ,using=".//*[@id='marketing_banner']/area[1]")
	WebElement getTheOffer;
	
	public HomePage(FirefoxDriver dr)
	{
	  this.dr=dr;
	 PageFactory.initElements(dr, this);
	}
	public ManPage clickMenProduct() throws InterruptedException
	{
		dr.findElement(By.xpath(".//*[@id='homepage-main-content']/div[2]/ul/li[1]/a/img")).click();
		Thread.sleep(3000);
		return new ManPage(dr);
	}
	@Override
	protected void isLoaded() throws Error 
	{
		String url=dr.getCurrentUrl();
		Assert.assertTrue(dr.getCurrentUrl().contains(url));
		
		
	}
	@Override
	protected void load() 
	{
		dr.navigate().to("http://www.bluefly.com");
       
     
		
	}
	public GetTheOffer getTheOffer() throws InterruptedException
	{
		//dr.findElement(By.xpath(".//*[@id='marketing_banner']/area[1]")).click();
		getTheOffer.click();
		 Thread.sleep(2000);
		    dr.navigate().back();
		    Thread.sleep(2000);
		return new GetTheOffer(dr);
	}

}
