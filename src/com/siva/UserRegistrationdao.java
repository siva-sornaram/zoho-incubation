package com.siva;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.siva.*;
import com.siva.util.DbConnection;

public class UserRegistrationdao {
	public static int registerUser(User user) {
		
		String insertSql = "INSERT INTO logintable(username, password) VALUES (?, ?)";
		
		int result = 0, i = 1;
		
		try {
			
			Connection con = DbConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement(insertSql);
			stmt.setString(i++, user.getUsername());
			stmt.setString(i++, user.getPassword());
			
			result = stmt.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("Mugesh");
		user.setPassword("TXVnZXNo");
		
		registerUser(user);
	}

}
