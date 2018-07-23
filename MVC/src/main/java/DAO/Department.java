package DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*DEPTNO	NUMBER	-	2	0	1	-	-	-
	DNAME	VARCHAR2	14	-	-	-	nullable	-	-
	LOC	VARCHAR2	13	-*/


@Entity
@Table(name ="DEPT",schema = "claim")
public class Department {

	
	@Id
	int deptno;
	String dname;
	String loc;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
	
}
