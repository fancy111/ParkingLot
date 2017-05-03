package com.etc.Dao;

import java.net.URI;
import java.util.List;

import hibernate.Bookform;
import hibernate.Car;
import hibernate.Rentform;
import hibernate.User;
import hibernate.Usercreditnum;

public interface UserDao extends BaseDao<User>
{
	public User userLogin(String phoneNumber,String password);
	
	public User userRegister(String phoneNumber,String password);
	
	public User userSetPassWord(int UserID,String password);
	public User userSetPassWord(User user,String password);
	
	public User userChangePhoto(User user,URI url);
	public User userChangePhoto(int UserID,URI url);
	
	public List<Usercreditnum> userCheckCredit(User user);
	public List<Usercreditnum> userCheckCredit(int Userid);

	public List<Bookform> userGetAllBookForm(User user);
	public List<Bookform> userGetAllBookForm(int userid);
	
	public List<Rentform> userGetAllRentForm(User user);
	public List<Rentform> userGetAllRentForm(int userid);
	
	public List<Car> userCheckCar(User user);
	public List<Car> userCheckCar(int userid);
	//in OrderService
	public List<Bookform> userbookCheck(User user,int status);
	public List<Bookform> userbookCheck(int userid,int status);
	
	public List<Rentform> userrentCheck(User user,int status);
	public List<Rentform> userrentCheck(int userid,int status);
	
	
}