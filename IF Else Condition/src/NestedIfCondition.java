import org.junit.Test;


public class NestedIfCondition {

	@Test
	public void m1()
	
	{
		p1(4,6);
	
	}
	 int p1(int a,int b)
	{
		if (a>b)
		{ 
			if(a<5)
			{System.out.println("false");}
			else
			{System.out.println("true");}
			
			}
		
		
		else if(a<b)
		{ 
			if(b>2)
			{System.out.println("true");}
			else
			{System.out.println("false");}
			
		}
		 
		else
		{System.out.println("nothing is making sense");}
		
		return 0;
	}
	
	
}
