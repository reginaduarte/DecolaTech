package com.avanade.decolatech.aplicacao;

public class AppStrings {
	public static void main(String[] args) {
		int x = 10;
		boolean b = (x == 10);
		
		String s1 = "Java";
		String s2 = "Java";
		boolean b1 = (s1 == s2);
		boolean compara1 = s1.equals(s2);
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		boolean b2 = (s3 == s4);
		boolean compara2 = s3.equals(s4);
		
		System.out.println("b1: "+ b1);
		System.out.println("b2: " + b2);
		System.out.println("compara1: "+ compara1);
		System.out.println("compara2: " + compara2);
	}
}
