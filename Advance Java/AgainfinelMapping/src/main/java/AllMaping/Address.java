package AllMaping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	int addressid;
	String addressname;
	

	public Address() {
		super();
	}

	public Address(int addressid, String addressname) {
		super();
		this.addressid = addressid;
		this.addressname = addressname;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", addressname=" + addressname + "]";
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getAddressname() {
		return addressname;
	}

	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}

}
