
public class Copy {
	void m1() {
		String first[] = { "amit", "nilesh", "sukshena" };
		String second[] = { "Gaikwad", "dave", "gandhi" };
        
		for (int a = 0; a < first.length; a++) {

			for (int b = 0; b < second.length; b++) {
				if (first[a].length() == second[b].length()) {
					System.out.println(second[b]);
				}
			}
		}

	}

	public static void main(String[] args) {
		Copy c = new Copy();
		c.m1();

	}

}
