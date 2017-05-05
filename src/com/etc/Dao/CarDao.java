package com.etc.Dao;

import java.util.List;

import hibernate.Car;
import hibernate.User;

public interface CarDao extends BaseDao<Car>
{
	public Car GetCar(int userID,String Car_Platenum);
	//获取Car实体，userID和车牌作为候选键可以来获得一个Car实体，主要是获得主键ID的值
	
	public Car addCar(int userID,String Car_PlateNum);
	public Car addCar(User user,String Car_PlateNum);
	
	public boolean deleteCar(int userID,String Car_PlateNum);
	public boolean deleteCar(User user,String Car_PateNum);
	
	//后来添加的方法
	public List<Car> getAllCar(User user);
	public List<Car> getAllCar(String userId);
	
}
