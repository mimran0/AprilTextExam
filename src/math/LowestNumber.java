package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65,1,-9};



		int minValue = array[0];
		for(int i=1;i < array.length;i++) {
			if (array[i] < minValue) {
				minValue = array[i];


			}
		}
		System.out.println("Minimum Number is "+minValue);

}
	}
