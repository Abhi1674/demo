package Products;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Scanner;

class Appendable extends ObjectOutputStream
{
	public Appendable(OutputStream out) throws IOException {
		super(out);
		}
	@Override
	protected void writeStreamHeader() {}
}

public class productRecord
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("product1.ser");
		int y =(int) f.length();

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Choice ");
		System.out.println("1. Add Product");
		System.out.println("2. Display Product");
		System.out.println("2. Search Product");
		System.out.println("3. Delete Product");
		System.out.println("Press any key to exit");
		
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			try {	
			System.out.println("Enter product name,price,date of expiry");
			  String product_name=sc.next();
			  int price= sc.nextInt();
			  String date=sc.next();
			  Product p= new Product(product_name,price,date);
		if( y<=0)
		{
		FileOutputStream fo= new FileOutputStream(f,true);
		ObjectOutputStream o= new ObjectOutputStream(fo);
		o.writeObject(p);
	    o.close();
		}
		else
		{
			FileOutputStream fo= new FileOutputStream(f,true);
			Appendable o= new Appendable(fo);
			o.writeObject(p);
		    o.close();
		}
			}catch(Exception e1) {}
		 break;
		case 2:
			Product p;
			try {
			ObjectInputStream oi= new ObjectInputStream(new FileInputStream(f));
		    do
			{
			p=(Product)oi.readObject();
			System.out.println(p);
		   }while(p!=null);
			}catch(Exception a) {}
			break;
			
		case 3:
			int flag=0;
			System.out.println("Enter the Product name want to search ");
			String n=sc.next();
			Scanner s=new Scanner(new FileInputStream("product1.ser"));
			try {
			while(s.hasNext())
			{
				String s1=s.nextLine();
		       if(s1.contains(n))
		       {
		    	   flag=1;
		       }
		       }
			if(flag==1)
			{
				System.out.println("Product Found");
			}
			else
			{
				System.out.println("Product Not Found");
			}
			}catch(Exception c) {}
		
	}
	}}
