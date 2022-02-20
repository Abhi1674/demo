package LabQuestions;

public class Add {

	void add(int ...y)
	{
	int sum=0;
	for(int u:y)
		sum+= u;
	System.out.println(sum);
	}
	
	public static void main(String...args)
	{
		Add a=new Add();
		a.add(3,4,5);
		
	}
}
