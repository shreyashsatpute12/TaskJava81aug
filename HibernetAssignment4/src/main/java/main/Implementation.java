package main;



import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import model.Director;
import model.Movie;
import util.HibernateUtil;

public class Implementation {
public static void main(String[] args) {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	
	
	Query q1=session.createQuery("select max(revenueInDollars) from Movie");
    List opList = q1.list();
	System.out.println("Maximum Revenue : "+opList);
	
	
	Query q2=session.createQuery("select min(revenueInDollars) from Movie");
    List opList1 = q2.list();
	System.out.println("Minimum Revenue: "+opList1);
	
	Query q3=session.createQuery("select sum(revenueInDollars) from Movie");
    List opList3 = q3.list();
	System.out.println("Sum of the Revenue :"+opList3);
	
	
	Query q4=session.createQuery("select avg(revenueInDollars) from Movie");
    List opList4 = q4.list();
	System.out.println("Average of the revenue: "+opList4);
	
	Query q5=session.createQuery("select count(*) from Movie where language=:lang");
	q5.setParameter("lang", "English");
    List opList5 = q5.list();
	System.out.println("English Movies Count"+opList5);
	
}
}
