package com.etc.Dao;

import java.util.Date;

import hibernate.Strategy;

public interface StrategyDao extends BaseDao<Strategy>
{
	//in BookService
	public double getParkingFee(Date StartTime,Date endTime);
	//in outlayService
	public Strategy getStaregy(int parkinglotid);
}
