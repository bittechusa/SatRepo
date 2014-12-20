


public class SafariDriver extends FirefoxDriver implements WebDriver,RemoteDriver//a class can extends one class and more than one interface
{//when u implement more than one interface u have to inplement all both interface methods
WebDriver dr;
	

	@Override
	public void get(String url) 
	{
		
		dr.get(url);
	}



	@Override
	public void quit() 
	{
		dr.quit();
	}



	@Override
	public void findElement(String by)
	{
		// TODO Auto-generated method stub
		
	}
	


}
