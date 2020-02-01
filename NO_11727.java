package Backjoon_Algorithm;
import java.util.Scanner;

//dp[i] = dp[i-1]+2* dp[i-2]
// dp[i-1] : �� �տ� ���� ���簢���� �ϳ� �ִ� ��� 
// dp[i-2] : �� �տ� ���� ���簢���� �ΰ��� �ִ� ���  / �� �տ� 2X2 ���簢�� �ϳ� �ִ� ��� -> �� 2��
// ��ȭ���� �������� !
//11726���� ���弱�̶� �������� !
public class NO_11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int[] dp = new int[N+1];
		
		if(N>0) dp[1]=1;
		if(N>1) dp[2]=3;
		if(N>2)
		{
			for(int i=3 ; i<=N ; i++) dp[i] = (dp[i-1]+2*dp[i-2])%10007;
		}
		
		System.out.println(dp[N]);
	}

}