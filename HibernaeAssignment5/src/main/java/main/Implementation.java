package main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Assets;
import model.Employee;
import util.HibernateUtil;

public class Implementation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		

//		Assets asset=new Assets(01,12345,2113,"Laptop",45000,"Mumbai");
//		session.save(asset);
//		Assets asset1=new Assets(02,56789,1221,"PC",55000,"Pune");
//		Assets asset2=new Assets(03,54321,3232,"Laptop",45000,"Mumbai");
//		Assets asset3=new Assets(04,98765,1212,"Laptop",65000,"Pune");
//		
//		session.save(asset1);session.save(asset2);session.save(asset3);
//		
//		Employee emp=new Employee("Shreyash",101,"Shreyash@",asset);
//		session.save(emp);
//		Employee emp1=new Employee("Yash",102,"yash@",asset1);
//		Employee emp2=new Employee("Shree",103,"Shree@",asset2);
//		
//		session.save(emp1);
//		session.save(emp2);
		
		
		
		
		
		
		
		
		
//		Assets ast = session.get(Assets.class, 01);
//		System.out.println(ast);
//		
		
		
		
		
		
		
		
		
		
		
		
//		Assets ast1=session.load(Assets.class,02);
//		System.out.println(ast1);
//		
		
		
		
		
		
		
		
		
		
//		Query q1=session.createQuery("Select max(assrtPrice)from Assets");
//		List opList = q1.getResultList();
//		System.out.println(opList);
//		
//		
//		
		
		
		
		
		
		
		
		
//		
//		Query q2=session.createQuery("select count(*) from Employee");
//		System.out.println(q2.list());
//		
//		
		
		
		
		
		
		
		
		
//		Query q3=session.createQuery("FROM Employee e ORDER BY e.empName asc");
//		System.out.println(q3.list());
//		
		
		
		
		
		
		
		
		
//		Query q4=session.createQuery("from Employee where empId=:id");
//		q4.setParameter("id",101 );
//		List opList1=q4.getResultList();
//		System.out.println(opList1);
//		
		
		
		
		
		
//		
//		Query q5=session.createQuery("select avg(assrtPrice) from Assets as e  group by e.assetLocation");
//		
//		System.out.println(q5.list());
//		System.out.println("Mumbai    "+"    Pune");
		
		
		
		
		
		
		
		
//		Query q5=session.createQuery("update Employee set password=:pass where empId=:id");
//		q5.setParameter("pass","Shreyash@123");
//		q5.setParameter("id", 101);
//		q5.executeUpdate();
		
		
		
		
		
		
		Query q6=session.createQuery("delete from Employee where empId=:eid");
		q6.setParameter("eid", 103);
		q6.executeUpdate();
		
		t.commit();
		
		
		
	}
}
