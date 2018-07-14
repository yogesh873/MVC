package Validation;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Loginbean {
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	@NotNull
	public	int uid  ;
	@NotNull
	String password;
	
	public Loginbean()
	{
	this.password = null;	
	//default constructor	
		
	}
	
	public Loginbean(int uid, String pwd){
		
		this.uid = uid;
		this.password = pwd;
		
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
