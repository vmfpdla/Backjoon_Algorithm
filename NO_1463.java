package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int[] dp = new int[X+1]; // dp[5] : 5�� 1�̵Ǵ� �ּ�Ƚ�� 
		
		dp[0]=dp[1]=0; // 0�� 1�� �ּ�Ƚ���� 0 �̴�.
		for(int i=2;i<=X;i++) //��ȭ���� �����ؼ� Ǭ��. 0�� 1�� �̹� 0�̹Ƿ� 2���� X���� �ݺ���
		{
			dp[i] = dp[i-1]+1; // ex) 10 �ΰ�� dp[9](9�� 1�εǴ� �ּڰ�)+1(10���� 1) �� �д�.
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1); // ���� 3�ǹ���ΰ�� , ���� dp[i]�� dp[i/3]+1 �� �������� �ٲ۴�.
			else if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
		}
		System.out.println(dp[X]);
	}
}
