package by.htp.conf02.main;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int nod = 1;
		if(a>b) {
			for(int i=1; i<b+1; ++i) {
				if(a%i == 0 && b%i == 0) {
					nod = i;
				}
			}
		}
		else {
			for(int i=1; i<a+1; ++i) {
				if(a%i == 0 && b%i == 0) {
					nod = i;
				}
			}
		}
		System.out.println(nod);
		sc.close();
	}

}
