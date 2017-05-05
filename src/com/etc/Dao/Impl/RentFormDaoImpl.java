package com.etc.Dao.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.etc.Dao.RentFormDao;

import hibernate.Bookdecomp;
import hibernate.Rentform;

public class RentFormDaoImpl extends BaseDaoImpl<Rentform> implements RentFormDao{

	/**
	 * 得到长期租用订单对应的所有分解订单
	 * @param rentform 长期租用订单
	 * @return 分解订单列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Bookdecomp> GetAllRentDetail(Rentform rentform) {
		List<Bookdecomp> bookdecomps = new ArrayList<Bookdecomp>();
		if(rentform.getBookdecomps().isEmpty())
			return null;
		Iterator<Bookdecomp> iterator=rentform.getBookdecomps().iterator();
		while (iterator.hasNext())
		{
			Bookdecomp bookdecomp=(Bookdecomp)iterator.next();
			bookdecomps.add(bookdecomp);
		}
		return bookdecomps;		
	}

	/**
	 * 得到长期租用订单对应的所有分解订单
	 * @param Rentid 长期租用订单id
	 * @return 分解订单列表
	 */
	@Override
	public List<Bookdecomp> GetAllRentDetail(String Rentid) {
		Rentform rentform = this.loadEntity(Rentid);
		return this.GetAllRentDetail(rentform);
	}

	/**
	 * 得到所有在某停车场的长期租用订单
	 * @param parkingLotid 停车场的id
	 * @return 长期租用订单列表
	 */
	@Override
	public List<Rentform> GetAllRentForm(int parkingLotid) {
		String where = "where RentForm_ParkingLotid = ?";
		return this.loadListEntitys(where, parkingLotid);
	}
	
}