import java.util.Scanner;

/*
 * @author DerfelTercian
 * @version 0.1
 * This calculates the gpa of a person
 * 
 * 
 */
public class GpaCalc {
	public static double averageGrade(double grade1,double grade2,double grade3) {
		double x = (grade1+grade2+grade3)/3;
		return x;
	}
	public static void printAverage(double grade1,double grade2, double grade3) {
		System.out.println(averageGrade(grade1,grade2,grade3));
	}
	public static void main(String[] args) {
		double grade1=4.0;
		double grade2=4.1;
		double grade3=4.0;
		printAverage(grade1,grade2,grade3);
	}

}