package LabQuestions;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		int b[]= {5,54,67,11,32,21,98,11,45};
		int prime=0;
		int flag=1;
		for(int i=0; i<b.length; i++)
		{  
			int count=0;
			for(int j=2; j<=b[i];j++)
			{
				if(b[i]%j!=0)
				{
					count++;
				}	
			}
			if(b[i]==(count+2))
			{
				prime++;
			}
		}
		System.out.println("Total prime Numbers are :"+prime);
	}
}
