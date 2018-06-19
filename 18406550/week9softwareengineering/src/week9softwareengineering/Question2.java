package week9softwareengineering;

import java.util.Scanner;

public class Question2 {
	static double[] arr = new double[5];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		for(double i : arr){
			System.out.println(i);
		}
	}
}