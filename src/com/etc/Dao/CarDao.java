package com.etc.Dao;

import hibernate.Car;
import hibernate.User;

public interface CarDao extends BaseDao<Car>
{
	public Car GetCar(int userID,String Car_Platenum);
	//获取Car实体，userID和车牌作为候选键可以来获得一个Car实体，主要是获得主键ID的值
	
	public Car addCar(int userID,String Car_PlateNum);
	public Car addCar(User user,String Car_PlateNum);
	
	public Car deleteCar(int userID,String Car_PlateNum);
	public Car deleteCar(User user,String Car_PateNum);
	
}
