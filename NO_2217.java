package Backjoon_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class NO_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();  //������ ����
 		int[] rope = new int[K]; // ���� �迭
		int[] cnt = new int[K]; // cnt[0] = ���� 1�� ����Ҷ� �ִ� , cnt[1] = ���� 2������Ҷ� �ִ�
		
		for(int i=0;i<K;i++) rope[i]=sc.nextInt();
		
		Arrays.sort(rope); // �������� �迭
		
		for(int i=1;i<=K;i++) // ���� ���� 2���� ����Ѵٸ�, ���� �� ���� 2���� ����� ���̰�, �� �ΰ��� �������� *2 ��ŭ �߷��� ��ƿ �� �ִ�.
			                           // ���� ���� 3���� ����Ѵٸ�, ���� �� ���� 3���� ����� ���̰�, �� ������ ���� �������� *3 ��ŭ �߷��� ��ƿ �� �ִ�.
		{
			cnt[i-1]= rope[K-i]*i;
			
		}
		
		Arrays.sort(cnt); // �������� �迭
		
		System.out.println(cnt[K-1]); // ���� ū �� ���

	}

}
