import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SharePage 
{
	FirefoxDriver dr;
	SharePage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	void verifyElement(WebElement by)
	{
		if(by.isDisplayed())
		{
			System.out.println("element present");
		}
		else
			System.out.println("not present");
	}
	void verifyTitle(String title)
	{
		if(dr.getTitle().contains(title))
		{
			System.out.println("title matched");
		}
		else
			System.out.println("title not matched");
	}

}
