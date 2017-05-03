package com.etc.Dao;

import java.util.Date;
import java.util.List;

import hibernate.Bookdecomp;
import hibernate.Bookform;
import hibernate.User;

public interface BookDecompDao extends BaseDao<Bookdecomp>
{
	public List<Bookdecomp> getTodayRent(int UserID,Date date);
	public List<Bookdecomp> getTodayRent(User user,Date date);
	//in BookService
	//返回对应时间内全部预约的数量
	public int ParkingNum(Date startDate,Date endDate);
	//返回具体的类
	public List<Bookdecomp> ParkingDetail(Date startDate,Date endDate);
}
