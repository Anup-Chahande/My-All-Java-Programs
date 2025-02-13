package Proj;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
    @Id  
	int facultyid;
	String facultyname;
 @OneToMany(cascade = CascadeType.ALL)
    
    public Faculty(int facultyid, String facultyname) {
		super();
		this.facultyid = facultyid;
		this.facultyname = facultyname;
	}
	@Override
	public String toString() {
		return "Faculty [facultyid=" + facultyid + ", facultyname=" + facultyname + "]";
	}
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
public Faculty() {
	super();
	// TODO Auto-generated constructor stub
}

}
