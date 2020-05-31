package DisplayProductCategory;

import java.sql.*;
import java.util.Scanner;

public class product_category 
{

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENTER PRODUCT CATEGORY");
		String product_category = sc1.next();
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select * from product_data where product_category= '"+product_category+"'";
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peje7?user=root&password=250521");

			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			System.out.println("PRODUCT NAME");
			System.out.println("-----------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		}
		
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc1.close();
			if(con!=null)
			{
				try 
				{
					con.close();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

