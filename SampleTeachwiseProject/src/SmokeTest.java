import org.junit.Test;


public class SmokeTest extends BaseTest
{
	
	
	SharePage sp;
	HomePage hp;
	ProductDetailPage pp;
	CartPage cp;
	LogInPage lp;
	BillingPage bp;
	@Test
	public void test1() throws InterruptedException
	{
		sp=new SharePage(dr);
		hp=new HomePage(dr);
		hp.homePageLogo();
		pp=hp.clickProduct();
		sp.verifyTitle("Casio Watch");
		cp=pp.clickBuyButton();
		cp.verifyShoppingCart();
		lp=cp.clickCheckOut();
		bp=lp.clickCheckOutasGuest();
		bp.sendBillingInformation();
	}
	

}
