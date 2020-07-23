package by.htp.conf02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		while(a<0) {
			System.out.println("Wrong angle, try again: ");
		}
		double b = sc.nextDouble();
		while(b<0) {
			System.out.println("Wrong angle, try again: ");
		}
		System.out.println("Exists?");
		if(a+b<180) {
			System.out.println("YES\nRight?");
			if(a==90 || b==90 || (a+b)==90) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
		sc.close();

	}

}
