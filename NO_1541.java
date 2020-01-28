package Backjoon_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

// - 기준으로 다 더하고 나중에 서로 빼주기만 하면 된다. -> 이게 최소

public class NO_1541 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = new String(); // 식을 String 로 받고
		input = scanner.nextLine(); 
		String[] str = input.split("\\-"); // 마이너스 기준으로 분리
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int result =0;
		for(int i=0;i<str.length;i++)
		{
			answer.add(calc(str[i])); 
			
		}
		result = answer.get(0);
		for(int i=1;i<answer.size();i++)
		{
			result = result - answer.get(i); // 이제 서로 빼줌
		}
		System.out.println(result);
	}
	
	public static int calc(String str) // 20+30+40  이 들어오면 이걸 계산해줌
	{
		String[] num = str.split("\\+");
		int result =0;
		for(int i=0;i<num.length;i++)
		{
			result = result+Integer.parseInt(num[i]);
		}
		
		return result;
	}

}
