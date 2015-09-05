package week_1;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args){
		//int[] input = {1,2,3,4,5};
		int[] input = {5,4,3,2,1};
		BubbleSort bs = new BubbleSort();
		
		bs.printArray(input);
		bs.bubbleSort(input);
		bs.printArray(input);
		//bs.bubbleSort(input);
	}
	
	public void printArray(int[] input){
		System.out.println(Arrays.toString(input));
	}
	
	public void bubbleSort(int input[]) {
		int counter = 0;
		int i, j, temp;
		boolean swapped;
		for (j = 0; j < input.length; j++) {
			swapped = false;
			for (i = 1; i < input.length - j; i++) {
				System.out.println(++counter);
				if (input[i - 1] > input[i]) {
					temp = input[i];
					input[i] = input[i - 1];
					input[i - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}
