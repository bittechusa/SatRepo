import org.junit.Test;


public class SwitchStatement {


	
	@Test
	public void run(){
		int age =5;
	switch(age)
	{
	case 1:
		System.out.println("print 1");  
	break;   // if WE don't use break then console will go to check next case  
	case 2:
		System.out.println("Print 2");
	break;
	case 5:
		System.out.println("print 5");
	break;
	default:
	System.out.println("don't print");
	}		

	}
	}
