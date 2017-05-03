package com.etc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil{
	private static SessionFactory sessionFactory;
	private static Session session;

	static{
		//第一步:读取Hibernate的配置文件  hibernamte.cfg.xml文件
        Configuration configuration = new Configuration().configure();
        //第二步:创建服务注册构建器对象，通过配置对象中加载所有的配置信息,
        //创建注册服务
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        //第三步:创建会话工厂
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	//返回会话工厂
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//返回会话对象
	public static Session getSession(){
		session = sessionFactory.openSession();
		return session;
	}
	
	//关闭会话对象
	public static void closeSession(Session session)
	{
		if (session!=null) {
			session.close();
		}
	}
	
}