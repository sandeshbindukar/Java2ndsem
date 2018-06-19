package week9softwareengineering;

import java.util.Scanner;

public class DisplayInteger {
	static int[] arr = new int[5];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("First to Last");
		for(int i : arr){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Last to First");
		for (int i = arr.length-1 ; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
