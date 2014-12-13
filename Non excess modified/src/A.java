
public class A 
{
	int a=7;// global variable 
	static int b=11;// class variable 
	final int c=20;
	static void m()
	{
	System.out.println("hi");	
	}
	
	A ()
	{
		a++;
		b++;
		//c++; not possible because final class can never be inheritance 
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
	
	A(int z)
	{
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	
}
