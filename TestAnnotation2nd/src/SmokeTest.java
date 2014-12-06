import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest {
	
	@Test
	public void signIn() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("npaion@yahoo.com");
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("rgdgd");
		dr.findElement(By.xpath("//input[@id='u_0_n']")).click();
		Thread.sleep(9000);
	}
//@Ignore----aita @test er upper likhle ai @test ta run hobe na
	//jodi ekta mehtod run korte chai @test unit er janno tahole oi method ke double click kore right click kore run as junit
	@Test
	public void signOut() 
	{
		
		dr.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		dr.findElement(By.xpath("//input[@class='uiLinkButtonInput' and @value='Log Out']")).click();
	}
}
