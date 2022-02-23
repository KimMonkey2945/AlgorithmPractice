package String;

import java.util.Scanner;

public class Main {
	public int solution(String str, char a) {
		int answer = 0;
		
		str= str.toUpperCase();
		a = Character.toUpperCase(a);
		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == a) {
//				answer++;
//			}
//		}
		
		// 향상된 for문
		// str 자리에 문자열은 올 수 없으므로 배열로 만들어준다!
		for(char b: str.toCharArray()) {
			if(b == a) {
				answer++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
//		1.문자 찾기
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char a = scan.next().charAt(0);
				
		System.out.println(T.solution(str, a));
	
	}

}
