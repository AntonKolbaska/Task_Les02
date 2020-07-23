package by.htp.conf02.main;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double result = 1;
		for(int i=1; i<a+1; ++i) {
			result *= i;
		}
		System.out.println(result);
		sc.close();
	}

}
