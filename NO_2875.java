package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_2875 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int K = scanner.nextInt();
		int cnt =0;
		while(N>=2 && M>=1 && N+M-K>=3) //���л��� 2���̻�, ���л� 1���̻�, ��+�� - �����ؾ��� �ο����� 3���̻��� ��츸
			                                                  // ���� ���� © �� �ִ�.
		{
			N=N-2; // ���л� 2�� ����
			M--; // ���л� �Ѹ� ���鼭
			cnt++; // ������1++
		}
		
		System.out.println(cnt);
	}

}
