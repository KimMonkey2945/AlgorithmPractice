package Array;

import java.util.Scanner;

public class Main {
	/*
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		 1. 큰 수 출력하기
		answer.add(arr[0]);
		//앞의 수와 비교 해서 큰수만 출력하도록
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
		*/
	
//		2.보이는 학생
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
		
		
//		1.큰 수 출력하기
	/*	int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int a : R.solution(n, arr)) {
			System.out.print(a + " ");
		}
	*/
		
//		2. 보이는 학생
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
	
		System.out.println(R.solution(n, arr));
		
		
		
		
		
	}

}
