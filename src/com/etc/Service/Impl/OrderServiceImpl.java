package com.etc.Service.Impl;

import com.etc.Dao.BookDecompDao;
import com.etc.Dao.BookFormDao;
import com.etc.Dao.CarDao;
import com.etc.Dao.ParkingDao;
import com.etc.Dao.ParkingSetDao;
import com.etc.Dao.RentFormDao;
import com.etc.Dao.UserDao;
import com.etc.Service.OrderService;

public class OrderServiceImpl implements OrderService
{
	private BookFormDao bookFormDao;
	private BookDecompDao bookDecompDao;
	private ParkingDao parkingDao;
	private ParkingSetDao parkingSetDao;
	private RentFormDao rentFormDao;
	private UserDao userDao;
}
