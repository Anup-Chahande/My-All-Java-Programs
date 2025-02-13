package com.NewSpringMvc;

public class Entity {
String uname;
String Password;
@Override
public String toString() {
	return "Entity [uname=" + uname + ", Password=" + Password + "]";
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

}
