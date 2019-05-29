package org.anupam.test.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Time{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	private int roll;
	private String Name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Time(int roll, String name) {
		this.roll = roll;
		Name = name;
	}

	
}

public class MyProgram {		
	static Integer file = 0;
	public static void main(String[] args) {
		
		System.out.println(" Hello ");
		Thread th = new Thread(()->  {System.out.println("hellllll");});
		th.start();
		
		Set<String> l1 = new TreeSet<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("5");
		l1.add("4");
		l1.add("8");
		
		l1.forEach(e->{System.out.println(e);});
		
		Time r1 = new Time(1 , "anupam");
		Time r2 = new Time(1 , "anupam");
		System.out.println(r1.hashCode() + " --- " + r1 );
		System.out.println(r2.hashCode() + " --- " + r2 );
		System.out.println(   " --- " + r1.equals(r2) );

		;
		
		Map<Integer,String> a1 = new HashMap<Integer,String>();
		String aaa1 = a1.put(1, "anupam");
		String aaa2 = a1.put(1, "sharma");
		System.out.println( aaa1 + " " + aaa2);
		for(Entry<Integer, String> a : a1.entrySet())
		{
			System.out.println(a.getKey() + "  " + a.getValue());
		}
		
		String fileName = "c://JavaData//words.txt";
		Set <String> s1 = new TreeSet<>();
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(word-> s1.add(word));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(" Result -> " + s1.contains("Zworykin"));

		
		
	}
}