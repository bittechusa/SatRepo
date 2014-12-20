import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {
	

FirefoxDriver dr = new FirefoxDriver();

void SignUp()
{
dr.get("http://www.facebook.com");
dr.manage().window().maximize();
dr.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("paion");
dr.findElement(By.xpath("//input[@id='u_0_3']")).sendKeys("paion");
dr.findElement(By.xpath("//input[@id='u_0_5']")).sendKeys("npaion@damy.com");
dr.findElement(By.xpath("//input[@id='u_0_8']")).sendKeys("npaion@damy.com");
dr.findElement(By.xpath("//input[@id='u_0_a']")).sendKeys("123456");
new Select(dr.findElement(By.xpath("//span[@id='u_0_c']/span/select[1]"))).selectByVisibleText("Jan"); 
new Select(dr.findElement(By.xpath("//span[@id='u_0_c']/span/select[2]"))).selectByVisibleText("1"); 
new Select(dr.findElement(By.xpath("//span[@id='u_0_c']/span/select[3]"))).selectByVisibleText("2012"); 
dr.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@id='u_0_e']")).click();



// this is how we got new select object






}








}
