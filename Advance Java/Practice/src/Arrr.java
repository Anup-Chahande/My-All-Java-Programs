
public class Arrr {
	void arrmethod(int arr[]) {
//	System.out.println(arr); it will give a memory address
	System.out.println(arr[0]); 

		for (int i : arr) {
		
		System.out.println(i);
		
	}
	
	}

	public static void main(String[] args) {
		Arrr a = new Arrr();
		int k[] = { 1, 2, 3, 4 };
		a.arrmethod(k);

	}
}
