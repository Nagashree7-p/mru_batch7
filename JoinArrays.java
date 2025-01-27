package com.mru.m;

import java.util.Arrays;

public class JoinArrays {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = {40,50,60};
		int[] arr3 = new int[arr1.length+arr2.length];
		for(int i=0;i<arr3.length;i++) {
			if(i<arr1.length) {
				arr3[i] = arr1[i];
			}else {
				arr3[i] = arr2[i-arr1.length];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}