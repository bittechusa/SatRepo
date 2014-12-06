
public class IfElseCondition {
	
	
	
	
	public static void main(String[]args)
	{
		p1(4,6);
		p2(3,5);
	}
	
	static int  p1(int a,int b)
	{
		if (a<b)
		{ System.out.println("true");}
		else 
		{ System.out.println("false");}
		
		return 0;
	}
	
	static int p2(int a,int b)
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
