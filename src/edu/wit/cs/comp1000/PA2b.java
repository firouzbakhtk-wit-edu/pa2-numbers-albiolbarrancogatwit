package edu.wit.cs.comp1000;
import java.lang.Math;
import java.util.Scanner;

/**
 * Solution to the 2nd programming assignment, part b.
 */
public class PA2b {

	/**
	 * When the code runs, it asks the user to input a, b and c.
	 * Then, it determines whether the discriminant is real or not.
	 * If it isn't, it just states that the roots are imaginary.
	 * Otherwise, it then calculates the roots.
	 * If the roots are equal, it just prints out "Root: " and then the root.
	 * Otherwise, it prints "Roots:" and then both roots.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double discriminant = (b*b)-(4*a*c);
		if (discriminant >= 0) {
			double root1 = (((-b) - Math.sqrt(discriminant))/(2*a));
			double root2 = (((-b) + Math.sqrt(discriminant))/(2*a));
			if (root1 == root2) {
				System.out.printf("Root: %.2f%n",root1);
			}
			else {
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
			}
		}
		else {
			System.out.printf("Roots: imaginary%n");
		}
		
	}

}
