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
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
	
		System.out.println(R.solution(n, arr));
		
		
		
		
		
	}

}
