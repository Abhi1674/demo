package Test;

interface first{
	int x=10;
}
interface second{
	int x=10;
}

public class MyAr implements first, second {

	void check()
	{
		System.out.println("X is :");
	}
}
