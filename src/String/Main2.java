package String;

import java.util.ArrayList;
import java.util.Scanner;


	



public class Main2 {
	/* Ư�� ���� ������
	public ArrayList<String> solution(int n ,String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	*/
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * //1.���� ã�� int answer = 0;
		 * 
		 * String str = scan.next(); char a = scan.next().charAt(0);
		 * 
		 * scan.close(); //��� �빮�ڷ� �ٲ㼭 ���� str = str.toUpperCase(); char b =
		 * Character.toUpperCase(a);
		 * 
		 * // for(int i = 0; i < b.length(); i++) { // if(b.charAt(i) == c) { //
		 * answer++; // } // } //���� for������ Ǯ�� ����. //�帧�� �� ����ϱ� for(char d :
		 * str.toCharArray()) { if(d == b ) { answer++; } }
		 * 
		 * System.out.println(answer);
		 * 
		 */

//		2. ��ҹ��� ��ȯ
		// �ƽ�Ű�ڵ带 �̿�
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
		
		// 3.���� �� �ܾ�
		/*
		String a = scan.nextLine(); //�ܾ �ƴ϶� �� ���� �޾ƾ� �ϹǷ� nextLine
		
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
		//Integer.MIN_VALUE = �ڹٿ��� ������ �ּҰ�, �ݴ�� MAX_VALUE
		
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
			
//		4. �ܾ� ������
		//StringBuilder�� ����ϴ� ������ String�� �Һ� ������, StringBuilder�� �̿��ϸ� �������� ���·� �ٲ� �� ����
		// �迭�� ����Ʈ�� ���̿� ���� �ѹ� ������ ������.
	/*	int number = scan.nextInt();
		String [] words = new String[number];
		
		for(int i = 0; i < number; i++) {
			words[i] = scan.next();
		}
		
		scan.close();

//		String [] answer; �迭�� �Ϸ� �ߴ��� ���� ���� �� ���ŷο�
		
		ArrayList<String> answer = new ArrayList<>(); 
		for(String word: words) {
			String tmp = new StringBuilder(word).reverse().toString();
			answer.add(tmp);
		}
		System.out.println(answer);
	*/
		Main2 T = new Main2();
		int n = scan.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	
	
	}
	
	
}
