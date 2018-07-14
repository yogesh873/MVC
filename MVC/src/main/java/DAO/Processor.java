package DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "PROCESSOR" ,schema = "CLAIM")
public class Processor {

	@Id
	int prcsrid;
	
	String frstnm;
	
	
	String lstnm;
	
	int ROLECD;
	
	public int getPrcsrid() {
		return prcsrid;
	}

	public void setPrcsrid(int prcsrid) {
		this.prcsrid = prcsrid;
	}

	public String getFrstnm() {
		return frstnm;
	}

	public void setFrstnm(String frstnm) {
		this.frstnm = frstnm;
	}

	public String getLstnm() {
		return lstnm;
	}

	public void setLstnm(String lstnm) {
		this.lstnm = lstnm;
	}

	public int getROLECD() {
		return ROLECD;
	}

	public void setROLECD(int rOLECD) {
		ROLECD = rOLECD;
	}


	
	
}
