package main;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Director;
import model.Holywood;
import model.Movie;
import util.HibernateUtil;

public class Imple1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
//		
//		Director dir1=new Director("D101","Chris Columbus",1958);
//		Director dir2=new Director("D102","Patrick Read Johnson",1962);
//		Director dir3=new Director("D103","Aamir Khan",1965);
//		Director dir4=new Director("D104","R. Balki",0);
//		//session.save(dir1);session.save(dir2);session.save(dir3);session.save(dir4);
//		
//		
//		Movie m=new Movie("M1001","Home Alone","English",1990,476700000,dir1);
//		Movie m1=new Movie("M1002","Home Alone","English",1992,358900000,dir1);
//		Movie m2=new Movie("M1003","Baby's Day Out","English",1994,16800000,dir2);
//		Movie m3=new Movie("M1004","Taare Zameen Par","Hindi",2007,13000000,dir3);
//		Movie m4=new Movie("M1005","Paa","Hindi",2009,4700000,dir4);
//		session.save(m);session.save(m1);session.save(m2);session.save(m3);session.save(m4);
		
		
		String language ="English";
		Query query1=session.createQuery("from Movie m where m.language=:lang");
		query1.setString("lang", language);
		List list = query1.list();
		for (Object l : list) {
			// System.out.println(l.toString());
		}
		
		
		String director = "Chris Columbus";
		Query query = session.createQuery("from Movie m where m.directorId.directorName=:dir");
		query.setString("dir", director);
		List list2 = query.list();
		for (Object l : list2) {
			//System.out.println(l.toString());
		}
		
				
		
		Query q2=session.createQuery("update Movie set revenueInDollars=revenueInDollars +10000 where movieName=:mn");
		q2.setParameter("mn","Paa");
	//q2.executeUpdate();
	  
	  
	  Query q4=session.createQuery("delete from Movie m where m.movieId=:id");
	  q4.setParameter("id","M1004");
		//q4.executeUpdate();
		
	
		
		Query q5=session.createQuery("select DISTINCT(language) from Movie ");
		List opList = q5.getResultList();
		//System.out.println(opList);
		
		
		
		Query q7 = session.createQuery("select m.moviename, m.directorId.directorId from Movie m");
		List<Object[]> list7 = q7.list();
		for(Object[] string : list7) {
			System.out.println("Movie Name : "+string[0]+", Director Name : "+string[1]);
		}
		
		
		t.commit();
	
	}}

