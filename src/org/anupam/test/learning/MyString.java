package org.anupam.test.learning;

public class MyString {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("");
		StringBuffer sb1 = new StringBuffer("");
		
		sb.append("anupaamsdasdhasjahjf");
		System.out.println(sb.capacity());
		System.out.println(sb.substring(3));

	}

}
