package Backjoon_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

// - �������� �� ���ϰ� ���߿� ���� ���ֱ⸸ �ϸ� �ȴ�. -> �̰� �ּ�

public class NO_1541 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = new String(); // ���� String �� �ް�
		input = scanner.nextLine(); 
		String[] str = input.split("\\-"); // ���̳ʽ� �������� �и�
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int result =0;
		for(int i=0;i<str.length;i++)
		{
			answer.add(calc(str[i])); 
			
		}
		result = answer.get(0);
		for(int i=1;i<answer.size();i++)
		{
			result = result - answer.get(i); // ���� ���� ����
		}
		System.out.println(result);
	}
	
	public static int calc(String str) // 20+30+40  �� ������ �̰� �������
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
