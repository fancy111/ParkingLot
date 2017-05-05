package com.etc.Dao.Impl;

import java.util.Date;
import java.util.List;

import com.etc.Dao.BookDecompDao;

import hibernate.Bookdecomp;
import hibernate.User;

public class BookDecompDaoImpl extends BaseDaoImpl<Bookdecomp> implements BookDecompDao {

	@Override
	public List<Bookdecomp> getTodayRent(int UserID, Date date) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Bookdecomp> getTodayRent(User user, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ParkingNum(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Bookdecomp> ParkingDetail(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
