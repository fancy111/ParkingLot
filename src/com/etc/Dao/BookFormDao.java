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
	//添加订单
	public boolean addBook(Bookform bookform);
	//根据订单Id删除订单
	public boolean deleteBook(int bookid);
	public boolean deleteBook(Bookform bookform);
	//添加费用、罚款和罚款类型
	public boolean addBookFee(int bookid,int fee);
	public boolean addBookFee(Bookform bookform,int fee);
	public boolean addBookFeeState(int bookid,int payState);
	public boolean addBookFeeState(Bookform bookform,int payState);
	public boolean addBookFine(int bookid,int fine);
	public boolean addBookFine(Bookform bookform,int fine);
	public boolean addBookFineType(int bookid,int fineType);
	public boolean addBookFineType(Bookform bookform,int fineType);
}
