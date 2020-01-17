package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int cnt=0;
		int[] coin = new int[N]; //�迭�� ������ ������ ���ÿ�
		
		for(int i=0;i<N;i++) coin[i] = sc.nextInt(); 
		
		for(int i=N-1;i>=0;i--)
		{
			if(K>=coin[i])
			{
				cnt++;
				K=K-coin[i];
				i++;
			}
		}
		System.out.println(cnt);

	}
}
