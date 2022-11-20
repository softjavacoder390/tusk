package com.test;

public class MoveZerosInLast_1 {
	 
	public static void main(String[] args) {
		
		//int inputArr[] = {10, 2, 78, 0, 0, 30, 19, 0, 16, 17, 80, 13, 20, 0, 6};
		
		int inputArr[] = {10, 2, 78,-1, -2, 30, 19, 0, 16, 17, 80, 13, 20, 0, 6};

		//o/p []={10 ,2 ,78, 30, 19, 16, 17, 80, 13, 20, 6, 0 ,0, -1, -2}
		
		int inputArrLength = inputArr.length;
		int inputArr1[] = new int[inputArrLength]; 
		int indexCount = 0;
		int fromTheEnd = inputArrLength-1;
		int count =0;
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] >0) { //10
				inputArr[indexCount++] = inputArr[i];  //
			}else
				inputArr1[count++] = inputArr[i]; 
				
		}
		int count1=0;
		System.out.println(indexCount);
		while(indexCount < inputArrLength) {
			inputArr[indexCount++] = inputArr1[count1++];
		}
		
		for (int data : inputArr) {
			System.out.print(data+" ");
		}
		
	}
}
