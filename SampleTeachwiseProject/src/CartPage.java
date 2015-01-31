import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CartPage 
{
	private FirefoxDriver dr;
	CartPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	SharePage sp=new SharePage(dr);
	void verifyShoppingCart()
	{
		sp.verifyElement(dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/h2")));
	}
	LogInPage clickCheckOut() throws InterruptedException
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/div/form/div[3]/table/tbody/tr[2]/td/div[1]/button")).click();
		return new LogInPage(dr);
	}

}
