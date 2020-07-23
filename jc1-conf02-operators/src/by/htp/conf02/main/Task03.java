package by.htp.conf02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		
		System.out.println("Kb: " + a/1024);
		System.out.println("Mb: " + a/(1024*1024));
		System.out.println("Gb: " + a/(1024*1024*1024));
		System.out.println("Tb: " + a/Math.pow(1024, 4));
		sc.close();

	}

}
