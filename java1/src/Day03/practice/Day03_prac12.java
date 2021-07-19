package Day03.practice;

import java.util.Scanner;

public class Day03_prac12 {
	public static void main(String[] args) {
		//네 개의 정수를 입력받아 오름차순 정렬
		
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		int index, swap;

		for (index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}

		System.out.println("before sorting");
		for (index = 0; index < arr.length; index++) {
		System.out.print(arr[index]);
		if(index<arr.length) {
			System.out.print(", ");
		}
		
		}
		
	}
}
