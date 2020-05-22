package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class create_properties 
{
	public static void main(String[] args)
	{
      FileWriter fw=null;
		
		Properties prop=new Properties();
		
		try
		{
			fw=new FileWriter("E:\\Downloadsss\\PEJE7\\assignment programs\\database.properties");
		
			prop.setProperty("employeename", "sachin");
			prop.setProperty("employeeAge", "26");
			
			prop.store(fw, "EXTERNAL FILE");
			
			System.out.println("PROPERTIES FILE CREATED SUCCESSFULLY");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
