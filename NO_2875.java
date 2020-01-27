package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_2875 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int K = scanner.nextInt();
		int cnt =0;
		while(N>=2 && M>=1 && N+M-K>=3) //여학생이 2명이상, 남학생 1명이상, 여+남 - 인턴해야할 인원수가 3명이상인 경우만
			                                                  // 다음 팀을 짤 수 있다.
		{
			N=N-2; // 여학생 2명씩 빼고
			M--; // 남학생 한명씩 빼면서
			cnt++; // 팀수는1++
		}
		
		System.out.println(cnt);
	}

}
