package com.digisoft.traning.basics.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String str1 = "aru03.info@gmail.com";
		
		StringBuffer sb = new StringBuffer(str1);

//		System.out.println(sb.hashCode());
		System.out.println(sb.append("ABCDdskjalkfdjalkj"));
//		System.out.println(sb.hashCode());
//		System.out.println(sb);
//		
		
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("aru"));
		System.out.println(sb.insert(0, "ARU"));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.replace(0, 3, "ARU"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.equals(str1));
		System.out.println(sb.indexOf("ARU"));
		System.out.println(sb.lastIndexOf("ARU"));
		
		
		
		
	}
}
