import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage 
{
	
	private FirefoxDriver dr;
	HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	SharePage sp=new SharePage(dr);
	void homePageLogo()
	{
		sp.verifyElement(dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[1]/a/img")));
	}
	ProductDetailPage clickProduct()
	{
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[1]/figure/a/img")).click();
		return new ProductDetailPage(dr);
	}

}
