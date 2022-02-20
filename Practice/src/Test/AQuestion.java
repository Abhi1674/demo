package Test;

public class AQuestion {

	private int j=10;
	private int i=giveJ();
	
	public int giveJ()
	{
		return j;
	}
	
	public static void main(String[] args)
	{
		System.out.println((new AQuestion()).i);
	}
}
