package com.etc.Dao;

import hibernate.Administrator;

public interface AdministratorDao extends BaseDao<Administrator>
{
	public Administrator login(String username,String passwd);
	
	public boolean register(String username,String passwd);
}
