package Backjoon_Algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

// 30의 배수 : 30의 배수 = 각 자리 숫자의 합이 3의 배수이고 , 끝자리는 0
public class NO_10610 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine(); // 문자열
		String[] array_N = N.split(""); // 문자배열로 저장 
		int length = array_N.length; // 문자배열의 길이
		int sum =0; // 각 자리 숫자의 합
		
		if(N.contains("0")==false) System.out.println(-1); // 만약 0이라는 숫자가 없으면 -1 출력
		else { // 아니라면
			for(int i=0;i<length;i++)
			{
				sum= sum+Integer.parseInt(array_N[i]); // 각 자리 숫자의 합을 구한후
			}
			
			Arrays.sort(array_N, Collections.reverseOrder()); // 배열을 내림차순으로 
			
			
			if(sum%3==0) // 각 자리 숫자의 합이 3의 배수인 경우 
			{
				for(int i=0;i<length;i++) System.out.print(array_N[i]); //그 수를 출력하고 
			}
			else System.out.println(-1); // 아닌 경우 -1 출력
			
		}
		
	}

}
