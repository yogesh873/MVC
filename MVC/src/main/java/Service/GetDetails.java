package Service;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.Employee;
@Repository
public class GetDetails {

	@Autowired
	SessionFactory sf;
	
	List<Employee> LOE;
	
	public List<Employee> getallemployee() 
	{
		
		Session s = sf.openSession();
		
	LOE =	(List<Employee>)s.createQuery("Select e " +
				"from Employee e").list();
		
		
		return LOE;
	}
}
