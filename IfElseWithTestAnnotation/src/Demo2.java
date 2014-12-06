import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo2 {
FirefoxDriver dr=new FirefoxDriver();
	 
	 public void m2(String x)
	 {
		 String m="hi";
		 dr.get("http://www.facebook.com");
		 if(m.equals(x));
		 if (dr.getPageSource().contains("Facebook")){
			 dr.get("http://www.google.com");
		 }
		 else{
			System.out.println(dr.getCurrentUrl()); //aita current url print out dekhabe
		 }
	 }
@Test
public void m3()
{

	m2("hi");
}
}
