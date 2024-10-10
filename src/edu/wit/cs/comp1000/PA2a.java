package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * Solution to the 2nd programming assignment, part a.
 */
public class PA2a {

	/**
	 * When it runs, it asks the user for 5 whole numbers in the terminal.
	 * After getting them, it outputs the sum of the positive, negative, and all numbers,
	 * and then the average of the positive, negative, and all numbers to the terminal.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		int sum = 0;
		int sumpos = 0;
		int sumneg = 0;
		int cntpos = 0;
		int cntneg = 0;
		int a = 0;
		a = scanner.nextInt();
		sum = sum + a;
		if (a>0) {
			sumpos = sumpos + a;
			cntpos = cntpos + 1;
		}
		else {
			sumneg = sumneg + a;
			cntneg = cntneg + 1;
		}
		a = scanner.nextInt();
		sum = sum + a;
		if (a>0) {
			sumpos = sumpos + a;
			cntpos = cntpos + 1;
		}
		else {
			sumneg = sumneg + a;
			cntneg = cntneg + 1;
		}
		a = scanner.nextInt();
		sum = sum + a;
		if (a>0) {
			sumpos = sumpos + a;
			cntpos = cntpos + 1;
		}
		else {
			sumneg = sumneg + a;
			cntneg = cntneg + 1;
		}
		a = scanner.nextInt();
		sum = sum + a;
		if (a>0) {
			sumpos = sumpos + a;
			cntpos = cntpos + 1;
		}
		else {
			sumneg = sumneg + a;
			cntneg = cntneg + 1;
		}
		a = scanner.nextInt();
		sum = sum + a;
		if (a>0) {
			sumpos = sumpos + a;
			cntpos = cntpos + 1;
		}
		else {
			sumneg = sumneg + a;
			cntneg = cntneg + 1;
		}
		double avgpos;
		double avgneg;
		if (cntpos>0) {
		avgpos = sumpos / (cntpos + 0.0);
		}
		else {
			avgpos = 0.0;
		}
		if (cntneg>0) {
			avgneg = sumneg / (cntneg + 0.0);
			}
			else {
				avgneg = 0.0;
			}
		double avg = sum / 5.0;
		if (cntpos== 1) {
			System.out.printf("The sum of the %d positive number: %d%n", cntpos, sumpos);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", cntpos, sumpos);
		}
		if (cntneg== 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", cntneg, sumneg);
		}
		else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", cntneg, sumneg);
		}
		System.out.printf("The sum of the 5 numbers: %d%n", sum);
		if (cntpos== 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", cntpos, avgpos);
		}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", cntpos, avgpos);
		}
		if (cntneg== 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", cntneg, avgneg);
		}
		else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", cntneg, avgneg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", avg);	
	}

}
