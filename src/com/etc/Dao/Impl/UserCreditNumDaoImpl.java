package com.etc.Dao.Impl;

import com.etc.Dao.UserCreditNumDao;

import hibernate.User;
import hibernate.Usercreditnum;
import hibernate.UsercreditnumId;

public class UserCreditNumDaoImpl extends BaseDaoImpl<Usercreditnum> implements UserCreditNumDao{

	/**
	 * 为某用户添加一张银行卡信息
	 * @param userID 用户id
	 * @param Creditnumber 银行卡号
	 * @return 是否添加成功
	 */
	@Override
	public boolean addCredit(int userID, String Creditnumber) {
		User user = new User();
		user.setUserId(userID);
		return this.addCredit(user, Creditnumber);
	}

	/**
	 * 为某用户添加一张银行卡信息
	 * @param user 用户对象
	 * @param Creditnumber 银行卡号
	 * @return 是否添加成功
	 */
	@Override
	public boolean addCredit(User user, String Creditnumber) {
		UsercreditnumId usercreditnumId = new UsercreditnumId(Creditnumber,user.getUserId());
		Usercreditnum usercreditnum = new Usercreditnum(usercreditnumId,user);
		return this.saveEntity(usercreditnum);
	}

	/**
	 * 为某用户删除一张银行卡信息
	 * @param userID 用户id
	 * @param Creditnum 银行卡号
	 * @return 是否删除成功
	 */
	@Override
	public boolean deleteCredit(int userID, String Creditnum) {
		User user = new User();
		user.setUserId(userID);
		return this.deleteCredit(user, Creditnum);
	}
	
	/**
	 * 为某用户删除一张银行卡信息
	 * @param user 用户对象
	 * @param Creditnum 银行卡号
	 * @return 是否删除成功
	 */
	@Override
	public boolean deleteCredit(User user, String creditnum) {
		UsercreditnumId usercreditnumId = new UsercreditnumId(creditnum,user.getUserId());
		Usercreditnum usercreditnum = new Usercreditnum(usercreditnumId,user);
		return this.deleteEntity(usercreditnum);
	}
	
}