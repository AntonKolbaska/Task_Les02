package by.htp.conf02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int counter=0;
		if(a<0) {
			++counter;
		}
		if(b<0) {
			++counter;
		}
		if(c<0) {
			++counter;
		}
		
		System.out.println(counter);
		sc.close();
	}

}
