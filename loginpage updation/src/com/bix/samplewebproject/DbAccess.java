package com.bix.samplewebproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbAccess {


public boolean checkDetails(String username,String password) throws Exception
{
	
	try
{
	 Class.forName("oracle.jdbc.driver.OracleDriver");   
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rengaoracle","db1989");

     PreparedStatement state = con.prepareStatement("select * from gmail where maild= ? and password=?");
	

	 state.setString(1, username);
	 state.setString(2, password);
     ResultSet result= state.executeQuery();
     
	 if(result.next())
		 
		   //String passwordcheck=result.getString("password");
	       //System.out.println(passwordcheck);
	       //if(passwordcheck.equals(password))
	 {
		 
		 return true;
	 }
}
catch(Exception e){
	
}
	return false;
}


	
}
