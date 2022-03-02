package String;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 11.문자열 압축 
		String str = scan.next().toUpperCase() + " ";
		int count = 1;
		String result ="";
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				result += str.charAt(i);
				if(count > 1) {
					result += Integer.toString(count);
				}
				count = 1;
			}
		}
		System.out.println(result);
		
		*/
		
//		12.암호
		
		int n = scan.nextInt();
		String str = scan.next();
		
		String answer = "";
		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(7);
		}
		System.out.println(answer);
		
	}
}
