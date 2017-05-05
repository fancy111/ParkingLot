package com.etc.Dao;

import java.util.List;

import hibernate.Outlay;
import hibernate.Parkinglot;

public interface OutLayDao extends BaseDao<Outlay>
{
	public List<Outlay> getAllincome(int parkinglotID);
	public List<Outlay> getAlloutlay(int parkinglotid);
	public List<Outlay> getAlloutlay(Parkinglot parkinglot);
	
}
