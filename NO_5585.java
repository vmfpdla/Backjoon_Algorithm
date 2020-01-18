package Backjoon_Algorithm;

import java.util.Scanner;

public class NO_5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // ≥Ωµ∑
		int changes = 1000-money; // ∞≈Ω∫∏ßµ∑
		int cnt=0;
		
		
		while(changes!=0) // ∞≈Ω∫∏ßµ∑¿Ã 0¿Ã æ∆¥“∂ß±Ó¡ˆ
		{
			if(500<=changes){
				cnt = cnt+changes/500; // ∞≈Ω∫∏ßµ∑¿ª 500¿∏∑Œ ≥™¥´ ∏Ú∏∏≈≠ cnt++
				changes=changes-(changes/500*500); 
			}
			if(100<=changes){
				cnt = cnt+changes/100;
				changes=changes-(changes/100*100);
			}
			if(50<=changes){
				cnt = cnt+changes/50;
				changes=changes-(changes/50*50);
			}
			if(10<=changes){
				cnt = cnt+changes/10;
				changes=changes-(changes/10*10);
			}
			if(5<=changes){
				cnt = cnt+changes/5;
				changes=changes-(changes/5*5);
			}
			if(1<=changes){
				cnt = cnt+changes/1;
				changes=changes-(changes/1*1);
			}
		}
		
		System.out.println(cnt);
	}

}
