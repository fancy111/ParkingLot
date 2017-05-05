package com.etc.Dao;

import java.util.List;

import hibernate.Bookdecomp;
import hibernate.Rentform;

public interface RentFormDao extends BaseDao<Rentform>
{
	public List<Bookdecomp> GetAllRentDetail(Rentform rentform);
	public List<Bookdecomp> GetAllRentDetail(String Rentid);

	//in OrderManageService
	public List<Rentform> GetAllRentForm(int parkingLotid);
}
