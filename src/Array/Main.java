package Array;

import java.util.Scanner;

public class Main {
	/*
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		 1. ū �� ����ϱ�
		answer.add(arr[0]);
		//���� ���� �� �ؼ� ū���� ����ϵ���
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
		*/
	
//		2.���̴� �л�
	/*
	public int solution(int n, int[] arr){
		
		int count = 1;
		int max = arr[0];
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				count++; 
			}
		}
		return count;
	}
	*/
	

	public static void main(String[] args) {
		Main R = new Main();
		Scanner scan = new Scanner(System.in);
		
		
//		1.ū �� ����ϱ�
	/*	int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int a : R.solution(n, arr)) {
			System.out.print(a + " ");
		}
	*/
		
//		2. ���̴� �л�
	/*	
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
	
		System.out.println(R.solution(n, arr));
	*/
		
//		3.���� ���� ��
		/*
		int n = scan.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		
		for(int i = 0; i < n; i++) {
			b[i] = scan.nextInt(); 
		}
		
		
		for(int i = 0; i < n; i++) {
			if((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (b[i] == 1 && a[i] == 3)) {
				System.out.println("B");
			}else if(a[i] == b[i]) {
				System.out.println("D");
			}else {
				System.out.println("A");
			}
		}
	*/	
		
//		4.�Ǻ���ġ ����
		/*
		int n = scan.nextInt();
		
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 1;
		a[2] = 2;
		
		for(int i = 3; i < n; i++) {
			a[i] = a[i-1] + a[i-2]; 
		}
		
		for(int b: a) {
			System.out.print(b + " ");
		}
		*/
		
//		�迭�� ������� �ʰ� Ǯ���
		
		int n = scan.nextInt();
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
