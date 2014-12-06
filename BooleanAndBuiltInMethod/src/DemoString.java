
public class DemoString {
	
	int a=7;
	String m=new String ("hi welcome");// String built it class
	String n="this is same as creating String object"; 
	Integer q=3;
	
	
	Boolean m1(int a, int b)
	{
		if(a>=b)
		{
			return true;
	    }
		else
		{
			return false;
		
	    }
	
	}
	
	void m2(String z)
	{
		if (m.equals(z))
		//(m.equals("hello")) we do this because if("he"== "be") not possible
			// or we can also compare with n which is (m.equals(n))
				{
			       System.out.println("true");
			    }
		else if (n.equals(m))
	              { System.out.println("false"); }
		else
		{
			System.out.println("false");
		}
	}
	
	void m3()
	{
		if(m.contains("hi"))// m er modhe hi kotha ta acheh naki ta jannar janno contains method use korb
		{
			System.out.println("true");
			}
		else
		{
			System.out.println("false");
		}
		
	}
	
	
	void m4()
	{
		// or  String k[]=....
		String[] k =(m.split(" "));//split use kori space, comma etc er madhome ekta sentence ke divide korar janno
		//here m er value er sentence ke divide korbe
		System.out.println(k[0]);
		System.out.println(k[1]);
	}
	
	void m5()
	{
		System.out.println(m.concat(" to bit tech"));  //concat use kori ai string ta m er string er sathe add korar janno
		//or z=m.concat(" to bit tech"); 
		//System.out.println(z);
	}
	
	void m6()
	{
		System.out.println(m.length());
	}
	
	void m7()
	{
		System.out.println(m.toLowerCase());//if there is any upper case then it will make lower case
		System.out.println(m.toUpperCase());
		
	}
	
	//for Interger is same as String
	
	
}
