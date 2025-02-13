package Hi;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	int id;
	String name;
	String dep;
	
	
	Emp (){};

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Emp(int id, String name, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	

}
