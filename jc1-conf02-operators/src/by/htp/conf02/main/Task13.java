package by.htp.conf02.main;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		while(a<1) {
			System.out.println("Wrong number, try again: ");
			a = sc.nextInt();
		}
		int result = 0;
		for(int i=1; i<a+1; ++i) {
			result +=i;
		}
		System.out.println(result);
		sc.close();
	}

}
