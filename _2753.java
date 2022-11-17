package baekjoon;

import java.util.Scanner;

public class _2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도 입력:");
		int year = sc.nextInt();
				
		if (year%4 == 0) {
			if (year%100 != 0 || year%400 == 0) {
				System.out.println("1");
			}
			else {
				
				System.out.println("0");
			}
				
		}
		else{
			System.out.println("0");
		}
		
		sc.close();
	}

}
