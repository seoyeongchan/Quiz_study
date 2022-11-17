package baekjoon;

/*문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.*/


import java.util.Scanner;

public class _2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
//		System.out.println("세자리 정수 n1 입력 : ");
		n1 = sc.nextInt();
//		System.out.println("세자리 정수 n2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println(n1*(n2%10));
		System.out.println(n1*((n2%100)/10));
		System.out.println(n1*((n2%1000)/100));
		System.out.println(n1*n2);
		
		
		sc.close();
	}

}
