package com.etc.Dao;

import java.util.Date;

import hibernate.Strategy;

public interface StrategyDao extends BaseDao<Strategy>
{
	//in BookService
	public long getParkingFee(Date StartTime,Date endTime,int parkingLotID);
	//in outlayService
	public Strategy getStaregy(int parkinglotid);
}
