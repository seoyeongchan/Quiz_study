package baekjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;


/*문제
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.

교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

입력
입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

출력
출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.*/

public class _5597 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> st = new ArrayList<Integer>();	// 과제 제출한 학생 리스트 만들기
		HashSet<Integer> student = new HashSet<Integer>();	// 전체학생 리스트만들기 (중복이 안되므로 set)
		
		while(student.size() < 28) {	
			int i = ran.nextInt(30)+1;	
			student.add(i);
		}
		for(int i = 1; i<=30; i++) {
			st.add(i);
		}
		
		st.removeAll(student);	// 전체학생 리스트에서 과제 제출한 학생 리스트를 제거 하면 2명만 남는다
//		System.out.println("낸 사람 : " + student);	// 과제 제출한 학생
		System.out.println(st.get(0));	// 제출하지 않은 학생 번호 출력
		System.out.println(st.get(1));	// 제출하지 않은 학생 번호 출력

		
		sc.close();
	}

}
