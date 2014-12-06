
public class A {
	
	
	int a=4;//global variable
	static int b=4; //class variable
	final int c= 4;
	
A ()
{
a++;
b++;
//C++ not possible
 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
}
	A(int d)
	{
		a++;
		b++;
		
		 System.out.println(a);
		 System.out.println(b);
}
	
	static void m1()
	{}
	
	
	
	
}
