package com.etc.Dao.Impl;

import java.util.List;

import com.etc.Dao.OutLayDao;

import hibernate.Outlay;
import hibernate.Parkinglot;

public class OutLayDaoImpl extends BaseDaoImpl<Outlay> implements OutLayDao{

	//income没有找到相应的地方获得
	@Override
	public List<Outlay> getAllincome(int parkinglotID) {
		// TODO Auto-generated method stub
		return null;
	}

	//根据停车场id获取停车场的所有支出
	@Override
	public List<Outlay> getAlloutlay(int parkinglotid) {
		// TODO Auto-generated method stub
		String where = "where Outlay_Parkinglotid = ?";
		List<Outlay> list = loadList(where, parkinglotid);
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

	//根据停车场对象获取停车场的所有支出
	@Override
	public List<Outlay> getAlloutlay(Parkinglot parkinglot) {
		// TODO Auto-generated method stub
		String where = "where Outlay_Parkinglotid = ?";
		List<Outlay> list = loadList(where, parkinglot.getParkingLotId());
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

}
