package com.etc.Dao.Impl;

import com.etc.Dao.ParkingSetDao;

import hibernate.Parkingset;

public class ParkingSetDaoImpl extends BaseDaoImpl<Parkingset> implements ParkingSetDao{

	/**
	 * 为某订单分配停车位
	 * @param BookID 订单的id
	 * @return 返回设置的停车位
	 */
	@Override
	public Parkingset setParkingSet(String BookID) {
		//如何分配停车位？算法？？董核心up，这个函数是不是应该放在service层
		return null;
	}
	
}