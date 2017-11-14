package org.mycompany.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	private String username;
	private String password;
	private String loginStatus;
//	private String selectedFruit="Banana";
	private String fullName;
	
	
	public User(){
		
	}
	
	public User(String username,String password,String selectedFruit){
		 this.username = username;
		 this.password = password;
//		 this.selectedFruit = selectedFruit;
		 this.fullName = username+password;
	}
	
	public String getUserName() {
		System.out.println("username--- "+username);
		return username;
	}
	public void setUsername(String userName) {
		System.out.println("Fired--- ");
//		this.username = "xyz";
	}
	public String getPassword() {
		return password;
	}
	/*public void setpassword(String password) {
		this.password = password;
	}*/
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
//	public String getSelectedFruit() {
//		return selectedFruit;
//	}
//	public void setSelectedFruit(String selectedFruit) {
//		this.selectedFruit = selectedFruit;
//	}
	
	public static List<User> loadUsers(){
		ArrayList<User> list = new ArrayList<User>();
		User u = new User("Shiva","welcome","Apple");
		User u1 = new User("Akash","Wecome","Banana");
		list.add(u);
		list.add(u1);
		return list;
	}
	
}
