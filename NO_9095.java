package Backjoon_Algorithm;

import java.util.Scanner;



//dp[i]=dp[i-1]+dp[i-2]+dp[i-3]  : ��ȭ��
//dp[i-1] : �Ǿտ� 1+ �� �����ϴ� ���
//dp[i-2] : �Ǿտ� 2+ �� �����ϴ� ���
//dp[i-3] : �Ǿտ� 3+ �� �����ϴ� ���
public class NO_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt= sc.nextInt();
		int[] dp = new int[11];
		int[] num = new int[cnt];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4;i<=10;i++)
		{
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		for(int i=0;i<cnt;i++)
		{
			num[i]=dp[sc.nextInt()];
		}
		for(int i=0;i<cnt;i++)
		{
			System.out.println(num[i]);
		}
		    
	}

}
