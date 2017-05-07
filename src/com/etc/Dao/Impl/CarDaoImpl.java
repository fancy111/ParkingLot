package com.etc.Dao.Impl;

import java.util.List;

import com.etc.Dao.CarDao;

import hibernate.Car;
import hibernate.User;

public class CarDaoImpl extends BaseDaoImpl<Car> implements CarDao{

	//根据用户Id和车牌号获取对象
	@Override
	public Car GetCar(int userID, String Car_Platenum) {
		// TODO Auto-generated method stub
		String where = "where Car_Userid = ? and Car_Platenum = ?";
		List<Car> list = loadList(where, userID,Car_Platenum);
		if (list.isEmpty()) {
			return null;
		}else{
			return list.get(0);
		}
	}

	//根据用户id和车牌号添加车对象????????????????????
	//如何在这个类中根据用户id获取user对象？？？？？？？？？？？？？？
	@Override
	public Car addCar(int userID, String Car_PlateNum) {
		// TODO Auto-generated method stub		
		return null;
	}

	//根据用户对象和车牌号添加车对象
	@Override
	public Car addCar(User user, String Car_PlateNum) {
		// TODO Auto-generated method stub
		Car car = new Car(user, Car_PlateNum);
		if (saveEntity(car)) {
			return car;
		};
		return null;
	}

	//根据用户ID和车牌号删除车辆
	//此处返回类型改为了boolean
	@Override
	public boolean deleteCar(int userID, String Car_PlateNum) {
		// TODO Auto-generated method stub
		String where = "where Car_Userid = ? and Car_Platenum = ?";
		List<Car> list= loadListEntitys(where, userID, Car_PlateNum);
		boolean isDelete = deleteEntity(list.get(0));
		return isDelete;
	}

	//此处的返回类型改为了Boolean
	@Override
	public boolean deleteCar(User user, String Car_PateNum) {
		// TODO Auto-generated method stub
		String where = "where Car_Userid = ? and Car_Platenum = ?";
		List<Car> list= loadListEntitys(where, user.getUserId(), Car_PateNum);
		boolean isDelete = deleteEntity(list.get(0));
		return isDelete;
	}

	//根据用户获取该用户的所有车辆对象
	@Override
	public List<Car> getAllCar(User user) {
		// TODO Auto-generated method stub
		String where = "where Car_Userid = ?";
		List<Car> list = loadList(where, user.getUserId());
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

	@Override
	public List<Car> getAllCar(String userId) {
		// TODO Auto-generated method stub
		String where = "where Car_Userid = ?";
		List<Car> list = loadList(where, userId);
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

}
