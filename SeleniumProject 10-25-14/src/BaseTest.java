import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {

 static FirefoxDriver dr=new FirefoxDriver();
 
 void mi()
 {
	 dr.get("http://www.facebook.com");
	 dr.manage().window().maximize();
	 System.out.println(dr.getTitle());
	if (dr.getTitle().equals("Welcome to Facebook - Log In, Sign Up or Learn More")){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
	
	if(dr.getTitle().contains("Facebook")){
		 System.out.println("true");
	 }
	 else{
		 System.out.println("false");
	 }
 }
 
 void m2()
 {
	if (dr.getPageSource().contains("mehedi")){
		System.out.println("found");
	}
	
	else{
		System.out.println("not found");
	}
	if (dr.getPageSource().contains("facebook")){
		System.out.println("found");
	}
	
	else{
		System.out.println("not found");
	}
 }
 
 void m3()
 {
	 int count=dr.findElements(By.tagName("a")).size();
		 System.out.println(count);
		String f=dr.findElement(By.xpath("//i[@class='fb_logo img sp_MXzTRXPhpG1 sx_517fe9']")).getText();//did not work but don't know why
		System.out.println(f);
	 }
		
}
