package Test;

public class Test1 {

	public void Add(int a)
	{
		loop:
			for(int i=1; i<3; i++)
			{
				for (int j=1; j<3; j++)
				{
					if(a==5)
					{
						break loop;
					}
					System.out.println(i*j );
				}
			}
	}
}
