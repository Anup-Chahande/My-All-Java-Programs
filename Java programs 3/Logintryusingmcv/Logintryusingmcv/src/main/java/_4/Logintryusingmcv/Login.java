package _4.Logintryusingmcv;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	int id;
	String uname;
	String password;

	public Login() {
		super();
	}

	public Login(int id, String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}

	public int getid() {
		return id;
	}

	public int setid(int id) {
		return this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
