package LabQuestions;
import java.util.*;
public class Student {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int r=sc.nextInt();
		
		HashMap<Integer,String> hm=new HashMap();
		System.out.println("Enter the student name and roll no :");
		
		for(int i=0; i<r; i++)
		{
			String name=sc.next();
			int rollno=sc.nextInt();
			hm.put(rollno, name);
			
		}
		System.out.println(hm);
		System.out.println("Enter rollno you want to display");
			
			int p=sc.nextInt();
			if(hm.containsKey(p))
			{
				System.out.println("Name of that student is :"+hm.get(p));
			}
			else
			{
				System.out.println("Name Not found");
			}
		
	}
}
