package Backjoon_Algorithm;

import java.util.Scanner;

//맨 뒤 숫자부터 for문 돌려서 맨 뒤 숫자보다 큰 경우에 보이고 이 큰 경우가 max 로 변해서 max 랑 계속 비교
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
