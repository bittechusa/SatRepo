


public class InternetExplorer implements WebDriver
{
WebDriver dr;

	FirefoxDriver dri=new FirefoxDriver();
	

	@Override
	public void get(String url) {
		
		System.out.println(url);
	}

	

	@Override
	public void quit() {
		dr.quit();
	}

	@Override
	public void findElement(String by) {
		// TODO Auto-generated method stub
		
	}
	


}
