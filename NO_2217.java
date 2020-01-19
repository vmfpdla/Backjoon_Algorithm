package Backjoon_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class NO_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();  //로프의 갯수
 		int[] rope = new int[K]; // 로프 배열
		int[] cnt = new int[K]; // cnt[0] = 로프 1개 사용할때 최댓값 , cnt[1] = 로프 2개사용할때 최댓값
		
		for(int i=0;i<K;i++) rope[i]=sc.nextInt();
		
		Arrays.sort(rope); // 오름차순 배열
		
		for(int i=1;i<=K;i++) // 만약 로프 2개를 사용한다면, 가장 긴 로프 2개를 사용할 것이고, 그 두개중 작은것의 *2 만큼 중량을 버틸 수 있다.
			                           // 만약 로프 3개를 사용한다면, 가장 긴 로프 3개를 사용할 것이고, 그 세개중 가장 작은것의 *3 만큼 중량을 버틸 수 있다.
		{
			cnt[i-1]= rope[K-i]*i;
			
		}
		
		Arrays.sort(cnt); // 오름차순 배열
		
		System.out.println(cnt[K-1]); // 가장 큰 값 출력

	}

}
