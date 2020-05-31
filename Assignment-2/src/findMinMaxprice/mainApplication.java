package findMinMaxprice;

import java.util.*;

public class mainApplication 
{

	public static void main(String[] args)
	{
        Scanner sc1=new Scanner(System.in);
		
		BL_Class p=new BL_Class();

		System.out.println("SELECT MODE OF OPERATION");
		System.out.println("1: MAX PRICE DETAILS");
		System.out.println("2: MIN PRICE DETAILS");
		
		int choice=sc1.nextInt();
		
		switch(choice)
		{
			case 1: p.maxPrice();
			 		
			 		break;
			
			case 2: p.minPrice();
					
					break;
					
			
		}
		sc1.close();
	

	}

}
