package Accident;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class accident {
	@Id
	   int cid;
	   String name;
	   String ownername;
	   String accidentdate;
	   String accidettime;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return name;
	}
	public void setCname(String cname) {
		this.name = cname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getAccidentdate() {
		return accidentdate;
	}
	public void setAccidentdate(String accidentdate) {
		this.accidentdate = accidentdate;
	}
	public String getAccidettime() {
		return accidettime;
	}
	public void setAccidettime(String accidettime) {
		this.accidettime = accidettime;
	}
	@Override
	public String toString() {
		return "Accidentpojo [cid=" + cid + ", cname=" + name + ", ownername=" + ownername + ", accidentdate="
				+ accidentdate + ", accidettime=" + accidettime + "]";
	}
	public accident(int cid, String cname, String ownername, String accidentdate, String accidettime) {
		super();
		this.cid = cid;
		this.name = cname;
		this.ownername = ownername;
		this.accidentdate = accidentdate;
		this.accidettime = accidettime;
	}
	public accident() {
		super();
	}
}
