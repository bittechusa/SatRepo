import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

import org.junit.Test;


public class Collection 
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	LinkedList<Integer> ll=new LinkedList<Integer>();
	
	@Test
	public void m1()
	{
		/*long s=System.currentTimeMillis();
		for( int i=0;i<=100000;i++)
		{
			
			al.add(i);
			al.
			
		}
		for(int k=99999;k>1000;k--)
		{
			al.get(k);
		}
		long e=System.currentTimeMillis();
		System.out.println(e-s);
        long s1=System.currentTimeMillis();
		for( int j=0;j<=100000;j++)
		{
			
			ll.add(j);
			
		}
		for(int l=99999;l>1000;l--)
		{
			al.get(l);
		}
		long e1=System.currentTimeMillis();
		System.out.println(e1-s1);*/
		al.add(9);
		al.add(19);
		al.add(5);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
		@Test
		public void m2()
		{
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
			hm.put(1, "payon");
			hm.put(2, "dip");
			hm.put(null, null);
			hm.put(null, null);
			hm.put(null, null);
			ht.put(1, "fhgkh");
			ht.put(2, "dgh");
			//ht.put(3, null);
			//ht.put(null, null);
			/*for(int i=0;i<=hm.size();i++)
			{
				System.out.println(hm.get(i));
			}*/
			for(int j=0;j<=ht.size();j++)
			{
				ht.get(j);
			}
			for(int k=0;k<ht.size();k++)
			{
				System.out.println(ht.remove(k));
			}
			
			
		}
	
		
	}

	
	
	
	
	


