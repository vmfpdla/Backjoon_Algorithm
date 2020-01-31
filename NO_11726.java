package Backjoon_Algorithm;

import java.util.Scanner;

//dp[i] = dp[i-1]+dp[i-2]
// dp[i-1] : 맨 앞에 세로 직사각형이 하나 있는 경우 
// dp[i-2] : 맨 앞에 가로 직사각형이 두개가 있는 경우 
// 점화식을 생각하자 !
public class NO_11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int[] dp = new int[N+1];
		
		if(N>0) dp[1]=1;
		if(N>1) dp[2]=2;
		if(N>2)
		{
			for(int i=3 ; i<=N ; i++) dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		
		System.out.println(dp[N]);
	}

}
