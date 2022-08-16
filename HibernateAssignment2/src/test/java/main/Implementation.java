package main;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Cust;
import model.Locker;
import util.HibernateUtil;

public class Implementation {
public static String line() {
	return "--------------------------------------------------";
}
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		org.hibernate.Transaction t = session.beginTransaction();
		Cust c=new Cust();
		
		c.setCustId(344434);
		c.setCustName("yash");
		c.setAddress("Maharashtra");
		 c.setDob(new java.sql.Date(1998, 03, 10));
		 c.setMobileNumber("9889988998");
		 
		 Locker lock=new Locker();
		 lock.setLockerId("001");
		 lock.setRent(5500);
		 lock.setLockerType("big");
		 
		 c.setLocker(lock);

//		 
		 
		
			session.save(c); 
	 line();
			Cust customer = session.get(Cust.class, 344434);
			
			System.out.println(customer);
			line();
			t.commit();

			session.close();

		
		
	}

}
