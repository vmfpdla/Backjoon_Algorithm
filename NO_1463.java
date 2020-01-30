package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int[] dp = new int[X+1]; // dp[5] : 5가 1이되는 최소횟수 
		
		dp[0]=dp[1]=0; // 0과 1은 최소횟수가 0 이다.
		for(int i=2;i<=X;i++) //점화식을 생각해서 푼다. 0과 1은 이미 0이므로 2부터 X까지 반복문
		{
			dp[i] = dp[i-1]+1; // ex) 10 인경우 dp[9](9가 1로되는 최솟값)+1(10빼기 1) 로 둔다.
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1); // 수가 3의배수인경우 , 위의 dp[i]와 dp[i/3]+1 중 작은수로 바꾼다.
			else if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
		}
		System.out.println(dp[X]);
	}
}
