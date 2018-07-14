package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Validation.Loginbean;
import DAO.user;

@Component
public class useraccess {

	@Autowired
	SessionFactory sf;
	
	
	public boolean validate(Loginbean lb)
	{
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
	System.out.println("getting user");	
		
	user u = s.get(user.class,lb.uid);	
	//System.out.println(" user ="+u.getUid());
	
	t.commit();	
	if(u!=null){
		System.out.println(u.getPassword()+"lb"+lb.getPassword()+u);
	if( u.getPassword().equals(lb.getPassword())){
	s.close();
		return true;
	}
	
	}
	
		
	s.close();
		return false;
	
	
	
	}
	
/*	
static List<Loginbean>	u = new ArrayList<>();
static Date dob1 ,dob2,dob3;



public static List<Loginbean>  populate(){

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
    try {  
  	 
	   //String to date conversion
     dob1 = sdf.parse("25-10-1991");  
     dob2 = sdf.parse("25-10-1991");
     dob3 = sdf.parse("25-10-1991");
         
    } catch (ParseException e) {
	     e.printStackTrace();
	  }  

user u1 = new user("yogesh", 12345,"ykyog@gmail.com" ,dob1);
user u2 = new user("Pintu", 54321,"ykyog1@gmail.com" , dob2);
user u3 = new user("Arpan",996220,"Arpan@gmail.com" , dob3);

Loginbean l1 = new Loginbean("yogesh", 12345);
Loginbean l2 = new Loginbean("Pintu", 54321);
Loginbean l3 = new Loginbean("Arpan",996220);




u.add(l1);
u.add(l2);
u.add(l3);

return u;

}
*/
}
