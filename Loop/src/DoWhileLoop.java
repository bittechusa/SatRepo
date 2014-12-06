import org.junit.Test;

public class DoWhileLoop {
	
	@Test
	public void runLoop()
	{
		int i=7;
		int j=1;
		/*do // do function always will run even if the while condition is not true
		{
			System.out.println("true");
			i++;
		}
		while(i>16);
			*/
		do{
			if(j<=5)
			System.out.println(j);
			j++;
		}
		  while(j<10);
		
		
	}
	
	
	
}
