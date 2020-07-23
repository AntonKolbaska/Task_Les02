package by.htp.conf02.main;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("a:");
		double a = sc.nextDouble();
		System.out.println("b:");
		double b = sc.nextDouble();
		System.out.println("h:");
		double h = sc.nextDouble();
		double x= a;
		//[a; 2)
		while(x<2) {
			System.out.println(-x);
			x +=h;
		}
		//{2}
		if(x==2) {
			System.out.println(-x);
		}
		//(2; b)
		while(x<b) {
			System.out.println(x);
		}
		//{b}
		if(x==b) {
			System.out.println(x);
		}
		sc.close();
	}

}
