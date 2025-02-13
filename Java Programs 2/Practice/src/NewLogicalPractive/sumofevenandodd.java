package NewLogicalPractive;

public class sumofevenandodd {
	public static void main(String[] args) {
		int sumofeven = 0;
		int sumofodd = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumofeven = i + sumofeven;
			}
			else {
				sumofodd=i+sumofodd;	
			}
		}
		System.out.println(sumofeven + " sum of even");
		System.out.println(sumofodd + " sum of odd");

	}
	

}
