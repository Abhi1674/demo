package LabQuestions;

import java.util.Scanner;

public class StringCharacter {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.next();
		
		for(int i=0; i<str.length(); i++) 
		{
		System.out.println(str.charAt(i));
		}
	}
}
