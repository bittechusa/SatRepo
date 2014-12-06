import org.junit.Test;


public class IfElseTestAnnotation {
	
	@Test
	public void m1()
	
	{
		p1(4,6);
		p2(3,5);
	}
	 int  p1(int a,int b)
	{
		
		 
		 
		 if (a<b)
		{ System.out.println("true");}
		else 
		{ System.out.println("false");}
		
		return 0;
	}
	
	 int p2(int a,int b)
	{
		if (a>b)
		{System.out.println("true");}
		else if(a<b)
		{System.out.println("not false");}
		else
		{System.out.println("false");}
		return 0;
	}

}
