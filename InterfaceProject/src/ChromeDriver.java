


public class ChromeDriver implements WebDriver
{

	
//when a class extends any interface u have to implemente all method
	@Override
	public void get(String url) {
		
		System.out.println(url);
	}


	@Override
	public void quit() {
		
	}
	@Override
	public void findElement(String by) {
		System.out.println("hjdsfg");
	}
	


}
