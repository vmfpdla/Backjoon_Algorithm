package Backjoon_Algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class NO_1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   // 회의 갯수
		int[][] K = new int[N][2];  // 회의 시작시간 과 끝나는 시간의 집합
		int[] temp = new int[2];
		int check =0;
		int cnt=0;
		for( int i=0;i<N;i++)
		{
			K[i][0]=sc.nextInt(); // 시작하는 시간
			K[i][1]=sc.nextInt(); // 끝나는 시간
		}
		
		Arrays.sort(K, new Comparator<int[]>() { // 끝나는 시간 순으로 오름차순 한 후 , 끝나는 시간이 같으면 시작하는 시간 순으로 오름차순 !
            @Override
            public int compare(int[] arg0, int[] arg1) {
                if(arg0[1] == arg1[1]) { //끝나는 시간이 같은경우
                    return arg0[0] - arg1[0]; //시작하는 시간 순으로 오름차순 정렬
                } else { // 끝나는 시간이 다른 경우 
                    return arg0[1] - arg1[1];// 끝나는 시간 순으로 오름차순 정렬
                }
            }
        });    
		
		
		check = K[0][1]; // check = 기준점
		for(int i=1;i<N;i++) //반복문을돌면서 
		{
			if(K[i][0]>= check ) // 끝나는 시간이 기준점보다 크거나 같은 경우에만
			{
				cnt ++; // cnt 증가 ( 회의 진행 할 수 있음 )
				check =K[i][1]; // 기준점은 해당 회의의 끝나는 시간으로 수정
			}
		}
		
		System.out.println(cnt+1); // 제일 처음 회의는 시작한다고 가정하므로 +1
	}

}
