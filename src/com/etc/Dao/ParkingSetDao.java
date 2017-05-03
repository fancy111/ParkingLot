package com.etc.Dao;

import hibernate.Parkingset;

public interface ParkingSetDao extends BaseDao<Parkingset>
{
	//为对应订单的车分配一个车位，并更新
	public Parkingset setParkingSet(String BookID);
	
}
