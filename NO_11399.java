package Backjoon_Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class NO_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
		n=sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) num[i] =sc.nextInt();
		Arrays.sort(num);
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++) sum=sum+num[j]; 
		}
		System.out.println(sum);
	}

}


