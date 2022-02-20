package Products;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Product implements Serializable
{
    static int product_id;
	String product_name;
	int price;
	String date;
	
	static
	{
		product_id++;
	}
/*	public Product(String a,int b,String date)
	{
		product_name=a;
		price=b;
		date=date;
		
	}
*/

	public Product(String product_name, int price, String date) {
		// TODO Auto-generated constructor stub
		this.product_name=product_name;
		this.price=price;
		this.date=date;
	}


	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + ", date="
				+ date + "]";
	}
	
	
	

}
