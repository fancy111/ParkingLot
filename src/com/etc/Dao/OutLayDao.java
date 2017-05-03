package com.etc.Dao;

import java.util.List;

import hibernate.Outlay;

public interface OutLayDao extends BaseDao<Outlay>
{
	public List<Outlay> getAllincome(int parkinglotID);
	public List<Outlay> getAlloutlay(int parkinglotid);
	
}
