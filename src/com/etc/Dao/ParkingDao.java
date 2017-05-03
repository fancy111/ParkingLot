package com.etc.Dao;

import java.util.Date;

import hibernate.Parking;

public interface ParkingDao extends BaseDao<Parking>
{
	public Parking setBookFine(String bookID,Date arriveTime,Date leaveTime);
	public Parking setBookFine(Parking parking);

	public Parking setArriveTime(String bookID,Date date);
	public Parking setArriveTime(Parking parking,Date date);
	
	public Parking setLeaveTime(String bookID,Date date);
	public Parking setLeaveTime(Parking parking,Date date);
}
