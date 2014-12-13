
public class C 
{
	String name1="shahid";//global variable
	
   int m3()
	{
		System.out.println("shahid");
	return 12;
	}//end of method
	int m4()
	{
		
		int b=20;
		System.out.println(b);
		return b;
	}
	int m5()
	{
		
		int b=20;
		System.out.println(b);
		return m3();//returned a method because m3() also retured a int type 
	}
	D m6()
	{
		System.out.println(6);
		return new D();
	}
	

}
