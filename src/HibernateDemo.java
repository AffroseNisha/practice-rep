import org.hibernate.cfg.*;
import org.hibernate.*;

public class HibernateDemo {
	public static void main (String []args)
	{
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Employee employee=new Employee();
			employee.setId(1002);
			employee.setName("banu");
			employee.setSalary(7500);
			employee.setAddress("chennai");
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(employee);
			tx.commit();
			session.close();
			System.out.println("Obj saved in DataBase");
			
			
			
		}
		catch(Exception e)
		
		{
System.out.println("Exception arrised"+e);			
		}
	}
	}
