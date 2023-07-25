package com.app;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
       int sum=0;
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();

		System.out.print("Enter the third number: ");
		int num3 = input.nextInt();

		int largest = num1;
		if (num2 > largest) {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}

		int largestNumber = largest;
		System.out.println("The largest of the three number is: " + largestNumber);
		sum=num1+num2+num3;
		System.out.println("Sum of the three number is: "+sum);
		int average=0;
		average=(num1+num2+num3)/3;
		System.out.println("Average of the three numbers is: "+average);
		
	}
}
