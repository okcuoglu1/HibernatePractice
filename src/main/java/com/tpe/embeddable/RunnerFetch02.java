package com.tpe.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer02.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();



      //id'si 1 olan developerın tüm bilgilerini yazdırmak istesek
      Developer02 dev1 = session.get(Developer02.class,1);
        System.out.println(dev1);

      //id'si 1 olan developerın sadece eğitim bilgilerini yazdırmak istesek.
        System.out.println(dev1.getEducation());


        tx.commit();
        session.close();
        sf.close();





    }

}
