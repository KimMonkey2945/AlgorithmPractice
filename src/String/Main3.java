package String;

import java.util.Scanner;

public class Main3 {
	
//	public String soultion(String str) {
//		5. 특정 문자 뒤집기	
		/*	String result;
			char [] s = str.toCharArray();
		
			int lt = 0;
			int rt = str.length()-1;
			
			
			while(lt < rt) {
				if(!Character.isAlphabetic(s[lt])) {
					lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
					rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
			result = String.valueOf(s);
			return result;
	*/
		/*
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i ) {
				result +=str.charAt(i);
			}
		} return result;
		
		*/
		
//	}
	
//	7번 이렇게 boolean 타입의 클래스를 따로 만들어서 
//	public static boolean solution(String str) {
//		return str.equals(new StringBuilder(str).reverse().toString());
//	}
		
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* 5.특정문자 뒤집기
		Main3 A = new Main3();
		String str = scan.next();
		
		scan.close();
		System.out.println(A.soultion(str));
		*/
		
//		6.중복문자 제거
		
		/*
		String str = scan.nextLine();
		Main3 A = new Main3();
		
		scan.close();
		System.out.println(A.soultion(str));
		*/
		
		
		
//		7.회문 문자열 
		//대소문자 구분 시 equalsignorecase를 사용 할 수도 있음.
//		String input = scan.nextLine();
//		
//		String str = input.toUpperCase();
//		
//		scan.close();
//		if(solution(str)){
//			System.out.println("YES");			
//		}else {
//			System.out.println("NO");
//		}
		
//		8.유효한 팰린드롬()
		/*
		String str = scan.nextLine(); //꺽쇠는 부정을 나타냄
		scan.close();

		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String b = new StringBuilder(str).reverse().toString();
		
		if(str.equals(b)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}	
		*/
		
//		9.숫자만 추출
		/*
		String str = scan.nextLine();
		scan.close();
		int result = 0; 
		String answer = "";
//		str = str.replaceAll("[^0-9]", ""); 숫자를 제외한 나머지를 없애버림
		
		방법1.
	/*	Character.isDigit() 숫자인지 판단함.
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <= 57) {
				result = result *10 +(x-48);
			}
		}

		방법2.
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		System.out.println(Integer.parseInt(answer));	
		*/
		
//		10.가장 짧은 문자거리
		
		
		
		
		
		
		
		
	}
}
