import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ProductDetailPage 
{
	private FirefoxDriver dr;
	ProductDetailPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	SharePage sp=new SharePage(dr);
	
	CartPage clickBuyButton() throws InterruptedException
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='add-to-cart-button-127']")).click();
		return new CartPage(dr);
	}

}
