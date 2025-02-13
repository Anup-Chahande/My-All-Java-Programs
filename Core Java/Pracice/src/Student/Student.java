package Student;

public class Student {
   private String  Sname;
   private int sid;
   private int age;
   private String Branch;
   
	
	public String getSname() {
		
		return Sname;
	}

	public int getsid() {
		
		return sid;
		
		
	}
	public int getSage() {
		
		return age;
	}
public String getBranch() {
		
		return Branch;
	}
	public void SetBranch(String Branch) {
		this.Branch=Branch;
		
	}

	public void Setsid(int sid) {
		this.sid=sid;
		
	}
	public void Setage(int age) {
		this.age=age;
		
	}public void Setname(String Sname) {
		this.Sname=Sname;
		
	}
	@Override
	public String toString() {
		
		return Sname + " "+ age  + "  " + sid + "  " + Branch;
	}
	
	
	
}
