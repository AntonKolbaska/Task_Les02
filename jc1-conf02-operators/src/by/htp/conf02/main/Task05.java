package by.htp.conf02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a>b) {
			System.out.println("First is smaller");
		}
		else {
			System.out.println("First is bigger");
		}
		sc.close();

	}

}
