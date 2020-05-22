package domain;

public class Mobile implements product {

	@Override
	public void productType() 
	{
		System.out.println("PRODUCT IS IPHONE");
		
	}

	@Override
	public void productCost(double price) 
	{
		double gstprice= price * 0.10;

		double totalprice= gstprice + price;
		System.out.println("PRODUCT PRICE IS "+totalprice);
		

	}

}
