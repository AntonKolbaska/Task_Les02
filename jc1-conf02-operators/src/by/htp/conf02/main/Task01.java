package by.htp.conf02.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double result=0;
		result = Math.sqrt(b*b+4*a*c);	//sqrt op.
		result = (b+result)/(2*a);		//full fraction
		result = result - a*a*a*c + 1/(b*b);
		
		System.out.println(result);
		sc.close();

	}

}
