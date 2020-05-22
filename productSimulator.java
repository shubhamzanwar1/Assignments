package test;

import java.util.Scanner;
import domain.product;
import factory.productFactory;

public class productSimulator 
{


	public static void main(String[] args)
	{
	   Scanner scan =new Scanner(System.in);
				
		System.out.println("SELECT PRODUCT TYPE");
		System.out.println("LAPTOP");
		System.out.println("MOBILE");
				
		String choice=scan.next();
				
		productFactory f1=new productFactory();
				
			product p =f1.getproduct(choice);
			p.productType();
			p.productCost(25000);
			scan.close();
		}
	

	}


