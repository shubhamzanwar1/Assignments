package factory;

import domain.product;
import domain.Laptop;
import domain.Mobile;

public class productFactory
{
		public product getproduct(String productType)
		{
			product p1=null;
			
			if(productType.equalsIgnoreCase("laptop"))
			{
				p1=new Laptop();   //upcasting
				
			}
			else if(productType.equalsIgnoreCase("mobile"))
			{
				p1=new Mobile();  //upcasting
			}
			
			return p1;
		}
	}


