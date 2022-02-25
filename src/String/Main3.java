package String;

import java.util.Scanner;

public class Main3 {
	
	public String soultion(String str) {
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
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i ) {
				result +=str.charAt(i);
			}
		} return result;
		
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* 5.특정문자 뒤집기
		Main3 A = new Main3();
		String str = scan.next();
		
		scan.close();
		System.out.println(A.soultion(str));
		*/
		
//		6.중복문자 제거
		
		String str = scan.nextLine();
		Main3 A = new Main3();
		
		scan.close();
		System.out.println(A.soultion(str));
		
		
	}

}
