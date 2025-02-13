package GradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
void m1() {
      System.out.println("Enter the exam Score");
	Scanner sc = new Scanner(System.in);
	int Score = sc.nextInt();
	if(Score>=90 && Score<=100) {
		System.out.println("Your grate is 'A' ");
		
	}
	else if(Score>=80 && Score<90 ) {
		System.out.println("Your grate is 'B' ");
		

	}
	else if(Score>=70 && Score<80) {
		System.out.println("Your grate is 'C' ");

	}
	else if(Score>=60 && Score<70) {
		System.out.println("Your grate is 'D' ");

	}
	else if(Score>=101 || Score<0) {
		System.out.println("Plese Enter Valid Score ");

	}
	else {
		System.out.println('F');
		
	}
	
}
public static void main(String[] args) {
	GradeCalculator gc = new GradeCalculator();
	gc.m1();
}
}
