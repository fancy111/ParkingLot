package com.etc.Service.Impl;

import com.etc.Dao.BookDecompDao;
import com.etc.Dao.BookFormDao;
import com.etc.Dao.RentFormDao;
import com.etc.Dao.StrategyDao;
import com.etc.Service.BookService;

public class BookServiceImpl implements BookService
{
	private StrategyDao strategyDao;
	private BookFormDao bookFormDao;
	private RentFormDao rentFormDao;
	private BookDecompDao  bookDecompDao;
}
