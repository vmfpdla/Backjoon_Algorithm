package Backjoon_Algorithm;

import java.util.Scanner;

//�� �� ���ں��� for�� ������ �� �� ���ں��� ū ��쿡 ���̰� �� ū ��찡 max �� ���ؼ� max �� ��� ��
public class NO_17608 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] h = new int[N];
		int cnt =1;
		for(int i=0;i<N;i++) h[i]=scanner.nextInt();
		int max = h[N-1];
		
		for(int i=N-1;i>=0;i--)
		{
			if(max<h[i])
			{
				cnt++;
				max=h[i];
			}
		}
		
		System.out.println(cnt);
	}

}
