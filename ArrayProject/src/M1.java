import org.junit.Test;

public class M1 
{
	int a = 5;
	String color = "red";
	//String color = "yellow";
	
	//Array behave as an object
	int b [] = {5, 6, 7,};
	
	@Test
	public void m1()
	{
		System.out.println(b.length);
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
	
	int c [] = new int [2];
	
	@Test
	public void m2()
	{
		c[0] = 7;
		c[1] = 8;
		//c[2] = 9;
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}
	
	// what is the difference between String and String buffer?
	// find the smallest or biggest number from an array
	int d [] = {43, 65, 768, 8, 769, 0, 876, 7, 1, 3, 78, 9, 78, 678, 4}; 
	@Test
	public void m3()
	{
		int moga = d [0]; //d [0] (holds the first value, in this case 43)
		for(int i=1; i<d.length; i++) 
		{
			if(moga<d[i])
			{
				moga=d[i];
			}
		}
		System.out.println(moga);
	}
	

}
