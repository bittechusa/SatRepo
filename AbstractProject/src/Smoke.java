public class Smoke 
{
	
	public static void main(String[] args) 
	{
		//Animal x=new Animal();
		//Animal deer = new Deer();
		Animal [] xyz = new Animal[2];
		xyz[0] = new Deer();
		xyz[1] = new Cow();
		
		for(int i=0; i<xyz.length; i++)
		{
			xyz[i].eat();
			
		}

	}

}
