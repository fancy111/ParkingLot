package com.etc.Dao.Impl;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
	 * 用户是否存在
	 * @param username 用户名
	 * @return 相应的用户对象,若没有则为null
	 */
	@Override
	public User inUserList(String phone) {
		String where="where User_Phonenum = ? ";
		List<User> users=this.loadListEntitys(where,phone);
		if (users.isEmpty()) 
			return null;
		return users.get(0);
	}
	
	/**
	 * 用户登录
	 * @param phoneNumber 用户注册的电话
	 * @param password 密码
	 * @return 相应的用户对象,若没有则为null
	 */
	@Override
	public User userLogin(String phone, String password) {
		String where = "where User_Phonenum=? and User_Password=?";
		List<User> userList = this.loadListEntitys(where, phone,password);
		if(userList.size() > 0)
			return userList.get(0);
		return null;
	}

	/**
	 * 用户注册
	 * @param user 用户对象
	 * @return 相应的用户对象,若没有则为null
	 */
	@Override
	public User userRegister(User user) {
		//若用户已存在
		if (this.inUserList(user.getUserPhonenum()) != null) 
			return null;
		user.setUserSigndate(new Date());
		this.saveEntity(user);
		return user;
	}

	/**
	 * 用户设置密码
	 * @param UserID 用户id
	 * @param password 新密码
	 * @return 成功否
	 */
	@Override
	public boolean userSetPassWord(int UserID, String password) {
		User user = this.loadEntity(UserID);
		return this.userSetPassWord(user, password);
	}
	
	/**
	 * 用户设置密码
	 * @param user 用户对象
	 * @param password 新密码
	 * @return 成功否
	 */
	@Override
	public boolean userSetPassWord(User user, String password) {
		user = this.loadEntity(user.getUserId());
		user.setUserPassword(password);
		return this.updateEntity(user);
	}

	/**
	 * 用户设置头像
	 * @param user 用户
	 * @param url 头像url
	 * @return 成功否
	 */
	@Override
	public boolean userChangePhoto(User user, URI url) {
		user.setUserPhoto(url.toString());
		return this.saveEntity(user);
	}

	/**
	 * 用户设置头像
	 * @param user 用户
	 * @param url 头像url
	 * @return 成功否
	 */
	@Override
	public boolean userChangePhoto(int UserID, URI url) {
		User user = this.loadEntity(UserID);
		return this.userChangePhoto(user, url);
	}

	/**
	 * 用户获取银行卡信息
	 * @param user 用户
	 * @return 银行卡列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Usercreditnum> userCheckCredit(User user) {
		if(user == null)
			return null;
		Iterator<Usercreditnum> iterator=user.getUsercreditnums().iterator();
		List<Usercreditnum> list=new ArrayList<Usercreditnum>();
		while (iterator.hasNext())
		{
			Usercreditnum usercreditnum=(Usercreditnum)iterator.next();
			list.add(usercreditnum);
		}
		return list;
	}

	/**
	 * 用户获取银行卡信息
	 * @param Userid 用户id
	 * @return 银行卡列表
	 */
	@Override
	public List<Usercreditnum> userCheckCredit(int Userid) {
		User user = this.loadEntity(Userid);
		Iterator<Usercreditnum> iterator=user.getUsercreditnums().iterator();
		List<Usercreditnum> list=new ArrayList<Usercreditnum>();
		while (iterator.hasNext())
		{
			Usercreditnum usercreditnum=(Usercreditnum)iterator.next();
			list.add(usercreditnum);
		}
		return list;
	}

	/**
	 * 用户获取车辆信息
	 * @param user 用户
	 * @return 车辆列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Car> userCheckCar(User user) {
		if(user == null)
			return null;
		Iterator<Car> iterator=user.getCars().iterator();
		List<Car> list=new ArrayList<Car>();
		while (iterator.hasNext())
		{
			Car car=(Car)iterator.next();
			list.add(car);
		}
		return list;
	}

	/**
	 * 用户获取车辆信息
	 * @param user 用户id
	 * @return 车辆列表
	 */
	@Override
	public List<Car> userCheckCar(int userid) {
		User user = this.loadEntity(userid);
		return this.userCheckCar(user);
	}

	/**
	 * 用户获取预约订单
	 * @param user 用户
	 * @return 预约订单列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Bookform> userGetAllBookForm(User user) {
		if(user == null)
			return null;
		Iterator<Bookform> iterator=user.getBookforms().iterator();
		List<Bookform> list=new ArrayList<Bookform>();
		while (iterator.hasNext())
		{
			Bookform bookform=(Bookform)iterator.next();
			list.add(bookform);
		}
		return list;
	}

	/**
	 * 用户获取预约订单
	 * @param userid 用户id
	 * @return 预约订单列表
	 */
	@Override
	public List<Bookform> userGetAllBookForm(int userid) {
		User user = this.loadEntity(userid);
		return this.userGetAllBookForm(user);
	}

	/**
	 * 用户获取预约订单
	 * @param user 用户
	 * @return 长期租用订单列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Rentform> userGetAllRentForm(User user) {
		if(user == null)
			return null;
		Iterator<Rentform> iterator=user.getRentforms().iterator();
		List<Rentform> list=new ArrayList<Rentform>();
		while (iterator.hasNext())
		{
			Rentform rentform=(Rentform)iterator.next();
			list.add(rentform);
		}
		return list;
	}

	/**
	 * 用户获取预约订单
	 * @param userid 用户id
	 * @return 长期租用订单列表
	 */
	@Override
	public List<Rentform> userGetAllRentForm(int userid) {
		User user = this.loadEntity(userid);
		return this.userGetAllRentForm(user);
	}

}
