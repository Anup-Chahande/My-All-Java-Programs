package Advancehardorogram;

public class ownfindno {

	static int myownnumfind(int index, int arr[]) {

		return arr[index];

	}
	
	
	void m2() {

		int[] arr = { 1, 2, 3, 4, 6 };

		System.out.println(myownnumfind(2, arr));

	}

	public static void main(String[] args) {
		ownfindno os = new ownfindno();
		os.m2();

	}

}
