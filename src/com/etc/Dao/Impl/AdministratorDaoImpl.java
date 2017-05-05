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
		String where = "where Admin_Name =? and Admin_Password=?";
		List<Administrator> adminList = this.loadList(where, username,passwd);
		if(adminList.size() > 0)
			return adminList.get(0);
		return null;
	}
}
