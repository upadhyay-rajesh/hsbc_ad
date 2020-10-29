package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface{

	public int createProfileDAO(FacebookUser f)  {
		int i=0;
		Connection con=null;
		try {
		//step 1 load driver
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//step 2 connection with database
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb2;create=true","rajesh","rajesh");
		//step 3 create query
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1, f.getName());
		ps.setString(2, f.getPassword());
		ps.setString(3,f.getEmail());
		ps.setString(4, f.getAddress());
		
		//step 4 execute query
		i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return i;
	}

	public int deleteProfileDAO(FacebookUser f)throws Exception {
		//step 1 load driver
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				//step 2 connection with database
				Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb2;create=true","rajesh","rajesh");
				//step 3 create query
				PreparedStatement ps=con.prepareStatement("delete from facebookuser where name=?");
				ps.setString(1, f.getName());
				
				//step 4 execute query
				int i=ps.executeUpdate();
				
				return i;
	}

}
