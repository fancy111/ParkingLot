package com.etc.Dao.Impl;

import java.util.Date;
import java.util.List;

import com.etc.Dao.ParkingDao;

import hibernate.Parking;
import hibernate.ParkingId;

public class ParkingDaoImpl extends BaseDaoImpl<ParkingId> implements ParkingDao{

	@Override
	public ParkingId setBookFine(String bookID, Date arriveTime, Date leaveTime) {
		// TODO Auto-generated method stub
		String where = "where Parking_Bookid = ?";
		List<ParkingId> list = loadList(where, bookID);
		ParkingId parkingId = list.get(0);
		parkingId.setParkingArriveTime(arriveTime);
		parkingId.setParkingLeaveTime(leaveTime);
		if (updateEntity(parkingId)) {
			return parkingId;
		}
		return null;
	}

	//根据订单Id设置到达时间
	@Override
	public ParkingId setArriveTime(String bookID, Date date) {
		// TODO Auto-generated method stub
		ParkingId parkingId = loadEntity(bookID);
		parkingId.setParkingArriveTime(date);
		if (updateEntity(parkingId)) {
			return parkingId;
		}
		return null;
	}

	@Override
	public ParkingId setArriveTime(Parking parking, Date date) {
		// TODO Auto-generated method stub
		ParkingId parkingId = loadEntity(parking.getId());
		parkingId.setParkingArriveTime(date);
		if (updateEntity(parkingId)) {
			return parkingId;
		}
		return null;
	}

	@Override
	public ParkingId setLeaveTime(String bookID, Date date) {
		// TODO Auto-generated method stub
		ParkingId parkingId = loadEntity(bookID);
		parkingId.setParkingLeaveTime(date);
		if (updateEntity(parkingId)) {
			return parkingId;
		}
		return null;
	}

	@Override
	public ParkingId setLeaveTime(Parking parking, Date date) {
		// TODO Auto-generated method stub
		ParkingId parkingId = loadEntity(parking.getId());
		parkingId.setParkingLeaveTime(date);
		if (updateEntity(parkingId)) {
			return parkingId;
		}
		return null;
	}
}
