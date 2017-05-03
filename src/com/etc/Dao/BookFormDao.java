package com.etc.Dao;

import java.util.Date;
import java.util.List;

import hibernate.Bookform;

public interface BookFormDao extends BaseDao<Bookform>
{
	public Bookform renewParkingSet(String bookFormid,Date bookDate,Date endDate);
	public Bookform renewParkingSet(Bookform bookForm,Date bookDate,Date endDate);

	public Bookform setBookPayStatus(String bookFormID,int status);
	public Bookform setBookPayStatus(Bookform bookform,int status);
    //in BookService
	//返回对应时间内全部预约的数量
	public int ParkingNum(Date startDate,Date endDate);
	//返回具体的类
	public List<Bookform> ParkingDetail(Date startDate,Date endDate);
	
	//in OrderManageService
	public List<Bookform> getALLBookForm(int parkinglotid);
}
