package com.etc.Dao.Impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.etc.Dao.BaseDao;
import com.etc.util.HibernateUtil;

public class BaseDaoImpl<T> implements BaseDao<T>
{
	//泛型反射类
	private Class<T> entityClass;
	
	private Session session = null;
	private Transaction transaction = null;
	
	/**
	 * 构造函数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		//通过反射获取子类确定的泛型类
		entityClass = (Class<T>)(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	/**
	 * 增加一个对象
	 * @param t 添加的对象
	 * @return 添加是否成功
	 */
	@Override
	public boolean saveEntity(T t) {
		//储存插入结果成功或者失败
		boolean result = false;
		try{
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			//保存该entity
			session.save(t);
			transaction.commit();
			result = true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			//事务回滚
			transaction.rollback();
			throw e;
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return result;
	}

	/**
	 * 更新一个对象
	 * @param t  更新的对象
	 * @return 更新是否成功
	 */
	@Override
	public boolean updateEntity(T t) {
		//储存更新结果成功或者失败
		boolean result = false;
		try{
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			//更新该entity
			session.update(t);
			transaction.commit();
			result = true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			//事务回滚
			transaction.rollback();
			throw e;
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return result;
	}

	/**
	 * 删除一个对象
	 * @param t  删除的对象
	 * @return 删除是否成功
	 */
	@Override
	public boolean deleteEntity(T t) {
		//储存删除结果成功或者失败
		boolean result = false;
		try{
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			//删除该entity
			session.delete(t);
			transaction.commit();
			result = true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			//事务回滚
			transaction.rollback();
			throw e;
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return result;
	}

	/**
	 * 通过主键删除一个对象
	 * @param id 删除的对象id
	 * @return 删除是否成功
	 */
	@Override
	public boolean deleteEntityById(Serializable id) {
		//储存删除结果成功或者失败
		boolean result = false;
		result = deleteEntity(this.loadEntity(id));
		return result;
	}

	/**
	 * 通过主键得到一个指定类型的对象
	 * @param class1 查找的对象类型
	 * @param id 查找的对象id
	 * @return 找到的对象
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T loadEntity(Class<T> class1, Serializable id) {
		try{
			session = HibernateUtil.getSession();
			if(!session.isConnected())
				session = HibernateUtil.getSessionFactory().openSession();
			//查找该id的对象
			T t = (T)session.get(class1, id);
			return t;
		}
		catch(HibernateException e){
			e.printStackTrace();
			return null;
		}
		finally{
			HibernateUtil.closeSession(session);
		}
	}

	/**
	 * 通过主键得到一个对象
	 * @param id 对象的主键
	 * @return 查询到的对象
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T loadEntity(Serializable id) {
		try{
			session = HibernateUtil.getSession();
			if(!session.isConnected())
				session = HibernateUtil.getSessionFactory().openSession();
			//查找该id的对象
			T t = (T)session.get(entityClass, id);
			return t;
		}
		catch(HibernateException e){
			e.printStackTrace();
			return null;
		}
		finally{
			HibernateUtil.closeSession(session);
		}
	}

	/**
	 * 加载所有对象，得到对象列表
	 * @return 对象列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> loadListEntitys() {
		try{
			session = HibernateUtil.getSession();
			if(!session.isConnected())
				session = HibernateUtil.getSessionFactory().openSession();
			//创建query
			return (List<T>)session.createQuery("from" + entityClass.getSimpleName()).list();
		}
		catch(HibernateException e){
			e.printStackTrace();
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	/**
	 * 根据where语句查询符合条件的对象列表
	 * @param where 条件查询语句
	 * @param params sql语句中对应的参数
	 * @return 对象列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> loadListEntitys(String where, Object... params) {
		try{
			session = HibernateUtil.getSession();
			if(!session.isConnected())
				session = HibernateUtil.getSessionFactory().openSession();
			//创建query
			Query query = session.createQuery("from" + entityClass.getSimpleName() + " " + where);
			//设置查询语句的参数
			for (int i=0;i<params.length;i++)
			{
				query.setParameter(i, params[i]);
			}
			return (List<T>)(query.list());
		}
		catch(HibernateException e){
			e.printStackTrace();
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	/**
	 * 根据sql语句查询符合条件的对象列表
	 * @param Allsql sql语句
	 * @param params sql语句中对应的参数
	 * @return 对象列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> loadList(String Allsql, Object... params) {
		try{
			session = HibernateUtil.getSession();
			if(!session.isConnected())
				session = HibernateUtil.getSessionFactory().openSession();
			//创建query
			Query query = session.createQuery(Allsql);
			//设置查询语句的参数
			for (int i=0;i<params.length;i++)
			{
				query.setParameter(i, params[i]);
			}
			return (List<T>)(query.list());
		}
		catch(HibernateException e){
			e.printStackTrace();
		}
		finally{
			HibernateUtil.closeSession(session);
		}
		return null;
	}

}
