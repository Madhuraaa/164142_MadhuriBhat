package com.madhuri.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.madhuri.pojo.User;

public class UserDAOVersion2 implements IUserDAO{

	@Override
	public String getUserType(String userName, String password) {
	Connection connection=ConnectionFactory.getCOnnection();
	try{PreparedStatement statement=connection.prepareStatement("select * from user_table where username=? and password=?");
	statement.setString(1, userName);
	statement.setString(2, password);
	ResultSet set=statement.executeQuery();
	while(set.next()){
		if(set.getString("username").equals(userName)&&
		set.getString("password").equals(password)){
			System.out.println("hii"+set.getString("userType"));
			return set.getString("userType");
		}
	}
	}
		catch(SQLException e ){
			e.printStackTrace();
		}
		throw new InvalidUserException("Doesn't exist");
	}

	@Override
	public void adduser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String userNmae, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(String userName) {
		// TODO Auto-generated method stub
		
	}
	 public static void main(String[] args) {
		System.out.println(new UserDAOVersion2().getUserType("Madhuri","java"));
	}

}
