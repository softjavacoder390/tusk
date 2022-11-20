package com.test;


import java.util.*;
public class FindTripilet {

	// function to print triplets with given sum
	//{ -1,0,1,2,-1,-4};
	static void findTriplets(int arr[], int n, int sum)
	{
		for (int i = 0; i < n - 1; i++) { // i=0, 0< 5
			// Find all pairs with sum equals to
			// "sum-arr[i]"
			HashSet<Integer> s = new HashSet<>();
			for (int j = i + 1; j < n; j++) { // j=1, 1<6
				int x = sum - (arr[i] + arr[j]); // x = 0- (-1 + 0) // 1,0,-1,2,
				System.out.println("sum X = " +x);
				if (s.contains(x))
					System.out.printf(
						"%d %d %d\n", x, arr[i], arr[j]);
				else
					s.add(arr[j]);//0,
			}
		}
		
	}
	
	// Driver code
	public static void main(String[] args)
	{   
		//Input: nums = [-1,0,1,2,-1,-4]
		//Output: [[-1,-1,2],[-1,0,1]]
		int arr[] = { -1,0,1,2,-1,-4};
		int sum = 0;
		int n = arr.length;
		findTriplets(arr, n, sum);
		
	}
}

