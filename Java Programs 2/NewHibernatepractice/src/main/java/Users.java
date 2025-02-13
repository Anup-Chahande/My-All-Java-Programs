import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Users {
@Id
	int Userid;
	String name;
	int age;	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Userid")
	List<Products> lp;
	
	public Users(int productid, String name, int age, List<Products> lp) {
		super();
		this.Userid = productid;
		this.name = name;
		this.age = age;
		this.lp = lp;
	}
	
	public Users(int productid, String name, int age) {
		super();
		this.Userid = productid;
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "Users [productid=" + Userid + ", name=" + name + ", age=" + age + ", lp=" + lp + "]";
	}
	public int getProductid() {
		return Userid;
	}
	public void setProductid(int productid) {
		this.Userid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Products> getLp() {
		return lp;
	}
	public void setLp(List<Products> lp) {
		this.lp = lp;
	}
	
	
}
