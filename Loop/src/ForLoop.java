import org.junit.Test;


public class ForLoop {
	
	@Test
	public void runLoop()
	{
	
		for(int i=0; i<=100; i=i+2){
			System.out.println(i);
		}
	}
@Test
public void runThis()
{
	for(int j=1; j<=100; j++){
		if(j==50){
		continue;// continue thakle oita under e je number acheh oi ta skip korbe; oita print korbe na
		// continue tahke er pore je statement ache oi ta skip korbe
		}
		System.out.println(j);
		}
	}

}
