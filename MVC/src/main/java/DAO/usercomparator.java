package DAO;

import java.util.Comparator;

import Validation.Loginbean;

public class usercomparator implements Comparator<Loginbean> {

	@Override
	public int compare(Loginbean u1, Loginbean u2) {
		
		System.out.println("previous class");
		// TODO Auto-generated method stub
		//return ((u1.username.compareTo(u2.username))+ ((u1.password == u2.password)?0:1));
		return 0;
	}

}
