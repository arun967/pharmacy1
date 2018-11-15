package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.model.Registration;

public class Registrationjdbc {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public Connection myConnection()
	{
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","newuser123");
			} catch (ClassNotFoundException | SQLException | NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;
	}
	public int saveData(List<Registration>lst)
	{
		Registration r=(Registration)lst.get(0);
		int i=0;
	{
	try {
	con=myConnection();
	ps=con.prepareStatement("insert into Registration values(?,?,?,?,?)");
	ps.setString(1, r.getName());
	ps.setString(2, r.getEmail());
	ps.setString(3, r.getUsername());
	ps.setString(4, r.getPassword1());
	ps.setString(5, r.getPassword2());
	i= ps.executeUpdate();
con.close();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
		return i;
	}
	public void displayData()
	{
	String str="select name,email,username,password1,password2 from Registration";
	try { 
	con=myConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(str);
	ResultSetMetaData rsmd=rs.getMetaData();
	for(int i=1;i<=rsmd.getColumnCount();i++)
	{
	System.out.println(rsmd.getColumnName(i)+"\t");
	}
	System.out.println("\n--------------");
	while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+
	rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+
	"\t"+rs.getString(5));
	}
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
}
