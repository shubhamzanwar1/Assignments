package findMinMaxprice;

import java.sql.*;

public class BL_Class 
{
	static Connection con;
	static
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peje7?user=root&password=250521");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void maxPrice()
	{
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select * from product_data where product_price= (select max(product_price) from product_data)";
	
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt("product_id");
				String name=rs.getString("product_name");
				double price=rs.getDouble("product_price");
				String product=rs.getNString("product_category");
				
				System.out.println("PRODUCT ID IS "+id);
				System.out.println("PRODUCT NAME IS "+name);
				System.out.println("PRODUCT PRICE IS "+price);
				System.out.println("PRODUCT CATEGORY IS "+product);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void minPrice()
	{
		
		Statement stmt=null;
        ResultSet rs=null;
		
		String query="select * from product_data where product_price= (select min(product_price) from product_data)";
	
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt("product_id");
				String name=rs.getString("product_name");
				double price=rs.getDouble("product_price");
				String product=rs.getNString("product_category");
				
				System.out.println("PRODUCT ID IS "+id);
				System.out.println("PRODUCT NAME IS "+name);
				System.out.println("PRODUCT PRICE IS "+price);
				System.out.println("PRODUCT CATEGORY IS "+product);
			}
		}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		
		
	}
}


