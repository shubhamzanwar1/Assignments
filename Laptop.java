package domain;

public class Laptop implements product
{

	@Override
	public void productType()
	{
	System.out.println("PRODUCT IS HP");
	}

	@Override
	public void productCost(double price)
	{
		double gstprice= price * 0.05;

		double totalprice= gstprice + price;
		
		System.out.println("PRODUCT PRICE IS "+totalprice);
	}

}
