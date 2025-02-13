package NemapPrograms;

public class Frequencyofstring {
	public static void main(String[] args) {

		String str1 = "banana";
		char arr[] = str1.toCharArray();
		int count[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[i] = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count[i]++;
					arr[j] = '0';

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != '0') {

				System.out.println(arr[i] + "=" + count[i]);

			}
		}

	}
}
