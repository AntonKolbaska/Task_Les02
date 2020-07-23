package by.htp.conf02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a>b) {
			System.out.println("8");
		}
		else {
			System.out.println("7");
		}
		sc.close();
	}

}
