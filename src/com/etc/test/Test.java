package com.etc.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.etc.Dao.UserCreditNumDao;
import com.etc.Dao.UserDao;
import com.etc.Dao.Impl.UserCreditNumDaoImpl;
import com.etc.Dao.Impl.UserDaoImpl;

import hibernate.User;
import hibernate.Usercreditnum;

public class Test{
	
	public static void  main(String[] args){
		UserDao userDao = new UserDaoImpl();
		UserCreditNumDao userCreditNumDao = new UserCreditNumDaoImpl();
//		User user = new User();
//		user.setUserId(1);
//		user.setUserName("xiao");
		//boolean success = userCreditNumDao.addCredit(1, "123122221");
		List<Usercreditnum> list = userDao.userCheckCredit(1);
		for(int i = 0; i < list.size(); i++){
			Usercreditnum usercreditnum = list.get(i);
			System.out.println(i+":"+usercreditnum.getId().getUserCreditNumCreditnum());
		}
//		if(success)
//			System.out.println("success");
//		else
//			System.out.println("fail");
	}
}