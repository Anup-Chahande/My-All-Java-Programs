package Deafult_Interfeace;

public interface Animal {
	

	default void eating() {
		System.out.print("Animal dog is eating");
	}

}
