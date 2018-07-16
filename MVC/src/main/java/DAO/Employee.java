package DAO;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	double deptno;
	
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
	public int getMgr() {
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
	public double getDeptno() {
		return deptno;
	}
	public void setDeptno(double deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String toString()
	{
		return "Employe:"+empno ;
		
	}
	
}
