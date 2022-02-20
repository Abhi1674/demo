package javat_point;

public class Armstrong_Number
{
	public static void main(String[]args)
	{
		int num=151;
		int temp,sum=0;
		int number=num;
		
		while(number!=0)
		{
			temp=number%10;
			sum=sum+temp*temp*temp;
			number/=10;
		}
		if(sum==num)
		{
			System.out.println("Number is armstrong number");
		}
		else
		{
			System.out.println("Number is not a armstrong number");
		}
	}

}
