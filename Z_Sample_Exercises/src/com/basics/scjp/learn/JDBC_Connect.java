package com.basics.scjp.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connect
{

	public static void main(String... args) throws SQLException
	{
		Connection conn=null;
		try {
		       Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		    }
		    catch (Exception ex){
		       System.out.println(ex.getMessage());
		    }

		    try {
		       conn = DriverManager.getConnection("jdbc:oracle:thin:@brm-oemdb-01.brocade.com:1521:wpqa", "SLK_OWN", "slk_own");
		    }
		    catch (SQLException e){
		    	  System.out.println(e.getMessage());
		    }

	PreparedStatement pstmt ;
	pstmt=conn.prepareStatement("select * from slk_unit where top_serial_num in('AFX2542H00T')");
	
	ResultSet rs =pstmt.executeQuery();
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"  "+ rs.getString(2));
	}
	
	
	}
	
	
}
