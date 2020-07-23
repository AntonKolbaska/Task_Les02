package by.htp.conf02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double x = sc.nextDouble();
		double result;
		if(x>3) {
			result = 1/(x*x*x+6);
		}
		else {
			result = x*x - 3*x +9;
		}
		System.out.println(result);
		sc.close();
	}

}
