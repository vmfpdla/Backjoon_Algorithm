package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_2193 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] num = new long[91]; // int ������ �Ѿ�Ƿ� long ���� �ٲ�
		
		num[1]=1;
		if(N>=2) num[2]=1;
		if(N>=3)
		{
			for(int i=3;i<=N;i++)
			{
				num[i] = num[i-1]+num[i-2]; // �Ǻ���ġ ���� ����
			}
		}
		
		for(int i=1;i<=N;i++) System.out.println(num[i]);

	}
	

}
