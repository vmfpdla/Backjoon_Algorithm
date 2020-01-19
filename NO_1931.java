package Backjoon_Algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class NO_1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   // ȸ�� ����
		int[][] K = new int[N][2];  // ȸ�� ���۽ð� �� ������ �ð��� ����
		int[] temp = new int[2];
		int check =0;
		int cnt=0;
		for( int i=0;i<N;i++)
		{
			K[i][0]=sc.nextInt(); // �����ϴ� �ð�
			K[i][1]=sc.nextInt(); // ������ �ð�
		}
		
		Arrays.sort(K, new Comparator<int[]>() { // ������ �ð� ������ �������� �� �� , ������ �ð��� ������ �����ϴ� �ð� ������ �������� !
            @Override
            public int compare(int[] arg0, int[] arg1) {
                if(arg0[1] == arg1[1]) { //������ �ð��� �������
                    return arg0[0] - arg1[0]; //�����ϴ� �ð� ������ �������� ����
                } else { // ������ �ð��� �ٸ� ��� 
                    return arg0[1] - arg1[1];// ������ �ð� ������ �������� ����
                }
            }
        });    
		
		
		check = K[0][1]; // check = ������
		for(int i=1;i<N;i++) //�ݺ��������鼭 
		{
			if(K[i][0]>= check ) // ������ �ð��� ���������� ũ�ų� ���� ��쿡��
			{
				cnt ++; // cnt ���� ( ȸ�� ���� �� �� ���� )
				check =K[i][1]; // �������� �ش� ȸ���� ������ �ð����� ����
			}
		}
		
		System.out.println(cnt+1); // ���� ó�� ȸ�Ǵ� �����Ѵٰ� �����ϹǷ� +1
	}

}
