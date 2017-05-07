package com.etc.Dao.Impl;

import java.util.List;

import com.etc.Dao.AdministratorDao;

import hibernate.Administrator;

public class AdministratorDaoImpl extends BaseDaoImpl<Administrator> implements AdministratorDao{

	/**
	 * 需要在数据库中添加管理员的用户名和密码属性
	 */
	@Override
	public Administrator login(String username, String passwd) {
		// TODO Auto-generated method stub
		String where = "where Administrator_name =? and Administrator_password=?";
		List<Administrator> adminList = this.loadList(where, username,passwd);
		if(adminList.size() > 0)
			return adminList.get(0);
		else return null;
	}

	//根据用户名和密码进行注册
	@Override
	public boolean register(String username, String passwd) {
		// TODO Auto-generated method stub
		Administrator administrator = new Administrator();
		administrator.setAdministratorUsername(username);
		administrator.setAdministratorPassword(passwd);
		if (saveEntity(administrator)) {
			return true;
		}else{
			return false;
		}
	}
	
	
}
