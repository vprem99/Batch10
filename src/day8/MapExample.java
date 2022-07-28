package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> data = new HashMap<Integer, String>();

		
		data.put(102, "Akshay");
		data.put(103, "Abhishek");
		data.put(104, "Dipika");
		data.put(105, "Manish");
		data.put(101, "Dipali");
		data.put(105, "Akshay");

		data.put(null, "ABC");

		System.out.println(data.get(104));

		System.out.println(data);

		System.out.println("Entries: " + data.entrySet());
		System.out.println("Keys: " + data.keySet());
		System.out.println("Values: " + data.values());
		String value = data.remove(103);
		System.out.println("Removed Value: " + value);
		System.out.println("Entries: " + data.entrySet());

		Map<Integer, String> data2 = new TreeMap<Integer, String>();

		
		data2.put(102, "Prashant");
		data2.put(103, "Abhishek");
		data2.put(104, "Dipika");
		data2.put(105, "Manish");
		data2.put(101, "Dipali");
		//data2.put(null, "ABC");

		System.out.println(data2.get(104));

		System.out.println(data2);

		System.out.println("Keys: " + data2.keySet());
		System.out.println("Values: " + data2.values());
		System.out.println("Entries: " + data2.entrySet());

		String value2 = data2.remove(103);
		System.out.println("Removed Value: " + value2);

	}
}