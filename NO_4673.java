package Backjoon_Algorithm;

// 셀프넘버 , 즉 생성자가 없는 숫자를 찾는 문제 
// 1~10000까지 숫자 하나씩 가져와서 d(n)을 구한다.
//이 숫자 d(n)은 n 이생성자 이므로 flag[d(n)] = true 로 바꿔준다 -> 생성자가 있다는 뜻
// boolean 은 false로 초기화 된다.

public class NO_4673 {

	public static void main(String[] args) {
		
		boolean[] flag = new boolean[10001]; // 1~10000 까지라서 10001 개 배열생성
		int num = 0;
		for(int i=1;i<10001;i++) // 1부터 10000 까지
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
		int cnt =n; // 처음 자기 숫자로 시작해서
		while(n!=0) {
			cnt = cnt + n%10; // 10으로 나눈 나머지를 더해준다
			n=n/10; // n은 몫으로 바꿔준다
			// 123 이면 123+3+2+1 이 순서로 더해져서
		}
		return cnt; // 리턴된다 . n=123인경우 cnt= 123+3+2+1 
	}
}
