package by.htp.conf02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A, B:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("x, y, z:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		if ((x < a && y < b) || (x < b && y < a)) {
			System.out.println("YES");
		}
		else if ((x < a && z < b) || (x < b && z < a)) {
			System.out.println("YES");
		}
		else if ((y < a && z < b) || (y < b && z < a)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}

}
