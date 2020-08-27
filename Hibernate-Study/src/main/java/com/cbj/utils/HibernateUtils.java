package com.cbj.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author cbjun
 * @create 2020/8/27 15:26
 */
public class HibernateUtils {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }
}