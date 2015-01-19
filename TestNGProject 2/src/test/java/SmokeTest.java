import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SmokeTest extends BaseTest
{
	
	@Test
	public void m1()
	{
		//login();
		dr.findElement(By.id("email")).sendKeys("sislam_31@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("7188019531");
		dr.findElement(By.id("u_0_n")).click();
		
	}
	public void login()
	{
		System.out.println("mit");
	}
	@Test(dependsOnMethods={"m1"})
	public void m2() throws InterruptedException
	{
		System.out.println("h");
		dr.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='logout_form']/label")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	public void m3()
	{
		
     }
	@Test(dataProvider="getdata")
	public void testlogin(int a,String c)
	{
		System.out.println(a+"   "+c);
	}
	@DataProvider
	public Object[][]  getdata()
	{
		Object [][] ob=new Object[2][2];
		ob[0][0]=5;
		ob[0][1]="hg";
		ob[1][0]=8;
		ob[1][1]="gh";
		return ob;
	}
	

}
