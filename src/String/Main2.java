package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	// 백준 방법으로 풀기.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * //1.문자 찾기 int answer = 0;
		 * 
		 * String str = scan.next(); char a = scan.next().charAt(0);
		 * 
		 * scan.close(); //모두 대문자로 바꿔서 진행 str = str.toUpperCase(); char b =
		 * Character.toUpperCase(a);
		 * 
		 * // for(int i = 0; i < b.length(); i++) { // if(b.charAt(i) == c) { //
		 * answer++; // } // } //향상된 for문으로 풀수 있음. //흐름을 잘 기억하기 for(char d :
		 * str.toCharArray()) { if(d == b ) { answer++; } }
		 * 
		 * System.out.println(answer);
		 * 
		 */

//		2. 대소문자 변환
		// 아스키코드를 이용
	/*	String str = scan.next();
		
		scan.close();
		
		String answer = "";
		
//		for(char a : str.toCharArray()) {
//			if((a >= 97) && (a <= 122)) {
//				answer += (char)(a - 32);
//			}else {
//				answer += (char)(a + 32);
//			}
//		}
//		System.out.println(answer);
		
		
		for(char a : str.toCharArray()) {
			if(Character.isLowerCase(a)) {
				answer += Character.toUpperCase(a);
			}else {
				answer += Character.toLowerCase(a);
			}
		}
		System.out.println(answer);
		*/
		
		// 3.문장 속 단어
		/*
		String a = scan.nextLine(); //단어가 아니라 한 줄을 받아야 하므로 nextLine
		
		String[] b = a.split(" "); 
		
		int c = 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i].length() > c) {
				c = b[i].length();
				answer = b[i];
			}
		}
		System.out.println(answer);
		
		String answer = "";
		
		int m = Integer.MIN_VALUE, pos;
		//Integer.MIN_VALUE = 자바에서 정수의 최소값, 반대는 MAX_VALUE
		
		while((pos = a.indexOf(" ")) != -1) {
			String tmp = a.substring(0, pos);
			int len = tmp.length();
			if(len > m ) {
				m = len;
				answer = tmp;
			}
			a = a.substring(pos + 1);
		}
		if(a.length() > m){ 
			answer = a;
		}
			System.out.println(answer);
		*/	
			
//		4. 단어 뒤집기
		//StringBuilder를 사용하는 이유는 String은 불변 이지만, StringBuilder를 이용하면 여러가지 형태로 바꿀 수 있음
		// 배열과 리스트의 차이에 대해 한번 생각해 봐야함.
		int number = scan.nextInt();
		String [] words = new String[number];
		
		for(int i = 0; i < number; i++) {
			words[i] = scan.next();
		}
		
		scan.close();

//		String [] answer; 배열로 하려 했느나 값을 넣을 때 번거로움
		
		ArrayList<String> answer = new ArrayList<>(); 
		for(String word: words) {
			String tmp = new StringBuilder(word).reverse().toString();
			answer.add(tmp);
		}
		System.out.println(answer);
		
	}

}
