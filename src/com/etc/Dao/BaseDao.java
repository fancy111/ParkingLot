package com.etc.Dao;

import java.io.Serializable;
import java.util.List;



public interface BaseDao<T> 
{
	boolean saveEntity(T t);
	boolean updateEntity(T t);
	boolean deleteEntity(T t);
	boolean deleteEntityById(final Serializable id);
	T loadEntity(Class<T> class1,Serializable id);
	T loadEntity(final Serializable id);
	List<T> loadListEntitys();
	List<T> loadListEntitys(String where,Object ...params);
	List<T> loadList(String Allsql,Object ...params);
}
