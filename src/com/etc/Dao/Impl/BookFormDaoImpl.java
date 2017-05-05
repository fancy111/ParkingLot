package com.etc.Dao.Impl;

import java.util.Date;
import java.util.List;

import com.etc.Dao.BookFormDao;

import hibernate.Bookform;

public class BookFormDaoImpl extends BaseDaoImpl<Bookform> implements BookFormDao{

	//根据订单Id修改订单开始时间和结束时间
	@Override
	public Bookform renewParkingSet(String bookFormid, Date bookDate, Date endDate) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(Bookform.class, bookFormid);
		bookform.setBookFormStartTime(bookDate);
		bookform.setBookFormEndTime(endDate);
		updateEntity(bookform);
		return bookform;
	}

	@Override
	public Bookform renewParkingSet(Bookform bookForm, Date bookDate, Date endDate) {
		// TODO Auto-generated method stub
		Bookform book = loadEntity(Bookform.class,bookForm.getBookFormId());
		book.setBookFormStartTime(bookDate);
		book.setBookFormEndTime(endDate);
		updateEntity(book);
		return book;
	}

	//根据订单Id设置订单的支付状态
	@Override
	public Bookform setBookPayStatus(String bookFormID, int status) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(Bookform.class,bookFormID);
		bookform.setBookFormPayState(status);
		updateEntity(bookform);
		return bookform;
	}

	@Override
	public Bookform setBookPayStatus(Bookform bookform, int status) {
		// TODO Auto-generated method stub
		Bookform book = loadEntity(Bookform.class, bookform.getBookFormId());
		book.setBookFormPayState(status);
		updateEntity(book);
		return book;
	}

	//根据开始时间和结束时间查询停车场个数
	@Override
	public int ParkingNum(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		String where = "where BookForm_StartTime> ? and BookForm_EndTime<?";
		List<Bookform> list = loadListEntitys(where, startDate,endDate);
		if (list.isEmpty()) {
			return 0;
		}
		return list.size();
	}

	//根据开始时间和结束时间查询该时间段所有订单详情
	@Override
	public List<Bookform> ParkingDetail(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		String where = "where BookForm_StartTime> ? and BookForm_EndTime<?";
		List<Bookform> list = loadListEntitys(where, startDate,endDate);
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

	//根据停车场Id查询所有订单
	@Override
	public List<Bookform> getALLBookForm(int parkinglotid) {
		// TODO Auto-generated method stub
		String where = "where BookForm_ParkingLotid = ?";
		List<Bookform> list = loadList(where, parkinglotid);
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}

}
