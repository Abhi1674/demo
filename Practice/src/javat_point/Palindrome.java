package javat_point;

public class Palindrome {

	public static void main(String[] args)
	{
		int num=121;
		int r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
