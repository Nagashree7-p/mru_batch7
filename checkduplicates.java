package com.mru.day7;
import java.util.HashSet;

public class checkduplicates {
	
	public static boolean checkForDuplicates(int[] arr) {
		HashSet<Integer>set = new HashSet<>();
		for(int element:arr) {
			if(set.contains(element)) {
				return true;
			}
			set.add(element);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,3,4};
		boolean res = checkForDuplicates(arr);
		System.out.println(res ? "Duplicates Found !!!": "Duplicates Not Found !!!");

	}

}
