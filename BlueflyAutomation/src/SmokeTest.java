import org.junit.Test;


public class SmokeTest extends BaseTest
{
	HomePage hp;
	ManPage mp;
	Women wp;
	GetTheOffer sp;
	@Test
	public void test1() throws InterruptedException
	{
	    hp=new HomePage(dr).get();
	    sp=hp.getTheOffer();
	   
		mp=hp.clickMenProduct();//new ManPage(dr)
		wp=mp.clickWomen();
		wp.verifyTitle();
		
	}
	

}
