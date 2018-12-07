package com.madhuri.servlet;

import java.util.ArrayList;

import com.madhuri.pojo.User;

public interface IUserDAO {
	public String getUserType(String userName,String password);
	public void adduser(User user);
	public void changePassword(String userNmae,String oldPassword,String newPassword);
	public void removeUser(String userName);

}
