package by.htp.conf02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Expression can be simplified to 1/d. If full calculations are important...");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double result=0;
		result =(a*b)/(c*d);
		result = result - (a*b-c)/(c*d);
		System.out.println("Full calc.: " + result);
		System.out.println("1/d: " + 1/d);
		sc.close();

	}

}
