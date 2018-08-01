package Service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.Department;
import DAO.Laptop;

@Repository
public class DepartmentCRUD {

	List<Department> deps;
	List<Laptop> lstlptop ;
	
	@Autowired
	SessionFactory sf;
	
public Department getdep(String dname)
{
	Session s = sf.openSession();
	
	TypedQuery<Department> qry = s.createQuery(" select d " +
            " from Department d " +
			" where d.dname like :name ");


	
Department dep = qry.setParameter("name", dname).getSingleResult();

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
	
	public List<Laptop> getdummylaptop()
	{
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		lstlptop.add(l1);
		
		lstlptop.add(l2);
		
		return lstlptop;
		
		
	}
	
}
