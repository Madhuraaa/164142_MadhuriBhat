package com.madhuri.servlet;

import java.util.ArrayList;

import com.madhuri.pojo.User;

public class UserDAO implements IUserDAO {
	

  ArrayList<User> userlist;
  
  public UserDAO(){
	  userlist=new ArrayList<>();
	  userlist.add(new User("Madhuri","java","Admin"));
	  userlist.add(new User("Sachin","sql","User"));
	  userlist.add(new User("rahul","java","Admin"));
  }
  public String getUserType(String username,String password) throws InvalidUserException{
	  for(User user:userlist){
		  if(user.getUsername().equals(username) && user.getPassword().equals(password))
		  {
			  System.out.println(user.getUserType());
			  return user.getUserType();
		  }
	  }
	  throw new InvalidUserException("User Name and Password doesnt exists...");
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
}
