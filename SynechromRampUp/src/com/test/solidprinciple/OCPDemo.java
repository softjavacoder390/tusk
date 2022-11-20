package com.test.solidprinciple;


//Open Closed Principle
//Objects or entities should be open for extension but closed for modification
interface ValueComparator {

	int compare(int value1, int value2);

}
class ArrayUtil {
	
	//int[] arr = {1,4,3,2,5};
		public static void sort(int[] arr, ValueComparator comparator) {
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i+1; j < arr.length; j++) {
					
					if(comparator.compare(arr[i], arr[j]) > 0){
						int temp = arr[i];
					    arr[i] = arr[j];
					    arr[j] = temp;
						
					}
					
				}
				
			}
			
		}
	}

class AscComparator implements ValueComparator {
	
	/* (non-Javadoc)
	 * @see com.test.solidprinciple.ValueComparator#compare(int, int)
	 */
	@Override
	public int compare(int value1, int value2){
		
		return value1 - value2;
	}

}

class DscComparator implements ValueComparator {

	@Override
	public int compare(int value1, int value2){
		
		return value2 - value1;
	}
}

public class OCPDemo {

	public static void main(String[] args) {
		int[] arr = {1,4,3,2,5};
		ArrayUtil.sort(arr, new AscComparator() );
		ArrayUtil.sort(arr, new DscComparator() );
		System.out.println("Value in Array are ...");
		
		for (int i : arr) {
			System.out.println(i); 
			
		}
	}
}
