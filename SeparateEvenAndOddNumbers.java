package com.mru.faqs;

public class SeparateEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int even=0,odd=0;
		
		for(int element:arr) {
			even+= element%2==0?1:0;
			odd+= element%2!=0?1:0;
		}
		
		int[] arr1 = new int[even];
		int[] arr2 = new int[odd];
		int evenIndex=0,oddIndex=0;
		for(int element:arr) {
			if(element%2==0)
				arr1[evenIndex++] = element;
			else
				arr2[oddIndex++] = element;
		}
		
		System.out.println("Even Number....");
		for(int element:arr1) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		System.out.println("Odd Number....");
		for(int element:arr2) {
			System.out.print(element+" ");
		}
		System.out.println();
		

	}

}