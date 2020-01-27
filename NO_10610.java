package Backjoon_Algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

// 30�� ��� : 30�� ��� = �� �ڸ� ������ ���� 3�� ����̰� , ���ڸ��� 0
public class NO_10610 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine(); // ���ڿ�
		String[] array_N = N.split(""); // ���ڹ迭�� ���� 
		int length = array_N.length; // ���ڹ迭�� ����
		int sum =0; // �� �ڸ� ������ ��
		
		if(N.contains("0")==false) System.out.println(-1); // ���� 0�̶�� ���ڰ� ������ -1 ���
		else { // �ƴ϶��
			for(int i=0;i<length;i++)
			{
				sum= sum+Integer.parseInt(array_N[i]); // �� �ڸ� ������ ���� ������
			}
			
			Arrays.sort(array_N, Collections.reverseOrder()); // �迭�� ������������ 
			
			
			if(sum%3==0) // �� �ڸ� ������ ���� 3�� ����� ��� 
			{
				for(int i=0;i<length;i++) System.out.print(array_N[i]); //�� ���� ����ϰ� 
			}
			else System.out.println(-1); // �ƴ� ��� -1 ���
			
		}
		
	}

}
