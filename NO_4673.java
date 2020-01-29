package Backjoon_Algorithm;

// �����ѹ� , �� �����ڰ� ���� ���ڸ� ã�� ���� 
// 1~10000���� ���� �ϳ��� �����ͼ� d(n)�� ���Ѵ�.
//�� ���� d(n)�� n �̻����� �̹Ƿ� flag[d(n)] = true �� �ٲ��ش� -> �����ڰ� �ִٴ� ��
// boolean �� false�� �ʱ�ȭ �ȴ�.

public class NO_4673 {

	public static void main(String[] args) {
		
		boolean[] flag = new boolean[10001]; // 1~10000 ������ 10001 �� �迭����
		int num = 0;
		for(int i=1;i<10001;i++) // 1���� 10000 ����
		{
			num = self_number(i);
			if(num < 10001) flag[num] = true;
		}
		
		for(int i=1;i<10001;i++)
		{
			if(flag[i]==false) System.out.println(i);
		}
	}
	
	public static int self_number(int n)
	{
		int cnt =n; // ó�� �ڱ� ���ڷ� �����ؼ�
		while(n!=0) {
			cnt = cnt + n%10; // 10���� ���� �������� �����ش�
			n=n/10; // n�� ������ �ٲ��ش�
			// 123 �̸� 123+3+2+1 �� ������ ��������
		}
		return cnt; // ���ϵȴ� . n=123�ΰ�� cnt= 123+3+2+1 
	}
}
