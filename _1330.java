package baekjoon;

import java.util.Scanner;

public class _1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
//		System.out.println("n1 입력: ");
		n1 = sc.nextInt();
//		System.out.println("n2 입력: ");
		n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println(">");
		}
		else if (n1 < n2) {
			System.out.println("<");
		}
		else if (n1 == n2) {
			System.out.println("==");
		}
		
		sc.close();
	}

}
