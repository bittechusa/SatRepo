
public class A extends B
{
	static int a=7;
	
	static String lname="islam";
	

	public static void main(String[] args) 
	{
		
		B x=new B();
		C x1=new C();
		D x3=x1.m6();
		//D x3=new D(); is same as D x3=x1.m6();
		x3.m7();
		//int x2=x.m1();void method can not be assign
		System.out.println(x.m5()+x.v);
		System.out.println(x.m5()+a);
		//System.out.println(x1.m4()+a);
		System.out.println(x1.m4());
		
		//System.out.println(x1.m4());
		int z=x1.m3()+x1.m5();//return method can assign
		System.out.println(z);
		
		
		
		//String z=x.name;
		//System.out.println(lname+x.name);

	}
	void m4()
	{
		
	}

}
