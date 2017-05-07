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

	//添加订单
	@Override
	public boolean addBook(Bookform bookform) {
		// TODO Auto-generated method stub
		if(saveEntity(bookform)){
			return true;
		}else{
			return false;
		}
	}

	//根据订单id删除订单
	@Override
	public boolean deleteBook(int bookid) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(bookid);
		if (deleteEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean deleteBook(Bookform bookform) {
		// TODO Auto-generated method stub
		if (deleteEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	//修改费用
	@Override
	public boolean addBookFee(int bookid, int fee) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(bookid);
		bookform.setBookFormFee(fee);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean addBookFee(Bookform bookform, int fee) {
		// TODO Auto-generated method stub
		bookform.setBookFormFee(fee);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	//修改支付状态
	@Override
	public boolean addBookFeeState(int bookid, int payState) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(bookid);
		bookform.setBookFormPayState(payState);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean addBookFeeState(Bookform bookform, int payState) {
		// TODO Auto-generated method stub
		bookform.setBookFormPayState(payState);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	//修改罚款
	@Override
	public boolean addBookFine(int bookid, int fine) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(bookid);
		bookform.setBookFormFine(fine);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean addBookFine(Bookform bookform, int fine) {
		// TODO Auto-generated method stub
		bookform.setBookFormFine(fine);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	
	//修改罚款类型
	@Override
	public boolean addBookFineType(int bookid, int fineType) {
		// TODO Auto-generated method stub
		Bookform bookform = loadEntity(bookid);
		bookform.setBookFormFineType(fineType);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean addBookFineType(Bookform bookform, int fineType) {
		// TODO Auto-generated method stub
		bookform.setBookFormFineType(fineType);
		if (updateEntity(bookform)) {
			return true;
		}else{
			return false;
		}
	}

}
