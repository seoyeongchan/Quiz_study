package baekjoon;

import java.util.Scanner;

public class _14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n1 입력:");
		int x = sc.nextInt();
		System.out.println("n2 입력:");
		int y = sc.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1");
		}
		else if (x<0 && y>0) {
			System.out.println("2");
		}
		else if (x<0 && y<0) {
			System.out.println("3");
			
		}
		else if (x>0 && y<0) {
			System.out.println("4");
		}
		sc.close();
	}

}
