package com.shilpa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String url="jdbc:mysql://localhost:3306/shilpa";
	String dname="bini";
	String dpwd="bini123";
	public boolean check(String uname, String pwd)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,dname,dpwd);
			PreparedStatement st=con.prepareStatement("select * from user where name=? and password=?");
			st.setString(1, uname);
			st.setString(2, pwd);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
