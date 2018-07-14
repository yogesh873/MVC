package Service;

import DAO.useraccess;

import java.util.List;

import DAO.usercomparator;
import Validation.Loginbean;
import DAO.user;

public class Checkdetails {
	
	usercomparator uc = new usercomparator();
	
	
	public static void main(String[] args)
	
	{
		
		System.out.println("previous class");
		
	}
	//List<Loginbean> userlist = useraccess.populate(); 
	/*
	public boolean validate (Loginbean u)
	{
		for(Loginbean u1: userlist)
		{System.out.println(u1.getUsername()+u1.getPassword()+uc.compare(u1,u));
			if(uc.compare(u1,u)== 0)
				return true;
			
		
		}
		
		return false;
		*/
	}
	
	


