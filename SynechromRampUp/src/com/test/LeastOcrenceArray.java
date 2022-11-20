package com.test;

import java.util.Arrays;

public class LeastOcrenceArray {

	static int leastFrequent(int arr[], int n)
	{
		
		// Sort the array
		Arrays.sort(arr);
		
		// find the min frequency using
		// linear traversal
		
		int min_count = n+1, res = -1;
		int curr_count = 1;
		//System.out.println(min_count);
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++;
			else {
				if (curr_count < min_count) {
					min_count = curr_count;
					res = arr[i - 1];
				}
				System.out.println("Element "+arr[i-1]+" count  "+ curr_count);
				curr_count = 1;
			}
			
		}
	
		// If last element is least frequent
		if (curr_count < min_count)
		{
			min_count = curr_count;
			res = arr[n - 1];
			System.out.println("Element "+res+" count  "+ min_count);
		}
	
		return res;
	}
	
	// driver program
	public static void main(String args[])
	{
		int arr[] = {1, 3, 2, 1, 2, 2, 3, 1};
		int n = arr.length;
		System.out.print(leastFrequent(arr, n));
		
	}
}

/*This code is contributed by Nikita Tiwari.*/
