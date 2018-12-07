package com.madhuri.servlet;

public class DAOUtility {
	

	public static IUserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return new UserDAOVersion2();
	}

	

}
