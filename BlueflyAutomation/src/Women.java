import org.openqa.selenium.firefox.FirefoxDriver;


public class Women 
{
	private FirefoxDriver dr;
	public Women(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public void verifyTitle()
	{
		String title=dr.getTitle();
		if(dr.getTitle().contains(title))
		{
			System.out.println("title is correct");
		}
	}

}
