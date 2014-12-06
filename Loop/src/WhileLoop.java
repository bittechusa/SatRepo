import org.junit.Test;
public class WhileLoop {
int i=1;
int j=1;
	@Test
	public void run()
	{
		
		while(i<11){
			System.out.println(i);
			i++;
		}// after this loop console stops, it does go to next loop if next loop has the same variable
		
	    while (j<10){
		if (j==5){
			System.out.println(j);
			//break;
		}
		
		System.out.println(j);
		j++;
	}
	}
	
}
