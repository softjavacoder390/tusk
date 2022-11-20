package com.test;

public class FindDuplicateInArray {

		void printRepeating(int arr[], int size)
		{
			int i;
			System.out.println("The repeating elements are : ");
			
			for (i = 0; i < size; i++) {
				int j = Math.abs(arr[i]);
				System.out.println(j);
				if (arr[j] >= 0)
					arr[j] = -arr[j];
				else
					System.out.print(j + " ");
					//System.out.println();
			}
		}

		// Driver code
		public static void main(String[] args)
		{
			FindDuplicateInArray duplicate = new FindDuplicateInArray();
			int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
			int arr_size = arr.length;

			duplicate.printRepeating(arr, arr_size);
		}

}

