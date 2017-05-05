package com.etc.Dao.Impl;

import java.util.Date;

import com.etc.Dao.StrategyDao;

import hibernate.Strategy;

class StrategyDaoImpl extends BaseDaoImpl<Strategy> implements StrategyDao{

	/**
	 * 根据开始时间和结束时间得到停车的费用
	 * @param StartTime 开始时间
	 * @param endTime 结束时间
	 * @param parkingLotID 停车场id
	 * @return 停车所需费用
	 */
	@Override
	public long getParkingFee(Date StartTime, Date endTime,int parkingLotID) {
		Strategy strategy = this.getStaregy(parkingLotID);
		long hour = (endTime.getTime() - StartTime.getTime())/1000/3600;
		//这里认为getStrategyFee()是停车一小时所需要的时间
		long fee = strategy.getStrategyFee() *hour ;
		return fee;
	}

	/**
	 * 根据开始时间和结束时间得到停车的费用
	 * @param parkinglotid 停车场id
	 * @return 停车策略
	 */
	@Override
	public Strategy getStaregy(int parkinglotid) {
		return this.loadEntity(parkinglotid);
	}
	
}