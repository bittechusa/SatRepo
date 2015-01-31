
public class A 
{
	int a=7;// global variable 
	static int b=11;// class variable.static value works with change valu,static
	                       // without object criat you can call direct class name;
	final int c=20;//global variable
	//abstract int c=9 ; variable cannot be abstract;
	//abstract mathod should be abstract class.
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
