package String;

import java.util.Scanner;

public class Main3 {
	
//	public String soultion(String str) {
//		5. Ư�� ���� ������	
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
	
//	7�� �̷��� boolean Ÿ���� Ŭ������ ���� ���� 
//	public static boolean solution(String str) {
//		return str.equals(new StringBuilder(str).reverse().toString());
//	}
		
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* 5.Ư������ ������
		Main3 A = new Main3();
		String str = scan.next();
		
		scan.close();
		System.out.println(A.soultion(str));
		*/
		
//		6.�ߺ����� ����
		
		/*
		String str = scan.nextLine();
		Main3 A = new Main3();
		
		scan.close();
		System.out.println(A.soultion(str));
		*/
		
		
		
//		7.ȸ�� ���ڿ� 
		//��ҹ��� ���� �� equalsignorecase�� ��� �� ���� ����.
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
		
//		8.��ȿ�� �Ӹ����()
		/*
		String str = scan.nextLine(); //����� ������ ��Ÿ��
		scan.close();

		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String b = new StringBuilder(str).reverse().toString();
		
		if(str.equals(b)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}	
		*/
		
//		9.���ڸ� ����
		/*
		String str = scan.nextLine();
		scan.close();
		int result = 0; 
		String answer = "";
//		str = str.replaceAll("[^0-9]", ""); ���ڸ� ������ �������� ���ֹ���
		
		���1.
	/*	Character.isDigit() �������� �Ǵ���.
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <= 57) {
				result = result *10 +(x-48);
			}
		}

		���2.
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		System.out.println(Integer.parseInt(answer));	
		*/
		
//		10.���� ª�� ���ڰŸ�
		
		
		
		
		
		
		
		
	}
}
