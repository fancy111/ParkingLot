package com.etc.Dao.Impl;

import java.net.URI;
import java.util.List;

import com.etc.Dao.UserDao;

import hibernate.Bookform;
import hibernate.Car;
import hibernate.Rentform;
import hibernate.User;
import hibernate.Usercreditnum;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao 
{

	/**
	 * @param phoneNumber 用户注册的电话
	 * @param password 密码
	 * @return 相应的用户对象,若没有则为null
	 */
	@Override
	public User userLogin(String phoneNumber, String password) {
		String where = "where User_Phonenum=? and User_Password=?";
		List<User> userList = this.loadList(where, phoneNumber,password);
		if(userList.size() > 0)
			return userList.get(0);
		return null;
	}

	@Override
	public User userRegister(String phoneNumber, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userSetPassWord(int UserID, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userSetPassWord(User user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userChangePhoto(User user, URI url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User userChangePhoto(int UserID, URI url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usercreditnum> userCheckCredit(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usercreditnum> userCheckCredit(int Userid) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Car> userCheckCar(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> userCheckCar(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookform> userGetAllBookForm(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookform> userGetAllBookForm(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rentform> userGetAllRentForm(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rentform> userGetAllRentForm(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookform> userbookCheck(User user, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookform> userbookCheck(int userid, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rentform> userrentCheck(User user, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rentform> userrentCheck(int userid, int status) {
		// TODO Auto-generated method stub
		return null;
	}

}
