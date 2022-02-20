package LabQuestions;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args)
	{
		int r;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number ");
		int number=sc.nextInt();
		
		int n=number;
		while(n!=0)
		{
			
			r=n%10;
			n=n/10;
			sum=(r*r*r)+sum;
		}
		if(sum==n)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}
}
