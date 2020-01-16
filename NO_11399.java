<<<<<<< HEAD
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


=======
package Backjoon_Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class NO_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc 라는 인스턴스 생성
		int n;
		int sum=0;
		n=sc.nextInt();
		int[] num = new int[n]; // 배열의 생성과 선언을 동시에 . C언어와 다르게 변수 N을 이용하여 바로 배열의 크기 지정이 가능
		for(int i=0;i<n;i++) num[i] =sc.nextInt();
		Arrays.sort(num); //Arrays.sort(배열이름) 하면 자동으로 오름차순 정렬
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++) sum=sum+num[j]; 
		}
		System.out.println(sum);
	}

}


>>>>>>> 7b28ef65b15d5a4058b9e0e6cb5238ace6092126
