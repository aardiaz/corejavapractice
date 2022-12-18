package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(url,username,password)
	  Connection  dbObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1pm", "root", "");
		
	 //=================================== insert sql ===========================================
	    //1. write sql
		String sql = "insert into user(username,password)values('sagun','shrestha99')";
		//2. create statement
		Statement  stm = dbObject.createStatement();
		//3.execute sql
		stm.execute(sql);
		
		//4. close db
		dbObject.close();
		
		System.out.println("added success");
	}

}
