package Onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Adharcard {
	@Id
	int adharid;
	String date;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cusid")
	Customer c;

	public Adharcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adharcard(int adharid, String date, Customer c) {
		super();
		this.adharid = adharid;
		this.date = date;
		this.c = c;
	}



	public Adharcard(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Adharcard [adharid=" + adharid + ", date=" + date + ", c=" + c + "]";
	}

	public int getAdharid() {
		return adharid;
	}

	public void setAdharid(int adharid) {
		this.adharid = adharid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}
}
