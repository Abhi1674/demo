package javat_point;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=12;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is prime Number");
		}
		else
		{
			System.out.println("Number is not prime number");
		}
	}
}
