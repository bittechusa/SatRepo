
public class Demo {

	public static void main(String[] args) 
	{
		int a=7;
		
		String s=new String("How are you f");
		String s3="shahidul";
		String s4="robel";
		Integer i=new Integer(6467);
		System.out.println(s.length());
		System.out.println(s.trim());
		String s1=s.replace(" ", "");
		System.out.println(s.replace(" ", ""));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		char[]s2=s1.toCharArray();
		System.out.println(s.equals("robel"));
		System.out.println(s.contains("emon"));
		System.out.println(s.indexOf("r"));
		System.out.println(s4.compareTo(s3));
		System.out.println(s.charAt(6));
		System.out.println(s.concat(" arif"));
		String [] a1=s.split(" ");
		System.out.println(a1[1]);
		System.out.println(s.endsWith("f"));
		System.out.println(s.substring(5));
	//git clone git@github.com:bittechusa/TWRepo.git
	}
	

}
