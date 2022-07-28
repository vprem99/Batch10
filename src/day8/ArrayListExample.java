package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Iterators;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Prem");
		names.add("Omkar");
		names.add("Mayank");
		names.add("Shubhash");
		names.add("Prem");
		names.add("");
		names.add("");
		names.add("");
		System.out.println(names.get(2));
		System.out.println(names);
		names.add(1, "AQM");
		System.out.println(names);
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		
		
		Set<String> names2 = new HashSet<String>();
		names2.add("Prem");
		names2.add("Omkar");
		names2.add("Mayank");
		names2.add("Shubhash");
		names2.add("Prem");
		names2.add("");
		names2.add("");
		names2.add("");
		//System.out.println(names2.get(2));
		System.out.println(names2);
		//names2.add(1, "AQM");
		//System.out.println(names2);
		
		Iterator<String> it=names.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		
		
		for(String x:names2)
		{
			System.out.println(x);
		}

	}
}