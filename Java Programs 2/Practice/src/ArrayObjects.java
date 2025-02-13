
public class ArrayObjects {
int id;
String name;
	public ArrayObjects(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	public static void main(String[] args) {
	
		ArrayObjects e1 = new ArrayObjects(1,"Anup");
		ArrayObjects e2 = new ArrayObjects(2,"Anup");
		ArrayObjects e3 = new ArrayObjects(3,"Anup");
		ArrayObjects e4 = new ArrayObjects(4,"Anup");
		
		
		ArrayObjects  obbjects [] = {e1,e2,e3,e4};

		
		for (ArrayObjects arrayObjects : obbjects) {
			System.out.println(arrayObjects);
		}
	
	
}
	@Override
	public String toString() {
		return "ArrayObjects [id=" + id + ", name=" + name + "]";
	}
}
