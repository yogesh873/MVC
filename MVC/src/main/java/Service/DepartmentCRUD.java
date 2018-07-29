package Service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.Department;

@Repository
public class DepartmentCRUD {

	List<Department> deps;
	
	@Autowired
	SessionFactory sf;
	
public Department getdep(String dname)
{
	Session s = sf.openSession();
	
	TypedQuery<Department> qry = s.createQuery(" select d " +
            " from Department d " +
			" where d.dname like dname ");


Department dep = qry.getSingleResult();

System.out.println(dep);

return dep;
}



public List<Department> getalldep()
{
Session s = sf.openSession();

TypedQuery<Department> qry = s.createQuery(" select d.dname " +
		                                   " from Department d ");


deps =  qry.getResultList();

s.close();

return deps;
}
	
	
	
}
