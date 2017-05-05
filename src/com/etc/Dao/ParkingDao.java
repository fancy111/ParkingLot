package com.etc.Dao;

import java.util.Date;

import hibernate.Parking;
import hibernate.ParkingId;

public interface ParkingDao extends BaseDao<ParkingId>
{
	//修改了返回类型和对象类型！！！！！！！！！！！！
		public ParkingId setBookFine(String bookID,Date arriveTime,Date leaveTime);
		//public ParkingId setBookFine(Parking parking);

		public ParkingId setArriveTime(String bookID,Date date);
		public ParkingId setArriveTime(Parking parking,Date date);
		
		public ParkingId setLeaveTime(String bookID,Date date);
		public ParkingId setLeaveTime(Parking parking,Date date);
}
