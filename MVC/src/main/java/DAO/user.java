package DAO;
import java.util.Date;



import org.springframework.stereotype.Repository;

import DAO.Processor;

import javax.validation.constraints.Past;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table( name ="APP_USER" ,schema = "claim")
public class user {

	
	@Id 
	@Column(name ="U_ID")
	private	int uid;
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	@OneToOne
	@JoinColumn(name = "PID")
	Processor P;
	
	@NotNull
	String username =null ;
	@NotNull
	String password;
	public Processor getP() {
		return P;
	}


	public void setP(Processor p) {
		P = p;
	}


	@NotNull
	String email;
	@Past @NotNull
	Date DOB;
	
	public user()
	{
		
		System.out.println("a");
		
	}
	
	
	public user(String username, String password, String email, Date dob){
		
		this.email = email;
		this.username = username;
		this.DOB = dob;
		this.password = password;
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}

public String toString()
{
return uid+password;	

}
	

	
}
