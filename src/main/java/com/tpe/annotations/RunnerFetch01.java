package com.tpe.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch01 {

    public static void main(String[] args) {


        Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer01.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        Developer01 dev=session.get(Developer01.class,1);
        System.out.println(dev);

        //1-sql ile tüm datayı çekiniz.
//        String sqlQuery1="SELECT * FROM t_developer01";
//        List<Object[]> resultList=session.createSQLQuery(sqlQuery1).getResultList();
//        System.out.println("------SQL----------");
//        for (Object[] r:resultList ){
//            System.out.println(Arrays.toString(r));
//        }

        //2-hql ile tüm datayı çekiniz.
//        String hqlQuery1="FROM Developer01";
//        List<Developer01> devList=session.createQuery(hqlQuery1, Developer01.class).getResultList();
//        System.out.println("------HQL----------");
//        devList.forEach(t-> System.out.println(t));

        //***ÖDEV***
        //3-hql ile ismi 'Shrek' olan datayı çekiniz.
        //4-hql ile emaili 'jack@gmail.com' olan datayı çekiniz.
        //5-hql ile branch i backend olan datanın ismini getiriniz.

//        System.out.println("**************************");
//        String hqlQuery2="FROM Developer01 WHERE name='Shrek'";
//        List<Developer01> devlist2 = session.createQuery(hqlQuery2,Developer01.class).getResultList();
//        devlist2.forEach(t-> System.out.println(t));

//        String hqlQuery3="FROM Developer01 WHERE email='jack@gmail.com'";
//        List<Developer01> devlist3 = session.createQuery(hqlQuery3,Developer01.class).getResultList();
//        devlist3.forEach(t-> System.out.println(t));

        String hqlQuery4="FROM Developer01 WHERE branch='backend'";
        List<Developer01> devlist4 = session.createQuery(hqlQuery4,Developer01.class).getResultList();
        devlist4.forEach(t-> System.out.println(t));




        tx.commit();
        session.close();
        sf.close();



    }



}
