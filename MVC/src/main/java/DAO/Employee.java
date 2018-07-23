package DAO;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;


/*
EMPNO	NUMBER(4,0)	No	-	1
ENAME	VARCHAR2(10)	Yes	-	-
JOB	VARCHAR2(9)	Yes	-	-
MGR	NUMBER(4,0)	Yes	-	-
HIREDATE	DATE	Yes	-	-
SAL	NUMBER(7,2)	Yes	-	-
COMM	NUMBER(7,2)	Yes	-	-
DEPTNO	NUMBER(2,0)	Yes	-	-
*/
@Entity
@Table( name = "EMP",schema ="claim")
public class Employee {

	@Id
	int empno;
	String ename;
	String job;
	Integer mgr;
	Date Hiredate;
	double sal;
	
	Double comm;
	
	@OneToOne
	Department  dep;
	
	@OneToMany(mappedBy ="emp")
	List<Laptop> ltop;
	
	public List<Laptop> getLtop() {
		return ltop;
	}


	public void setLtop(List<Laptop> ltop) {
		this.ltop = ltop;
	}


	public Employee(){
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		if(mgr!=null)
		this.mgr = mgr;
		else 
		this.mgr = 0;	
	}
	public Date getHiredate() {
		return Hiredate;
	}
	public void setHiredate(Date hiredate) {
		Hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		
		//if(comm != null)
		this.comm = comm;
		//else 
		//comm =0.0;	
	}
	
	
	public Department getDep() {
		return dep;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}


	@Override
	public String toString()
	{
		return "Employe:"+empno ;
		
	}
	
}
