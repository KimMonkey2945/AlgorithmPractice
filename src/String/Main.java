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
		
		// ���� for��
		// str �ڸ��� ���ڿ��� �� �� �����Ƿ� �迭�� ������ش�!
		for(char b: str.toCharArray()) {
			if(b == a) {
				answer++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
//		1.���� ã��
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char a = scan.next().charAt(0);
				
		System.out.println(T.solution(str, a));
	
	}

}
